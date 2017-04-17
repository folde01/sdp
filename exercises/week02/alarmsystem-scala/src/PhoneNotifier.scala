/**
  * Created by jesse on 17/04/17.
  */
class PhoneNotifier extends Notifier{
  override def notify(s: Sensor) = {
    System.out.println("Phoning owner with message: " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
  }

}
