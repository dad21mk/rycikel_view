import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recykel.Wisata
import com.example.recykel.databinding.ItemGridWisataBinding

class GridWisataAdapter(private val listWisata: ArrayList<Wisata>) :
    RecyclerView.Adapter<GridWisataAdapter.GridViewHolder>() {
    inner class GridViewHolder(var binding: ItemGridWisataBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val binding = ItemGridWisataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GridViewHolder(binding)
    }
    override fun getItemCount(): Int = listWisata.size
    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val wisata = listWisata[position]
        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .into(holder.binding.imgItemPhoto)
        holder.binding.tvItemName.text = wisata.name
    }
}