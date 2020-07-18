package junit

import java.lang.System.getProperty
import java.util.*

fun lol(): Int {
    println("Enter The Sentense")
    val str = "axxaxa"
    var result = 0
    val w = HashMap<Char, Int>()
    for (i in str.indices) {
        w[str[i]] = if (w[str[i]] == null) 1 else w[str[i]]!! + 1
    }
    for (i in w.keys) {
        if ((w[i]?.rem(2)) != 0 ) {
            println(1)
            println(i.toString() + ":" + w[i])
            result++
        }
    }
    return result
}

fun main() {
    println(lol())
}