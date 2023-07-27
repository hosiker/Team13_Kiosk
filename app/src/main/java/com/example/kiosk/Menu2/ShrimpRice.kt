package com.example.kiosk.Menu2

class ShrimpRice : AbstractRice() {
    override fun abstractRice() : MenuIteam {
        val name = "새우볶음밥"
        val price = 5000
        val deict = "새우가 들어가 있는 볶음 밥"
        return MenuIteam (name, price, deict)
    }
}