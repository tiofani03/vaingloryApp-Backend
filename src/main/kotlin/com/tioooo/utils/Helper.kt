package com.tioooo.utils

import com.tioooo.model.Hero

fun <T> calculatePage(
    tList: List<T>,
    page: Int,
    limit: Int,
): Map<String, Int?> {
    val allData = tList.windowed(
        size = limit,
        step = limit,
        partialWindows = true,
    )

    require(page > 0 && page <= allData.size)

    val prevPage = if (page == 1) null else page - 1
    val nextPage = if (page == allData.size) null else page + 1

    return mapOf(
        "prevPage" to prevPage,
        "nextPage" to nextPage
    )
}

fun <T> findDataGeneral(data: List<T>, query: String?): List<T> {
    if (query.isNullOrEmpty()) return emptyList()
    return data.filter { it.toString().contains(query, ignoreCase = true) }
}
fun List<Hero>.findData(query: String?): List<Hero> {
    if (query.isNullOrEmpty()) return emptyList()
    return this.filter { it.name.contains(query, ignoreCase = true) }
}



fun <T> provideData(
    listData: List<T>,
    page: Int,
    limit: Int,
): List<T> {
    val allData = listData.windowed(
        size = limit,
        step = limit,
        partialWindows = true,
    )
    require(page > 0 && page <= allData.size)
    return allData[page - 1]
}
