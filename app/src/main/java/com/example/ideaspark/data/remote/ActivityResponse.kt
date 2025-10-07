package com.example.ideaspark.data.remote

data class ActivityResponse(
    val activity: String,
    val accessibility: String,
    val key: String,
    val link: String,
    val participants: Int,
    val price: Double,
    val type: String,
    val kidFriendly:Boolean,
    val availability: Double? = null,
    val duration: String? = null
)
