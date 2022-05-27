package com.mrazi.hiddengem.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "gem", schema = "public")
class Achievement(
    @Id
    var id: UUID? = null,
    val name: String,
    val logo: String,
    val description: String,
    var created: LocalDateTime? = null
)