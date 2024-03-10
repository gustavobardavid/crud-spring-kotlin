package com.bardavid.springkotlin.Controllers

import com.bardavid.springkotlin.Models.Product
import com.bardavid.springkotlin.Repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

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

    @DeleteMapping("{id}")
    fun del(@PathVariable id: Long) {
        return productRepository.deleteById(id)
    }

    @GetMapping("{id}")
    fun find(@PathVariable id: Long): Optional<Product> {
        return productRepository.findById(id)
    }

    @PutMapping("{id}")
    fun alter (@PathVariable id: Long, @RequestBody product: Product) : Product{
        if (productRepository.existsById(id)){
            val safeProduct = product.copy(id)
            return productRepository.save(safeProduct)
        }
        return Product()
    }
}