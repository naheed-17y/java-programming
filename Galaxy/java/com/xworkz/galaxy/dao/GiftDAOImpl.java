package com.xworkz.galaxy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.xworkz.galaxy.dto.GiftDTO;

public class GiftDAOImpl implements GiftDAO {

	private List<GiftDTO> list;
    
	public GiftDAOImpl() {
   this.list = new ArrayList<GiftDTO>();
	}
	@Override
	public void save(GiftDTO dto) {
		System.out.println("invoked save" + dto);
		this.list.add(dto);
		// jdbc  
	}
	@Override
	public Optional<GiftDTO> fetchByGivenBy(String name) {
		for (GiftDTO e : list) {
			Optional<String> givenby = e.getGivenBy();
			if (givenby.isPresent()) {
				String givenByString = givenby.get();
				if (givenByString.equals(name)) {
					System.out.println("name is match, will create opt of e");
					return Optional.of(e);

				}
			}

		}
		return Optional.empty();
	}
	}


