import scala.collection.mutable.ListBuffer
import java.util.Calendar


/**
  * Created by jesse on 16/04/17.
  */
class SecurityControlUnit(sl: ListBuffer[Sensor]) extends ControlUnit(sl) {

  private var sensors = ListBuffer[Sensor]

  override def pollSensors() =
    if (curHourIsBetween(22, 6))
      super.pollSensors()

  def curHourIsBetween(startHr: Int, endHr: Int): Boolean = {
    val curHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    curHour >= startHr && curHour <= endHr
  }

  def SecurityControlUnit(sl: ListBuffer[Sensor]) = {
    // this doesn't compile - we get:
    // Expression of type ListBuffer[Sensor] doesn't conform to expected type
    // (Seq[Sensor]) => ListBuffer[Sensor]
    // why??? need to read up on generics?
    sensors = sl
  }

  // exe 10: Open-closed principle: extend to change behaviour

}
