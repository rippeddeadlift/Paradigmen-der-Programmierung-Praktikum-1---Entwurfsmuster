class Thermometer(var sensor: Sensor) : TemperatureSubject {
    fun measure(times: Int) {
        var tmp = 0.0
        repeat(times) {
            val newTmp = sensor.getTemperature()
            if (newTmp != tmp) {
                for (a in observers) {
                    a.update(newTmp)
                }
                tmp = newTmp
            }
        }
    }

    override val observers: MutableList<TemperatureObserver> = mutableListOf()

    override fun addObserver(o: TemperatureObserver) {
        observers.add(o)
    }

    override fun removeObserver(o: TemperatureObserver) {
        observers.remove(o)
    }
}