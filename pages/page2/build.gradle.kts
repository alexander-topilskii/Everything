plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        minSdkVersion(21)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":ui:holder:userHolder"))
    implementation(project(":ui:holder:simpleTextHolder"))
    implementation(project(":ui:holder:baseViewHolder"))
    implementation(project(":viewModel"))
    implementation(project(":dataProducer"))
    implementation(project(":ui:mybenchmark"))
    implementation(project(":ui:recycler"))

    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
}