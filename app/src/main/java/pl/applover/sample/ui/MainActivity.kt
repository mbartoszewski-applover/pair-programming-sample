package pl.applover.sample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pl.applover.sample.R
import pl.applover.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() = with(binding) {
        bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            val fragment = when (menuItem.itemId) {
                R.id.landing -> LandingFragment.newInstance()
                R.id.ios -> IosDevsFragment.newInstance()
                R.id.android -> AndroidDevsFragment.newInstance()
                else -> return@setOnNavigationItemSelectedListener false
            }

            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                fragment
            ).commit()

            true
        }

        bottomNavigation.selectedItemId = R.id.landing
    }
}

