package com.example.kiosk.Menu3

data class CartItem(val name: String, val price: Int, val quantity: Int)  // 메뉴명, 가격, 수량

class Cart {
    private val items = mutableListOf<CartItem>()

    /*fun addToCart(item: TangMenu, quantity: Int) {
        items.add(CartItem(item.name, item.price, quantity))
    }*/

    fun addToCart(item: DryMenu, quantity: Int) {
        items.add(CartItem(item.name, item.price, quantity))
    }

    /*fun addToCart(item: RiceMenu, quantity: Int) {
        items.add(CartItem(item.name, item.price, quantity))
    }

    fun addToCart(item: DrinkMenu, quantity: Int) {
        items.add(CartItem(item.name, item.price, quantity))
    }*/

    fun displayCart() {
        if (items.isEmpty()) {
            println("---카트가 비어 있습니다.---")
            return
        } else {
            println("===Cart===")
            var totalCost = 0.0
            for ((index, item) in items.withIndex()) {
                val subtotal = item.price * item.quantity  // 각 항목(메뉴)별로 가격 계산(여러개 선택할 수 있기 때문)
                println("${index+1}. ${item.name} | ${item.quantity}개")
                totalCost += subtotal  // 총액에 메뉴별 가격 더하기
            }
            println("Total: $totalCost")
        }

        while (true) {
            print("\n0.뒤로가기\n- 입력: ")
            val input = readLine()!!

            if (input=="0") {
                return
            } else {
                println("※ 잘못된 입력입니다.")
            }
        }
    }

}