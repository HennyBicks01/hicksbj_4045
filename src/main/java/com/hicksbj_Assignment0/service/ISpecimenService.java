package com.hicksbj_Assignment0.service;

import com.hicksbj_Assignment0.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchById(int id);

	void save(SpecimenDTO specimenDTO);

}