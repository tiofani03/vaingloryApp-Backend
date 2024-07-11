package com.tioooo.plugins

import com.tioooo.routes.heroes.heroes
import com.tioooo.routes.news.news
import com.tioooo.routes.root
import io.ktor.server.application.Application
import io.ktor.server.http.content.staticResources
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        root()
        heroes()
        news()
        staticResources("/images", "images")
    }
}
