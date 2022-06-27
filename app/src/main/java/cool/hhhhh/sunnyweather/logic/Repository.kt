package cool.hhhhh.sunnyweather.logic

import okhttp3.Dispatcher
import retrofit2.http.Query

object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers)
}