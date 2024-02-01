package com.example.notekeeper

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.example.notekeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

//        val textDisplayedValue = findViewById<TextView>(R.id.textDisplayedValue)

//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)

//        binding.fab.setOnClickListener { view ->
//
//            val originalValue = textDisplayedValue.text.toString().toInt()
//            val newValue = originalValue*2
//
//            textDisplayedValue.text = newValue.toString()
//            Snackbar.make(view, "Value $originalValue Changed to $newValue", Snackbar.LENGTH_LONG)
//                .show()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_settings -> true
//            else -> super.onOptionsItemSelected(item)
//        }
        return false
    }

    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
        return false



    }
}

class Person (   ){
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0
    var weightLBS = 0
    var weightKG: Int
        get() = (weightLBS / 2.2).toInt()
        set(value) {
            weightLBS = (value * 2.2).toInt()
        }
}

fun main() {
    val person = Person()
    person.firstName = "Jim"
    person.lastName = "Wilson"
    person.age = 54
    person.weightKG = 90
    println("${person.firstName} ${person.lastName} is ${person.age} years old and weighs ${person.weightLBS}KG")
}