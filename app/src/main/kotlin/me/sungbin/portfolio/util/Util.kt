package me.sungbin.portfolio.util

import android.content.Context
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.net.toUri

object Util {
    fun openTab(context: Context, address: String) {
        val builder = CustomTabsIntent.Builder().build()
        builder.launchUrl(
            context,
            address.toUri()
        )
    }
}
