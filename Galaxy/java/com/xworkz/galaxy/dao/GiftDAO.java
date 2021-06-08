package com.xworkz.galaxy.dao;

import java.util.Optional;

import com.xworkz.galaxy.dto.GiftDTO;

public interface GiftDAO {
	public void save(GiftDTO dto);
	public Optional<GiftDTO> fetchByGivenBy(String name); 
}
