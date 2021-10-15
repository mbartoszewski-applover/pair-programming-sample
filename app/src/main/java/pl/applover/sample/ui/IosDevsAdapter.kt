package pl.applover.sample.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pl.applover.sample.databinding.ItemIosDevBinding
import pl.applover.sample.domain.IosDev

class IosDevsAdapter(
    private val items: List<IosDev>
) : RecyclerView.Adapter<IosDevViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IosDevViewHolder {
        val itemBinding = ItemIosDevBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IosDevViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: IosDevViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}

