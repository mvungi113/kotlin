import java.util.Random


class LuckDispatcher {
    fun getNumber(){
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main(){
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()
    val d3 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
    d3.getNumber()


    rentPrice(10,2,1)

    DoAuth.takeParams("Foo", "QrQy172")

    BigBen.getBongs(12)

}


/// object expression

fun rentPrice(standardDays : Int, festivistyDays: Int, specialDays:Int){
    val dayRates = object  {
        var standard: Int = 30 * standardDays
        var festivisty : Int = 50 * festivistyDays
        var special: Int = 100 * specialDays

    }

    val total = dayRates.standard + dayRates.festivisty + dayRates.special
    println("Total price : $$total")
}
// object declaration
object DoAuth{
    fun takeParams(username:String, password:String){
        println("Input Auth Parameters = $username:$password")
    }
}

//companion Objects

class BigBen {
    companion object Bonger{
        fun getBongs(nTimes:Int){
            for (i in 1 .. nTimes){
                println("$i BONG ")
            }

        }
    }
}