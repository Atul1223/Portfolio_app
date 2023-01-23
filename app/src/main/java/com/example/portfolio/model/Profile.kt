package com.example.portfolio.model

data class Profile(
    var name : String,
    var about : String,
    var role : String,
    var profilePicUrl : String,
    var skills: Map<String, String>
)
