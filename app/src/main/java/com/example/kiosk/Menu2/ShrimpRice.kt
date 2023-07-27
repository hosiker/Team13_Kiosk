package com.example.kiosk.Menu2

import com.example.kiosk.Utils.MenuItem

class ShrimpRice : AbstractRice() {
    override fun info() : MenuItem {
        val name = "새우볶음밥"
        val price = 5000
        val deict = "새우가 들어가 있는 볶음 밥"
        return MenuItem (name, price, deict)
    }
}