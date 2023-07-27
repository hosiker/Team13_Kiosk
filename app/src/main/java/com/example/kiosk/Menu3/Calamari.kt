package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem

class Calamari: AbstractDry() {
    override fun info(): MenuItem {
        val name = "   한  치   "
        val price = 9000
        val depict = "깨끗하게 건조한 1등급 한치, 씹을수록 고소한 맛!"
        return MenuItem(name, price, depict)
    }
}
