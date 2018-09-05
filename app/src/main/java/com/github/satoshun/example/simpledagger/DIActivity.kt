package com.github.satoshun.example.simpledagger

import android.app.Activity
import androidx.fragment.app.Fragment

inline fun <reified T> Activity.get(): T {
  return (application as App).get()
}

inline fun <reified T> Activity.inject() = lazy { get<T>() }

inline fun <reified T> Fragment.get(): T {
  return (requireActivity().application as App).get()
}

inline fun <reified T> Fragment.inject() = lazy { get<T>() }
