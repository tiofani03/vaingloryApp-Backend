package com.tioooo.routes.news

import com.tioooo.model.ApiResponse
import com.tioooo.model.News
import com.tioooo.repository.NewsRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject


fun Route.news() {
    val newsRepository: NewsRepository by inject()


    route("/vainglory/news") {
        get {
            try {
                val apiResponse = newsRepository.getNews()
                call.respond(
                    message = apiResponse,
                    status = HttpStatusCode.OK,
                )
            } catch (e: IllegalArgumentException) {
                call.respond(
                    message = ApiResponse<News>(success = false, message = "Invalid"),
                    status = HttpStatusCode.NotFound
                )
            }
        }
    }
}