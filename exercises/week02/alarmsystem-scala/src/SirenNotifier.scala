/**
  * Created by jesse on 17/04/17.
  */
class SirenNotifier extends Notifier{

 override def notify(s: Sensor) = {
    System.out.println("Sounding the control unit siren because " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
  }
}
