package com.example.kiosk.Menu2

import com.example.kiosk.Utils.MenuItem

class SelfRice : AbstractRice() {
    override fun info(): MenuItem {
        val name = "셀프주먹밥"
        val price = 3000
        val deict = "나는 탄수화물이 필요하다 내 마음대로 만들어 먹는 주먹밥"
        return MenuItem (name, price, deict )
    }
}