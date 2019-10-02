package modbat.mbt

import org.scalatest._

class CounterModel extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "CounterModel1" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=30","--no-redirect-out","modbat.examples.CounterModel"), ModbatTestHarness.setExamplesJar, td)
    result._2 should not be empty
  }

  "CounterModel2" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("--mode=dot","--auto-labels","modbat.examples.CounterModel"), ModbatTestHarness.setExamplesJar, td, Some("modbat.examples.CounterModel.dot","counter.dot"))
    result._2 shouldBe empty
  }

  "CounterModel3" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=30","--no-redirect-out","modbat.examples.CounterModel2"), ModbatTestHarness.setExamplesJar, td)
    result._2 should not be empty
  }

  "CounterModel4" should "pass" in { td =>
    val result = ModbatTestHarness.testMain(Array("--mode=dot","--auto-labels","modbat.examples.CounterModel2"), ModbatTestHarness.setExamplesJar, td, Some("modbat.examples.CounterModel2.dot","counter2.dot"))
    result._2 shouldBe empty
  }
}
