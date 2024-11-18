package com.geeks.rickymortyapi.ui.p.data.characters

import com.google.gson.annotations.SerializedName

data class SingleCharacter(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("status")
    val status: String,

    @SerializedName("species")
    val species: String,

    @SerializedName("type")
    val type: String?,

    @SerializedName("gender")
    val gender: String,

    @SerializedName("origin")
    val origin: Location,

    @SerializedName("location")
    val location: Location,

    @SerializedName("image")
    val image: String,

    @SerializedName("episode")
    val episodes: List<String>
)

data class Locations(
    @SerializedName("name")
    val name: String,

    @SerializedName("url")
    val url: String
)