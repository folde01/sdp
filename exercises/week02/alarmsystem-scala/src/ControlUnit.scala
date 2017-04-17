/*

**************
*** exe 13 ***
**************

We want to test that an alarm is raised, and also implement different alarm notifica-
tion methods (For example: automatically call the fire department, call the owner’s
phone, and trigger the control unit alarm siren). Plan how you can extract the
announcement logic and:

a) trigger many different announcement strategies:

* ControlUnit will have a reference to a list of Notifier objects.

* Notifier will be our 'abstract strategy'. It will be a trait with a method notify(Sensor).

* Notifier's notify method will take parameter Sensor and interrogate it
for location, type, status etc info in order to generate a notification.

* Several such 'concrete strategies' will implement Notifier eg FireDeptNotifier, PhoneNotifier and
SirenNotifier

* Constructor injection will inject a list of the possible Notifiers into the ControlUnit at runtime.

* ControlUnit will have a method called runNotifier(Notifier) which will use one of the Notifiers from the
injected list and run its notify() method.

* To demonstate this, pollSensor will just run each notifier, in a loop.


b) test that the different strategies was triggered:

* Create a list each of Notifiers and Sensors. pollSensors should run runNotifier on each possible pair and return the
correct results based on the state of each combination of Sensor and Notifier.

* pollSensor should return a list of Notification objects that we can query, making testing easier.
(Notification objects might then passed to a NotificationSender for processing if we were taking
this architecture further.)


*/
import scala.collection.mutable.ListBuffer

class ControlUnit(sl: ListBuffer[Sensor], nl: ListBuffer[Notifier]) {

  private var sensors: ListBuffer[Sensor] = null

  private var notifiers: ListBuffer[Notifier] = null

  def ControlUnit(sl: ListBuffer[Sensor], nl: ListBuffer[Notifier]) = {
    sensors = sl
    notifiers = nl
  }

  def runNotifier(notifier: Notifier, sensor: Sensor): Unit =  notifier.notify(sensor)

  def pollSensors() {
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        // System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
        for (notifier <- notifiers) {
          runNotifier(notifier, sensor)
        }
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }

  def pollSensorsOld() {
    // exe 5: we're no longer creating the list of sensors...
    //sensors += new FireSensor()
    //sensors += new SmokeSensor()
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }
}

object ControlUnit


