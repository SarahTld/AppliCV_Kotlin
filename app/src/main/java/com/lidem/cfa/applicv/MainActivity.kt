package com.lidem.cfa.applicv

import android.content.ClipDescription
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lidem.cfa.applicv.classes.Competence
import com.lidem.cfa.applicv.classes.CompetenceAdapter


class MainActivity : AppCompatActivity(), onCompetenceClickListener {

    lateinit var recyclerView: RecyclerView
    lateinit var competencesList: MutableList<Competence>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_competence)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true);

        competencesList = ArrayList();

        competencesList.add(Competence("Kotlin", "Apprentissage de Kotlin"))
        competencesList.add(Competence("Swift", "Apprentissage de Swift"))
        competencesList.add(Competence("Java", "Apprentissage de Java"))
        competencesList.add(Competence("Laravel", "Apprentissage de Laravel"))
        competencesList.add(Competence("Symfony", "Apprentissage de Symfony"))

        recyclerView.adapter = CompetenceAdapter(competencesList, this)

//        CompetenceAdapter(competencesList).onItemClick = {
//            val intent = Intent(this, CompetenceDetailActivity::class.java)
//            intent.putExtra("title", it.title)
//            intent.putExtra("description", it.description)
//            startActivity(intent)
//        }
    }

    override fun onItemClicked(position: Int) {
//        Toast.makeText(this,"Compétence" + position + "Clicked !!",Toast.LENGTH_SHORT).show()

        val intent = Intent(this, CompetenceDetailActivity::class.java)
        intent.putExtra("title", competencesList[position].title)
        intent.putExtra("description", competencesList[position].description)
        startActivity(intent)
    }

}
