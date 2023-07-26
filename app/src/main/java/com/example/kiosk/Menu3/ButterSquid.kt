package com.example.kiosk.Menu3

import com.example.kiosk.Utils.MenuItem
import com.example.kiosk.Utils.MenuItems

class ButterSquid: AbstractDry() {
    override fun abstractDry(): MenuItem {
        return MenuItems.butterSquid  // object MenuItems에서 정의된 butterSquid를 반환
    }
}