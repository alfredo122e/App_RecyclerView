package com.example.app_reciclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    val titles = arrayOf("Ana Iveth García Ulloa.", "Rossmery Alexandra Domínguez Chávez.", "Valery Michelle Oviedo.", "Jazmín.", "Wendy Elizabeth Martínez Callejas.", "Azucena Coreas."  )

    val details = arrayOf("20 años", "19 años", "19 años", "20 años","20 años", "21 años")

    val images = intArrayOf(
        R.drawable.image10,
        R.drawable.image1,
        R.drawable.image5,
        R.drawable.image3,
        R.drawable.image7,
        R.drawable.image11
    )

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView=itemView.findViewById(R.id.item_image)
        var itemTitle: TextView= itemView.findViewById(R.id.item_title)
        var itemDetail: TextView = itemView.findViewById(R.id.item_detail)

        init {

            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                val context: Context = v.getContext()
                var intent = Intent()
                if (position == 0) {
                    intent = Intent(context, Amigo5::class.java)
                    context.startActivity(intent)

                } else if (position == 1) {
                    intent = Intent(context, Amigo1::class.java)
                    context.startActivity(intent)

                } else if (position == 2) {
                    intent = Intent(context, Amigo2::class.java)
                    context.startActivity(intent)

                } else if (position == 3) {
                    intent = Intent(context, Amigo3::class.java)
                    context.startActivity(intent)

                } else if (position == 4) {
                    intent = Intent(context, Amigo4::class.java)
                    context.startActivity(intent)

            } else {
                    intent = Intent(context, Amigo6::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }
}
