package com.d360.xorc.draenor

import org.jooby.run

fun main(args: Array<String>) {
    run(*args) {
        get("/") { "Hello world" }
    }
}
