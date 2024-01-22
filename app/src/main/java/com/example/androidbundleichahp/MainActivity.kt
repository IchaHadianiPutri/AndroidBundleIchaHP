package com.example.androidbundleichahp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.androidbundleichahp.R

class MainActivity : AppCompatActivity() {

    private lateinit var namaEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var nisEdit: EditText
    private lateinit var submitBtn: Button

    private val NAME_KEY: String = "nama"
    private val CLASS_KEY: String = "kelas"
    private val nis_KEY: String = "NIS"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        nisEdit = findViewById(R.id.nisEdit)
        submitBtn = findViewById(R.id.submitBtn)

        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(CLASS_KEY, kelasEdit.text.toString())
            intent.putExtra(nis_KEY, nisEdit.text.toString())
            startActivity(intent)
        }
    }
}