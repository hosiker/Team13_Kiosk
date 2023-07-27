package com.example.kiosk.Menu1

import com.example.kiosk.Utils.Kiosk
import com.example.kiosk.Utils.Kiosk.cart
import com.example.kiosk.Utils.MenuItem
import com.example.kiosk.Utils.QuantityUtils
import java.lang.NumberFormatException


open class Menu1 {
    open fun tang(menu1List: List<abstractTang1>) {
        while (true) {
            try {
                println("=======탕류 메뉴판=======")
                menu1List.forEachIndexed { index, menuItem ->
                    val menuInfo = menuItem.Info()
                    println("${index + 1}. ${menuInfo.name} | W ${menuInfo.price} | ${menuInfo.depict}")
                }
                println("5. 카트보기")
                println("0. 뒤로가기")
                println("=======================")
                print("입력: ")
                val input: Int? = readLine()?.toInt()
                if (input != null) {
                    when (input) {
                        in 1..menu1List.size -> {
                            val selItem = menu1List[input - 1]
                            val itemInfo = selItem.Info()
                            println("\"${itemInfo.name}을 선택했습니다.\"")

                            val qa = QuantityUtils.askForQuantity()
                            cart.addToCart(itemInfo.name, itemInfo.price, qa)
                            println("${itemInfo.name} ${qa}개를 카트에 담았습니다. \n")
                        }

                        0 -> {
                            println("뒤로가기 종료")
                            return
                        }

                        5 -> {
                            println("카트보기")
                            Kiosk.cart.viewCart()
                            continue
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

    open class Count(op: Int) {
        var count: Int = 0

        init {
            this.count = op
        }
        open fun c1() {
            println("수량 ${count}개 입니다.")
        }
    }


    abstract class abstractTang1() {
        abstract fun Info(): MenuItem
    }

    class omok : abstractTang1() {
        override fun Info(): MenuItem {
            val name = "모듬어묵짬뽕"
            val price = 10000
            val depict = "소박한 모듬어묵짬뽕"
            return MenuItem(name, price, depict)
        }
    }

    class nagasaki : abstractTang1() {
        override fun Info(): MenuItem {
            val name = "나가사끼짬뽕"
            val price = 20000
            val depict = "담백한 나가사끼짬뽕"
            return MenuItem(name, price, depict)
        }
    }

    class hamul : abstractTang1() {
        override fun Info(): MenuItem {
            val name = "해물얼큰짬뽕"
            val price = 20000
            val depict = "시원한 해물얼큰짬뽕"
            return MenuItem(name, price, depict)
        }
    }

    class kimchiodong : abstractTang1() {
        override fun Info(): MenuItem {
            val name = "김치우동짬뽕"
            val price = 15000
            val depict = "깔끔한 김치우동짬뽕"
            return MenuItem(name, price, depict)
        }
    }
}

