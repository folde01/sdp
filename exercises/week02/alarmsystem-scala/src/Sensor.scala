trait Sensor {
  def isTriggered: Boolean

  def getLocation: String

  def getSensorType: String

  // exe 7: move this to trait BatteryPowered:
  //def getBatteryPercentage: Double

  // exe 6: no longer need  getBatteryPercentage ... breaks I: interface separation principle.
  // clients should only use the interfaces they need.

  // exe 8:
  def getCategory: String
}
