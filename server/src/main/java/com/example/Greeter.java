package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
 /**
   * @bhavya someone the name of person
   * @return greetinf string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
