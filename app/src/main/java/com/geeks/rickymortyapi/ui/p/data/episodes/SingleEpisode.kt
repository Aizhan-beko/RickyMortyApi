package com.geeks.rickymortyapi.ui.p.data.episodes

import com.google.gson.annotations.SerializedName

data class SingleEpisode (
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
