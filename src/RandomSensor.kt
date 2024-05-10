import kotlin.random.Random

class RandomSensor(private val min: Double, private val max: Double) : Sensor {
    init {
        require(min < max) { "Min value must be less than max value" }
    }

    override fun getTemperature(): Double {
        return Random.nextDouble(min, max)
    }
}