package com.example.kiosk

data class DryMenu(val name: String, val price: Double, val description: String)

open class Menu3 {
    private val dryList = listOf(
        DryMenu("튀김쥐포", 3.0, "바삭하고 고소해서 한입! 나도 모르게 또 한입!"),
        DryMenu("새끼먹태", 7.0, "골고루 먹고 싶은데 먹태가 먹고 싶다면 ㄱㄱ!"),
        DryMenu("한치", 8.0, "깨끗하게 건조한 1등급 한치, 씹을수록 고소한 맛!"),
        DryMenu("버터구이오징어입", 7.0, "버터를 만나 더 부드럽고 촉촉해진 국민 술안주")
    )

    fun dry() {
        println("[마른 안주]")
        for ((index, menu) in dryList.withIndex()) {
            println("${index + 1}. ${menu.name} | | W ${menu.price} | ${menu.description}")
        }
        println("0. 뒤로가기")

        while (true) {
            print("입력: ")
            val input = readLine()!!
            val num = input.toIntOrNull()

            if (num != null) {
                when (input.toInt()) {
                    in 1..dryList.size -> {
                        val pickMenu = dryList[num -1]
                        println("$num. ${pickMenu.name} | W ${pickMenu.price} | ${pickMenu.description}")
                    }  // num == index + 1 (num은 사용자한테 입력받은 값, index+1은 메뉴에 저장된 값)

                    0 -> {
                        println("메인메뉴로 돌아갑니다.")
                        return
                    }

                    else -> {
                        println("※ 잘못된 입력입니다. 메뉴를 확인해주세요.")
                    }
                }
            }
            else {
                println("※ 숫자를 입력해주세요.")
            }
        }
    }
}