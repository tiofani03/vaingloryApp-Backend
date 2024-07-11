package com.tioooo.repository

import com.tioooo.data.generateNewsData
import com.tioooo.model.ApiResponse
import com.tioooo.model.News

class NewsRepositoryImpl : NewsRepository {
    override suspend fun getNews(): ApiResponse<List<News>> {
        return ApiResponse(
            success = true,
            message = "Success",
            data = generateNewsData(),
            lastUpdated = System.currentTimeMillis(),
        )
    }
}