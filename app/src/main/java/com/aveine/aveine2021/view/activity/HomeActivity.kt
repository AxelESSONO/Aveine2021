package com.aveine.aveine2021.view.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.aveine.aveine2021.R
import com.aveine.aveine2021.view.fragment.WineListFragment

class HomeActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var fragmentWineList : WineListFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Hook toolbar
        toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val mainFragment = findViewById<View>(R.id.container)
        fragmentWineList = WineListFragment()

        supportFragmentManager.beginTransaction()
            .replace(mainFragment.id, fragmentWineList)
            .addToBackStack(null)
            .commit()


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