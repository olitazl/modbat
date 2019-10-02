package modbat.mbt

import org.scalatest._

class LoopTestWithLaunch extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "LoopTestWithLaunch1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--log-level=fine","--no-redirect-out","--loop-limit=3","modbat.test.LoopTestWithLaunch"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "LoopTestWithLaunch2" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=20","--no-redirect-out","--loop-limit=4","modbat.test.LoopTestWithLaunch"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
