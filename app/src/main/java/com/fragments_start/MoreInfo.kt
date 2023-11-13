package com.fragments_start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fragments_start.databinding.FragmentMainListBinding
import com.fragments_start.databinding.FragmentMoreInfoBinding


class MoreInfo : Fragment() {

    private lateinit var binding: FragmentMoreInfoBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentMoreInfoBinding.inflate(layoutInflater, container, false)
        // return inflater.inflate(R.layout.fragment_more_info, container, false)
        return binding.root
    }


}