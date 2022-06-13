package com.mobile.mpvandroid.persegipjg

class MainPresenter(private val mainView: MainView) {

    //persegi
    fun hitungLuasPersegi(sisi: Float) {
        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }
        val luaspsg = sisi*sisi
        mainView.updateLuas(luaspsg)
    }
    fun hitungKelilingPersegi(sisi: Float) {
        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }
        val kelilingpsg = 4*sisi
        mainView.updateKeliling(kelilingpsg)
    }

}