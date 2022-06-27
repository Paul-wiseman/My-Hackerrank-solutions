package catAndMouse

import java.util.concurrent.atomic.AtomicInteger

fun main() {

    println(catAndMouse(1,2,3))
    val animalType2 = listOf("dog" to "bulldog",
        "dog" to "beagle",
        "cat" to "persian",
        "dog" to "poodle",
        "cat" to "russian blue",
        "cat" to "siamese")
    val animalTypes = listOf("dog", "dog", "cat", "dog", "cat", "cat")
    val factory = AnimalFactory()
    for (t in animalTypes) {
        val c = factory.createAnimal(t)
        println("${c.id} - ${c}")
    }

}

/* sample question
* 1 2 3
  1 3 2
    * expected answer
    * Cat A
      Mouse C
    * */
fun catAndMouse(x: Int, y: Int, z: Int): String {

    val catAPosition = Math.abs(x - z)
    val catBPosition = Math.abs(y - z)

    println("catA Difference --- $catAPosition")
    println("catB Difference --- $catBPosition")

    return if (catAPosition < catBPosition) {
        "Cat A"
    } else if (catBPosition < catAPosition) {
        "Cat A"
    } else {
        "Mouse C"
    }
}

object MySingleton{
    private val counter = AtomicInteger(0)
    fun increament (): Int = counter.incrementAndGet()
}

interface Animal{
    val id:Int
}

class Dog(override val id: Int):Animal{
    val name = "Dog"
}
class Cat(override val id: Int):Animal{
    val name = "Cat"
}

class AnimalFactory {
    var counter = 0
    fun createAnimal(animalType: String) : Animal {
        var counter = 0
        return when(animalType.trim().toLowerCase()) {
            "cat" -> Cat(++counter)
            "dog" -> Dog(++counter)
            else -> throw RuntimeException("Unknown animal $animalType")
        }
    }
}
interface Bui<in UnitType, out ProduceUnit> where UnitType :Enum<*>, ProduceUnit:Unit{

}
interface Building<in UnitType, out ProducedUnit>
        where UnitType : Enum<*>, ProducedUnit : Unit {
    fun build(type: UnitType) : ProducedUnit
}

