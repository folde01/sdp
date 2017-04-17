import scala.util.Random

/**
  * Created by jesse on 16/04/17.
  */
class MotionSensor extends Sensor {

  private var location: String = ""

  def MotionSensor(loc: String) = {
    location = loc
  }

  override def isTriggered: Boolean = new Random().nextInt(100) > 95

  override def getLocation: String = location

  override def getSensorType: String = "motion sensor"

  override def getCategory = "hazard"

}
