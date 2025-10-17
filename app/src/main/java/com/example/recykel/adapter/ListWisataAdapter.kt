package com.example.recykel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recykel.Wisata
import com.example.recykel.databinding.ItemRowWisataBinding

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>) :
    RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {
    // ViewHolder bertugas memegang referensi ke view di dalam layout item
    inner class ListViewHolder(var binding: ItemRowWisataBinding) :
        RecyclerView.ViewHolder(binding.root)
    // Metode ini dipanggil untuk membuat ViewHolder baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ListViewHolder {
        val binding =
            ItemRowWisataBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false)
        return ListViewHolder(binding)
    }
    // Metode ini untuk mendapatkan jumlah total item dalam daftar
    override fun getItemCount(): Int = listWisata.size
    // Metode ini dipanggil untuk mengisi data ke dalam view yang dipegang ViewHolder

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo) = listWisata[position]
        // Memuat gambar dari URL menggunakan Glide
        Glide.with(holder.itemView.context)
            .load(photo)
            .into(holder.binding.imgItemPhoto)
        // Mengisi data teks
        holder.binding.tvItemName.text = name
        holder.binding.tvItemDescription.text = description
    }
}