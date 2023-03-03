package com.lidem.cfa.applicv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.lidem.cfa.applicv.classes.Competence
import com.lidem.cfa.applicv.classes.CompetenceAdapter

class CompetenceDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_competence_detail)

//        val competence = intent.getParcelableExtra<Competence>("title")
//        if( competence != null) {
//            val title: TextView = findViewById(R.id.competence_detail_title)
//            val description: TextView = findViewById(R.id.competence_detail_description)
//
//            title.text = competence.title
//            description.text = competence.description
//        }

        val txt_title: TextView = findViewById(R.id.competence_detail_title)
        val txt_description: TextView = findViewById(R.id.competence_detail_description)

        val title = intent.getStringExtra("title")
        txt_title.text = title

        val description = intent.getStringExtra("description")
        txt_description.text = description

    }
}