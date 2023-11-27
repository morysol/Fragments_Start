package com.fragments_start

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(
    val animalType: String,
    val infoShort: String,
    val infoFull: String,
    val picture: Int,
    val url: String,
) : Parcelable