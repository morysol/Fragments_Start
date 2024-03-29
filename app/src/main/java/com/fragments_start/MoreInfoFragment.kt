package com.fragments_start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.fragments_start.databinding.FragmentMoreInfoBinding


class MoreInfoFragment : Fragment() {

    private lateinit var binding: FragmentMoreInfoBinding
    private val args: MoreInfoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoreInfoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.moreInfo.text = args.animal.infoShort
        binding.moreInfoPicture.setImageResource(args.animal.picture)


        Glide.with(this)
            .load(args.animal.url)
            .into(binding.moreInfoPicture)


        binding.back.setOnClickListener {
            //

            //  findNavController().navigate(MoreInfoDirections.actionMoreInfoToMainList())
            findNavController().popBackStack()
        }
        binding.more.setOnClickListener {
            findNavController().navigate(
                MoreInfoFragmentDirections.actionMoreInfoToFullInfo(args.animal)
            )
        }
    }

}