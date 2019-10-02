package modbat.test

import modbat.dsl._

class Child6(var id: Int) extends Model {
  val origId = id
  @Before def child_before { System.out.println("child " + origId + ":before") }
  @After def child_after { System.out.println("child " + origId + ":after") }
  // transitions
  "init" -> "running" := skip
  "running" -> "running" := {
    id = id + 1
  }
  "running" -> "done" := {
    assert (id < 5)
  }
}
