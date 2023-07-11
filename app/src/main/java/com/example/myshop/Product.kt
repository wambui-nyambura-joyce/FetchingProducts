package com.example.myshop

import android.accounts.AuthenticatorDescription
import android.icu.text.CaseMap.Title

data class Product(
    var id : Int,
    var title: String,
    var description: String,
    var price : Double,
    var rating : Double,
    var stock : Int,
    var brand : String,
    var category: String,
    var thumbnail: String
)
