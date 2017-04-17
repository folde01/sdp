import scala.util.Random

// have to add BatteryPowered here or we get error on override getBatteryPercentage
// as we're no longer overriding anything there...
class SmokeSensor extends Sensor with BatteryPowered {

  private var battery = 100

  private var location: String = ""

  def FireSensor(loc: String) = {
    location = loc
  }

  override def isTriggered: Boolean = new Random().nextInt(100) > 90

  override def getLocation: String = location

  override def getSensorType: String = "smoke sensor"


  override def getBatteryPercentage: Double = {
    if (battery > 0) battery -= 10
    battery
  }

  override def getCategory = "hazard"

}
