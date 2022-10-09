/*
 * @(#)mutex_md.h	1.8 01/12/12
 *
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * Interface to mutex HPI implementation for Solaris
 */

#ifndef _MUTEX_MD_H_
#define _MUTEX_MD_H_

#include <synch.h>

/*
 * Generally, we would typedef mutex_t to be whatever the system
 * supplies.  But Solaris gives us mutex_t directly.
 */

int    mutexInit(mutex_t *);
int    mutexDestroy(mutex_t *);
int    mutexLock(mutex_t *);
bool_t mutexLocked(mutex_t *);
int    mutexUnlock(mutex_t *);

#endif /* !_MUTEX_MD_H_ */
