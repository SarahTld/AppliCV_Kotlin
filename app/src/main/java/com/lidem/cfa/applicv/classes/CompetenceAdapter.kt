package com.lidem.cfa.applicv.classes

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.lidem.cfa.applicv.R
import com.lidem.cfa.applicv.onCompetenceClickListener
import java.util.Objects

class CompetenceAdapter(val competencesList: MutableList<Competence>, val onCompetenceClickListener: onCompetenceClickListener): RecyclerView.Adapter<CompetenceAdapter.ViewHolder>()
{
    var onItemClick: ((Competence) -> Unit)? = null

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val competenceView = itemView.findViewById<CardView>(R.id.competence_card)
        val title = itemView.findViewById<TextView>(R.id.competence_title)
//        val description = itemView.findViewById<TextView>(R.id.competence_detail_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem: View = LayoutInflater.from(parent.context).inflate(R.layout.competence_card, parent, false)
        return ViewHolder(viewItem)
    }

    override fun getItemCount(): Int {
        return competencesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val competence = competencesList[position]

        holder.competenceView.tag = position
        holder.title.text = competencesList[position].title
//        holder.description.text = competencesList[position].description

        holder.competenceView.setOnClickListener {
            onCompetenceClickListener.onItemClicked(position)
        }
    }
}