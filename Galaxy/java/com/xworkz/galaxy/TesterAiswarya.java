package com.xworkz.galaxy;

import java.util.Optional;

import com.xworkz.galaxy.dao.GiftDAO;
import com.xworkz.galaxy.dao.GiftDAOImpl;
import com.xworkz.galaxy.dto.GiftDTO;
import com.xworkz.galaxy.dto.GiftDTO.GiftType;

public class TesterAiswarya {
	public static void main(String[] args) {

		GiftDAO dao = new GiftDAOImpl();

		GiftDTO dto = new GiftDTO();
		dto.setGivenBy(Optional.of("Rohan"));
		dto.setType(Optional.of(GiftType.MUG));
		dto.setPrice(150);

		dao.save(dto);

		Optional<GiftDTO> opt = dao.fetchByGivenBy("Veeresh");
		opt.ifPresent(v -> System.out.println(v));

	}
}
