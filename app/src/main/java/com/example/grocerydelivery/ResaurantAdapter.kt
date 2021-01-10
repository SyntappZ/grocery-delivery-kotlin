package com.example.grocerydelivery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grocerydelivery.data.FoodItem
import kotlinx.android.synthetic.main.card.view.*

class RestaurantAdapter(private val foodItems: List<FoodItem>) : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodItems[position]
    holder.bind(foodItem)
    }

    override fun getItemCount(): Int = foodItems.size


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    fun bind(foodItem: FoodItem) {
        itemView.foodItemTitle.text = foodItem.name
        itemView.foodItemPrice.text = "Price: £${foodItem.price}"

    }
    }

}