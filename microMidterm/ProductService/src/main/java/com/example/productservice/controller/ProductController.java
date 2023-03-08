package com.example.productservice.controller;

import com.example.productservice.entity.Product;
import com.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{proid}")
    public Product getProductById(@PathVariable long proId){
        return productService.getProductById(proId);
    }

    @PostMapping("/products/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<String>("Product is added to Database.", HttpStatus.OK);
    }

    @PutMapping("/products/update/{proid}")
    public ResponseEntity<String> updateProduct(@PathVariable long proId, @RequestBody Product product){
        productService.updateProduct(proId, product);
        return new ResponseEntity<String>("Product is Updated.", HttpStatus.OK);
    }

    @DeleteMapping("/products/delete/{proid}")
    public ResponseEntity<String> deleteProduct(@PathVariable long proId){
        productService.deleteProduct(proId);
        return new ResponseEntity<String>("Product is Deleted.", HttpStatus.OK);
    }

}

