package org.example
//
//fun main(args: Array<String>) {
//    println("Hello, World")
//}

import kotlinx.coroutines.*
import java.time.LocalDateTime

fun main() = runBlocking { // this: CoroutineScope
    var current = LocalDateTime.now()
    println("1当前日期和时间为: $current")
    println("Hello")
    for(i in 1..10000) {
        launch { doWorld() }
    }
    current = LocalDateTime.now()
    println("2当前日期和时间为: $current")
    println("World!")
}

// this is your first suspending function
suspend fun doWorld() {
    delay(1000L)
}

