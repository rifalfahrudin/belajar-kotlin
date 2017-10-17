/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var map=HashMap<Int, String>()
    map.put(1,"Ahmad")
    map.put(2."Rifal")
    map.put(33."Fahrudin")
    println(map.get(33))

    map.put(33, "Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }
}