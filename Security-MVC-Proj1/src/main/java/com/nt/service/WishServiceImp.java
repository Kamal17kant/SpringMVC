package com.nt.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service("WishService")
public class WishServiceImp implements IWishService {
	
	@Override
	public String generateWishMessage() {
		LocalDateTime obj=LocalDateTime.now();
		int hour=obj.getHour();
		if(hour<12)
			return "Good Morning";
		else if(hour<14)
			return "Good AfterNoon";
		else if(hour<16)
			return "Good Evening";
		else
		return "Good Night";
	}

}
