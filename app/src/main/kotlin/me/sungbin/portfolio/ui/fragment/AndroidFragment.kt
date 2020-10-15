package me.sungbin.portfolio.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_android.*
import me.sungbin.portfolio.R
import me.sungbin.portfolio.adapter.ProjectItemAdapter
import me.sungbin.portfolio.model.Project


/**
 * Created by SungBin on 2020-09-10.
 */

class AndroidFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_android, container, false)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_dev_library.adapter = ProjectItemAdapter(
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
            ), requireActivity()
        )
    }

}