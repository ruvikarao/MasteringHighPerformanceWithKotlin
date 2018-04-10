package chapter9.section1

import java.math.BigInteger

class Baker {

    fun bake(): Cake {
        for (i in 0..1_000_000_000) {
            BigInteger.ONE.modPow(BigInteger.TEN, BigInteger.TEN)
        }
        return Cake()
    }
}