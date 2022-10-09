/*
 * @(#)PopupMenuPeer.java	1.4 01/12/12
 *
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package java.awt.peer;

import java.awt.Event;

public interface PopupMenuPeer extends MenuPeer {
    void show(Event e); 
}
