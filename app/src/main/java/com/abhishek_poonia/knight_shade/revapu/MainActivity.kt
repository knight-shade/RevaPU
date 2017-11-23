package com.abhishek_poonia.knight_shade.revapu

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    init{
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ib_formula.setOnClickListener {
            toast("Formula")
        }

        ib_questions.setOnClickListener {
            toast("Questionnaire")
            startActivity( Intent(this, PdfActivity::class.java))
        }

        ib_about.setOnClickListener{
            toast("About REVA")
        }

        imageButton7.setOnClickListener {
            toast("Placeholder")
        }
    }
}
