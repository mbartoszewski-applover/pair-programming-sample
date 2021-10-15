@file:Suppress("NoWildcardImports", "WildcardImport")

import Config.AppPlugin.*

object Config {

    object Versions {
        const val kotlinGradlePlugin = "1.4.30"
        const val googleServices = "4.3.5"

        const val kotlin = "1.4.30"
        const val coroutines = "1.4.3"
        const val appcompat = "1.3.0-beta01"
        const val material = "1.4.0-alpha01"
        const val constraintLayout = "2.1.0-alpha2"
        const val lifecycle = "2.2.0"
        const val lifecycleVM = "2.3.0"
        const val arch = "2.1.0"
        const val coreKtx = "1.5.0-beta02"
        const val fragmentKtx = "1.3.0"
        const val junit = "4.13.2"
        const val mockk = "1.11.0"
        const val testRunner = "1.1.3-alpha04"
        const val espresso = "3.4.0-alpha04"
        const val assertk = "0.12"
        const val viewBindingDelegate = "1.0.0"
        const val glide = "4.12.0"
    }

    val buildscriptPlugins = listOf(
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}",
        "com.google.gms:google-services:${Versions.googleServices}"
    )

    val projectPlugins = listOf(
        Pair("org.jetbrains.kotlin.plugin.serialization", Versions.kotlin)
    )

    val appBuildPlugins = listOf<String>()

    val appPlugins = listOf(
        AndroidPlugin("com.android.application"),
        KotlinPlugin("android"),
        KotlinPlugin("kapt"),
        AndroidPlugin("kotlin-parcelize")
    )

    val libs = listOf(
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutines}",
        "androidx.appcompat:appcompat:${Versions.appcompat}",
        "com.google.android.material:material:${Versions.material}",
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}",
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}",
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVM}",
        "androidx.core:core-ktx:${Versions.coreKtx}",
        "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}",
        "com.github.Zhuinden:fragmentviewbindingdelegate-kt:${Versions.viewBindingDelegate}",
        "com.github.bumptech.glide:glide:${Versions.glide}"
    )

    val testLibs = listOf(
        "junit:junit:${Versions.junit}",
        "io.mockk:mockk:${Versions.mockk}",
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}",
        "com.willowtreeapps.assertk:assertk-jvm:${Versions.assertk}",
        "androidx.arch.core:core-testing:${Versions.arch}"
    )

    val androidTestLibs = listOf(
        "androidx.test.espresso:espresso-core:${Versions.espresso}",
        "androidx.test.ext:junit-ktx:${Versions.testRunner}"
    )

    val kaptLibs = listOf(
        "com.github.bumptech.glide:compiler:${Versions.glide}"
    )

    sealed class AppPlugin(open val name: String) {
        class AndroidPlugin(name: String) : AppPlugin(name)
        class KotlinPlugin(name: String) : AppPlugin(name)
    }
}
