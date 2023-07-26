package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem
import com.example.kiosk.Utils.MenuItems

class Filefish(): AbstractDry() {
    override fun abstractDry(): MenuItem {
        return MenuItems.filefish  // object MenuItemise 정의된 cuttlefish 반환
    }
}