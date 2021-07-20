package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvDetails:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvDetails=findViewById(R.id.rvDetails)
        val contacts= listOf(
        Contacts("vicky","0798744489","vicky@gmail.com","https://cdn.pixabay.com/photo/2018/01/15/07/52/woman-3083390__340.jpg"),
        Contacts("Stella","0704958605","stella@gmail.com","https://cdn.pixabay.com/photo/2016/01/19/17/48/woman-1149911__340.jpg"),
            Contacts("Mary","0704958699","mary@gmail.com","https://cdn.pixabay.com/photo/2018/01/15/07/52/woman-3083390__340.jpg"),
            Contacts("Gilly","0704958635","gilly@gmail.com","https://cdn.pixabay.com/photo/2017/08/01/01/33/beanie-2562646__340.jpg"),
            Contacts("Janet","0704958604","janet@gmail.com","https://cdn.pixabay.com/photo/2017/06/15/11/40/beautiful-2405131__340.jpg"),
            Contacts("Esther","0704958609","esther@gmail.com","https://cdn.pixabay.com/photo/2018/03/06/22/57/portrait-3204843__340.jpg"),
            Contacts("Liz","0704958605","liz@gmail.com","https://cdn.pixabay.com/photo/2018/02/21/08/40/woman-3169726__340.jpg"))


        val contactsAdaptor=ContactsAdaptor(contacts,baseContext)
        rvDetails.layoutManager=LinearLayoutManager(baseContext)
        rvDetails.adapter=contactsAdaptor
    }
}