package com.example.kiosk.Menu2

class KimchiRice : AbstractRice() {
    override fun abstractRice() : MenuIteam {
        val name = "김치볶음밥"
        val price = 5000
        val deict = "매콤한 김치가 들어가 매콤한 김치볶음밥"
        return  MenuIteam (name, price, deict)
    }
}

