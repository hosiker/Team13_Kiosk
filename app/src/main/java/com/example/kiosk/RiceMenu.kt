package com.example.kiosk

class RiceMenu {
    fun riceMenu() {
        print("2.김치볶음밥  ")
        println("5,000원")
        println("매콤한 김치와 함께 불맛을 내어 매콤한 김치볶음밥")
        print("3.셀프 주먹밥 ")
        println("3,000원")
        println("간단하게 밥과 참기름과 김으로 내가 원하는 크기대로 만드는 간단 주먹밥")
        print("4.새우볶음밥  ")
        println("5,000원")
        println("고기는 부담스럽고 밥은 먹고 싶고 그러면 새우와 함께 볶은 밥")
        println("")
        println("")
        var riceSelect : Int
        while (true) {
            try {
                println("1.뒤로가기(메뉴판) 2.김치볶음밥 2.셀프 주먹밥 3.새우 볶음밥 ")
                print("원하시는 번호를 선택해 주세요    ")
                riceSelect = readLine()!!.toInt()
            } catch (riceSelect:java.lang.NumberFormatException){
                println("선택이 바르지 않습니다. 정확한 숫자만 입력 해 주세요")
                continue
            }
            when (riceSelect) {
                1 -> {
                    return
                }

                2 -> {
                    KimchiRice().abstractRice(name = "김치볶음밥", price = 5000)
                    continue
                }

                3 -> {
                    SelfRice().abstractRice(name = "셀프 주먹밥", price = 3000)
                    continue
                }

                4 -> {
                    ShrimpRice().abstractRice(name = "새우볶음밥", price = 5000)
                    continue
                }
                else -> {
                    println("다시 선택해 주세요")
                }

            }
        }
    }
}