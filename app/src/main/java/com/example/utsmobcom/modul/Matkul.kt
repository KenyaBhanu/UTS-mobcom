package com.example.utsmobcom.modul

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Matkul(
    @StringRes val namaMatkul: Int,
    @StringRes val sksMatkul: Int,
    @DrawableRes val imgMatkul: Int
)
