package com.example.recykel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recykel.adapter.ListWisataAdapter
import com.example.recykel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val list = ArrayList<Wisata>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Langkah 6: Inisialisasi RecyclerView
        binding.rvWisata.setHasFixedSize(true)
        // Mengambil data dari DataWisata
        list.addAll(DataWisata.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        // Langkah 7: Menentukan LayoutManager
        binding.rvWisata.layoutManager = LinearLayoutManager(this)
        // Langkah 8: Menghubungkan adapter ke RecyclerView
        val listWisataAdapter = ListWisataAdapter(list)
        binding.rvWisata.adapter = listWisataAdapter
    }
}