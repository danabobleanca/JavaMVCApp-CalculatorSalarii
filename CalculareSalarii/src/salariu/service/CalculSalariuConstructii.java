package salariu.service;

import org.springframework.stereotype.Service;

@Service
public class CalculSalariuConstructii extends AbstractCalculSalariu {

	@Override
	public Double calculCas(Double brut) {
		Double cas=Taxa.CAS_CONSTRUCTII.getTaxa()*brut;
		return cas;
	}

	@Override
	public Double calculCass(Double brut) {
		Double cass=Taxa.CASS_CONSTRUCTII.getTaxa()*brut;
		return cass;
	}

	@Override
	public Double calculImpozit(Double venit) {
		Double impozit=Taxa.IMPOZIT_CONSTRUCTII.getTaxa()*venit;
		if(impozit<=0) {
			impozit=0.00;
		}
		return impozit;
	}

}
