package modbat.test

import modbat.dsl._

class SubModel5 extends SubModel4 {
  // transitions
  "init" -> "err" := System.out.println("Goodbye!")
}
