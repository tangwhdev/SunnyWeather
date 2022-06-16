package com.sunnyweather.android

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {

        val gson =  Gson()
        val gsonDisHtml = GsonBuilder().disableHtmlEscaping().create()
//
//        val customerInfo = CustomerInfo("唐文辉","四川省\u0031成都市")
//        System.out.println(gson.toJson(customerInfo))
//        System.out.println(gsonDisHtml.toJson(customerInfo))
//        var str = "{\"name\":\"唐文辉\",\"address\":\"四川省\u0000成都市\"}"
//        val cus = gson.fromJson(str,CustomerInfo::class.java)
//        System.out.println(cus.address)

//        var ch = '\u0000'
//        var str = "A"+ch+"B"
//        val strings = arrayOf("abc", "\u0000", "ghi")
//        System.out.println(gson.toJson(strings))
//        System.out.println(gsonDisHtml.toJson(strings))

        val str = "河南省东恒市\u0000\u0000\u0000政工程有限公司"
        val str1 = "{\"key\":\"\u0000value\"}"
        val c = CustomerInfo()
        c.address = str1
        System.out.println(str)
        System.out.println(str1)
        println(Gson().toJson(str1))
        println(gsonDisHtml.toJson(str1))




    }
}