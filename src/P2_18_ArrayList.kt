/**
 * Created by SAINTEK 101 on 10/17/2017.
 */
fun main(args: Array<String>) {
    var arraylist= ArrayList<String>()
    arraylist.add("Ahmad")
    arraylist.add("Rifal")
    arraylist.add("Fahrudin")
    arraylist.add("Jepara")

    println("First name:" + arraylist.get(0))

    println("all element by object")
    for (item in arraylist){
        println(item)
    }

    println("=========== Slide 19 ============")

    arraylist.set(0,"Unisnu Jepara")

    println("All Element By index")
    for (index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    //search
    if (arraylist.contains("Hfasfa")) {
        println("name is found")
    }else{
        println("name is not found")
    }
}