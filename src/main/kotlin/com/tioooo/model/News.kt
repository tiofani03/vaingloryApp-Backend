package com.tioooo.model

import kotlinx.serialization.Serializable

@Serializable
data class News (
    val id: Int,
    val title: String,
    val description: String,
    val image: String,
    val fullUrl: String,
)
