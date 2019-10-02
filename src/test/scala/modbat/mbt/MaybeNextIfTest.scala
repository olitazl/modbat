package modbat.mbt

import org.scalatest._

class MaybeNextIfTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "MaybeNextIfTest1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--log-level=fine","--no-redirect-out","--maybe-probability=0.3","modbat.test.MaybeNextIfTest"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "MaybeNextIfTest2" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=3","--log-level=fine","--no-redirect-out","--maybe-probability=0.3","modbat.test.MaybeNextIfTest2"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "MaybeNextIfTest3" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=3","--log-level=fine","--no-redirect-out","--maybe-probability=0.9","modbat.test.MaybeNextIfTest3"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "MaybeNextIfTest4" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=3","--log-level=fine","--no-redirect-out","--maybe-probability=0.48","modbat.test.MaybeNextIfTest4"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "MaybeNextIfTest5" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=3","--log-level=fine","--no-redirect-out","--maybe-probability=0.48","modbat.test.MaybeNextIfTest5"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
