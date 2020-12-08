package com.example.retrofitteste
import retrofit2.Call
import retrofit2.http.GET

interface API {

    @GET("users")
    //users é api que está consumindo, por exemplo https://jsonplaceholder.typicode.com/users"
    fun obterUsuarios(): Call<List<Users>>
    //User é o nome da classe, obterUsuario é o nome do metodo, : é mostrando o tipo do return


}