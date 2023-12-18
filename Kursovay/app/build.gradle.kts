@file:Suppress("")


plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.kursovay"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kursovay"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

 androidResources
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        mlModelBinding = true
    }

    dependencies {



    // Support Libraries
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    // AndroidDraw Library
    implementation ("com.github.divyanshub024:AndroidDraw:v0.1")

    // Task API
    implementation ("com.google.android.gms:play-services-tasks:18.0.2")

    //TODO: Add TF Lite
    implementation ("org.tensorflow:tensorflow-lite:2.8.0")
    implementation ("com.github.divyanshub024:AndroidDraw:v0.1")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test:runner:1.5.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
}}
dependencies {
    implementation("org.tensorflow:tensorflow-lite-support:0.1.0")
    implementation("org.tensorflow:tensorflow-lite-metadata:0.1.0")
}




