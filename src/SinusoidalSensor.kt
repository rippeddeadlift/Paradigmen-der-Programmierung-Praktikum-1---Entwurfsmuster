import kotlin.math.PI
import kotlin.math.sin

class SinusoidalSensor(private val amplitude: Double, private val frequency: Double, private val phaseShift: Double) : Sensor {
    override fun getTemperature(): Double {
        val currentTime = System.currentTimeMillis() / 1000.0 // Zeit in Sekunden
        return amplitude * sin(2 * PI * frequency * currentTime + phaseShift)
    }
}