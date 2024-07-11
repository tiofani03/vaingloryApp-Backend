package com.tioooo.repository

import com.tioooo.data.heroesData
import com.tioooo.model.Hero
import com.tioooo.model.ApiResponse
import com.tioooo.utils.calculatePage
import com.tioooo.utils.findData
import com.tioooo.utils.provideData

class HeroRepositoryImpl : HeroRepository {
    override val heroes: List<Hero>
        get() = heroesData

    override suspend fun getAllHeroes(page: Int, limit: Int): ApiResponse<List<Hero>> {
        return ApiResponse(
            success = true,
            message = "Success",
            prevPage = calculatePage(
                tList = heroesData,
                page = page,
                limit = limit,
            )["prevPage"],
            nextPage = calculatePage(
                tList = heroesData,
                page = page,
                limit = limit,
            )["nextPage"],
            data = provideData(
                listData = heroesData,
                page = page,
                limit = limit,
            ),
            lastUpdated = System.currentTimeMillis(),
        )
    }

    override suspend fun searchHeroes(name: String): ApiResponse<List<Hero>> {
        return ApiResponse(
            success = true,
            message = "OK",
            data = heroes.findData(name)
        )
    }

    override suspend fun getHeroById(id: Int): ApiResponse<Hero> {
        val hero = heroes.find { it.id == id }
        return if (hero != null) {
            ApiResponse(
                success = true,
                message = "OK",
                data = hero
            )
        } else {
            ApiResponse(
                success = false,
                message = "Hero not found",
                data = null
            )
        }
    }

    override suspend fun getHeroByRole(role: String): ApiResponse<List<Hero>> {
        return ApiResponse(
            success = true,
            message = "Success",
            data = heroesData.filter { it.role == role },
            lastUpdated = System.currentTimeMillis(),
        )
    }
}