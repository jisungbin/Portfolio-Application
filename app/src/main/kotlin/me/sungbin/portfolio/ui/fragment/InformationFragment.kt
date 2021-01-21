package me.sungbin.portfolio.ui.fragment

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.sungbin.androidutils.extensions.alert
import me.sungbin.androidutils.util.DialogUtil
import me.sungbin.androidutils.util.licensediaog.License
import me.sungbin.androidutils.util.licensediaog.Project
import me.sungbin.portfolio.databinding.DialogMadScoreBinding
import me.sungbin.portfolio.databinding.DialogZmobotBinding
import me.sungbin.portfolio.databinding.FragmentInfomationBinding
import me.sungbin.portfolio.util.Util

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnDevTime.setOnClickListener {
            alert("개발 시간", "5~7일")
        }

        binding.btnGithub.setOnClickListener {
            Util.openTab(requireContext(), "https://github.com/sungbin5304/Portfolio-Application")
        }

        binding.btnQuestion.setOnLongClickListener {
            alert(null, "이게 포트폴리오인가...?")
            return@setOnLongClickListener true
        }

        binding.btnUseZmobot.setOnClickListener {
            val dialog = AlertDialog.Builder(requireActivity())
            dialog.setView(DialogZmobotBinding.inflate(layoutInflater).root)
            dialog.setPositiveButton("즈모봇 오픈채팅방") { _, _ ->
                Util.openTab(requireContext(), "https://open.kakao.com/o/g50KUJSc")
            }
            dialog.show()
        }

        binding.btnMadScore.setOnClickListener {
            val dialog = AlertDialog.Builder(requireActivity())
            val layout = DialogMadScoreBinding.inflate(layoutInflater)
            layout.btnGotoMadScore.setOnClickListener {
                Util.openTab(
                    requireContext(),
                    "https://madscorecard.withgoogle.com/scorecard/share/4257227469"
                )
            }
            dialog.setView(layout.root)
            dialog.show()
        }

        binding.btnOpensourceLicense.setOnClickListener {
            DialogUtil.showLicense(
                requireActivity(),
                "오픈소스 라이선스",
                arrayOf(
                    Project("kotlin", "https://github.com/JetBrains/kotlin", License.Apache2),
                    Project(
                        "androidx",
                        "https://github.com/androidx/androidx",
                        License.Apache2
                    ),
                    Project(
                        "AndroidStudio Icon Assets",
                        "http://www.apache.org/licenses/LICENSE-2.0.txt",
                        License.Apache2
                    ),
                    Project(
                        "lottie-android",
                        "https://github.com/airbnb/lottie-android",
                        License.Apache2
                    ),
                    Project(
                        "material-components-android",
                        "https://github.com/material-components/material-components-android",
                        License.Apache2
                    ),
                    Project(
                        "flexbox-layout",
                        "https://github.com/google/flexbox-layout",
                        License.Apache2
                    ),
                    Project(
                        "CrashReporter",
                        "https://github.com/MindorksOpenSource/CrashReporter",
                        License.Apache2
                    ),
                    Project(
                        "constraintlayout",
                        "https://github.com/androidx/constraintlayout",
                        License.Apache2
                    ),

                    Project(
                        "SmoothBottomBar",
                        "https://github.com/ibrahimsn98/SmoothBottomBar",
                        License.MIT
                    ),
                    Project(
                        "AndroidUtils",
                        "https://github.com/sungbin5304/AndroidUtils",
                        License.MIT
                    ),
                    Project(
                        "glide",
                        "https://github.com/bumptech/glide/google/flexbox-layout",
                        License.BSD
                    )
                )
            )
        }
    }
}
