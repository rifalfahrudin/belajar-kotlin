fun show(name:String):Unit{
    println("name:" + name)
}

fun show(number:Int):Unit{
    print("number:" + number)
}

fun show(numberD:Double):Unit{
    print("numberD:" + numberD)
}

fun main(args: Array<String>) {
    show("RF")
    show(100)
}