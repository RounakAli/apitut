package com.example.apitut

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(val context:Activity, val productArraylist: List<Product>?)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>()


{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
        return MyViewHolder(itemView)

    }

    override fun getItemCount(): Int {

        return productArraylist!!.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = productArraylist?.get(position)
        if (currentitem != null) {
            holder.title.text =currentitem.title

        }

        //image view`s data
//        holder.image.setImageResource()
        //how to show image in a imageveiw when the picture is in url
        //use the picassio android library to do this

        if (currentitem != null) {
            Picasso.get().load(currentitem.thumbnail).into(holder.image)

        }
    }

    class MyViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title :TextView
        var image :ImageView

        init {

            title = itemView.findViewById(R.id.producttitle)
            image = itemView.findViewById(R.id.productimage)

        }

    }


}