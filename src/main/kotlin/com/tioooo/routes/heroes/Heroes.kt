package com.tioooo.routes.heroes

import com.tioooo.model.ApiResponse
import com.tioooo.model.Hero
import com.tioooo.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import org.koin.ktor.ext.inject

fun Route.heroes() {
    val heroRepository: HeroRepository by inject()

    route("/vainglory/heroes") {
        get {
            try {
                val page = call.request.queryParameters["page"]?.toInt() ?: 1
                val limit = call.request.queryParameters["limit"]?.toInt() ?: 5
                val name = call.request.queryParameters["name"]

                name?.let {
                    val apiResponse = heroRepository.searchHeroes(name)
                    call.respond(
                        message = apiResponse,
                        status = HttpStatusCode.OK,
                    )
                    return@let
                } ?: run {
                    val apiResponse = heroRepository.getAllHeroes(
                        page = page,
                        limit = limit,
                    )
                    call.respond(
                        message = apiResponse,
                        status = HttpStatusCode.OK,
                    )
                }

            } catch (e: NumberFormatException) {
                call.respond(
                    message = ApiResponse<List<Hero>>(success = false, message = "Only number allowed"),
                    status = HttpStatusCode.BadRequest,
                )
            } catch (e: IllegalArgumentException) {
                call.respond(
                    message = ApiResponse<List<Hero>>(success = false, message = "Heroes not found"),
                    status = HttpStatusCode.NotFound
                )
            }
        }

        get("{id?}") {
            val id = call.parameters["id"] ?: return@get call.respond(
                message = ApiResponse<Hero>(success = false, message = "Hero id must be provided"),
                status = HttpStatusCode.BadRequest
            )

            try {
                val apiResponse = heroRepository.getHeroById(id.toInt())
                call.respond(
                    message = apiResponse,
                    status = HttpStatusCode.OK,
                )
            } catch (e: IllegalArgumentException) {
                call.respond(
                    message = ApiResponse<Hero>(success = false, message = "Hero id must be Int"),
                    status = HttpStatusCode.NotFound
                )
            }
        }
    }
}