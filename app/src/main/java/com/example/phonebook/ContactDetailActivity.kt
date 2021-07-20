package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

lateinit var image: ImageView
lateinit var name:TextView
lateinit var phone:TextView
lateinit var email:TextView
class ContactDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)
    name=findViewById(R.id.tvName)
    image=findViewById(R.id.imgContacts)
    phone=findViewById(R.id.tvPhone)
    email=findViewById(R.id.tvEmail2)
    name.text=intent.getStringExtra("name")
    phone.text=intent.getStringExtra("phone")
    email.text=intent.getStringExtra("email")
        var pic=intent.getStringExtra("image")
    Picasso.get().load(pic).resize(700,600).into(image)

    }
}