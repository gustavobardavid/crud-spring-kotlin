package com.bardavid.springkotlin.Repositories

import com.bardavid.springkotlin.Models.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long>