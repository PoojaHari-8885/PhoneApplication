package com.phoneapp.dialer.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.phone.dialer.databinding.FragmentDialpadBinding

class DialPadFragment : Fragment() {

    private var binding: FragmentDialpadBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDialpadBinding.inflate(inflater)
        return binding!!.root
    }
}