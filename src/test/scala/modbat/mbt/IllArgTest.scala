package modbat.mbt

import org.scalatest._

class IllArgTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "IllArgTest1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=1","modbat.test.IllArgTest","--no-redirect-out","--log-level=fine"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
