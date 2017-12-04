package mainPackage

import javaClasses.PublicStaticObjects
import java.util.*

var a : Int = 0
var b : Int = 0

fun main(args: Array<String>) {
    println("Application started!")

    val sc : Scanner = Scanner(System.`in`)

    a = sc.nextInt()
    b = sc.nextInt()

    println(PublicStaticObjects.gcd(a, b))

    PublicStaticObjects.start()
}