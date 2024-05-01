package fizzbuzz_if

fun fizzBuss(num: Int): String {
    var result: String
    if (num % 15 == 0) {
        return "FizzBuzz"
    } else if (num % 3 == 0) {
        return "Fizz"
    } else if (num % 5 == 0) {
        return "Buzz"
    } else {
        return "$num"
    }
}

fun main(arg: Array<String>) {
    val num = 20
    for (i in 1..num) {
        println(fizzBuss(i))
    }
}