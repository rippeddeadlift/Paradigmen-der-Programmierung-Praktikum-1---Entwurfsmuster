import kotlin.math.PI
import kotlin.math.sin

class SinusoidalSensor(private val amplitude: Double, private val frequency: Double) : Sensor {
    private var phaseShift = 0.1
    private var time = 0.0
    override fun getTemperature(): Double {


        // y(t)=Asin(2πft+ϕ)
        time += 0.153
        val y = amplitude * sin(2 * PI * frequency * time + phaseShift)
        return y
    }
}