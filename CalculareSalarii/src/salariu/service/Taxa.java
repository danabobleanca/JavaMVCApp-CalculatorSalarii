package salariu.service;

public enum Taxa {
	CAS(0.25),
	CASS(0.10),
	IMPOZIT(0.10),
	CAM(0.0225), 
	CAS_CONSTRUCTII(0.2125), 
	CASS_CONSTRUCTII(0.00),
	IMPOZIT_CONSTRUCTII(0.00);
	
	
	private Double taxa;
	
	private Taxa(Double taxa) {
		this.taxa=taxa;
	}
	
	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

}
