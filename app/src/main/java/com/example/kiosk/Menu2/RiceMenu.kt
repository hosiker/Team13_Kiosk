package com.example.kiosk.Menu2

class RiceMenu() {
    var selMenuList = mutableListOf<Triple<String, Int, Int>>()
    val viewList = mutableListOf("2.김치볶음밥 5,000원","3.셀프주먹밥 3,000원","4.새우볶음밥 5,000원")
    fun riceMenu1 () : MutableList<Triple<String, Int, Int>>  {
        println(viewList)
        var riceSelect : Int
        while (true) {
            try {
                println("1.뒤로가기(메뉴판) 2.김치볶음밥 3.셀프 주먹밥 4.새우 볶음밥 5.밥메뉴선택완료")
                print("원하시는 번호를 선택해 주세요    ")
                riceSelect = readLine()!!.toInt()
            } catch (riceSelect:java.lang.NumberFormatException){
                println("선택이 바르지 않습니다. 정확한 숫자만 입력 해 주세요")
                continue
            }
            when (riceSelect) {
                1 -> {
                    break
                }

                2 -> {
                    var c = Partens(KimchiRice()).par1()// 완성부분 이후에 관리 부분에서 효율적
                    println("몇개를 주문 하시겠습니까?")
                    var c1 = readLine()!!.toInt()
                    selMenuList.add(Triple((c.name), (c.price), (c1)))
                }

                3 -> {
                   var d = Partens(SelfRice()).par1()
                    println("몇개를 주문 하시겠습니까?")
                    var d1 = readLine()!!.toInt()
                    selMenuList.add(Triple((d.name), (d.price), (d1)))
                }

                4 -> {
                    var e = Partens(ShrimpRice()).par1()
                    println("몇개를 주문 하시겠습니까?")
                    var e1 = readLine()!!.toInt()
                    selMenuList.add(Triple((e.name), (e.price), (e1)))
                }

                5 -> {
                    println("밥메뉴에서 선택된 메뉴는 ${selMenuList}")
                    break
                }
                else -> {
                    println("")
                    println("다시 선택해 주세요")
                    println("")
                }
            }
        }
        return selMenuList
    }
}