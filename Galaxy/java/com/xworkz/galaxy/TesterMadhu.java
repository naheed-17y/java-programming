package com.xworkz.galaxy;

import java.util.Optional;

import com.xworkz.galaxy.dto.GiftDTO;
import com.xworkz.galaxy.dto.GiftDTO.GiftType;
import com.xworkz.galaxy.dto.WarDTO;

public class TesterMadhu {
public static void main(String[] args) {
	GiftDTO dto=new GiftDTO();
	//dto.setType(GiftType.FLOWER);
	dto.setPrice(20);
	Optional<GiftType> optGiftType=
			Optional.ofNullable(GiftType.MUG);
	dto.setType(optGiftType);
	
	Optional<GiftType> type=dto.getType();
	
	//type.ifPresent(System.out::println);
	type.ifPresent(r->System.out.println(r));
	
	
	dto.setGivenBy(Optional.ofNullable("sush"));
	
	dto.getGivenBy().ifPresent(v->System.out.println(v.toUpperCase()));
	dto.getGivenBy().map(String::toUpperCase);
	
	
//	WarDTO warDTO=new WarDTO();
//	warDTO.setCountry("India");
//	warDTO.setName("Kargil");
//	System.out.println(warDTO);
}
}
