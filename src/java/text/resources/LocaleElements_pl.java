/*
 * @(#)LocaleElements_pl.java	1.10 01/12/12
 *
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996, 1997 - All Rights Reserved
 *
 * Portions copyright (c) 2002 Sun Microsystems, Inc. All Rights Reserved.
 *
 *   The original version of this source code and documentation is copyrighted
 * and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
 * materials are provided under terms of a License Agreement between Taligent
 * and Sun. This technology is protected by multiple US and International
 * patents. This notice and attribution to Taligent may not be removed.
 *   Taligent is a registered trademark of Taligent, Inc.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */

/**
 *
 * Table of Java supplied standard locale elements
 *
 * automatically generated by java LocaleTool LocaleElements.java
 *
 * Date Created: Wed Aug 21 15:47:57  1996
 *
 *     Locale Elements and Patterns:  last update 10/23/96
 *
 *
 */

// WARNING : the format of this file will change in the future!

package java.text.resources;

import java.util.ListResourceBundle;

public class LocaleElements_pl extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    public Object[][] getContents() {
        return new Object[][] {
            { "LocaleString", "pl_PL" }, // locale id based on iso codes
            { "LocaleID", "0415" }, // Windows id
            { "ShortLanguage", "pol" }, // iso-3 abbrev lang name
            { "ShortCountry", "POL" }, // iso-3 abbrev country name
            { "Languages", // language names
                new String[][] {
                    { "pl", "polski" }
                }
            },
            { "Countries", // country names
                new String[][] {
                    { "PL", "Polska" }
                }
            },
            { "MonthNames",
                new String[] {
                    "stycze\u0144", // january
                    "luty", // february
                    "marzec", // march
                    "kwiecie\u0144", // april
                    "maj", // may
                    "czerwiec", // june
                    "lipiec", // july
                    "sierpie\u0144", // august
                    "wrzesie\u0144", // september
                    "pa\u017adziernik", // october
                    "listopad", // november
                    "grudzie\u0144", // december
                    "" // month 13 if applicable
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "sty", // abb january
                    "lut", // abb february
                    "mar", // abb march
                    "kwi", // abb april
                    "maj", // abb may
                    "cze", // abb june
                    "lip", // abb july
                    "sie", // abb august
                    "wrz", // abb september
                    "pa\u017a", // abb october
                    "lis", // abb november
                    "gru", // abb december
                    "" // abb month 13 if applicable
                }
            },
            { "DayNames",
                new String[] {
                    "niedziela", // Sunday
                    "poniedzia\u0142ek", // Monday
                    "wtorek", // Tuesday
                    "\u015broda", // Wednesday
                    "czwartek", // Thursday
                    "pi\u0105tek", // Friday
                    "sobota" // Saturday
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "N", // abb Sunday
                    "Pn", // abb Monday
                    "Wt", // abb Tuesday
                    "\u015ar", // abb Wednesday
                    "Cz", // abb Thursday
                    "Pt", // abb Friday
                    "So" // abb Saturday
                }
            },
            { "Eras",
                new String[] { // era strings
                    "p.n.e.",
                    "n.e."
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###;-#,##0.###", // decimal pattern
                    "z\u0142#,##0.##;-z\u0142#,##0.##", // currency pattern
                    "#,##0%" // percent pattern
                }
            },
            { "NumberElements",
                new String[] {
                    ",", // decimal separator
                    "\u00a0", // group (thousands) separator
                    ";", // list separator
                    "%", // percent sign
                    "0", // native 0 digit
                    "#", // pattern digit
                    "-", // minus sign
                    "E", // exponential
                    "\u2030", // per mille
                    "\u221e", // infinity
                    "\ufffd" // NaN
                }
            },
            { "CurrencyElements",
                new String[] {
                    "z\u0142", // local currency symbol
                    "PLZ", // intl currency symbol
                    "," // monetary decimal separator
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "HH:mm:ss z", // full time pattern
                    "HH:mm:ss z", // long time pattern
                    "HH:mm:ss", // medium time pattern
                    "HH:mm", // short time pattern
                    "d MMMM yyyy", // full date pattern
                    "d MMMM yyyy", // long date pattern
                    "yyyy-MM-dd", // medium date pattern
                    "yy-MM-dd", // short date pattern
                    "{1} {0}" // date-time pattern
                }
            },
            { "CollationElements",
                /* for pl_PL, default sorting except for the following: */
                /* add d<stroke> between d and e. */
                /* add l<stroke> between l and m. */
                /* add z<abovedot> after z.       */
                "& A < a\u0328 , A\u0328 " +      // a < a-ogonek
                "& C < c\u0301 , C\u0301 " +      // c < c-acute
                "& D < \u0111, \u0110 " +         // tal : d < d-stroke
                "& E < e\u0328 , E\u0328 " +      // e < e-ogonek
                "& L < \u0142 , \u0141 " +        // l < l-stroke
                "& N < n\u0301 , N\u0301 " +      // n < n-acute
                "& O < o\u0301 , O\u0301 " +      // o < o-acute
                "& S < s\u0301 , S\u0301 " +      // s < s-acute
                "& Z < z\u0301 , Z\u0301 " +      // z < z-acute
                "< z\u0307 , Z\u0307 "            // z-dot-above
            }
        };
    }
}
