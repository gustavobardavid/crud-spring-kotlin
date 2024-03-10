package com.bardavid.springkotlin.Controllers

import com.bardavid.springkotlin.Models.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("products")
class ProductController {
    @GetMapping
    fun list() : List<Product>{
        return listOf(Product("Arroz", "5"))
    }

    @PostMapping
    fun add (@RequestBody product: Product) : Product{
        return product
    }
}