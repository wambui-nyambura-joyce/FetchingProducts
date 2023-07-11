package com.example.myshop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myshop.databinding.ProductlistBinding
import com.squareup.picasso.Picasso


class ProductAdapter(var productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    fun updateProducts(newProduct: List<Product>){
        productList = newProduct
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ProductlistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ProductViewHolder(private val binding: ProductlistBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Product) {
            binding.apply {
                tvtitle.text = product.title
                tvdescription.text = product.description
                tvprice.text = product.price.toString()

                Picasso.get()
                    .load(product.thumbnail)
                    .into(binding.ivProductOne)

            }
        }
    }
}
