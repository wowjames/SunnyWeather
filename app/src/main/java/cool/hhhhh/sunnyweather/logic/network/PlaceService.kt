package cool.hhhhh.sunnyweather.logic.network

import cool.hhhhh.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.Query

interface PlaceService {
    fun searchPlace(@Query("query") query: String): Call<PlaceResponse>
}