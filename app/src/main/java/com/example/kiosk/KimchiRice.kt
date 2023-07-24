package com.example.kiosk

class KimchiRice : AbstractRice() {
    override fun abstractRice() {
        println("김치볶음밥을 선택하셨습니다.")
        println("5,000원 입니다.")
        return
    }
}