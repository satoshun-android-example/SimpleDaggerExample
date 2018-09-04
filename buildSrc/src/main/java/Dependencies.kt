object Vers {
  val compile_sdk = 28
  val min_sdk = 21
  val target_sdk = 28

  val kotlin = "1.2.61"
  val couroutine = "0.24.0"
  val ktlint = "0.24.0"
}

object Libs {
  val android_plugin = "com.android.tools.build:gradle:3.3.0-alpha08"
  val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
  val dokka_plugin = "org.jetbrains.dokka:dokka-android-gradle-plugin:0.9.16"
  val safeargs_plugin = "android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0-alpha04"
  val versions_plugin = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"

  val dagger = "com.google.dagger:dagger:2.17"
  val dagger_compiler = "com.google.dagger:dagger-compiler:2.17"
  val dagger_android = "com.google.dagger:dagger-android:2.17"
  val dagger_android_support = "com.google.dagger:dagger-android-support:2.17"
  val dagger_android_compiler = "com.google.dagger:dagger-android-processor:2.17"
}
