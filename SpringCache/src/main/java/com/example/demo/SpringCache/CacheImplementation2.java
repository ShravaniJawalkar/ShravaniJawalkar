package com.example.demo.SpringCache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SpringCache.Impl.OrderImplementation;
import com.example.demo.SpringCache.RequResp.OrderRequest;
import com.example.demo.SpringCache.RequResp.OrderRequest.OrderDetailsRequest;

@RestController
@RequestMapping("/orderCache")
public class CacheImplementation2 {
	@Autowired
	OrderImplementation orderImplementation;

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> save(@RequestBody OrderRequest entity) {

		return new ResponseEntity<List<String>>(orderImplementation.saveData(entity.getOrderRequests()), HttpStatus.OK);
	}

	@GetMapping(value = "/getSaveDataById")
	public ResponseEntity<List<OrderDetailsRequest>> findByID(@RequestParam("isCache") boolean isCache)
			throws InterruptedException {
		List<OrderDetailsRequest> orderList = orderImplementation.findById(isCache);

		if (orderList == null) {
			throw new RuntimeException();
		}
		return new ResponseEntity<>(orderList, HttpStatus.OK);
	}
}
