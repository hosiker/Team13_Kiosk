package com.example.kiosk.Menu3

// 마른안주 추상화
abstract class AbstractDry {
    abstract fun abstractDry(name: String, price: Int, depict: String): MenuItem
}

data class MenuItem(val name: String, val price: Int, val depict: String)