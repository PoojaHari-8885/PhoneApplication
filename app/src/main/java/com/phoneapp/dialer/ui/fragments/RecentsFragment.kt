package com.phoneapp.dialer.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.phone.dialer.databinding.FragmentRecentsBinding

class RecentsFragment : Fragment() {

    private var binding: FragmentRecentsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRecentsBinding.inflate(inflater)
        return binding!!.root
    }
}