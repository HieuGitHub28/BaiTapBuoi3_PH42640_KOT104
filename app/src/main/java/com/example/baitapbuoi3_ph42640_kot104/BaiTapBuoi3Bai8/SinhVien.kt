package com.example.lab1kot104.BaiTapBuoi3Bai8

open class SinhVien(var hoten: String, var tuoi: Int, var lop: String) {
    open fun getThongTin(): String {
        return "ho ten: $hoten, tuoi: $tuoi, lop: $lop"
    }
}