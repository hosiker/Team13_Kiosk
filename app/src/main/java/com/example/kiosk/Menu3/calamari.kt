package com.example.kiosk.Menu3

class calamari: AbstractDry() {
    override fun abstractDry(name: String, price: Int, depict: String): MenuItem {
        return MenuItem(name, price, depict)
    }
}