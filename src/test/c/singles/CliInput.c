/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */

#include <stdio.h>

/**
 * A simple input reader from your command line interface.
 *
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
int main(void)
{
    int cmdInput = 0; // the initialize is important, because it isn't defined what value it gets with non numeric input

    printf("Please input an integer value: ");
    scanf("%d", &cmdInput);
    printf("You entered: %d\n", cmdInput);

    return 0;
}
