package com.example.recyclerviewproje

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(private val mContext:Context,private val filmlerListesi:List<Filmler>):RecyclerView.Adapter<RVAdapter.CardTasarimNesneTutucu>() {
    inner class CardTasarimNesneTutucu(view:View):RecyclerView.ViewHolder(view){
        var imageViewFilmResim:ImageView
        var textViewFilmAdi:TextView
        var textViewFilmFiyat:TextView
        var buttonSepeteEkle:Button

        init {
            imageViewFilmResim=view.findViewById(R.id.imageViewFilmResim)
            textViewFilmAdi=view.findViewById(R.id.textViewFilmAdi)
            textViewFilmFiyat=view.findViewById(R.id.textViewFilmFiyat)
            buttonSepeteEkle=view.findViewById(R.id.buttonSepeteEkle)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneTutucu {
        val tasarim=LayoutInflater.from(mContext).inflate(R.layout.cardview_layout,parent,false)
        return CardTasarimNesneTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimNesneTutucu, position: Int) {
       val film=filmlerListesi[position]
        holder.textViewFilmAdi.text=film.filmAdi
        holder.textViewFilmFiyat.text="${film.FilmUcret} TL"
        holder.imageViewFilmResim.setImageResource(mContext.resources.getIdentifier(film.FilmResimAdi,"drawable", mContext.packageName))
        holder.buttonSepeteEkle.setOnClickListener {
            Toast.makeText(mContext,"${film.filmAdi} sepete eklendi", Toast.LENGTH_SHORT).show()
        }


    }
}