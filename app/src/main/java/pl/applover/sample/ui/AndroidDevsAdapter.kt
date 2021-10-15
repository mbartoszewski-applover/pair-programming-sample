package pl.applover.sample.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pl.applover.sample.databinding.ItemAndroidDevBinding
import pl.applover.sample.domain.AndroidDev

class AndroidDevsAdapter(
    private val items: List<AndroidDev>
) : RecyclerView.Adapter<AndroidDevViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidDevViewHolder {
        val itemBinding = ItemAndroidDevBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AndroidDevViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AndroidDevViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}

