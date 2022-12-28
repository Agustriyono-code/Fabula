package com.sai.fabula.utils

import java.util.*

//menetukan jarak upda berita
fun isNight(): Boolean {
    val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    return (currentHour <= 7 || currentHour >= 18)
}
