package com.example.kiosk.Menu2

class KimchiRice : AbstractRice() {
    override fun abstractRice() : MenuIteam {
        println("김치볶음밥을 선택하셨습니다.")
        println("5000원 입니다.")
        println("")
        return  MenuIteam (name = "김치볶음밥", price = 5000)
    }
}

