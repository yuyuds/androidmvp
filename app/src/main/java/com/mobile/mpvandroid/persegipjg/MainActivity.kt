package com.mobile.mpvandroid.persegipjg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mobile.mpvandroid.R

class MainActivity : AppCompatActivity(), MainView {

    //persegi
    private lateinit var etSisi: EditText
    private lateinit var btnLuasPersegi: Button
    private lateinit var btnKelilingPersegi: Button
    private lateinit var tvHasilpsg: TextView

    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)

        //persegi
        etSisi = findViewById(R.id.etsisi)
        btnLuasPersegi = findViewById(R.id.btnLuasPsg)
        btnKelilingPersegi = findViewById(R.id.btnKelilingPsg)
//        tvHasilpsg = findViewById(R.id.tvHasilPsg)


        //persegi
        btnLuasPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(sisi)
        }
        btnKelilingPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(sisi)
        }
    }


    //Persegi
    override fun updateLuas(luas: Float) {
        tvHasil.text = luas.toString()
    }
    override fun updateKeliling(keliling: Float) {
        tvHasil.text = keliling.toString()
    }
    override fun showError(errorMsg: String) {
        tvHasil.text = errorMsg
    }

}