package com.example.fourthlab

import android.graphics.Picture
import com.example.fourthlab.ActivityFunctions


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fourthlab.databinding.PersonMainBinding
import com.google.android.material.snackbar.Snackbar

class PersonsAdapter(private val activityFunctions: ActivityFunctions) : RecyclerView.Adapter<PersonsAdapter.PersonsViewHolder>() {

    var personsList = mutableListOf<Persons>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PersonMainBinding.inflate(inflater, parent, false)
        return PersonsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonsViewHolder, position: Int) {

        val Persons = personsList[position]

        holder.itemView.setOnClickListener{
            activityFunctions.showFormClickEvent(Persons.name)
        }

        with(holder.binding){
            like.setOnClickListener {
                activityFunctions.showLikeClickEvent(Persons.name)
            }
            Glide.with(picture.context)
                .load(Persons.img)
                .circleCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(picture)
            picture.setImageResource(Persons.img)
            name.text = Persons.name
            date.text = Persons.date
            text.text = Persons.text
            sex.text = Persons.sex
        }

    }

    override fun getItemCount(): Int {
        return personsList.size
    }

    class PersonsViewHolder(var binding: PersonMainBinding): RecyclerView.ViewHolder(binding.root)

}