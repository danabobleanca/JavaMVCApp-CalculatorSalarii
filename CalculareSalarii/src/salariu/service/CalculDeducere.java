package salariu.service;

import org.springframework.stereotype.Component;

@Component
public class CalculDeducere {

	private Double deducereSalariuBrutMax0Pers=495.00;
	private Double deducereSalariuBrutMax1Pers=655.00;
	private Double deducereSalariuBrutMax2Pers=815.00;
	private Double deducereSalariuBrutMax3Pers=975.00;
	private Double deducereSalariuBrutMax4Pers=1295.00;
	
	private Double calculDeducereBrutMinim(Integer persoaneInIntretinere) {
		Double deducere=0.00;
		if(persoaneInIntretinere==0) {
				deducere=510.00;
		}else if(persoaneInIntretinere==1) {
				deducere=670.00;
		}else if (persoaneInIntretinere==2) {
				deducere=830.00;
		}else if(persoaneInIntretinere==3) {
				deducere=990.00;
		}else if (persoaneInIntretinere>=4) {
				deducere=1310.00;
		}
		return deducere;
	}
	
	
	private Double calculDeducereBrutMaxim(Double salariuBrut,Integer persoaneInIntretinere) {
		Double deducere=0.00;
		for(int salariu=1951;salariu<3600;salariu+=50) {
			
			if(salariuBrut==salariu || salariuBrut<(salariu+50)) {
				if(persoaneInIntretinere==0) {
					deducere=deducereSalariuBrutMax0Pers;
				}else if(persoaneInIntretinere==1) {
					deducere=deducereSalariuBrutMax1Pers;
				}else if(persoaneInIntretinere==2) {
					deducere=deducereSalariuBrutMax2Pers;
				}else if(persoaneInIntretinere==3) {
					deducere=deducereSalariuBrutMax3Pers;
				}else if(persoaneInIntretinere>=4) {
					deducere=deducereSalariuBrutMax4Pers;
					System.out.println(deducere);
				}
				break;
			}
			deducereSalariuBrutMax0Pers-=15;
			deducereSalariuBrutMax1Pers-=15;
			deducereSalariuBrutMax2Pers-=15;
			deducereSalariuBrutMax3Pers-=15;
			deducereSalariuBrutMax4Pers-=15;
		}
		return deducere;
	}
	
	
	
	public Double alegereDeducere(Double brut, Integer persoaneInIntretinere) {
		Double deducere;
		if(brut<=1950.00) {
			deducere=calculDeducereBrutMinim(persoaneInIntretinere);
		}
		else if(brut>1950.00 && brut<3601) {
			deducere=calculDeducereBrutMaxim(brut, persoaneInIntretinere);
		}
		else {
			deducere=0.00;
		}
		return deducere;
	}
}
