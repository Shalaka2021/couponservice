package com.shalaka.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shalaka.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon getByCode(String code);

}
