package com.fragments_start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fragments_start.databinding.FragmentFullInfoBinding


class FullInfo : Fragment() {

    private lateinit var binding: FragmentFullInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //  return inflater.inflate(R.layout.fragment_full_info, container, false)

        binding = FragmentFullInfoBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fullInfo.setOnClickListener { findNavController().navigate(FullInfoDirections.actionFullInfoToMoreInfo()) }


    }

}