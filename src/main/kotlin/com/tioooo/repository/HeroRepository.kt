package com.tioooo.repository

import com.tioooo.model.ApiResponse
import com.tioooo.model.Hero

interface HeroRepository {
    val heroes: List<Hero>

    suspend fun getAllHeroes(page: Int = 1, limit: Int = 5): ApiResponse<List<Hero>>

    suspend fun searchHeroes(name: String): ApiResponse<List<Hero>>

    suspend fun getHeroById(id: Int): ApiResponse<Hero>

    suspend fun getHeroByRole(role: String): ApiResponse<List<Hero>>

}