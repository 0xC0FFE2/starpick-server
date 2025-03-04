pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        kotlin("jvm") version "2.1.10"
        kotlin("plugin.spring") version "2.1.10"
        kotlin("plugin.jpa") version "2.1.10"
        id("org.springframework.boot") version "3.4.3"
        id("io.spring.dependency-management") version "1.1.7"
    }
}

rootProject.name = "starpick"

include("starpick-core")
include("starpick-infrastructure")
include("starpick-persistence")
include("starpick-presentation")