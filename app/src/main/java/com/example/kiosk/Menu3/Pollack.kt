package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem

class Pollack: AbstractDry() {
    override fun info(): MenuItem {
        val name = "   먹  태   "
        val price = 9000
        val depict = "주당들의 최애안주!! 바삭쫄깃 먹태와 특제 소스가 만났다!!"
        return MenuItem(name, price, depict)
    }
}