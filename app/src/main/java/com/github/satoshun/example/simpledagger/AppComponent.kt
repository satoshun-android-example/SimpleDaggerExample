package com.github.satoshun.example.simpledagger

import dagger.Binds
import dagger.Component
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

@Component(modules = [HogeModule::class])
interface AppComponent {
  val values: Map<Class<out Any>, @JvmSuppressWildcards Provider<Any>>
}

@Module
interface HogeModule {
  @Binds @IntoMap @Key(Hoge1::class) fun bindHoge1(hoge: Hoge1): Any
  @Binds @IntoMap @Key(Hoge2::class) fun bindHoge2(hoge: Hoge2): Any
}

class Hoge1 @Inject constructor()
class Hoge2 @Inject constructor()
class IllegalHoge @Inject constructor()

@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class Key(val value: KClass<out Any>)
