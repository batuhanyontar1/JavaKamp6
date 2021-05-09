package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.concretes.Product;

	
	
	@RestController
	@RequestMapping("/api/products")
	public class ProductsControler {
		
		
		private ProductService productService;
		
		@Autowired
		public ProductsControler(ProductService productService) {
			super();
			this.productService = productService;
		}

		@GetMapping("/getall")
		public List<Product> getAll(){
			return this.productService.getAll();
			
		}

}
