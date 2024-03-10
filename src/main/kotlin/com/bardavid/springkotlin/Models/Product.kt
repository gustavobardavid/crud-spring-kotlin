package com.bardavid.springkotlin.Models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Product(@Id
        @GeneratedValue
        val id: Long = 0L,
        val name: String = "",
        val price: String = "")