module com.baeldung.library.core {
  exports com.baeldung.library.core;
  // Line below is needed to test package-private methods. See
  // givenTheLibraryWithABook_whenRemoveABook_thenLibraryIsEmpty
  // in library-test project.
  // Since this requires the module to be in module path always,
  // it's better to add this during test execution. See build.gradle
  // in library-test
  // opens com.baeldung.library.core to com.baeldung.library.test;
}
