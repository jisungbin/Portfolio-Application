package me.sungbin.portfolio.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.sungbin.portfolio.adapter.ProjectItemAdapter
import me.sungbin.portfolio.databinding.FragmentAndroidBinding
import me.sungbin.portfolio.model.Project


/**
 * Created by SungBin on 2020-09-10.
 */

class AndroidFragment : Fragment() {

    private val binding by lazy { FragmentAndroidBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvDevLibrary.adapter = ProjectItemAdapter(
            listOf(
                Project(
                    "AndroidUtils",
                    "\uD83D\uDD25 Powerful Utils for Android \uD83D\uDD25",
                    "https://github.com/sungbin5304/AndroidUtils",
                    "https://raw.githubusercontent.com/sungbin5304/AndroidUtils/master/banner.png"
                ),
                Project(
                    "KakaoEmoticonParser",
                    "카카오톡 이모티콘 추출기",
                    "https://github.com/sungbin5304/KakaoEmoticonParser",
                    "https://github.com/sungbin5304/KakaoEmoticonParser/raw/master/%ED%8C%8C%EB%8C%95%EC%9D%B4.jpg"
                ),
                Project(
                    "SpakChat",
                    "android chatting application",
                    "https://github.com/sungbin5304/AndroidUtils",
                    ""
                ),
                Project(
                    "MusicInformator",
                    "a music information finder application with jetpack libraries, full-material design, gradle kotlin dsl, and databinding.",
                    "https://github.com/sungbin5304/MusicInformator",
                    ""
                )
            )
        )
    }

}