package com.sai.fabula.utils

import android.app.Activity
import android.widget.Toast
//menampilkan massage dari berita
fun Activity.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(applicationContext, message, duration).show()
}
