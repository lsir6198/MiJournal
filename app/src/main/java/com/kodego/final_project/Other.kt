package com.kodego.final_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kodego.final_project.databinding.FragmentOtherBinding


class Other : Fragment() {
    lateinit var binding: FragmentOtherBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOtherBinding.inflate(layoutInflater)
        return binding.root
    }

}