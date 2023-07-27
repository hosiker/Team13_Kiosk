package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem

class ButterSquid: AbstractDry() {
    override fun info(): MenuItem {
        val name = "버터오징어구이"
        val price = 9000
        val depict = "진~한 버터에 한바탕 뒹군 오징어"
        return MenuItem(name, price, depict)
    }
}
