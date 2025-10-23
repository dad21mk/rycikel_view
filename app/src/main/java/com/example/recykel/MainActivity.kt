package com.example.recykel

import CardViewWisataAdapter
import GridWisataAdapter
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
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
    // FUNGSI UNTUK MENAMPILKAN MENU
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        //menu dari file XML ke Action Bar
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    // FUNGSI UNTUK MENANGANI SAAT ITEM MENU DI-KLIK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Memanggil fungsi setMode yang sudah kita buat
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title as String)
    }
    private fun showRecyclerGrid() {
        // Kunci dari Grid View adalah menggunakan GridLayoutManager
        binding.rvWisata.layoutManager = GridLayoutManager(this, 2) // Angka 2 berarti 2 kolom
        val gridWisataAdapter = GridWisataAdapter(list)
        binding.rvWisata.adapter = gridWisataAdapter
    }
    private fun showRecyclerCardView() {
        binding.rvWisata.layoutManager = LinearLayoutManager(this)
        val cardViewWisataAdapter = CardViewWisataAdapter(list)
        binding.rvWisata.adapter = cardViewWisataAdapter
    }
}