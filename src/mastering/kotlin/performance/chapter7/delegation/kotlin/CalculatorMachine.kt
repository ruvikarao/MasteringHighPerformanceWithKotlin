package delegation.kotlin

import delegation.Calculator
import delegation.CalculatorBrain

class CalculatorMachine(private val delegate: Calculator): Calculator by delegate  {

    fun printDelagateClassName() {
        println(delegate::class.java.simpleName)
    }

}