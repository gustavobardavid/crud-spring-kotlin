package com.bardavid.springkotlin.Controllers

import com.bardavid.springkotlin.Models.Product
import com.bardavid.springkotlin.Repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("products")
class ProductController {

    @Autowired
    lateinit var productRepository: ProductRepository
    @GetMapping
    fun list() : List<Product>{
        return productRepository.findAll().toList()
    }

    @PostMapping
    fun add (@RequestBody product: Product) : Product{
        return productRepository.save(product)
    }
}