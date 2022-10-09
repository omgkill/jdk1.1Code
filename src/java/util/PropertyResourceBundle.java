/*
 * @(#)PropertyResourceBundle.java	1.9 01/12/12
 *
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package java.util;

import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

/**
 * <code>PropertyResourceBundle</code> is an abstract subclass of
 * <code>ResourceBundle</code> that manages resources for a locale
 * using a set of static strings from a property file. See
 * <code>ResourceBundle</code> for more information about resource
 * bundles in general.
 *
 * <p>
 * The property file contains the keys that you use in your source code
 * in calls to <code>ResourceBundle.getString</code> and similar methods,
 * and their corresponding values, etc.
 * The name of the property file indicates the resource bundle's family
 * and locale.
 *
 * <p>
 * In the following example, the keys are of the form "s1"... The actual
 * keys are entirely up to your choice, so long as they are the same as
 * the keys you use in your program to retrieve the objects from the bundle.
 * Keys are case-sensitive.
 * <blockquote>
 * <pre>
 * s1=3
 * s2=MeinDisk
 * s3=3 Mar 96
 * s4=Der disk '{1}' a {0} a {2}.
 * s5=0
 * s6=keine Datein
 * s7=1
 * s8=ein Datei
 * s9=2
 * s10={0}|3 Datein
 * s11=Der Format worf ein Exception: {0}
 * s12=ERROR
 * s14=Resulte
 * s13=Dialogue
 * s15=Pattern
 * s16=1,3
 * </pre>
 * </blockquote>
 *
 * @see ResourceBundle
 * @see ListResourceBundle
 */
public class PropertyResourceBundle extends ResourceBundle {
    /**
     * Creates a property resource
     * @param file property file to read from.
     */
    public PropertyResourceBundle (InputStream stream) throws IOException {
        lookup.load(stream);
    }

    /**
     * Override of ResourceBundle, same semantics
     */
    public Object handleGetObject(String key) {
        Object obj = lookup.get(key);
        return obj; // once serialization is in place, you can do non-strings
    }

    /**
     * Implementation of ResourceBundle.getKeys.
     */
    public Enumeration getKeys() {
	    Enumeration result = null;
	    if (parent != null) {
            final Enumeration myKeys = lookup.keys();
            final Enumeration parentKeys = parent.getKeys();

            result = new Enumeration() {
                public boolean hasMoreElements() {
                    if (temp == null)
                        nextElement();
                    return temp != null;
                }

                public Object nextElement() {
                    Object returnVal = temp;
                    if (myKeys.hasMoreElements())
                        temp = myKeys.nextElement();
                    else {
                        temp = null;
                        while (temp == null && parentKeys.hasMoreElements()) {
                            temp = parentKeys.nextElement();
                            if (lookup.containsKey(temp))
                                temp = null;
                        }
                    }
                    return returnVal;
                }

                Object temp = null;
            };
	    } else {
	        result = lookup.keys();
	    }
        return result;
    }

    // ==================privates====================

    private Properties lookup = new Properties();
}
