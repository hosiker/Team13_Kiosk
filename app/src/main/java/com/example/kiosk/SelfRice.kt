package com.example.kiosk

class SelfRice : AbstractRice() {
    override fun abstractRice() {
        println("셀프 주먹밥 을 선택하셨습니다.")
        return
    }
}