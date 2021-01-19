package me.sungbin.portfolio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import me.sungbin.portfolio.R
import me.sungbin.portfolio.databinding.LayoutProjectItemBinding
import me.sungbin.portfolio.model.Project

/**
 * Created by SungBin on 2020-07-20.
 */

class ProjectItemAdapter(
    private val items: List<Project>
) : RecyclerView.Adapter<ProjectItemAdapter.ViewHolder>() {

    class ViewHolder(private val binding: LayoutProjectItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindViewHolder(project: Project) {
            with(binding) {
                this.project = project
                invalidateAll()
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
        ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.context),
                R.layout.layout_project_item, viewGroup, false
            )
        )

    override fun onBindViewHolder(@NonNull viewholder: ViewHolder, position: Int) {
        viewholder.bindViewHolder(items[position])
    }

    override fun getItemCount() = items.size
    override fun getItemId(position: Int) = position.toLong()
    override fun getItemViewType(position: Int) = position
}
