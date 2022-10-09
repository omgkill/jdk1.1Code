/*
 * @(#)timeval_md.h	1.12 01/12/12
 *
 * Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

#ifndef	_SOLARIS_TIMEVAL_H_
#define	_SOLARIS_TIMEVAL_H_

typedef struct {
	long tv_sec;		/* seconds */
	long tv_usec;		/* microseconds (NOT milliseconds) */
} timeval_t;

#endif	/* !_SOLARIS_TIMEVAL_H_ */
