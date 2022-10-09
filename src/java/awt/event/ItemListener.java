/*
 * @(#)ItemListener.java	1.8 01/12/12
 *
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package java.awt.event;

import java.util.EventListener;

/**
 * The listener interface for receiving item events.
 * @see ItemSelectable 
 *
 * @version 1.8 12/12/01
 * @author Amy Fowler
 */
public interface ItemListener extends EventListener {

    /**
     * Invoked when an item's state has been changed.
     */    
    void itemStateChanged(ItemEvent e);

}
