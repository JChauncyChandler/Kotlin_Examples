fun main(arg:Array<String>){

    val x = 5

    // when statements work 'when' a value is true. They replace the C-Style switch statements
    when(x) {
        1 -> println("X == 1")
        3 -> println("X == 3")
        5 -> println("X == 5") // This is true and will be the only line that runs
        else -> {
            println("X is not 1, 3, or 5")
        }
    }

    when(x) {
        1 -> println("X == 1")
        3 -> println("X == 3")
        7 -> println("X == 5")
        else -> {
            println("X is not 1, 3, or 7") // The first 3 lines were false, the else statement fires when all the other cases are false
        }
    }

    when(x) {
        1, 3, 5 -> println("X == 1, 3, or 5") // You can include a range of specific numbers to checked against
        else -> {
            println("X is not 1, 3, or 5")
        }
    }

    when(x) {
        in 1..10 -> {
            println("X is between 1 and 10") // Range can be defined this way as well
        }

        !in 1..10 -> {
            println("X is not between 1 and 10")
        }
    }
}