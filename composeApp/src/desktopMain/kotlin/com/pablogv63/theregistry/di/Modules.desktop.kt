package com.pablogv63.theregistry.di

import com.pablogv63.theregistry.dependencies.DbClient
import com.pablogv63.theregistry.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)

}