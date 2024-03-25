package com.abc.cowin.util;

import com.abc.cowin.entity.VaccineCenterEntity;
import com.abc.cowin.model.Vaccine;

public class EntityModelUtil {
	
	public static VaccineCenterEntity vaccineModelToEntity(Vaccine vaccine) {
		
		VaccineCenterEntity vaccineEntity =new VaccineCenterEntity();
		vaccineEntity.setVaccineId(vaccine.getVaccineId());
		vaccineEntity.setVaccineName(vaccine.getVaccineName());
		vaccineEntity.setManufactureDate(vaccine.getManufactureDate());
		vaccineEntity.setExpiryDate(vaccine.getExpiryDate());
		vaccineEntity.setCompanyName(vaccine.getCompanyName());
		return vaccineEntity;		
	}
	
	public static Vaccine vaccineEntityToModel(VaccineEntity vaccineEntity) {
		
		Vaccine vaccine =new Vaccine();
		vaccine.setVaccineId(vaccineEntity.getVaccineId());
		vaccine.setVaccineName(vaccineEntity.getVaccineName());
		vaccine.setManufactureDate(vaccineEntity.getManufactureDate());
		vaccine.setExpiryDate(vaccineEntity.getExpiryDate());
		vaccine.setCompanyName(vaccineEntity.getCompanyName());
		return vaccine;
		
	}
}