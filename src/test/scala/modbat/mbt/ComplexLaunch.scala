package modbat.mbt

import org.scalatest._

class ComplexLaunch extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "ComplexLaunch1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=5","--log-level=debug","--no-redirect-out","modbat.test.ComplexLaunch"), ModbatTestHarness.setTestJar, td)
    result._2 shouldBe empty
  }

  "ComplexLaunch2" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=50","--log-level=fine","--print-stack-trace","--no-redirect-out","modbat.test.ComplexLaunch"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "ComplexLaunch3" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("--mode=dot","--show-choices","modbat.test.ComplexLaunch"), ModbatTestHarness.setTestJar, td, Some("modbat.test.ComplexLaunch.dot","claunch.dot"))
    result._2 shouldBe empty
  }

  "ComplexLaunch4" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--log-level=fine","--no-redirect-out","modbat.test.ComplexLaunch2"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "ComplexLaunch5" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--log-level=fine","--no-redirect-out","modbat.test.ComplexLaunch3"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "ComplexLaunch6" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--log-level=fine","--no-redirect-out","modbat.test.ComplexLaunch4"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "ComplexLaunch7" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--log-level=fine","--no-redirect-out","modbat.test.ComplexLaunch5"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }

  "ComplexLaunch8" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--log-level=fine","--no-redirect-out","modbat.test.ComplexLaunch6"), ModbatTestHarness.setTestJar, td)
    result._2 should not be empty
  }
}
