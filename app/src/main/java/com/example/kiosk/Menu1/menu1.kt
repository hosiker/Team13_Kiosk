package com.example.kiosk.Menu1

import com.example.kiosk.Menu2.AbstractRice
import com.example.kiosk.Menu2.KimchiRice
import java.lang.NumberFormatException


fun main(){
    val menuList = mutableListOf(
        Menu2("모듬어묵짬뽕 |", 10000, "| 소박한 모듬어묵짬뽕"),
        Menu2("나가사끼짬뽕 |", 20000, "| 담백한 나가사끼짬뽕"),
        Menu2("해물얼큰짬뽕 |", 20000, "| 시원한 해물얼큰짬뽕"),
        Menu2("김치우동짬뽕 |", 15000, "| 칼칼한 김치우동짬뽕")
    )

        for(menu in menuList){
        println("${menu.name} ${menu.price} ${menu.explain}")
    }

    //menuList.add(Menu2("빨간우동전골 |", 18000, "| 존맛존맛존맛"))
    //menuList.removeAt(2)

    //println("----- 변경 후 메뉴 리스트 -----")
    //for (menu in menuList) {
    //    println("${menu.name} ${menu.price} ${menu.explain}")
    //}

    Menu1().tang()
}

data class Menu2(val name: String, val price: Int, val explain: String)

open class Menu1 {

    open fun tang() {
            var a = arrayOf("모듬어묵짬뽕", "나가사끼짬뽕", "해물얼큰짬뽕", "김치우동짬뽕")
        while (true) {
            println("1. 뒤로가기")
            println("")
            println("[탕 메뉴]")
            println("2. ${a[0]}")
            println("3. ${a[1]}")
            println("4. ${a[2]}")
            println("5. ${a[3]}")

            var sel1: Int?

            println("숫자를 꼭 입력하세요 (문자입력시 재입력요청)")

            try {
                var input: Int? = readLine()?.toInt()
                if (input != null) {
                    sel1 = input.toInt()
                    when (sel1) {

                        2 -> {

                            info(omok()).info1()
                            println("")

                            // var num2 = readLine()!!.toInt()
                            // var n2 = Count(num2)
                            // n2.c1()
                            // println("가격은 ${num2 * 10000}원입니다.")

                            //var Omok = omok().abstractTang1(name = "모듬어묵짬뽕", price = 10000)//
                            //var c = KimchiRice().abstractRice(name = "김치볶음밥", price = 5000)
                            //selMenuList.add(c)

                            continue
                        }

                        3 -> {

                            info(nagasaki()).info1()
                            println("")

                            // var num3 = readLine()!!.toInt()
                            // var n3 = Count(num3)
                            // n3.c1()
                            // println("가격은 ${num3 * 20000}원입니다.")
                            continue
                        }

                        4 -> {

                            info(hamul()).info1()
                            println("")

                            // var num4 = readLine()!!.toInt()
                            // var n4 = Count(num4)
                            // n4.c1()
                            // println("가격은 ${num4 * 20000}원입니다.")
                            continue
                        }

                        5 -> {

                            info(kimchiodong()).info1()
                            println("")
                            //var num5 = readLine()!!.toInt()
                            // var n5 = Count(num5)
                            // n5.c1()
                            // println("가격은 ${num5 * 15000}원입니다.")
                            continue
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


//    class Menu2 {
//        var name: String = ""
//        var price: Int = 0
//        var explain: String = ""
//
//        constructor(_name: String, _price: Int, _explain: String) {
//            name = _name
//            price = _price
//            explain = _explain
//        }
//    }
//}


    open class Count(op: Int) {
        var count: Int = 0

        init {

            this.count = op

        }

        open fun c1() {
            println("수량 ${count}개 입니다.")
        }
    }



    //info(omok()).info1()
    class info(val tt: abstractTang1) {
        fun info1() {
            return tt.tang1()

        }
    }

    abstract class abstractTang1() {
        abstract fun tang1()

    }

    class omok : abstractTang1() {
        override fun tang1() {

            val name = "모듬어묵짬뽕"
            val price = 10000
            val explain = "소박한 모듬어묵짬뽕"

            println("${name}이 선택되었습니다.| 10000 | 소박한 묵짬뽕")
            println("수량을 입력하세요")

            //println("${price} 원입니다.")
            var num2 = readLine()!!.toInt()
            var n2 = Count(num2)

            n2.c1()
            println("가격은 ${num2 * price}원입니다.")

            return
        }
    }

    class nagasaki : abstractTang1() {
        override fun tang1() {

            val name = "나가사끼짬뽕"
            val price = 20000


            println("${name}이 선택되었습니다. | 20000 | 담백한 나가사끼짬뽕")
            println("수량을 입력하세요")

            //println("${price} 원입니다.")
            var num3 = readLine()!!.toInt()
            var n3 = Count(num3)
            n3.c1()
            println("가격은 ${num3 * price}원입니다.")

            return
        }
    }

    class hamul : abstractTang1() {
        override fun tang1() {

            val name = "해물얼큰짬뽕"
            val price = 20000

            println("${name}이 선택되었습니다. | 20000 | 시원한 해물얼큰짬뽕")
            println("수량을 입력하세요")

            //println("${price} 원입니다.")
            var num4 = readLine()!!.toInt()
            var n4 = Count(num4)

            n4.c1()
            println("가격은 ${num4 * price}원입니다.")

            return
        }
    }

    class kimchiodong : abstractTang1() {
        override fun tang1() {
            val name = "김치우동짬뽕"
            val price = 15000

            println("${name}이 선택되었습니다. | 15000 | 칼칼한 김치우동짬뽕")
            println("수량을 입력하세요")

            //println("${price} 원입니다.")
            var num5 = readLine()!!.toInt()
            var n5 = Count(num5)
            n5.c1()
            println("가격은 ${num5 * price}원입니다.")

            return
        }
    }

}





//open class Price(op1: Int) {
//    var price:Int = 0
//
//    init {
//
//        this.price = op1
//    }
//    open fun p1(){
//        println("가격은 ${price} 입니다.")
//
//    }
//}


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


//        if (sel1 == 2) {
//            println("2번 어묵탕이 선택되었습니다. (굿초이스 갓성비)")
//        } else if (sel1 == 3) {
//            println("3번 나가사끼탕이 선택되었습니다.")
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