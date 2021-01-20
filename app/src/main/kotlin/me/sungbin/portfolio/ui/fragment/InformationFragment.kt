package me.sungbin.portfolio.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.sungbin.portfolio.databinding.FragmentInfomationBinding

/**
 * Created by SungBin on 2020-09-10.
 */

class InformationFragment : Fragment() {
    private val binding by lazy { FragmentInfomationBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root
}
