package com.example.retrofitteste
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buscaDados()
    }

    private fun buscaDados() {
        val serviceRetrofit = Retrofit()
        serviceRetrofit.api?.obterUsuarios()?.enqueue(object : Callback<List<Users>> {
            override fun onResponse(call: Call<List<Users>?>?, response: Response<List<Users>?>?) {
                val lista = response?.body();
                name1.text = lista?.get(0)?.name.toString()
                desc1.text = lista?.get(0)?.email.toString()
                name2.text = lista?.get(1)?.name.toString()
                desc2.text = lista?.get(1)?.email.toString()
                name3.text = lista?.get(2)?.name.toString()
                desc3.text = lista?.get(2)?.email.toString()
                name4.text = lista?.get(3)?.name.toString()
                desc4.text = lista?.get(3)?.email.toString()
                name5.text = lista?.get(4)?.name.toString()
                desc5.text = lista?.get(4)?.email.toString()
                name6.text = lista?.get(5)?.name.toString()
                desc6.text = lista?.get(5)?.email.toString()
                name7.text = lista?.get(6)?.name.toString()
                desc7.text = lista?.get(6)?.email.toString()
                name8.text = lista?.get(7)?.name.toString()
                desc8.text = lista?.get(7)?.email.toString()
                name9.text = lista?.get(8)?.name.toString()
                desc9.text = lista?.get(8)?.email.toString()
                name10.text = lista?.get(9)?.name.toString()
                desc10.text = lista?.get(9)?.email.toString()
            }
                override fun onFailure(call: Call<List<Users>?>?, t: Throwable?) {
            Log.e("Erro", "************** erro **********\n" + t?.message.toString())
        }
    })
    }
}