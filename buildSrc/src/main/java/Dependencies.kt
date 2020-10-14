import org.gradle.api.JavaVersion

object Application {
    const val minSdk = 23
    const val targetSdk = 30
    const val compileSdk = 30
    const val jvmTarget = "1.8"
    const val versionCode = 5
    const val versionName = "1.0.0"

    val targetCompat = JavaVersion.VERSION_1_8
    val sourceCompat = JavaVersion.VERSION_1_8
}

object Versions {
    object Essential {
        const val AppCompat = "1.2.0"
        const val Anko = "0.10.8"
        const val Kotlin = "1.4.10"
        const val Gradle = "4.0.2"
    }

    object Ktx {
        const val Core = "1.3.2"
        const val Fragment = "2.3.0"
    }

    object Jetpack {
        const val Navigation = "2.3.0"
    }

    object Ui {
        const val ReflowAnimator = "1.0.0-SNAPSHOT"
        const val SmoothBottomBar = "1.7.6"
        const val Lottie = "3.4.4"
        const val Material = "1.2.1"
        const val Glide = "4.11.0"
        const val CardView = "1.0.0"
        const val ConstraintLayout = "2.0.2"
    }

    object Util {
        const val AndroidUtils = "4.0.3"
        const val CarshReporter = "1.1.0"
    }
}

object Dependencies {
    object Essential {
        const val AppCompat = "androidx.appcompat:appcompat:${Versions.Essential.AppCompat}"
        const val Anko = "org.jetbrains.anko:anko:${Versions.Essential.Anko}"
        const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Essential.Kotlin}"
    }

    object Ktx {
        const val NavigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.Jetpack.Navigation}"
        const val NavigationUi =
            "androidx.navigation:navigation-ui-ktx:${Versions.Jetpack.Navigation}"
        const val Core = "androidx.core:core-ktx:${Versions.Ktx.Core}"
        const val Fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.Ktx.Fragment}"
    }

    object Ui {
        const val ReflowAnimator =
            "com.shazam:android-reflow-animator:${Versions.Ui.ReflowAnimator}"
        const val SmoothBottomBar =
            "com.github.ibrahimsn98:SmoothBottomBar:${Versions.Ui.SmoothBottomBar}"
        const val Lottie = "com.airbnb.android:lottie:${Versions.Ui.Lottie}"
        const val Material = "com.google.android.material:material:${Versions.Ui.Material}"
        const val Glide = "com.github.bumptech.glide:glide:${Versions.Ui.Glide}"
        const val CardView = "androidx.cardview:cardview:${Versions.Ui.CardView}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.Ui.ConstraintLayout}"
    }

    object Util {
        const val GlideCompiler = "com.github.bumptech.glide:compiler:${Versions.Ui.Glide}"
        const val AndroidUtils = "com.github.sungbin5304:SBT:${Versions.Util.AndroidUtils}"
        const val CrashReporter =
            "com.balsikandar.android:crashreporter:${Versions.Util.CarshReporter}"
    }
}