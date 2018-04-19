fun main(arg:Array<String>){

    var x = 5
    var y = 7

    // '==' is a comparison operator. It asks does 'x' equal '5' and returns a boolean of true or false
    if(x == 5){
        println("X = 5")
    }

    // since x doesn't equal 7 this if statement will not run
    if(x == 7){
        println("X = 7")
    }

    // '!=' is the opposite of '==', it asks if 'x' does not equal '7'
    if(x != 7){
        println("X != 7")
    }

    if(x == 5 && y == 7){

    }

    if(x == 4 || y == 7){

    }

    // This is an 'if-else' statement.
    if(x == 6){ // If x equals 6 then do what is in my curly braces
        println("x == 6")
    }else{ // If x does not equals 6 then do what is in my curly braces
        println("X != 6")
    }

    // A nested if-else statement contains multiple if statements
    if(x != 5){
        println("X != 5")
    }else if(y == 5){
        println("Y != 5")
    }else{
        println("X = 5 and Y != 5")
    }

    // If the If statement only has one line curly braces are not needed
    if(x == 5)
        println("No curly braces needed :)")
}