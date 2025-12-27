package com.shalaka.springcloud.controllers;

import java.io.Console;
//import java.lang.System.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shalaka.springcloud.model.Coupon;
import com.shalaka.springcloud.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	CouponRepo repo;
	
	Logger logger= LoggerFactory.getLogger(CouponRestController.class);
	
	@RequestMapping(value = "/coupons" , method = RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {
		return repo.save(coupon);
	}
	
	@RequestMapping(value = "/coupons/{code}" , method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable String code) {
//		System.out.println("code "+code);
		logger.info(code);
		return repo.getByCode(code);
	}
}
