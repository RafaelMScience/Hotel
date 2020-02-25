package com.rafaelm.hotel

interface HotelListView {
    fun showHotels(hotels: List<Hotel>)
    fun showHotelDetais(hotel: Hotel)
}