package com.fragments_start


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController


import com.fragments_start.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true);

        navHostFragment =
            supportFragmentManager.findFragmentById(binding.mainList.id) as NavHostFragment;
        supportActionBar?.setTitle(R.string.put_text_here)

        navController = navHostFragment.findNavController()
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.menu_action, menu)
//        // return true
//        return super.onCreateOptionsMenu(menu)
//    }

//    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
//
//        R.id.action_favorite -> {
//            // User chooses the "Favorite" action. Mark the current item as a
//            // favorite.
//            Toast.makeText(applicationContext, "action_favorite", Toast.LENGTH_SHORT).show()
//
//            findNavController(binding.mainList.id).popBackStack()
//            true
//        }
//
//        R.id.action_settings -> {
//            // User chooses the "Settings" item. Show the app settings UI.
//            Toast.makeText(applicationContext, "action_settings", Toast.LENGTH_SHORT).show()
//            true
//        }
//
//
//        else -> {
//            // The user's action isn't recognized.
//            // Invoke the superclass to handle it.
//            super.onOptionsItemSelected(item)
//        }
//    }


}