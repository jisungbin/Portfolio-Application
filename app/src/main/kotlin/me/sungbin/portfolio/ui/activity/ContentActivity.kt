package me.sungbin.portfolio.ui.activity

import android.os.Bundle
import android.view.Menu
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ContextThemeWrapper
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import me.sungbin.androidutils.annotation.Intentable
import me.sungbin.portfolio.R
import me.sungbin.portfolio.databinding.ActivityContentBinding

@Intentable
class ContentActivity : AppCompatActivity() {
    private val binding by lazy { ActivityContentBinding.inflate(layoutInflater) }
    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.fcv_container) as NavHostFragment).navController
    }

    private val listener by lazy {
        NavController.OnDestinationChangedListener { controller, _, _ ->
            binding.tsTitle.setText(
                when (controller.currentDestination?.id) {
                    R.id.introduce -> getString(R.string.content_profile)
                    R.id.skill -> getString(R.string.content_skill)
                    R.id.android -> getString(R.string.content_project)
                    else -> getString(R.string.content_information) // R.id.info
                }
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tsTitle.setFactory {
            TextView(ContextThemeWrapper(this, R.style.ContentTitleTextView), null, 0)
        }
        val inAnim = AnimationUtils.loadAnimation(
            this,
            android.R.anim.fade_in
        )
        val outAnim = AnimationUtils.loadAnimation(
            this,
            android.R.anim.fade_out
        )
        inAnim.duration = 200
        outAnim.duration = 200
        binding.tsTitle.inAnimation = inAnim
        binding.tsTitle.outAnimation = outAnim
        supportActionBar?.hide()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_navigation, menu)
        binding.sbbNavigation.setupWithNavController(menu!!, navController)
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
