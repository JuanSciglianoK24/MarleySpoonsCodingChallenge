package io.marleyspoonscodingchallenge.homepage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.marleyspoonscodingchallenge.databinding.ItemViewRecipeBinding
import io.marleyspoonscodingchallenge.domain.homepage.model.RecipeItem

class RecipesAdapter(
  private val data: List<RecipeItem>
) : RecyclerView.Adapter<RecipesAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
    return ViewHolder(ItemViewRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
  }

  override fun getItemCount() = data.size

  private fun getItem(position: Int) = data[position]

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.apply {
      bind(getItem(position))
    }
  }

  inner class ViewHolder(private val binding: ItemViewRecipeBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(recipeItem: RecipeItem) {
      binding.apply {
        this.recipeItem = recipeItem
        executePendingBindings()
      }
    }
  }
}

