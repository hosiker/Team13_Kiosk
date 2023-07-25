package com.example.kiosk

import com.example.kiosk.Menu1.Menu1
import com.example.kiosk.Menu2.AbstractRice
import com.example.kiosk.Menu2.KimchiRice
import com.example.kiosk.Menu2.RiceMenu
import com.example.kiosk.Menu2.SelfRice
import com.example.kiosk.Menu2.ShrimpRice

import com.example.kiosk.Menu3.Menu3
import com.example.kiosk.Menu3.AbstractDry
import com.example.kiosk.Menu3.ButterSquid
import com.example.kiosk.Menu3.Calamari
import com.example.kiosk.Menu3.Filefish
import com.example.kiosk.Menu3.Pollack

import com.example.kiosk.Utils.Kiosk.cart

fun main(){
    // val menu1List: List<> = listOf()
    val menu2List: List<AbstractRice> = listOf(KimchiRice(), SelfRice(), ShrimpRice())
    val menu3List: List<AbstractDry> = listOf(ButterSquid(), Calamari(), Filefish(), Pollack())
    //val menu4List: List<AbstractDrink> = listOf(Soju(), Beer(), Highball())
    while(true) {
        println("===술집이름===")
        println("메뉴를 선택해 주세요.")
        println("1.탕류")
        println("2.밥류")
        println("3.마른안주")
        println("4.주류")
        println("5.카트")
        println("0.종료")

        print("입력: ")
        val num1: Int = readLine()!!.toInt()

        when(num1) {
            0-> {
                break //선택된메뉴 실행되지 않음.
            }

            1 -> {
                println("1.탕류 클래스를 불러옵니다.")

                Menu1().tang()
            }

            2-> {
                RiceMenu().riceMenu1(menu2List)
            }

            3 -> {
                Menu3().dried(menu3List)
            }

            4 -> {
                //MenuFour().drink(menu4List)
            }
            5-> {
                cart.viewCart()  // 카드에 담긴 항목을 보여줌
                continue
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