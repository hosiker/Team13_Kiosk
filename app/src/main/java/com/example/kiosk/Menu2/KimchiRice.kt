package com.example.kiosk.Menu2

class KimchiRice : AbstractRice() {
    override fun abstractRice(name: String, price: Int) :String{
        val name = "김치볶음밥"
        val price = 5000
        println("${name}을 선택하셨습니다.")
        println("${price}원 입니다.")
        println("")
        return name
    }
}