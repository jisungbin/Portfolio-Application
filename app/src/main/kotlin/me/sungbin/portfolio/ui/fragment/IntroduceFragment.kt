package me.sungbin.portfolio.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import me.sungbin.portfolio.R
import me.sungbin.portfolio.databinding.FragmentIntroduceBinding
import me.sungbin.portfolio.util.Util

/**
 * Created by SungBin on 2020-09-10.
 */

class IntroduceFragment : Fragment() {
    private val binding by lazy { FragmentIntroduceBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val format = SimpleDateFormat("yyyy", Locale.KOREA)
        val year = format.format(Date()).toInt()
        val age = year - 2002 + 1
        binding.tvBirthdayValue.text = getString(R.string.introduce_birthday_value, age)

        binding.ivDevblog.setOnClickListener {
            Util.openTab(requireContext(), "https://devl.es/")
        }
        binding.ivGithub.setOnClickListener {
            Util.openTab(requireContext(), "https://github.com/sungbin5304")
        }
        binding.ivFacebook.setOnClickListener {
            Util.openTab(
                requireContext(),
                "https://www.facebook.com/profile.php?id=100013373946772"
            )
        }
        binding.ivHomepage.setOnClickListener {
            Util.openTab(requireContext(), "https://sungbin.me/")
        }
        binding.ivTwitter.setOnClickListener {
            Util.openTab(requireContext(), "https://twitter.com/sungbin_dev")
        }
        binding.ivInstagram.setOnClickListener {
            Util.openTab(requireContext(), "https://www.instagram.com/sungbin__5304/")
        }
    }
}
