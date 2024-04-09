package com.redis.redis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.redis.redis.entity.Product;
import com.redis.redis.repository.ProductDao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@SpringBootApplication
@RestController
@RequestMapping("/products")
public class RedisApplication {

  @Autowired
  private ProductDao dao;

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

  @PostMapping("save")
  public String saveProduct(@RequestBody Product product) {
    dao.save(product);
    return "Success";
  }

  @GetMapping("getAll")
  public List<Product> getProduct() {
      return dao.findAll();
  }
  
  @GetMapping("getById/{id}")
  public Product getProductById(@PathVariable int id) {
      return dao.findProductById(id);
  }

  @PutMapping("delete/{id}")
  public String deleteProduct(@PathVariable int id) {
      dao.deleteProduct(id);
      return "Success";
  }
  

}
