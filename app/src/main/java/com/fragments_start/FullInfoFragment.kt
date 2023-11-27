package com.fragments_start


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.fragments_start.databinding.FragmentFullInfoBinding


class FullInfoFragment : Fragment() {

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
        binding.fullInfo.setOnClickListener {
            //
            findNavController().popBackStack()
        }

        val args: FullInfoFragmentArgs by navArgs()


        binding.fullInfo.text = args.fullInfo.infoFull
        // Glide.with(this).load(args.fullInfo.picture).load(binding.imageView)
//        Glide.with(this)
//            .load("http://developer.alexanderklimov.ru/android/images/android_cat.jpg")
//            .into(binding.imageView)
        //  binding.imageView.setImageResource(args.fullInfo.picture)

        val animation: Animation =
            AnimationUtils.loadAnimation(binding.imageView.context, R.anim.common_animation)
        binding.imageView.startAnimation(animation)


        Glide.with(this)
            .load(args.fullInfo.picture)
            .into(binding.imageView)
    }

}