package com.mrazi.hiddengem.dto

import java.time.LocalDateTime
import java.util.*

data class AchievementDto(
    var id: UUID? = null,
    val name: String,
    val logo: String,
    val description: String,
    var created: LocalDateTime? = null
)
