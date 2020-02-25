package com.rafaelm.hotel

import android.os.Bundle
import android.widget.ArrayAdapter
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

    override fun showHotelDetais(hotel: Hotel) {}

}