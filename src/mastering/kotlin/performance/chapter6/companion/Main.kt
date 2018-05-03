@file:JvmName("Main")
package mastering.kotlin.performance.chapter6.companion

@JvmField
var prevId = -1

class Main private constructor() {

    private var id: Int? = null

    companion object {

        @JvmStatic
        fun newInstance(): Main {
            val main = Main()
            main.id = ++prevId
            return main
        }
    }
}