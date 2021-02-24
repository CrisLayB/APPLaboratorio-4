package com.example.lab04.retrofit

/**
 * <h1> Laboratorio 4 - Retrofit Pokédex </h1>
 * <h2> Network </h2>
 *
 * Clase para revisar si hay internet o no
 *
 * <p> Desarrollo de Plataformas Moviles - Universidad del Valle de Guatemala </p>
 *
 * Creado por:
 * @author Cristian Laynez
 * @version 1.0
 * @since 2020 - Febrero - 22
 *
 **/

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity

class Network {

    companion object {
        fun avaliableRed(activity: AppCompatActivity):Boolean{
            val connectivityManeger = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connectivityManeger.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
    }

}