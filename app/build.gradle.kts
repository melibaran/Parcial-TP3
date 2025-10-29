plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    alias(libs.plugins.devtools.ksp)
    alias(libs.plugins.hilt.android)

}

android {
    namespace = "com.example.clase5"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.clase4"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    //ROOM:
    implementation(libs.androidx.room.paging)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)

    implementation(libs.coil.network.okhttp)

    //SERIALIZATION:
    implementation(libs.kotlinx.serialization.json)

    //Para ROOM:
    val room_version = "2.8.2"


    //COMPOSE:
    implementation(platform(libs.androidx.compose.bom))

    //HILT NAVIGATION COMPOSE:
    implementation(libs.hilt.navigation.compose)

    //NAVIGATION:
    implementation(libs.androidx.navigation.compose)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.ui.text.google.fonts)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    //COIL:
    implementation(libs.coil.compose)

    //HILT:
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.android)


    //RETROFIT:
    implementation(libs.retrofit)
    implementation(libs.converter.gson)


    //Para ROOM dependencies:
    ksp("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-rxjava2:$room_version")
    implementation("androidx.room:room-rxjava3:$room_version")
    implementation("androidx.room:room-guava:${room_version}")
    testImplementation ("androidx.room:room-testing:$room_version")

    //TESTS:
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}