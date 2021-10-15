package pl.applover.sample.ui

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pl.applover.sample.R
import pl.applover.sample.databinding.ItemIosDevBinding
import pl.applover.sample.domain.IosDev

class IosDevViewHolder(private val binding: ItemIosDevBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: IosDev) = with(binding) {
        Glide.with(photo.context)
            .load(item.photoUrl)
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(photo)

        name.text = item.name
        salary.text = "$${item.salaryCents / 100}"
        devices.text = "Devices count: ${item.appleDevicesCount}"
    }
}
