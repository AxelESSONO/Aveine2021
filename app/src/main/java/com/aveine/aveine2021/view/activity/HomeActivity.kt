package com.aveine.aveine2021.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.aveine.aveine2021.R

class HomeActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

    }

    // Link menu to MainActivity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Load menu described in menu_toolbar.xml file
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    // Task to perform by selected menu item
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return true
    }

}