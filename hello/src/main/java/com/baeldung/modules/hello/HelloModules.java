package com.baeldung.modules.hello;

/**
 * HelloModules
 */
public class HelloModules implements HelloInterface {
  /**
   * Do something
   */
  public static void doSomething() {
    System.out.println("Hello, Modules!");
  }

  /**
   * Say hello
   */
  public void sayHello() {
    System.out.println("Hello!");
  }
}
