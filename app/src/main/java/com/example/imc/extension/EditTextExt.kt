package com.example.imc.extension

import android.widget.EditText

fun EditText.valueDouble() = this.value().toDouble()

fun EditText.value() = this.text.toString()