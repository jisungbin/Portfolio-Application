package me.sungbin.portfolio.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.sungbin.portfolio.adapter.ProjectItemAdapter
import me.sungbin.portfolio.databinding.FragmentProjectBinding
import me.sungbin.portfolio.model.Project

/**
 * Created by SungBin on 2020-09-10.
 */

class ProjectFragment : Fragment() {
    private val binding by lazy { FragmentProjectBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvDevProject.adapter = ProjectItemAdapter(
            listOf(
                Project(
                    "AndroidUtils",
                    "\uD83D\uDD25 Powerful Utils for Android \uD83D\uDD25",
                    "https://github.com/sungbin5304/AndroidUtils",
                    "https://raw.githubusercontent.com/sungbin5304/AndroidUtils/master/banner.png"
                ),
                Project(
                    "GitMessengerBot",
                    "a Messenger Auto-Reply bot application with Git service.",
                    "https://github.com/sungbin5304/GitMessengerBot",
                    "https://raw.githubusercontent.com/sungbin5304/GitMessengerBot/master/Banner%20with%20Icon.png"
                ),
                Project(
                    "KakaoTalkBotBaseModule",
                    "Android KakaoTalk bot application development basic library.",
                    "https://github.com/sungbin5304/KakaoTalkBotBaseModule",
                    "https://raw.githubusercontent.com/sungbin5304/KakaoTalkBotBaseModule/master/banner.png"
                ),
                Project(
                    "KakaoEmoticonParser",
                    "카카오톡 이모티콘 추출기",
                    "https://github.com/sungbin5304/KakaoEmoticonParser",
                    "https://github.com/sungbin5304/KakaoEmoticonParser/raw/master/%ED%8C%8C%EB%8C%95%EC%9D%B4.jpg"
                ),
                Project(
                    "TagableRoundImageView",
                    "Tagable Round ImageView",
                    "https://github.com/sungbin5304/TagableRoundImageView",
                    "https://raw.githubusercontent.com/sungbin5304/TagableRoundImageView/master/banner.png"
                ),
                Project(
                    "SpakChat",
                    "Android firebase chatting application.",
                    "https://github.com/sungbin5304/SpakChat",
                    "https://raw.githubusercontent.com/sungbin5304/SpakChat/master/Banner%20with%20Icon.png"
                ),
                Project(
                    "MusicInformator",
                    "a music information finder application with jetpack libraries, full-material design, gradle kotlin dsl, and databinding.",
                    "https://github.com/sungbin5304/MusicInformator",
                    "https://raw.githubusercontent.com/sungbin5304/MusicInformator/master/MusicInformator.png"
                ),
                Project(
                    "GamePack",
                    "android korean gamepack library",
                    "https://github.com/sungbin5304/GamePack",
                    "https://raw.githubusercontent.com/sungbin5304/GamePack/master/Banner.png"
                )
            )
        )
    }
}
