package com.github.satoshun.example.simpledagger

import android.app.Application
import javax.inject.Inject
import javax.inject.Provider

class App : Application() {
  lateinit var appComponent: AppComponent

  @Inject lateinit var values: Map<Class<out Any>, @JvmSuppressWildcards Provider<Any>>

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.builder().build()
    appComponent.inject(this)
  }

  inline fun <reified T> get(): T = values[T::class.java]!!.get() as T
}
