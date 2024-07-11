package com.tioooo.repository

import com.tioooo.model.ApiResponse
import com.tioooo.model.News

interface NewsRepository {
    suspend fun getNews(): ApiResponse<List<News>>
}