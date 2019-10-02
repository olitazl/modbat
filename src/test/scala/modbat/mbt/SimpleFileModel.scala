package modbat.mbt

import org.scalatest._

class SimpleFileModel extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "SimpleFileModel1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=5","--no-redirect-out","modbat.test.SimpleFileModel"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
