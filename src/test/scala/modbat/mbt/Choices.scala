package modbat.mbt

import org.scalatest._

class Choices extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "Choices1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=5","--no-redirect-out","--show-choices","modbat.test.Choices"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "Choices2" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("--mode=dot","--show-choices","modbat.test.Choices"), ModbatTestHarness.setTestJar, td, Some("modbat.test.Choices.dot","choices.dot"))
    result._2 shouldBe empty
  }
}
