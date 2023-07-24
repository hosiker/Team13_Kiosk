package com.example.kiosk.Kiosk_mainKt

import com.example.kiosk.RiceMenu

fun main(){
    while(true) {
        println("술집이름")

        println("1.매장 내 식사")
        println("2.포장하기")
        println("3.종료")

        val num1: Int = readLine()!!.toInt()

        if (num1 == 1) {
            //      kioskmenu()
        }
        if (num1 == 2) {
            //         kioskmenu()
        }
        if (num1 == 3) {
            break
        } else {
            println("다시 선택해 주세요")
            continue
        }

    }

    //meue1() 탕류 : 김민우
    //menu2() 밥류 : 허다겸
    //menu3() 마른안주 : 이소연
    //menu4() 주류 : 이호식
}