package com.fragments_start

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.fragments_start.databinding.FragmentFullInfoBinding


class FullInfo : Fragment() {

    private lateinit var binding: FragmentFullInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFullInfoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fullInfo.setOnClickListener { findNavController().navigate(FullInfoDirections.actionFullInfoToMoreInfo()) }

        val args: FullInfoArgs by navArgs()

        Log.d("TAG", args.testArg)
        binding.fullInfo.text = args.testArg
    }

}