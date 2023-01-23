package com.example.portfolio.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio.R
import com.example.portfolio.databinding.SkillCardBinding

class SkillRecyclerViewAdapter(var context: Context) : RecyclerView.Adapter<SkillRecyclerViewAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bind : SkillCardBinding = SkillCardBinding.bind(itemView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view: View = LayoutInflater.from(context).inflate(R.layout.skill_card,parent,false)
        return SkillRecyclerViewAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind.skillTextView.setText("Kotlin")
    }

    override fun getItemCount(): Int {
        return 5
    }
}