package com.abhishek_poonia.knight_shade.revapu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_formulas.*
import org.jetbrains.anko.toast

class FormulasActivity : AppCompatActivity() {

    var showingList = false
    val physicsTopicsArray = arrayOf("Physics1", "Physics2", "Physics3", "Physics4", "Physics5")
    val chemistryTopicsArray = arrayOf("Chemistry1", "Chemistry2", "Chemistry3", "Chemistry4", "Chemistry5")
    val mathsTopicsArray = arrayOf("Maths1", "Maths2", "Maths3", "Maths4", "Maths5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulas)

        ib_physics.setOnClickListener {
            toast("PHYSICS")
            list_view.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, physicsTopicsArray)
            fadeOutButtonsAndBringListview()
            showingList = true
        }

        ib_chemistry.setOnClickListener {
            toast("CHEMISTRY")
            list_view.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chemistryTopicsArray)
            fadeOutButtonsAndBringListview()
            showingList = true
        }

        ib_maths.setOnClickListener {
            toast("MATHS")
            list_view.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mathsTopicsArray)
            fadeOutButtonsAndBringListview()
            showingList = true
        }

    }

    override fun onBackPressed() {
        if(showingList){
            showingList =false
            fadeListViewAndBringButtons()
        }else{
            super.onBackPressed()
        }
    }

    fun fadeOutButtonsAndBringListview(){
        ib_physics.animate().alpha(0.0f).start()
        ib_chemistry.animate().alpha(0.0f).start()
        ib_maths.animate().alpha(0.0f).withEndAction {
            list_view.visibility = View.VISIBLE
        }.start()
    }

    fun fadeListViewAndBringButtons(){
        list_view.visibility = View.INVISIBLE
        ib_physics.animate().alpha(1.0f).start()
        ib_chemistry.animate().alpha(1.0f).start()
        ib_maths.animate().alpha(1.0f).start()

    }


}
