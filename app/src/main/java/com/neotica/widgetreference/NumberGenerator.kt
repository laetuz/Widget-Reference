package com.neotica.widgetreference

import java.util.*

//Step 2
internal object NumberGenerator {
    fun generate(max: Int): Int {
        val random = Random()
        return random.nextInt(max)
    }
}