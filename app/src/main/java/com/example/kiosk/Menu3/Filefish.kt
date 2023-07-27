package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem

class Filefish: AbstractDry() {
    override fun info(): MenuItem {
        val name = " 튀 김 쥐 포 "
        val price = 3000
        val depict = "바삭하고 고소해서 한입! 나도 모르게 또 한입!"
        return MenuItem(name, price, depict)
    }
}