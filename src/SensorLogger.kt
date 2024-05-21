class SensorLogger(var sensor:Sensor) : Sensor {
    override fun getTemperature(): Double {
        val temp = sensor.getTemperature()
        println("SensorLogger: Current Temperature = $temp")
        return temp
    }
}