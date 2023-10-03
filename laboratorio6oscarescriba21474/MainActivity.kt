package com.example.laboratorio6oscarescriba21474

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.CircularPropagation
import android.view.LayoutInflater
import android.widget.Toast
import com.example.laboratorio6oscarescriba21474.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import java.util.Objects
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //se crea una variable retroFit para llamar al metodo de la api.
        val retrofitTraer = RetrofitClient.EjecutarApi.getTraer()

        retrofitTraer.enqueue(object: retrofit2.Callback<Ciudades> {
            override fun onResponse(call: Call<Ciudades>, response: Response<Ciudades>) {
                binding.Texto1.text = response.body().toString()
            }

            override fun onFailure(call: Call<Ciudades>, t: Throwable) {
               Toast.makeText(this@MainActivity, "Error al consultar la api", Toast.LENGTH_LONG).show()
            }

        })
    }
}