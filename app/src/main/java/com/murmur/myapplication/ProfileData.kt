package com.murmur.myapplication

object ProfileData {
    fun getProfileData() = ProfileDetails(
        isAdmin = false,
        firstName = "Jetpack",
        lastName = "Compose",
        email = "testing@gmail.com",
        telephone = "+000000000",
        gender = "Male",
        avatarUrl = R.drawable.ic_launcher_foreground,
        customerNo = 1233
    )
}