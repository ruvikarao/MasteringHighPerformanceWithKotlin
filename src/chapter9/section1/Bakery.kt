package chapter9.section1

import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors

class Bakery {
    fun order(amountOfCakes: Int): List<Cake> {
        val cakes = mutableListOf<Cake>()
        val baker = Baker()
        val bakingTask = Runnable {
            cakes.add(baker.bake())
        }
        for (i in 0 until amountOfCakes) {
            bakingTask.run()
        }
        return cakes
    }

    fun fastOrder(amountOfCakes: Int): List<Cake> {
        val cakes = mutableListOf<Cake>()
        val baker = Baker()
        val countDownLatch = CountDownLatch(amountOfCakes)
        val bakingTask = Runnable {
            cakes.add(baker.bake())
            countDownLatch.countDown()
        }
        val executor = Executors.newFixedThreadPool(amountOfCakes)
        for (i in 0 until amountOfCakes) {
            executor.execute(bakingTask)
        }
        executor.shutdown()
        countDownLatch.await()
        return cakes
    }
}

fun main(args: Array<String>) {
    val cakes = Bakery().fastOrder(amountOfCakes = 10)
    println("Number of cakes: ${cakes.size}")
}