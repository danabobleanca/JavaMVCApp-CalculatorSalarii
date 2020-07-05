package salariu.service;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractCalculSalariu {
	public  abstract Double calculCas(Double brut);
	public  abstract Double calculCass(Double brut);
	public abstract  Double calculImpozit(Double venit);
	
	@Autowired
	private CalculDeducere deducere;

	
	public Double calculCam(Double brut) {
		double cam=Taxa.CAM.getTaxa()*brut;
		return cam;
	}
	
	public Double totalContributii(Double cas, Double cass) {
		double totalContributii=cas+cass;
		return totalContributii;
	}

	public Double totalTaxePlatiteAngajat(Double totalContributii, Double impozit) {
		Double totalTaxePlatiteAngajat=totalContributii+impozit;
		return totalTaxePlatiteAngajat;
	}

	public Double totalTaxePlatiteCatreStat(Double totalTaxeAngajat, Double totalTaxeAngajator) {
		Double totalTaxePlatiteCatreStat=totalTaxeAngajat+totalTaxeAngajator;
		return totalTaxePlatiteCatreStat;
	}

	
	public Double calculVenit(Double brut,  Double totalContributii, Double deducere) {
		Double totalVenit=brut-deducere-totalContributii;
		return totalVenit;
	}
	
	public Double salariuNet(Double brut, Double totalTaxePlatiteAngajat) {
		Double salariuNet=brut-totalTaxePlatiteAngajat;
		return salariuNet;
	}
	
	public Double salariuComplet(Double brut, Double cam) {
		Double salariuComplet=brut+cam;
		return salariuComplet;
	}
	
	public Double alegereDeducere(Double brut, Integer persoaneInIntretinere) {
		return  deducere.alegereDeducere(brut, persoaneInIntretinere);
	}
	
}