package modbat.mbt

import org.scalatest._

class TickTockTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "TickTockTest1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.TickTockTest"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "TickTockTest2" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--show-choices","modbat.test.TickTockTest"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
