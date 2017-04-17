import org.junit.Test;
import scala.collection.mutable.ListBuffer;

import static org.junit.Assert.assertEquals;

public class ControlUnitTest {
    @Test
    public void testThatXXXX() {
        ListBuffer<Sensor> sensorList = new ListBuffer<>();
        sensorList.append(new FireSensor());
        ListBuffer<Notifier> notiferList = new ListBuffer<>();
        ControlUnit controlUnit = new ControlUnit(sensorList, notiferList);
        boolean isTriggered = sensor.isTriggered();
        assertEquals(false, isTriggered);
    }

}

/*

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmokeSensorTest {

  @Test
  public void testThatIsTriggeredReturnsFalse() {
    SmokeSensor sensor = new SmokeSensor();
    boolean isTriggered = sensor.isTriggered();
    assertEquals(false, isTriggered);
  }

  @Test
  public void testThatGetLocationReturnsNull() {
    SmokeSensor sensor = new SmokeSensor();
    String location = sensor.getLocation();
    assertEquals(null, location);
  }

  @Test
  public void testThatGetSensorTypeReturnsNull() {
    SmokeSensor sensor = new SmokeSensor();
    String sensorType = sensor.getSensorType();
    assertEquals(null, sensorType);
  }

  @Test
  public void testThatGetBatteryPercentageReturnsNegativeOne() {
    SmokeSensor sensor = new SmokeSensor();
    double batteryPercentage = sensor.getBatteryPercentage();
    assertEquals(-1.0, batteryPercentage, 0.01);
  }

}
*/