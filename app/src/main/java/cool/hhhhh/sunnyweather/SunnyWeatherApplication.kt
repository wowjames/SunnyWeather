package cool.hhhhh.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object{
        @SuppressLint
        lateinit var context: Context
        const val token = "ezXMAnelQuM2Rng4"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}