package com.tioooo.di

import com.tioooo.repository.HeroRepository
import com.tioooo.repository.HeroRepositoryImpl
import com.tioooo.repository.NewsRepository
import com.tioooo.repository.NewsRepositoryImpl
import org.koin.dsl.module

val RepositoryModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
    single<NewsRepository> {
        NewsRepositoryImpl()
    }
}