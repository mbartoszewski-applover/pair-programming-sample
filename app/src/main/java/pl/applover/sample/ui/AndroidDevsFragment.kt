package pl.applover.sample.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding
import pl.applover.sample.R
import pl.applover.sample.data.PretendApi
import pl.applover.sample.databinding.FragmentAndroidDevsBinding

class AndroidDevsFragment : Fragment(R.layout.fragment_android_devs) {
    private val binding by viewBinding(FragmentAndroidDevsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadDevs()
    }

    private fun loadDevs() = with(binding) {
        lifecycleScope.launchWhenStarted {
            val devs = PretendApi().getAndroidDevs()

            androidDevList.adapter = AndroidDevsAdapter(devs)
        }

    }

    companion object {
        fun newInstance() = AndroidDevsFragment()
    }

}
