package com.fragments_start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.fragments_start.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)



        supportFragmentManager.beginTransaction()
            .replace(binding.mainList.id, MainList()) // place where to put fragment
            .addToBackStack(null) // we want add fragment to backStack
            .commit()

        // findNavController(R.id.mainList)

        // . .navigate(MainListDirections.actionMainListToMoreInfo())
    }


}