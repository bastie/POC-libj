/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
 
package lang.libc;
 
/**
 * 
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class stdio {

  /**
   * indicate end-of-file conditions
   */
  public final static int EOF = -1;
  
  /**
   * 
   * @param s
   */
  public final static void printf (String s) {
	  System.out.printf(s);
  }
}
