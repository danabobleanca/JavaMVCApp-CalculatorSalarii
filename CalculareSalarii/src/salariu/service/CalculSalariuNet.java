package salariu.service;

import org.springframework.stereotype.Service;

@Service
public class CalculSalariuNet extends AbstractCalculSalariu{

	
	@Override
	public Double calculCas(Double brut) {
		double cas=Taxa.CAS.getTaxa()*brut;
		return cas;
	}

	@Override
	public Double calculCass(Double brut) {
		double cass=Taxa.CASS.getTaxa()*brut;
		return cass;
	}

	@Override
	public Double calculImpozit(Double venitImpozabil) {
		double impozit=Taxa.IMPOZIT.getTaxa()*venitImpozabil;
		if(impozit<=0) {
			impozit=0.00;
		}
		return impozit;
	}
	
}
