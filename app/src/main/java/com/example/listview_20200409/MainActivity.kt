package com.example.listview_20200409

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val roomList=ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomList.add(Room(8000, "서울시 은평구", 4, "연립주택입니다."))
        roomList.add(Room(15000, "서울시 서대문구", 0, "아파트입니다."))
        roomList.add(Room(22000, "서울시 영등포구", -1, "단독주택입니다."))
        roomList.add(Room(6000, "경기도 수원시", 3, "연립주택입니다."))
        roomList.add(Room(4000, "서울시 성북구", 8, "단독주택입니다."))
        roomList.add(Room(9000, "경기도 남양주시", 12, "아파트입니다."))
        roomList.add(Room(11000, "서울시 광진구", -1, "연립주택입니다."))
    }
}
