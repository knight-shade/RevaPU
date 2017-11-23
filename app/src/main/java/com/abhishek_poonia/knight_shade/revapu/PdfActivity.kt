package com.abhishek_poonia.knight_shade.revapu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_pdf.*
import org.jetbrains.anko.toast

class PdfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)
        pdfView.fromAsset("one.pdf")
                .onError {
                    toast("Unable to load pdf!.")
                }
                .load()
    }
}
