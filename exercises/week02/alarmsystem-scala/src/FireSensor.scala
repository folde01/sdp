import scala.util.Random

class FireSensor(val location: String, val sensorType: String) extends Sensor {

  private var battery = 100

  override def isTriggered: Boolean = new Random().nextInt(100) > 95

  override def getLocation: String = location

  override def getSensorType: String = sensorType

  override def getBatteryPercentage: Double = {
    if (battery > 0) battery -= 10
    battery
  }

}
