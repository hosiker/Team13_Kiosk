package com.example.kiosk.Menu2

abstract class AbstractRice {
    abstract fun abstractRice() : MenuIteam
}
data class MenuIteam(val name: String, val price : Int, val deict : String)
