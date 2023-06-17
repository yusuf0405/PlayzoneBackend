package com.playzone.di

import com.playzone.dao.user.UserDao
import com.playzone.dao.user.UserDaoImpl
import com.playzone.repository.UserRepository
import com.playzone.repository.UserRepositoryImpl
import org.koin.dsl.module

val appModule = module {
    single<UserRepository> { UserRepositoryImpl(get()) }
    single<UserDao> { UserDaoImpl() }
}