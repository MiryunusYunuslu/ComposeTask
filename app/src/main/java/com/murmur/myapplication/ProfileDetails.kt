package com.murmur.myapplication

data class ProfileDetails(
    val isAdmin: Boolean,
    val firstName: String,
    val lastName: String,
    val email: String,
    val telephone: String,
    val gender: String,
    val avatarUrl: Int,
    val customerNo: Int
)