package com.example.kiosk.Menu4

open class Menu4 {

    fun menu4(): Int {
        while (true) {
            println("0.종료")
            println("1.뒤로가기")
            //println("2.소주")
            //println("3.맥주")
            //println("4.음료수")
            DrinkList()
            val size = DrinkList().drinkname.size

            for(i in 1..size){
                println("${i+1}. ${DrinkList().drinkname[i-1]}")
            }


            val num4: Int = readLine()!!.toInt()

            when (num4) {
                0 -> {
                    return 0
                }

                1 -> break

                2 -> {
                    println("1.소주 |4000원|")
                }

                3 -> {
                    println("2.맥주 |4000원|")
                }

                4 -> {
                    println("3.소주 |2000원|")
                }

                else -> {
                    println("다시 선택해 주세요")
                    continue
                }
            }
        }
        return 1
    }

}

open class DrinkList {
    val drinkname = mutableListOf("소주", "맥주", "음료수")
    val drinkprice = mutableListOf("4000원", "4000원", "2000원")
}
