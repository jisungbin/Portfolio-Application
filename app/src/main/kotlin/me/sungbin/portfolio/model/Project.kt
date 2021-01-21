package me.sungbin.portfolio.model

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import me.sungbin.portfolio.module.GlideApp

/**
 * Created by SungBin on 2020-10-15.
 */

data class Project(
    val name: String,
    val description: String,
    val link: String,
    val bannerImageLink: String
) {
    companion object {
        @JvmStatic
        @BindingAdapter("image")
        fun setImage(imageView: ImageView, imageAddress: String) {
            GlideApp.with(imageView.context).load(imageAddress).into(imageView)
        }
    }
}
