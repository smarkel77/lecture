package com.techelevator.reviews.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reviews.dao.ProductReviewDao;
import com.techelevator.reviews.exception.ProductReviewNotFoundException;
import com.techelevator.reviews.model.ProductReview;

@RestController
@RequestMapping("/api")
public class ProductReviewsController {
	
	private ProductReviewDao productReviewDao;
	
	public ProductReviewsController(ProductReviewDao prd) {
		this.productReviewDao = prd;
	}

	@GetMapping
	public List<ProductReview> getProductList() {
		return productReviewDao.list();
	}
	
	@GetMapping("/{id}")
	public ProductReview read(@PathVariable int id) {
		ProductReview review = productReviewDao.read(id);
		if(review == null) {
			throw new ProductReviewNotFoundException(id, "Could not find review.");
		}
		return review;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductReview create(@RequestBody ProductReview review) {
		return productReviewDao.create(review);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ProductReview update(@RequestBody ProductReview review) {
		ProductReview pr = productReviewDao.read(review.getId());
		if(pr == null) {
			throw new ProductReviewNotFoundException(review.getId(), "Could not find review to update.");
		}
		return productReviewDao.update(review);
	}
	
	// OR...
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ProductReview update(@RequestBody ProductReview review, @PathVariable int id) {
		ProductReview pr = productReviewDao.read(id);
		if(pr == null) {
			throw new ProductReviewNotFoundException(id, "Could not find review to update.");
		}
		return productReviewDao.update(review);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		ProductReview pr = productReviewDao.read(id);
		if(pr == null) {
			throw new ProductReviewNotFoundException(id, "Could not find review to delete.");
		}
		productReviewDao.delete(id);
	}

}
