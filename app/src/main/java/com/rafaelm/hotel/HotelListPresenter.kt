package com.rafaelm.hotel

class HotelListPresenter (
    private val view: HotelListView,
    private val repository: HotelRepository
){
    fun searchHotel(term: String){
        repository.search(term){
            hotels -> view.showHotels(hotels)
        }
    }

    fun showHotelDeatils(hotel: Hotel){
        view.showHotelDetais(hotel)
    }
}