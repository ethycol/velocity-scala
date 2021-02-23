package hello

import org.scalatest.funsuite.AnyFunSuite

class VelocityScalaSuite extends AnyFunSuite {
  test("Test that 'Hello' string is correct") {
    assert(Constants.hello == "Hello, World")
  }
}