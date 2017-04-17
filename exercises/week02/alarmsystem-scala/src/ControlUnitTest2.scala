import junit.framework.Test

import scala.collection.mutable.ListBuffer

/**
  * Created by jesse on 17/04/17.
  */
class ControlUnitTest2 {
  @Test
  def testThatNoSensorsTriggered() {
    val sensors = new ListBuffer[Sensor]()
    sensors += (new FireSensor, new MotionSensor, new SmokeSensor)
    // not sure what to test, as the sensors are only supposed to be triggered occasionally?
    var anyTriggered = false
    for (sensor <- sensors) {
      if (sensor.isTriggered) anyTriggered = true
    }
    assert(false, anyTriggered)
  }

}

/*
    val notifiers = new ListBuffer[Notifier]()
    notifiers += (new PhoneNotifier, new SirenNotifier, new FireDeptNotifier)
    val controlUnit = new ControlUnit(sensors, notifiers);
import org.junit.Test;
import scala.collection.mutable.ListBuffer;

import static org.junit.Assert.assertEquals;

public class ControlUnitTest {

}
 */
