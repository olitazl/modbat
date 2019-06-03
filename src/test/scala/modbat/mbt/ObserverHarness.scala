package modbat.mbt

import org.scalatest._

class ObserverHarness extends FlatSpec with Matchers {
  "ObserverHarness1" should "pass" in {
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.ObserverHarness"), ModbatTestHarness.setTestJar)
    result._1 should be(0)
    result._3 shouldBe empty
  }



  "ObserverHarness2" should "pass" in {
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.ObserverHarness2"), ModbatTestHarness.setTestJar)
    result._1 should be(0)
    result._3 shouldBe empty
  }



  "ObserverHarness3" should "pass" in {
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.ObserverHarness3"), ModbatTestHarness.setTestJar)
    result._1 should be(0)
    result._3 shouldBe empty
  }



  "ObserverHarness4" should "pass" in {
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.ObserverHarness4"), ModbatTestHarness.setTestJar)
    result._1 should be(0)
    result._3 shouldBe empty
  }



  "ObserverHarness5" should "pass" in {
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.ObserverHarness5"), ModbatTestHarness.setTestJar)
    result._1 should be(0)
    result._3 shouldBe empty
  }



  "ObserverHarness6" should "pass" in {
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.ObserverHarness6"), ModbatTestHarness.setTestJar)
    result._1 should be(0)
    result._3 shouldBe empty
  }



  "ObserverHarness7" should "pass" in {
    val result = ModbatTestHarness.testMain(Array("-s=1","-n=2","--no-redirect-out","--log-level=fine","modbat.test.ObserverHarness7"), ModbatTestHarness.setTestJar)
    result._1 should be(0)
    result._3 shouldBe empty
  }



}