package com.example.kiosk.Menu2

import com.example.kiosk.Utils.Kiosk.cart
import com.example.kiosk.Utils.QuantityUtils

class RiceMenu() {
    fun riceMenu1(menu2List: List<AbstractRice>) {
        var riceSelect: Int

        while (true) {
            try {
                for ((index, MenuIteam) in menu2List.withIndex()) {
                    val menuinfo = MenuIteam.info()
                    println("${index + 1}. ${menuinfo.name} | W ${menuinfo.price} | ${menuinfo.depict}")
                }
                println("4. 카트보기\n0. 뒤로가기")
                print("원하시는 번호를 선택해 주세요    ")
                riceSelect = readLine()!!.toInt()

                when (riceSelect) {
                    in 1..menu2List.size -> {
                        val selectedItem =
                            menu2List[riceSelect - 1]
                        val itemInfo = selectedItem.info()
                        println("\n${itemInfo.name}을(를) 선택하셨습니다.")

                        val quantity = QuantityUtils.askForQuantity()
                        cart.addToCart(itemInfo.name, itemInfo.price, quantity)
                        println("${itemInfo.name} ${quantity}개를 카트에 담았습니다.\n")
                    }

                    4 -> {
                        cart.viewCart()
                        continue
                    }

                    0 -> {
                        println("메인메뉴로 돌아갑니다.\n")
                        return
                    }

                    else -> {
                        println("- ※ 잘못된 입력입니다. 메뉴를 확인해주세요.\n")
                    }
                }
            } catch (riceSelect: java.lang.NumberFormatException) {
                println("선택이 바르지 않습니다. 정확한 숫자만 입력 해 주세요")
                continue
            }
        }
    }
}