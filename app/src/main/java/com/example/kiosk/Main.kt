package com.example.kiosk

import com.example.kiosk.Menu1.Menu1
import com.example.kiosk.Menu2.RiceMenu
import com.example.kiosk.Menu3.MenuThree
import com.example.kiosk.Menu3.AbstractDry
import com.example.kiosk.Menu3.ButterSquid
import com.example.kiosk.Menu3.Calamari
import com.example.kiosk.Menu3.Filefish
import com.example.kiosk.Menu3.Pollack

import com.example.kiosk.Menu4.AbstractDrink
import com.example.kiosk.Menu4.Beer
import com.example.kiosk.Menu4.Highball
import com.example.kiosk.Menu4.Soju

fun main(){
    val menu3List: List<AbstractDry> = listOf(ButterSquid(), Calamari(), Filefish(), Pollack())
    val menu4List: List<AbstractDrink> = listOf(Soju(), Beer(), Highball())
    while(true) {
        println("술집이름")
        println("메뉴를 선택해 주세요.")
        println("0.종료")
        println("1.탕류")
        println("2.밥류")
        println("3.마른안주")
        println("4.주류")
        println("5.메뉴 선택 완료")

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
                var f = RiceMenu().riceMenu()
                //selMeunList.add(f.toString())
            }

            3 -> {
                // Menu3().dry()
                MenuThree().dried(menu3List)
            }

            4 -> {
                //val res = Menu4().menu4()
                //if(res==0) break
                //MenuFour().drink()
            }
            /*5-> {
                println("선택 메뉴 : ${selMeunList}입니다")
                println("이 주문대로 주문 하시겠습니까?")
                var g : Int
                while (true){
                    try {
                        println("1.네  주   문   합  니  다   ")
                        println("2.아니요    조금 더 보겠습니다.")
                        println("3.처음으로 주문내역 삭제됩니다. ")
                        print("원하시는 번호를 선택해 주세요    ")
                        g = readLine()!!.toInt()
                    } catch (riceSelect:java.lang.NumberFormatException){
                        println("선택이 바르지 않습니다. 정확한 숫자만 입력 해 주세요")
                        continue//밑 g 인자가 받아진다 그리고 계속 try 반복하고 break 적용시 밑에 when 문의 break와 continue 가 바뀌어 진다.
                    }
                    when(g){
                        1 -> {
                            //총가격 알려주는 기능 추가해서 완료되었습니다 하기// 빈공간하면 계속 5번반복함
                        }
                        2 -> {
                            break// 키오스크메뉴로 이동 //키오스크메뉴에서 다시 종료(0)을 눌러야 완전히 종료가 되어진다. 어떻게 해야 여기서 종료를 할수 있을까
                        }
                        3 -> {
                            continue//
                            //새로 시작하는 방법 찾기(그냥 종료하는 것도 방법이다.
                        }
                        else -> {
                            println("정확한 숫자를 입력 해주세요")
                        }
                    }
                }

            }*/
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