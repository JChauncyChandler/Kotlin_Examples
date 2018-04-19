fun main(arg:Array<String>){

    var x = 5
    val y = 7

    println(x + y) // 12

    x = x + y // x = 12

    println(x) // 12

    //y = x + y <-- this throws an error because y is a constant and can't be changed

    //Two ways to print variables to the console
    println("X = " + x) // 12
    println("X = $x") // 12

    println("Y = " + y) // 7
    println("Y = $y") // 7

    var string:String? //Multiple characters and number
    var character:Char? // Single character or number
    var double:Double? // 64 bit number, use when you need only fractional numbers
    var float:Float? // 32 bit number, use when you need a large fractional number
    var long:Long? // 64 bit number, use when you need a whole number over 2 billion
    var int:Int? // 32 bit number, use when you don't need fractional numbers
    var short:Short? // 16 bit number, use if you need 2-byte signed arithmetic
    var byte:Byte? // 8 bit number, use when you need a specific byte
    var boolean:Boolean? // True or False

    string = "Hello, New New York!"
    character = 'c'
    double = 3458263.3782
    float = 543121.23f
    long = 1000000000000000000
    int = 324568
    short = 16200
    byte = 101
    boolean = true

    println(string)
    println(character)
    println(double)
    println(float)
    println(long)
    println(int)
    println(short)
    println(byte)
    println(boolean)


}