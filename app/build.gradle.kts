@file:Suppress("MagicNumber")

val debug = "debug"
val appName = "Pair Programming sample"

plugins {
    for (plugin in Config.appPlugins) {
        when (plugin) {
            is Config.AppPlugin.AndroidPlugin -> id(plugin.name)
            is Config.AppPlugin.KotlinPlugin -> kotlin(plugin.name)
        }
    }
}

buildscript {
    repositories {
        mavenCentral()
        maven("https://jitpack.io")
        jcenter()
    }
    dependencies {
        Config.appBuildPlugins.forEach { plugin -> classpath(plugin) }
    }
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "pl.applover.sample"
        minSdkVersion(23)
        targetSdkVersion(30)
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    signingConfigs {
        getByName(debug) {
            keyAlias = "androiddebugkey"
            keyPassword = "android"
            storeFile = file("keystore/debug.keystore")
            storePassword = "android"
        }
    }
    buildTypes {
        getByName(debug) {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-debug-rules.pro", "proguard-rules.pro")
            applicationIdSuffix = ".$debug"
            versionNameSuffix = ".1.$debug"
            resValue("string", "app_name", "$appName $debug")
        }
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    Config.libs.forEach(::implementation)
    Config.testLibs.forEach(::testImplementation)
    Config.androidTestLibs.forEach(::androidTestImplementation)
    Config.kaptLibs.forEach(::kapt)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    val experimentalTime = "-Xopt-in=kotlin.time.ExperimentalTime"
    val requiresOptIn = "-Xopt-in=kotlin.RequiresOptIn"

    kotlinOptions.freeCompilerArgs += listOf(experimentalTime, requiresOptIn)
}
