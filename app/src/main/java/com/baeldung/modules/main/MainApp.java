package com.baeldung.modules.main;

import com.baeldung.modules.hello.HelloModules;
import com.baeldung.modules.hello.HelloInterface;

import java.util.ServiceLoader;

/**
 * MainApp
 */
public class MainApp {
  /**
   * Main method for MainApp
   * @param args Command line arguments
   */
  public static void main(String[] args) {
    HelloModules.doSomething();
    Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
    HelloInterface service = services.iterator().next();
    service.sayHello();
  }
}
