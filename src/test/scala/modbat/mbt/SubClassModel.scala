package modbat.mbt

import org.scalatest._

class SubClassModel extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "SubClassModel1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=1","--no-redirect-out","modbat.test.SubClassModel"), ModbatTestHarness.setTestJar, td)
    result._2 shouldBe empty
  }
}
