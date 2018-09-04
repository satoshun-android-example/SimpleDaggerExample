package com.github.satoshun.example.simpledagger

import android.app.Activity

inline fun <reified T> Activity.get(): T {
  return (application as App).get()
}
