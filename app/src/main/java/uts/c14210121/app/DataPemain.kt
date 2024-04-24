package uts.c14210121.app

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DataPemain : AppCompatActivity() {
    lateinit var _btnMulai : Button
    lateinit var _inputNama : EditText
    lateinit var _inputHp : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_data_pemain)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        _btnMulai = findViewById(R.id.btnmulai)
        _inputNama = findViewById(R.id.inputnama)
        _inputHp = findViewById(R.id.inputhp)


        _btnMulai.setOnClickListener{
            val intent = Intent(this@DataPemain, Permainan::class.java).apply {
                putExtra(Permainan.nama, _inputNama.text.toString())
                putExtra(Permainan.nohp, _inputHp.text.toString())
            }

            startActivity(intent)
        }

    }
}