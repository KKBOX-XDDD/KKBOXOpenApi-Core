package com.kkbox.openapi.model

import java.io.Serializable

/**
 * Represents categories.
 */
class CategoryInfo(
    val id: String,
    val title: String,
    val covers: List<ImageInfo>
) : Serializable
