package com.mohsen.mvvm.viewPagerTrasation

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("android:src")
fun bindImageView(view: ImageView, url: String?) {
    Glide.with(view).load(url).centerCrop().into(view)
}
