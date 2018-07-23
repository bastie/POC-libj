/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
 
package lang.libc;

import langx.MutableInteger;

/**
 * A simple facade for standard c library.
 * 
 * @author Sͬeͥbͭaͭsͤtͬian
 *
 */
public class stdio {

  /**
   * Indicate end-of-file conditions
   */
  public final static int EOF = -1;
  
  /**
   * A <code> printf </code> implementation.  
   * @param stringToPrint the string
   */
  public final static void printf (String stringToPrint) {
	  System.out.printf(stringToPrint);
  }

  /**
   * A <code> printf </code> implementation with parameters.  
   * @param stringToPrint the string
   * @param parametersToIntegrateInString parameters to format string
   */
  public final static void printf (String stringToPrint, String ... parametersToIntegrateInString) {
	  System.out.printf(stringToPrint, (Object[]) parametersToIntegrateInString);
  }


  /**
   * A <code> printf </code> implementation with parameters.  
   * @param stringToPrint the string
   * @param parametersToIntegrateInString parameters to format string
   */
  public final static void printf (String stringToPrint, Object ... parametersToIntegrateInString) {
	  for (int i = 0; i < parametersToIntegrateInString.length; i++) {
		  if (parametersToIntegrateInString[i] instanceof MutableInteger) {
			  parametersToIntegrateInString[i] = ((MutableInteger)parametersToIntegrateInString[i]).integerValue();
		  }
	  }
	  System.out.printf(stringToPrint, (Object[]) parametersToIntegrateInString);
  }
  
  public final static void scanf (String stringFormat, MutableInteger inputResult) {
	  try {
		  String s = System.console().readLine();
		  int newValue = Integer.parseInt(s.split(" ")[0]);
		  inputResult.setValue(newValue);
	  }
	  catch (Throwable onErrorReturnZero) {
		  inputResult.setValue(0);
	  }
  }
}
