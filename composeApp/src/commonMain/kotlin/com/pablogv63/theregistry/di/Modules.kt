package com.pablogv63.theregistry.di

import com.pablogv63.theregistry.dependencies.MyRepository
import com.pablogv63.theregistry.dependencies.MyRepositoryImpl
import com.pablogv63.theregistry.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule:Module

val sharedModule = module {
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    viewModelOf(::MyViewModel)
}