package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem
import com.example.kiosk.Utils.MenuItems

class Calamari: AbstractDry() {
    override fun abstractDry(): MenuItem {
        return MenuItems.calamari  // object MenuItems에서 정의된 calamari를 반환
    }
}