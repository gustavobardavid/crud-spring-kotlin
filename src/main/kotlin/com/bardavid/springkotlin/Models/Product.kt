package com.bardavid.springkotlin.Models

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Product(@Id
        @GeneratedValue
              @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
        val id: Long = 0L,
        val name: String = "",
        val price: String = "")