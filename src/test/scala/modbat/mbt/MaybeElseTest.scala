package modbat.mbt

import org.scalatest._

class MaybeElseTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "MaybeElseTest1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=1","modbat.test.MaybeElseTest","--maybe-probability=0.0","--no-redirect-out"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "MaybeElseTest2" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=1","modbat.test.MaybeElseTest","--maybe-probability=1.0","--no-redirect-out"), ModbatTestHarness.setTestJar, td)
    result._2 shouldBe empty
  }

  "MaybeElseTest3" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=1","modbat.test.MaybeElseTest2","--maybe-probability=0.0","--no-redirect-out"), ModbatTestHarness.setTestJar, td)
    result._2 shouldBe empty
  }

  "MaybeElseTest4" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=1","modbat.test.MaybeElseTest2","--maybe-probability=1.0","--no-redirect-out"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
