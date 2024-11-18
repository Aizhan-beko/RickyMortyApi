package com.geeks.rickymortyapi.ui.p.data.episodes

import com.google.gson.annotations.SerializedName

data class EpisodesResponse(
    @SerializedName("info")
    val info: Info,

    @SerializedName("results")
    val results: List<Episode>
)

data class Info(
    @SerializedName("count")
    val count: Int,

    @SerializedName("pages")
    val pages: Int,

    @SerializedName("next")
    val next: String?,

    @SerializedName("prev")
    val prev: String?
)

data class Episode(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("air_date")
    val airDate: String,

    @SerializedName("episode")
    val episodeCode: String,

    @SerializedName("characters")
    val characters: List<String>,

    @SerializedName("url")
    val url: String,

    @SerializedName("created")
    val created: String
)