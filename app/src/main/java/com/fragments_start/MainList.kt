package com.fragments_start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.fragments_start.databinding.FragmentMainListBinding


class MainList : Fragment() {

    private lateinit var binding: FragmentMainListBinding

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainListBinding.inflate(layoutInflater, container, false)
        // findNavController().navigate(MainListDirections.actionMainListToMoreInfo())
        // return inflater.inflate(R.layout.fragment_main_list, container, false)
        return binding.root
    }

    //
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainListLayout.setOnClickListener {
            findNavController().navigate(
                MainListDirections.actionMainListToMoreInfo()
            )
        }


    }

}