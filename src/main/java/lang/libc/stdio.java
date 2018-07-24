/*
 * Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
 
package lang.libc;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

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
  
  /**
   * A <code> scanf </code> implementation.
   * @param __TODO__stringFormat ignored
   * @param inputResult return value
   */
  public final static void scanf (String __TODO__stringFormat, MutableInteger inputResult) {
	  try {
		  String s = System.console().readLine();
		  int newValue = Integer.parseInt(s.split(" ")[0]);
		  inputResult.setValue(newValue);
	  }
	  catch (Throwable onErrorReturnZero) {
		  inputResult.setValue(0);
	  }
  }
  
  public static final FILE stdout = FILE.getStdout();
  public static final FILE STDOUT_FILENO = FILE.getStdout();

  /**
   * A simple stream implementation 
   * @author Sͬeͥbͭaͭsͤtͬian
   *
   */
  public static class FILE {
	  
	  /**
	   * Flag, want to write...
	   */
	  private boolean output = false;
	  /**
	   * Delegate, to write...
	   */
	  private OutputStream outputStreamDelegate;
	  static FILE getStdout () {
		  FILE result = new FILE ();
		  result.output = true;
		  result.outputStreamDelegate = System.out;
		  return result;
	  }
	  
  }
}
