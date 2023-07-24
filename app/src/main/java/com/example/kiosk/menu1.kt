package com.example.kiosk

import java.lang.NumberFormatException

fun main(){ //


Menu1().tang()

//var menu2 = Menu1("나가사끼탕 ",  20000, " 해산물과 나가사키의 조화")
//var menu3 = Menu1("해물얼큰짬뽕탕 ",  20000, " 매콤 얼큰 짬뽕탕")
//var menu4 = Menu1("김치우동전골 ",  20000, " 김치와 우동의 콤비")


//menu1.tang()
//menu2.tang1()
//menu3.tang1()
//menu4.tang1()

}


open class Menu1 {

    open fun tang() {

        while (true) {
            println("1. 뒤로가기")
            println("[탕 메뉴]")
            println("2. 어묵탕")
            println("3. 나가사키탕")
            println("4. 해물얼큰짬뽕탕")
            println("5. 김치우동전골")

            var sel1: Int?

            try {

                var input: Int? = readLine()?.toInt()
                if (input != null) {
                    sel1 = input.toInt()
                    when (sel1) {

                        2 -> {
                            println("2번 어묵탕이 선택되었습니다. 가성비끝판왕")
                            return
                        }

                        3 -> {
                            println("3번 나가사끼탕이 선택되었습니다. 존맛존맛 담백한 나가사끼")
                            return
                        }

                        4 -> {
                            println("4번 해물얼큰짬뽕탕이 선택되었습니다. 존맛존맛 얼큰한 해물얼큰짬뽕탕")
                            return
                        }

                        5 -> {
                            println("5번 김치우동전골이 선택되었습니다. 한국인의 맛")
                            return
                        }

                        0 -> {
                            println("프로그램 종료")
                            break
                        }
                        1 -> {
                            println("뒤로가기 종료")
                            return
                        }

                        else -> {

                            println("입력이 없습니다. 숫자를 입력해주세요. ")

                        }
                    }
                } else {
                    println("입력이 없습니다. 숫자를 입력해주세요.")
                    continue
                }

            } catch (e: NumberFormatException) {
                println("잘못된 입력입니다. 숫자를 입력해주세요.")
                continue
            }
        }
    }
}
//
//    var name: String = ""
//    var price: Int = 0
//    var explain: String = ""
//
//    constructor(_name: String, _price: Int, _explain: String) {
//        print("${_name}")
//        print("${_price}원")
//        println("${_explain}")
//
//        name = _name
//        price = _price
//        explain = _explain







//
//        if (sel1 == 2) {
//            println("2번 어묵탕이 선택되었습니다. (굿초이스 갓성비)")
//        } else if (sel1 == 3) {
//            println("3번 나가사키탕이 선택되었습니다.")
//        } else if (sel1 == 4) {
//            println("4번 해물얼큰짬뽕탕이 선택되었습니다.")
//        } else if (sel1 == 5) {
//            println("4번 김치우동전골이 선택되었습니다.")
//        } else if (sel1 == 0) {
//            println("프로그램 종료")
//        } else {
//            println("뒤로가기예정")
//        }
//    }
//}

//    open fun tang2() {
//
//    }
//
//    open fun tang3() {
//
//    }
//
//    open fun tang4() {
//
//    }
//}