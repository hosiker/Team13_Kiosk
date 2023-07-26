package com.example.kiosk.Menu2

class SelfRice : AbstractRice() {
    override fun abstractRice(): MenuIteam {
//        val name = "셀프 주먹밥"
//        val price = 3000
        println("셀프 주먹밥을 선택하셨습니다.")
        println("3000원 입니다.")
        println("")
        return MenuIteam (name = "셀프주먹밥", price = 3000)
    }
}