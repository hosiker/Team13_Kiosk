package com.example.kiosk

class SelfRice : AbstractRice() {
    override fun abstractRice(name: String, price: Int): String{
        val name = "셀프 주먹밥"
        val price = 3000
        println("${name} 을 선택하셨습니다.")
        println("${price}원 입니다.")
        println("")
        return name
    }
}