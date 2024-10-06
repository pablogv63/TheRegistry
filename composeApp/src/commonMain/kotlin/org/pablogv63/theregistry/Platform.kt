package org.pablogv63.theregistry

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform