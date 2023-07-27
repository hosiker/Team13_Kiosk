package com.example.kiosk.Menu4

open class Menu4 {

    fun menu4(): Int {
        while (true) {
            //println("0.종료")
            println("=======주류 메뉴판=======")

            DrinkList().detailList()
            println("0. 뒤로가기")

            println("=======================")

            val listsize = DrinkList().drinkname.size

            val num4: Int = readLine()!!.toInt()

            if (num4 <= listsize) {
                when (num4) {
                    0 -> break

                    1 -> {
                        println("\"${DrinkList().drinkname[num4 - 1]} | ${DrinkList().drinkprice[num4 - 1]} | ${DrinkList().drinkdescription[num4 - 1]}\"")
                    }

                    2 -> {
                        println("\"${DrinkList().drinkname[num4 - 1]} | ${DrinkList().drinkprice[num4 - 1]} | ${DrinkList().drinkdescription[num4 - 1]}\"")
                    }

                    3 -> {
                        println("\"${DrinkList().drinkname[num4 - 1]} | ${DrinkList().drinkprice[num4 - 1]} | ${DrinkList().drinkdescription[num4 - 1]}\"")
                    }
                }

            }
            //else if (num4 == 0) break
            else {
                println("보기에 없는 번호입니다 다시 선택해 주세요")
                continue
            }

        }
        return 1
    }

}

//open class DrinkList {
//    val drinkname = mutableListOf("소주", "맥주", "음료수")
//    val drinkprice = mutableListOf("4000원", "4000원", "2000원")
//}

abstract class List {
    abstract fun detailList()
}

open class DrinkList() : List() {

    val drinkname = mutableListOf("소주", "맥주", "음료수")
    val drinkprice = mutableListOf("₩ 4000", "₩ 4000", "₩ 2000")
    val drinkdescription =
        mutableListOf("한국의 전통적인 증류주", "세계적으로 인기 있는 알코올 음료", "상쾌하고 다양한 맛과 종류를 가진 음료")

    override fun detailList() {
        val size = DrinkList().drinkname.size

        for (i in 1..size) {
            println("${i}. ${DrinkList().drinkname[i - 1]} | ${DrinkList().drinkprice[i - 1]}")
            //println("2.소주")
            //println("3.맥주")
            //println("4.음료수")
        }


    }
}