package com.example.myapplication.bean

class People {
    var name: String? = null
    var age: Int = 0
    var sex: String? = null

    override fun toString(): String {
        return "People{" +
                "name='" + name + '\''.toString() +
                ", age=" + age +
                ", sex='" + sex + '\''.toString() +
                '}'.toString()
    }
}
