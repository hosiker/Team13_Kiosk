package com.example.kiosk.Menu2

import com.example.kiosk.Utils.MenuItem

class KimchiRice : AbstractRice() {
    override fun info() : MenuItem {
        val name = "김치볶음밥"
        val price = 5000
        val deict = "매콤한 김치가 들어가 매콤한 김치볶음밥"
        return  MenuItem (name, price, deict)
    }
}

