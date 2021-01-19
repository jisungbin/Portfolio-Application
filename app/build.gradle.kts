plugins {
    id("com.android.application")
    id("name.remal.check-dependency-updates") version "1.2.2"
    kotlin("android")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Application.compileSdk)
    defaultConfig {
        minSdkVersion(Application.minSdk)
        targetSdkVersion(Application.targetSdk)
        versionCode = Application.versionCode
        versionName = Application.versionName
        multiDexEnabled = true
        setProperty("archivesBaseName", "v$versionName ($versionCode)")
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            isDebuggable = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
    }

    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/library_release.kotlin_module")
    }

    compileOptions {
        sourceCompatibility = Application.sourceCompat
        targetCompatibility = Application.targetCompat
    }

    kotlinOptions {
        jvmTarget = Application.jvmTarget
    }
}

dependencies {
    fun def(vararg dependencies: String) {
        for (dependency in dependencies) implementation(dependency)
    }

    def(
        Dependencies.Essential.AppCompat,
        Dependencies.Essential.Kotlin,

        Dependencies.Ktx.Core,
        Dependencies.Ktx.NavigationUi,
        Dependencies.Ktx.NavigationFragment,
        Dependencies.Ktx.Fragment,

        Dependencies.Ui.SmoothBottomBar,
        Dependencies.Ui.Lottie,
        Dependencies.Ui.Browser,
        Dependencies.Ui.Material,
        Dependencies.Ui.Glide,
        Dependencies.Ui.CardView,
        Dependencies.Ui.ConstraintLayout,

        Dependencies.Util.AndroidUtils,
        Dependencies.Util.CrashReporter
    )

    kapt(Dependencies.Util.GlideCompiler)
    kapt(Dependencies.Util.AndroidUtilsCompiler)
}
