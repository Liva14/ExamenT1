package com.pmdm.exament1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }

    private lateinit var is2selected: CardView
    private lateinit var is4selected: CardView
    private lateinit var is8selected: CardView
    private lateinit var btnEnd: FloatingActionButton

    private fun initComponents() {
        is2selected = findViewById(R.id.tabTwo)
        is4selected = findViewById(R.id.tabFour)
        is8selected = findViewById(R.id.tabEight)
        btnEnd = findViewById(R.id.btnEnd)
    }

    private fun initListeners() {
        btnEnd.setOnClickListener{
            changeAct()
        }
        is2selected.setOnClickListener {

        }
        is4selected.setOnClickListener {

        }
        is8selected.setOnClickListener {

        }
    }

    private fun changeAct() {
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }
}