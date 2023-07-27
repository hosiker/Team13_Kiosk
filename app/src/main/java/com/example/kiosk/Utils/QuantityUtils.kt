package com.example.kiosk.Utils

class QuantityUtils {
    // 클래스의 인스턴스를 생성하지 않고 해당 클래스의 멤버에 접근할 수 있도록 companion object 사용
    companion object {
        fun askForQuantity(): Int {
            while (true) {
                print("수량: ")
                val quantity = readLine()?.toIntOrNull()
                if (quantity != null && quantity > 0) {
                    return quantity
                } else {
                    println("※ 올바른 수량을 입력해주세요.")
                }
            }
        }
    }
}