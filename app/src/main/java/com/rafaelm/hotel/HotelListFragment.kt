package com.rafaelm.hotel

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment

class HotelListFragment : ListFragment(), HotelListView{
    private val presenter = HotelListPresenter(this,MemoryRepository)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.searchHotel("")
    }

    override fun showHotels(hotels: List<Hotel>) {
        val adapater = ArrayAdapter<Hotel>(requireContext(),android.R.layout.simple_list_item_1, hotels)
        listAdapter = adapater
    }

    override fun showHotelDetais(hotel: Hotel) {
        if (activity is OnHotelClickListener) {
            val listener = activity as OnHotelClickListener
            listener.onHotelClick(hotel)
        }
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        val hotel = l.getItemAtPosition(position) as Hotel
        presenter.showHotelDeatils(hotel)
    }

    interface OnHotelClickListener {
        fun onHotelClick(hotel: Hotel)
    }

}