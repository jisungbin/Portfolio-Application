package me.sungbin.portfolio.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sungbin.sungbintool.extensions.plusAssign
import kotlinx.android.synthetic.main.fragment_introduce.*
import me.sungbin.portfolio.R
import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by SungBin on 2020-09-10.
 */

class IntroduceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_introduce, container, false)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val format = SimpleDateFormat("yyyy", Locale.KOREA)
        val year = format.format(Date()).toInt()
        val age = year - 2002 + 1
        tv_age += "${age}살"
    }
}