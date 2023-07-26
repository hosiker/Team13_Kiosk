package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem

class Pollack: AbstractDry() {
    override fun info(): MenuItem {
        val name = "먹태"
        val price = 13000
        val depict = "주당들의 최애안주!! 바삭쫄깃 먹태와 특제 소스가 만났다!!"
        return MenuItem(name, price, depict)
    }
}
/*
class Pollack: AbstractDry() {
    override fun abstractDry(): MenuItem {
        return MenuItems.pollack  // object MenuItemise 정의된 pollack 반환
    }
}*/
