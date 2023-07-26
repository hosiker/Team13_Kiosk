package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem
import com.example.kiosk.Utils.MenuItems

class Pollack: AbstractDry() {
    override fun abstractDry(): MenuItem {
        return MenuItems.pollack  // object MenuItemise 정의된 pollack 반환
    }
}