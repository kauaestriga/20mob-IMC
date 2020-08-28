package com.example.imc.extension

fun Double.format(digits: Int) = String.format("%.${digits}f", this)