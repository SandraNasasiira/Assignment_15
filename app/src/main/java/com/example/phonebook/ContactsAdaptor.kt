package com.example.phonebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdaptor (var contactList:List<Contacts>,var context: Context):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var data = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_resourcefile, parent, false)
        return ContactsViewHolder(data)

    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var detail = contactList[position]
        holder.name.text = detail.names
        holder.phone.text = detail.phoneNumbers
        holder.email.text = detail.emails
        Picasso.get()
            .load(detail.imageUrl)
            .resize(80, 80)
            .centerCrop()
            .into(holder.ivContacts)
        holder.cvContact.setOnClickListener {
            val intent = Intent(context, ContactDetailActivity::class.java)
            intent.putExtra("name",detail.names)
            intent.putExtra("phone",detail.phoneNumbers)
            intent.putExtra("email",detail.emails)
            intent.putExtra("image",detail.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }

    }
    override fun getItemCount(): Int {
        return contactList.size
    }

}

class ContactsViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
    var name=itemView.findViewById<TextView>(R.id.tvName1)
    var phone=itemView.findViewById<TextView>(R.id.tvPhone1)
    var email=itemView.findViewById<TextView>(R.id.tvEmail1)
    var ivContacts=itemView.findViewById<ImageView>(R.id.imgPicture1)
    var cvContact=itemView.findViewById<CardView>(R.id.cvContact)
}