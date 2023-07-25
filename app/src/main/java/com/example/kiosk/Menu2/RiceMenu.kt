package com.example.kiosk.Menu2

class RiceMenu {
    fun riceMenu(): MutableList<String> {
        var selMenuList = mutableListOf<String>()
        var selPriList = mutableListOf<Int>()
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
                println("1.뒤로가기(메뉴판) 2.김치볶음밥 3.셀프 주먹밥 4.새우 볶음밥 5.밥메뉴선택완료")
                print("원하시는 번호를 선택해 주세요    ")
                riceSelect = readLine()!!.toInt()
            } catch (riceSelect:java.lang.NumberFormatException){
                println("선택이 바르지 않습니다. 정확한 숫자만 입력 해 주세요")
                continue
            }
            when (riceSelect) {
                1 -> {
//                    continue//맨밑 리턴 있으면 밥 메뉴로 되돌아 간다. 맨밑 리턴없으면 리턴으로 키오스크메뉴로 이동한다.
                    break//맨밑에 리턴있으면 키오스크 화면되면서 선택된 메뉴까지 나오고 다시 재실행 이동
                }

                2 -> {
                    var c = KimchiRice().abstractRice(name = "김치볶음밥", price = 5000)
                    selMenuList.add(c)//list에 반환값인 김치볶음밥이 왔다.
                    continue
//                    break // 밥메뉴에서 선택된 리스트 나오고 난 뒤에 키오스크에서도 선택된 값이 빈칸으로 나오고 다시 키오스크 재실행 된다.

//                    selMenuList.add("시험작")
//                    println(selMenuList) // 시험작이 나오고, 프린트로 시험작 나오고 다시 밥메뉴 선택으로 되돌아 온다.

//                    selMenuList.add(KimchiRice().abstractRice(name = "김치볶음밥", price = 5000)) // 두번 반복되어 질 뿐 변화 없음. 키오스크로 가져가지 못함.

//                    selMenuList.add(return) // 아무변화 없음
                    //
                }

                3 -> {
                   var d = SelfRice().abstractRice(name = "셀프 주먹밥", price = 3000)
                    selMenuList.add(d)
                }

                4 -> {
                    var e = ShrimpRice().abstractRice(name = "새우볶음밥", price = 5000)
                    selMenuList.add(e)
                    continue// 다시 밥메뉴사항으로 돌아옴 = 컨티뉴 없이 그냥만 적어도 밥메뉴선택 사항으로 돌아온다.
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
//            println("밥메뉴에서 선택된 메뉴는 ${selMenuList}")//무엇을 선택해도 보이지가 않는다. else 이후에 실행이 되고 다시 밥메뉴로 간다.
        }
        return selMenuList
    }
}