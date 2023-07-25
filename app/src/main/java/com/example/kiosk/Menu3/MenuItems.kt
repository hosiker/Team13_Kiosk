package com.example.kiosk.Menu3

// 메뉴의 데이터베이스 역할
object MenuItems {
    val butterSquid = MenuItem("버터오징어구이", 9000, "진~한 버터에 한바탕 뒹군 오징어")
    val filefish = MenuItem("튀김쥐포", 3000, "바삭하고 고소해서 한입! 나도 모르게 또 한입!")
    val pollack = MenuItem("먹태", 13000, "주당들의 최애안주!! 바삭쫄깃 먹태와 특제 소스가 만났다!!")
    val calamari = MenuItem("한치", 8000, "깨끗하게 건조한 1등급 한치, 씹을수록 고소한 맛!")

    val menu3Items: List<MenuItem> = listOf(butterSquid, filefish, pollack, calamari)
}