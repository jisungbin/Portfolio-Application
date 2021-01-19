package me.sungbin.portfolio.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.sungbin.portfolio.databinding.FragmentSkillBinding

/**
 * Created by SungBin on 2020-09-10.
 */

class SkillFragment : Fragment() {

    private val binding by lazy { FragmentSkillBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root
}
