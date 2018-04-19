fun main(args:Array<String>){

    var x=10
    var y= 12
    val arr = arrayOf(5, 15, 23, 53, 2, 1, 10, 37)

    val arr2 = sortArray(arr)
    for (x in arr2){
        println(x)
    }
    println(addValues(x, y))
}

fun addValues(num1:Int, num2:Int): Int {

    return num1 + num2
}

fun sortArray(arr:Array<Int>): Array<Int> {
    arr.sort()
    return arr
}