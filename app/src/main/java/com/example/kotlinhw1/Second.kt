package com.example.kotlinhw1

class Second {
    companion object {
        fun copyClass(): First {
            return First().copy(name = "Igor", secondName = "Rybakov")
        }

    }
}