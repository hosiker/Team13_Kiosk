package com.example.kiosk.Menu3

import com.example.kiosk.Utils.Kiosk.cart
import com.example.kiosk.Utils.QuantityUtils

class Menu3() {
    fun dried(menu3List: List<AbstractDry>) {

        while (true) {
            println("=====마른 안주 메뉴판=====")
            menu3List.forEachIndexed { index, menuItem ->
                val menuInfo = menuItem.info()
                println("${index + 1}. ${menuInfo.name} | W ${menuInfo.price} | ${menuInfo.depict}")
            }

            println("5. 카트보기")
            println("0. 뒤로가기")
            println("=======================")

            print("입력: ")
            val inputQuantity = readLine()?.toIntOrNull() //  입력값을 정수로 변환 가능하면 해당 정수값을 반환, 그렇지 않면 null 반환

            if (inputQuantity != null) {
                when (inputQuantity) {
                    in 1..menu3List.size -> { // 1~menu3item 리스트 크기동안 실행
                        val selectedItem = menu3List[inputQuantity.toInt()-1]  // 선택한 메뉴의 인덱스에 해당하는 메뉴를 가져옴
                        val itemInfo = selectedItem.info()
                        println("\"${itemInfo.name}을(를) 선택하셨습니다.\"")

                        val quantity = QuantityUtils.askForQuantity()
                        cart.addToCart(itemInfo.name, itemInfo.price, quantity)
                        println("${itemInfo.name} ${quantity}개를 카트에 담았습니다.\n")
                    }

                    5 -> {
                        cart.viewCart()  // 카드에 담긴 항목을 보여줌
                        continue
                    }

                    /*6 -> {
                        cart.total()  // 총합을 선택하면 가격을 말해주고 계산하는걸로 넘어가야 하는걸까?
                    }*/

                    0 -> {
                        println("메인메뉴로 돌아갑니다.\n")
                        return  // 0 입력 시 메인메뉴로 뒤로가기
                    }

                    else -> {
                        println("- ※ 잘못된 입력입니다. 메뉴를 확인해주세요.\n")  // inputQuantity 값이 null(메뉴에 없는 숫자)일 경우 다시 입력하게 설정
                    }
                }
            } else {
                println("※ 숫자를 입력해주세요.\n")  // inputQuantity 값이 null(숫자가 아닌 문자)일 경우 다시 입력하게 설정
            }
        }
    }
}