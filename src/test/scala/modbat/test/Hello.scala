package modbat.test

import modbat.dsl._

class Hello extends Model {
  // transitions
  "init" -> "next" := {
    System.out.println("Hello, World!")
  }
  "next" -> "end" := skip
  "next" -> "err" := { assert(false) }
}
