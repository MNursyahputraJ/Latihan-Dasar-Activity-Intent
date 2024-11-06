package com.example.dicoding

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnpindahdata : Button = findViewById(R.id.btn_pindahdata)
        btnpindahdata.setOnClickListener(this)
        val btnpindahobject : Button = findViewById(R.id.btn_pindahobject)
        btnpindahobject.setOnClickListener(this)
        val btndialnumber : Button = findViewById(R.id.btn_dialnumber)
        btndialnumber.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.btn_pindahdata -> {
                val pindahdataIntent = Intent(this@MainActivity, Activity_pindahdata::class.java)
                pindahdataIntent.putExtra(Activity_pindahdata.EXTRA_NAME, "My Project Boy")
                pindahdataIntent.putExtra(Activity_pindahdata.EXTRA_AGE,5)
                startActivity(pindahdataIntent)
            }
            R.id.btn_pindahobject -> {
                val person = Person(
                    "DicodingAcademy",
                    5,
                    "academy@dicoding.com",
                    "Bandung"
                )
                val moveWithObjectIntent = Intent(this@MainActivity, Activity_pindahobject::class.java)
                moveWithObjectIntent.putExtra(Activity_pindahobject.EXTRA_PERSON, person)
                startActivity(moveWithObjectIntent)
            }
            R.id.btn_dialnumber -> {
                val phoneNumber = "081210841382"
                val btndialnumber = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(btndialnumber)
            }
        }
    }
}
