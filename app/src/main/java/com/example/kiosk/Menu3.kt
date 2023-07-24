package com.example.kiosk

open class Menu3 {
    fun dry() {
        println("[마른 안주]")
        println("1. 튀김쥐포 | W 3.0 | 바삭하고 고소해서 한입! 나도 모르게 또 한입!")
        println("2. 한치 | W 8.0 | 깨끗하게 건조한 1등급 한치, 씹을수록 고소한 맛!")
        println("3. 한치 | W 8.0 | 깨끗하게 건조한 1등급 한치, 씹을수록 고소한 맛!")
        println("4. 버터구이오징어입 | W 7.0 | 버터를 만나 더 부드럽고 소소해진 국민 술안주")
        println("0. 뒤로가기")

        while (true) {
            print("입력: ")
            val input = readLine()!!
            val num = input.toIntOrNull()

            if (num != null) {
                when (input.toInt()) {
                    1 -> {
                        println("1. 튀김쥐포 | W 3.0 | 바삭하고 고소해서 한입! 나도 모르게 또 한입!")
                        //println("위 메뉴를 장바구니에 추가하시겠습니까? [1] Yes [2] No")
                    }

                    2 -> {
                        println("2. 한치 | W 8.0 | 깨끗하게 건조한 1등급 한치, 씹을수록 고소한 맛!")
                        //println("위 메뉴를 장바구니에 추가하시겠습니까? [1] Yes [2] No")
                    }

                    3 -> {
                        println("3. 한치 | W 8.0 | 깨끗하게 건조한 1등급 한치, 씹을수록 고소한 맛!")
                        //println("위 메뉴를 장바구니에 추가하시겠습니까? [1] Yes [2] No")
                    }

                    4 -> {
                        println("4. 버터구이오징어입 | W 8.0 | 버터를 만나 더 부드럽고 촉촉해진 국민 술안주")
                        //println("위 메뉴를 장바구니에 추가하시겠습니까? [1] Yes [2] No")
                    }

                    0 -> {
                        println("메인화면으로 돌아갑니다.")
                        return
                    }

                    else -> {
                        println("잘못된 입력입니다. 메뉴를 확인해주세요.")
                    }
                }
            } else {
                println("숫자를 입력해주세요.")
            }
        }
    }

}