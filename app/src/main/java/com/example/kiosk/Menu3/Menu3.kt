package com.example.kiosk.Menu3

import com.example.kiosk.Cart

open class Menu3() {
    fun dry() {
        val menu3Items = MenuItems.menu3Items
        val cart = Cart()
        
        while (true) {
            println("\n[마른 안주]")
            for ((index, menuItem) in menu3Items.withIndex()) {  // menu3Items 리스트 내 각 인덱스와 요소를 반복문으로 돌림
                println("${index+1}. ${menuItem.name} | W ${menuItem.price} | ${menuItem.depict}")
            }
            println("5. 카트보기")
            println("0. 뒤로가기")

            print("입력: ")
            val pick = readLine()!!.toIntOrNull() //  입력값을 정수로 변환 가능하면 해당 정수값을 반환, 그렇지 않면 null 반환

            if (pick != null) {
                when (pick) {
                    in 1..menu3Items.size -> { // 1~menu3item 리스트 크기동안 실행
                        val selectedItem = menu3Items[pick.toInt()-1]  // 선택한 메뉴의 인덱스에 해당하는 메뉴를 가져옴
                        println("${pick}. ${selectedItem.name}을(를) 선택하셨습니다.")

                        println("수량을 입력해주세요.")
                        val quantity = readLine()!!.toIntOrNull() //  입력값을 정수로 변환 가능하면 해당 정수값을 반환, 그렇지 않면 null 반환
                        if (quantity != null && quantity > 0) {  // 입력값이 숫자이고 0 이상이라면
                            cart.addToCart(selectedItem.name, selectedItem.price, quantity)  // 카트에 메뉴를 추가하는 함수를 호출해 - 메뉴명, 가격, 수량 정보를 인자로 전달해서 카트에 해당 메뉴를 추가
                            println("${selectedItem.name} ${quantity}개가 카트에 담겼습니다.\n")
                        } else {
                            println("※ 올바른 수량을 입력해주세요.")
                            continue  // null 값일 경우 다시 입력하게 설정
                        }
                    }

                    5 -> {
                        cart.viewCart()  // 카드에 담긴 항목을 보여줌
                    }

                    6 -> {
                        println(cart.total())  // 총합을 선택하면 가격을 말해주고 계산하는걸로 넘어가야 하는걸까?
                        // cart.total()
                    }

                    0 -> {
                        println("메인메뉴로 돌아갑니다.\n")
                        return  // 0 입력 시 메인메뉴로 뒤로가기
                    }

                    else -> {
                        println("- ※ 잘못된 입력입니다. 메뉴를 확인해주세요.")  // pick 값이 null(메뉴에 없는 숫자)일 경우 다시 입력하게 설정
                    }
                }
            } else {
                println("※ 숫자를 입력해주세요.")  // pick 값이 null(숫자가 아닌 문자)일 경우 다시 입력하게 설정
            }
        }
    }
}