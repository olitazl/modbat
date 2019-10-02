package modbat.mbt

import org.scalatest._

class NoSelfJoin extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "NoSelfJoin1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=1","--no-redirect-out","--log-level=fine","modbat.test.NoSelfJoin"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
