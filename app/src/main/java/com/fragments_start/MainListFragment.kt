package com.fragments_start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController

import com.fragments_start.databinding.FragmentMainListBinding

class MainListFragment : Fragment() {

    private lateinit var binding: FragmentMainListBinding
    private lateinit var adapter: AdapterAnimal

    private val animalList = ListAnimals()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    //
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //      binding.animal.setOnClickListener {
//            findNavController().navigate(
//                MainListDirections.actionMainListToMoreInfo()
//            )
        //  findNavController().navigate(MainListFragmentDirections.actionMainListToMoreInfo())
        //      }

        adapter =
            AdapterAnimal { model, position -> // код исполняется каждый раз при нажатии элемента
                Toast.makeText(requireContext(), "Clicked element №$position", Toast.LENGTH_SHORT)
                    .show()
                findNavController().navigate(
                    MainListFragmentDirections.actionMainListToMoreInfo(
                        model
                    )
                )

            }
        // указать ориентацию  binding.rcView.layoutManager = LinearLayoutManager(requireContext(), )
        binding.rcView.adapter = adapter

        // не уверен
        adapter.setAnimalList(animalList.animalList)
        adapter.update()

    }

}