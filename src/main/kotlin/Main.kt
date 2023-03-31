import kotlin.math.abs

class SugarStorage(_volume:Int = 0)
{
    //volume не может быть отрицательным
    var volume : Int = 0
        set(value) = if (value>0) field = value else field = 0
    //игнорировать отрицательные v
        var a: Int = 0
        set(value) {field=abs(value)}
    //уменьшить баланс хранилища на v
    fun decreaseSugar(v:Int) {
        a = v
        volume = volume - a}
    //увеличить баланс хранилища на v
    fun increaseSugar(v:Int) {
        a = v
        volume = volume + a}
}

fun main(args: Array<String>) {
    println("Hello World!")

    var bug = SugarStorage()
    bug.volume = 100
    println(bug.volume)
    bug.decreaseSugar(20)
    println(bug.volume)
    bug.increaseSugar(-50)
    println(bug.volume)
}