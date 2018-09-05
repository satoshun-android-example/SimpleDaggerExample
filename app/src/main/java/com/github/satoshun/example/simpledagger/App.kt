package com.github.satoshun.example.simpledagger

import android.app.Application
import javax.inject.Provider

class App : Application() {
  val values: Map<Class<out Any>, @JvmSuppressWildcards Provider<Any>> by lazy {
    DaggerAppComponent.builder().build().values
  }

  inline fun <reified T> get(): T = values[T::class.java]!!.get() as T
}
