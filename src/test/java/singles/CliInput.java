/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package singles;

import static lang.libc.stdio.printf;
import static lang.libc.stdio.scanf;

import langx.MutableInteger;

/**
 *
 * A simple input reader from your command line interface.
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class CliInput {

	public static void main (String ... ignored) {
		// the 4-byte C int type is similar equals to Java int type
		
		int cmdInput = 0;
		
	    printf("Please input an integer value: ");
	    MutableInteger intValue = MutableInteger.valueOf(cmdInput); 
	    scanf("%d", intValue);
	    printf("You entered: %d\n", intValue);

	    System.exit(0);
	}
}
