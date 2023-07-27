package com.example.kiosk.Utils

class Cart() {
    val cartItems: MutableList<Triple<String, Int, Int>> = mutableListOf()  // 메뉴명, 가격, 수량
    // Triple 3개의 요소를 묶어서 사용할 때 간결하게 표현 할 수 있음
    // 요소를 순서대로 first, second, third 호출 가능
    // 카트는 계속 추가될 수 있기 때문에 mutableListOf를 사용

    // 카트에 추가하는 함수
    fun addToCart(name: String, price: Int, quantity: Int) {
        val existingItem = cartItems.find { it.first == name && it.second == price }  // 카트아이템 리스트에 이름과 가격이 일치하는 항목을 검색하는 코드

        if (existingItem != null) { // 항목이 이미 존재한다면
            val updatedItem = Triple(existingItem.first, existingItem.second, existingItem.third + quantity)  // 수량을 더해주고 updatedItem 저장
            cartItems.remove(existingItem)  // 이미 존재하는 항목의 수량을 수정하기 위해 먼저 제거
            cartItems.add(updatedItem)  // 위에서 제거한 항목을 수량이 변한 변수로 추가
        } else { // 항목에 존재하지 않는다면 새롭게 추가
            cartItems.add(Triple(name, price, quantity))
        }
    }

    // 카트에서 항목을 제거하는 함수도 만들어야 할지??

    // 카트에 항목이 비었는지 확인하는 함수
    fun isEmpty(): Boolean {
        return cartItems.isEmpty()
    }


    // 카트 목록 보여주는 함수
    fun viewCart() {
        if (isEmpty()) {
            println("---카트가 비어 있습니다.---")
            return  // 비어 있을 때는 항목을 딱히 안봐도 된다고 생각해서 우선 카트에서 뒤로가기가 자동으로 되게 해둠
        } else {
            println("\n===카트 목록===")
            for ((index, cartItem) in cartItems.withIndex()) {
                println("${index + 1}. ${cartItem.first} | W ${cartItem.second} | ${cartItem.third}개")
            }
            total()  // total()함수에 출력 기능이 있으니까 중복되지 않게 그냥 함수만 불러오기
        }
    }


    // 카트 내 항목의 총합을 구하는 합수
    fun total() {
        var totalCost = 0  // 초기값
        for (cartItem in cartItems) {  // 카트에 담긴 항목들을 하나씩 다 둘러보는거
            val subtotal = cartItem.second * cartItem.third  // 각 메뉴별 가격 계산
            totalCost += subtotal  // totalCost(총합)에 subtotal(각 메뉴별 계산)을 더함
        }
        println("Total  W $totalCost")  // 총합 출력
        
        while (true) {
            if (totalCost == 0) {  // 총합이 0이면 자동으로 뒤로가기
                return
            } else {  // 0을 입력하면 뒤로가기, 다른 값을 입력하면 다시 입력하게 함
                println("0. 뒤로가기")
                val back = readLine()?.toIntOrNull()
                if (back == 0) {
                    return
                } else {
                    println("다시 입력해 주세요.")
                    continue
                }
            }
        }
    }
}
