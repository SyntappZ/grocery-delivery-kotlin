package com.example.grocerydelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grocerydelivery.data.FoodItem
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }

        val foodItems = listOf(
            FoodItem("Cheese Burger", 4.99, "Awesome"),
            FoodItem("Indian Curry", 5.99, "Very Hot"),
            FoodItem("Pancake Stack", 2.99, "Sweet Tooth"),
            FoodItem("Cheesy Pizza", 3.99, "Cheesy Greatness"),
            FoodItem("Chinese Stir Fry", 7.99, "Noodle time"),
            FoodItem("Waffle Surprise", 2.99, "Syrup Nom Nom")

        )

        restaurantRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RestaurantAdapter(foodItems)
        }

    }


}