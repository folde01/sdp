import scala.util.Random

class FireSensor extends Sensor with BatteryPowered {

  private var battery = 100

  private var location: String = ""

  def FireSensor(loc: String) = {
    location = loc
  }

  override def isTriggered: Boolean = new Random().nextInt(100) > 95

  override def getLocation: String = location

  override def getSensorType: String = "fire sensor"

  override def getBatteryPercentage: Double = {
    if (battery > 0) battery -= 10
    battery
  }

  override def getCategory = "hazard"

}
