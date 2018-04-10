package chapter9.section1

fun main(args: Array<String>) {
    val number = Runtime.getRuntime().availableProcessors()
    println("Number of available processors: $number")
}