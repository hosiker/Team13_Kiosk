package com.example.kiosk.Menu3

class Filefish(): AbstractDry() {
    override fun abstractDry(name: String, price: Int, depict: String): MenuItem {
        return MenuItem(name, price, depict)
    }
}