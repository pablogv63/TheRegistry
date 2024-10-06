package com.pablogv63.theregistry

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform