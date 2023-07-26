package com.example.kiosk.Menu2

class ShrimpRice : AbstractRice() {
    override fun abstractRice() : MenuIteam {

        println("새우볶음밥을 선택하셨습니다.")
        println("5000원 입니다")
        println("")
        return MenuIteam (name = "새우볶음밥", price = 5000)
    }
}