package com.hicksbj_Assignment0.service;

import org.springframework.stereotype.Component;

import com.hicksbj_Assignment0.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	/* (non-Javadoc)
	 * @see com.hicksbj_Assignment0.service.ISpecimenService#fetchById(int)
	 */
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLogitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}
	
	/* (non-Javadoc)
	 * @see com.hicksbj_Assignment0.service.ISpecimenService#save(com.hicksbj_Assignment0.dto.SpecimenDTO)
	 */
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
	
}
