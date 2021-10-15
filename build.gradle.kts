buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        Config.buildscriptPlugins.forEach { plugin -> classpath(plugin) }
    }
}

plugins {
    Config.projectPlugins.forEach { (id, version) -> id(id) version version }
}

repositories {
    gradlePluginPortal()
}

subprojects {
    repositories {
        mavenCentral()
        google()
        maven("https://jitpack.io")
        jcenter()
    }
}

tasks.register("clean").configure {
    delete(rootProject.buildDir)
}
