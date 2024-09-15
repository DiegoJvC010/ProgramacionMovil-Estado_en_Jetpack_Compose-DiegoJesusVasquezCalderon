package com.example.basicstatecodelab

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }