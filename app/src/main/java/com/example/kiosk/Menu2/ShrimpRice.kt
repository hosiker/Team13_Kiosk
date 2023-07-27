package com.example.kiosk.Menu2

class ShrimpRice : AbstractRice() {
    override fun abstractRice() : MenuIteam {
        val name = "김치볶음밥"
        val price = 5000
        val deict = "매본ㅇㄹㄴㅇㄹ"
        return MenuIteam (name, price, deict)
    }
}