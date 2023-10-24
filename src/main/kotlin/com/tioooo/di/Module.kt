package com.tioooo.di

import com.tioooo.repository.HeroRepository
import com.tioooo.repository.HeroRepositoryImpl
import org.koin.dsl.module

val RepositoryModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}