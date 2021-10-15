package pl.applover.sample.ui

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pl.applover.sample.R
import pl.applover.sample.databinding.ItemAndroidDevBinding
import pl.applover.sample.domain.AndroidDev

class AndroidDevViewHolder(private val binding: ItemAndroidDevBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: AndroidDev) = with(binding) {
        Glide.with(photo.context)
            .load(item.photoUrl)
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(photo)

        name.text = item.name
        salary.text = "$${item.salaryCents / 100}"
        sdk.text = item.favouriteSdkVersion
    }
}
