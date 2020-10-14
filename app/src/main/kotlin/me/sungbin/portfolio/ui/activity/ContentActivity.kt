package me.sungbin.portfolio.ui.activity

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_content.*
import me.sungbin.portfolio.R

class ContentActivity : AppCompatActivity() {

    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.fcv_container) as NavHostFragment).navController
    }

    private val listener = NavController.OnDestinationChangedListener { controller, _, _ ->
        with(tv_hello) {
            when (controller.currentDestination?.id) {
                R.id.introduce -> text = getString(R.string.content_profile)
                R.id.skill -> text = getString(R.string.content_skill)
                R.id.android -> text = getString(R.string.content_android)
                R.id.info -> text = getString(R.string.content_information)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        supportActionBar?.hide()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_navigation, menu)
        sbb_navigation.setupWithNavController(menu!!, navController)
        return true
    }

    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        navController.removeOnDestinationChangedListener(listener)
        super.onPause()
    }

}