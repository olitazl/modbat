package modbat.test

import modbat.dsl._

abstract class BaseModel extends Model {
  @Before def init { System.err.println("Hello.") }
}
