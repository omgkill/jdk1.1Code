/*
 * @(#)AclNotFoundException.java	1.6 01/12/12
 *
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package java.security.acl;

/**
 * This is an exception that is thrown whenever a reference is made to a 
 * non-existent ACL (Access Control List).
 *
 * @author 	Satish Dharmaraj
 */
public class AclNotFoundException extends Exception {

    /**
     * Constructs an AclNotFoundException.
     */
    public AclNotFoundException() {
    }

}