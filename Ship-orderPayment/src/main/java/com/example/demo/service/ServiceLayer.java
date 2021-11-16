package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.OrderDetailsRepo;
import com.example.demo.model.OrderDetails;
import com.example.demo.model.PaymentStatus;
import com.example.demo.model.ShipOrderRequest;

@Service
@Transactional
public class ServiceLayer implements OrderIfc {
	
	Logger logger = LoggerFactory.getLogger(OrderDetails.class);
	
	@Autowired
	OrderDetailsRepo orderDetailsRepo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public OrderDetails placeOrder(OrderDetails details) {
		if (details != null) {
			orderDetailsRepo.save(details);
			logger.info("Saved Succefully");
			details.setIsPaymentSuccessful(true);
			details.setPaymentStatus(PaymentStatus.PAID);
			
		
			ShipOrderRequest newRequest= restTemplate.postForObject("http://localhost:8080/ShipOperation/getOrderRequest",
					new ShipOrderRequest(details.getOrderId(), details.getOrderDescription(), details.getOrderQuantity(),
							details.getOrderDate(), details.getPayementDate(), details.getIsPaymentSuccessful(),details.getShipId()), ShipOrderRequest.class);
			System.out.println(newRequest);
		}
		return details;
	}
	

}
