package com.example.kiosk.Kiosk_mainKt

import com.example.kiosk.RiceMenu

fun main(){
    while(true) {
        println("술집이름")
        println("메뉴를 선택해 주세요.")

        println("0.종료")

        println("1.탕류")
        println("2.밥류")
        println("3.마른안주")
        println("4.주류")

        val num1: Int = readLine()!!.toInt()

        when(num1) {
            0-> {
                break
            }
            1-> {
                println("1.탕류 클래스를 불러옵니다.")
                //        menu1()
            }

            2-> {
                //          menu2()
            }
            3-> {
                //          menu3()
            }

            4-> {
                //          menu4()
            }
            else-> {
                println("다시 선택해 주세요")
                continue
            }
        }

    }

    //meue1() 탕류 : 김민우
    //menu2() 밥류 : 허다겸
    //menu3() 마른안주 : 이소연
    //menu4() 주류 : 이호식
}