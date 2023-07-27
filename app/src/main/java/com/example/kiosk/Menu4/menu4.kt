package com.example.kiosk.Menu4

import com.example.kiosk.Utils.Kiosk
import com.example.kiosk.Utils.MenuItem
import com.example.kiosk.Utils.QuantityUtils

open class Menu4 {

    fun menu4(menu4List: kotlin.collections.List<AbstractDrink>) {
        while (true) {
            //println("0.종료")
            println("=======주류 메뉴판=======")
            DrinkList().detailList()
            println("5. 카트보기")
            println("0. 뒤로가기")

            println("=======================")

            //val listsize = DrinkList().drinkname.size

            print("입력: ")
            val inputQuantity = readLine()?.toIntOrNull()

            if (inputQuantity != null) {
                when (inputQuantity) {
                    in 1..menu4List.size -> {
                        println("\"${DrinkList().drinkname[inputQuantity - 1]}을 선택하였습니다.\"")

                        val quantity = QuantityUtils.askForQuantity()
                        Kiosk.cart.addToCart(DrinkList().drinkname[inputQuantity - 1],DrinkList().drinkprice[inputQuantity - 1] , quantity)
                        println("${DrinkList().drinkname[inputQuantity - 1]} ${quantity}개를 카트에 담았습니다.\n")
                    }
                    5 -> {
                        Kiosk.cart.viewCart()  // 카드에 담긴 항목을 보여줌
                        continue
                    }
                    0 -> {
                        println("메인메뉴로 돌아갑니다.\n")
                        return  // 0 입력 시 메인메뉴로 뒤로가기
                    }
                    else -> {
                        println("보기에 없는 번호입니다 다시 선택해 주세요")

                    }
                }


                //else if (num4 == 0) break

            }else {
                println("※ 숫자를 입력해주세요.\n")
            }

        }

    }

}

//open class DrinkList {
//    val drinkname = mutableListOf("소주", "맥주", "음료수")
//    val drinkprice = mutableListOf("4000원", "4000원", "2000원")
//}

abstract class AbstractDrink {
    abstract fun info(): MenuItem
}

class Soju : AbstractDrink() {
    override fun info(): MenuItem {
        val name = "소주"
        val price = 4000
        val depict = "한국의 전통적인 증류주"
        return MenuItem(name, price, depict)
    }
}

class Beer : AbstractDrink() {
    override fun info(): MenuItem {
        val name = "맥주"
        val price = 4000
        val depict = "세계적으로 인기 있는 알코올 음료"
        return MenuItem(name, price, depict)
    }
}

class Drink : AbstractDrink() {
    override fun info(): MenuItem {
        val name = "음료수"
        val price = 2000
        val depict = "상쾌하고 다양한 맛과 종류를 가진 음료"
        return MenuItem(name, price, depict)
    }
}


abstract class List<T> {
    abstract fun detailList()
}

open class DrinkList() : List<Any?>() {

    val drinkname = mutableListOf("소주", "맥주", "음료수")
    val drinkprice : MutableList<Int> = mutableListOf(4000, 4000, 2000)
    val drinkdescription =
        mutableListOf("한국의 전통적인 증류주", "세계적으로 인기 있는 알코올 음료", "상쾌하고 다양한 맛과 종류를 가진 음료")

    override fun detailList() {
        val size = DrinkList().drinkname.size

        for (i in 1..size) {
            println("${i}. ${DrinkList().drinkname[i - 1]} | ${DrinkList().drinkprice[i - 1]} | ${DrinkList().drinkdescription[i - 1]}")
            //println("2.소주")
            //println("3.맥주")
            //println("4.음료수")
        }


    }
}