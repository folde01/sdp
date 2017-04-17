/**
  * Created by jesse on 17/04/17.
  */
class FireDeptNotifier extends Notifier{
  override def notify(s: Sensor) = {
    System.out.println("Notifying fire department: " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
  }
}
