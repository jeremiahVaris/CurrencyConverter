package com.jeremiahVaris.currencyconverter.repository.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Model for CurrencyFlagPair symbols and their full names
 */
data class Currencies(
    @SerializedName("symbols")
    var currencyList: TreeMap<String, String>? = null
)