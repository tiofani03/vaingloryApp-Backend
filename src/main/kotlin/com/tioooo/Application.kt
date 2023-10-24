package com.tioooo

import com.tioooo.plugins.configureDefaultHeader
import com.tioooo.plugins.configureHTTP
import com.tioooo.plugins.configureKoin
import com.tioooo.plugins.configureMonitoring
import com.tioooo.plugins.configureRouting
import com.tioooo.plugins.configureSerialization
import com.tioooo.plugins.configureStatusPages
import io.ktor.server.application.Application

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureDefaultHeader()
    configureHTTP()
    configureKoin()
    configureMonitoring()
    configureRouting()
    configureSerialization()
    configureStatusPages()
}
