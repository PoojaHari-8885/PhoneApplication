package com.phoneapp.dialer.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.phone.dialer.R
import com.phone.dialer.databinding.PhoneMainActivityBinding

class PhoneMainActivity : AppCompatActivity() {

    private var binding: PhoneMainActivityBinding? = null

    private var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PhoneMainActivityBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment?
        if (navHostFragment != null) {
            navController = navHostFragment.navController
        }
    }

    override fun onResume() {
        super.onResume()
        handleClickListeners()
    }

    private fun handleClickListeners() {
        binding?.apply {
            favoritesTab.setOnClickListener{
                navController?.navigate(R.id.favoritesFragment)
            }

            recentsTab.setOnClickListener{
                navController?.navigate(R.id.recentsFragment)
            }

            contactsTab.setOnClickListener{
                navController?.navigate(R.id.contactsFragment)
            }

            dialpadTab.setOnClickListener{
                navController?.navigate(R.id.dialPadFragment)
            }
        }
    }
}