package salariu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import salariu.service.AbstractCalculSalariu;
import salariu.service.CalculSalariuNet;

@Controller
public class SalariuController {

	@Autowired
	@Qualifier("calculSalariuConstructii")
	AbstractCalculSalariu calculSalariuConstructii;
	@Autowired
	@Qualifier("calculSalariuNet")
	AbstractCalculSalariu calculSalariuNet;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String calculBrutLaNet() {
		return "calculBrutLaNet";
	}
	
	@RequestMapping(value="/afisareSalariuNet", method=RequestMethod.GET)
	public ModelAndView afisareSalariuNet(@RequestParam("brut") Double brut, @RequestParam("persoaneInIntretinere") Integer persoaneInIntretinere, ModelAndView mv) {
		Double cas=calculSalariuNet.calculCas(brut);
		Double cass=calculSalariuNet.calculCass(brut);
		Double totalContributii=calculSalariuNet.totalContributii(cas, cass);
		Double deducereSalariu=calculSalariuNet.alegereDeducere(brut, persoaneInIntretinere);
		Double venitImpozabil=calculSalariuNet.calculVenit(brut, deducereSalariu, totalContributii);
		Double impozit=calculSalariuNet.calculImpozit(venitImpozabil);
		Double totalTaxeAngajat=calculSalariuNet.totalTaxePlatiteAngajat(totalContributii, impozit);
		Double salariuNet=calculSalariuNet.salariuNet(brut, totalTaxeAngajat);
		Double cam=calculSalariuNet.calculCam(brut);
		Double salariuComplet=calculSalariuNet.salariuComplet(brut, cam);
		Double taxeCatreStat=calculSalariuNet.totalTaxePlatiteCatreStat(totalTaxeAngajat, cam);
		
		mv.setViewName("afisareNet");
		mv.addObject("brut", brut);
		mv.addObject("persoaneInIntretinere", persoaneInIntretinere);
		mv.addObject("cas", cas);
		mv.addObject("cass", cass);
		mv.addObject("totalContributii", totalContributii);
		mv.addObject("venitImpozabil", venitImpozabil);
		mv.addObject("impozit", impozit);
		mv.addObject("salariuNet", salariuNet);
		mv.addObject("totalTaxeAngajat", totalTaxeAngajat);
		mv.addObject("cam", cam);
		mv.addObject("salariuComplet", salariuComplet);
		mv.addObject("taxeCatreStat", taxeCatreStat);
		mv.addObject("deducereSalariu", deducereSalariu);
		return mv;
	}
	
	@RequestMapping(value="/calculSalariuComplet", method=RequestMethod.GET)
	public String calculNetLaBrut() {
		return "calculSalariuComplet";
	}
	
	@RequestMapping(value="/afisareSalariuComplet", method=RequestMethod.GET)
	public ModelAndView afisareSalariuBrut(@RequestParam("salariuBrut") Double brut, @RequestParam ("persoaneInIntretinere") Integer persoaneInIntretinere, ModelAndView mv) {
		Double cas=calculSalariuNet.calculCas(brut);
		Double cass=calculSalariuNet.calculCass(brut);
		Double totalContributii=calculSalariuNet.totalContributii(cas, cass);
		Double deducereSalariu=calculSalariuNet.alegereDeducere(brut, persoaneInIntretinere);
		Double venitImpozabil=calculSalariuNet.calculVenit(brut, deducereSalariu, totalContributii);
		Double impozit=calculSalariuNet.calculImpozit(venitImpozabil);
		Double totalTaxeAngajat=calculSalariuNet.totalTaxePlatiteAngajat(totalContributii, impozit);
		Double salariuNet=calculSalariuNet.salariuNet(brut, totalTaxeAngajat);
		Double cam=calculSalariuNet.calculCam(brut);
		Double salariuComplet=calculSalariuNet.salariuComplet(brut, cam);
		Double taxeCatreStat=calculSalariuNet.totalTaxePlatiteCatreStat(totalTaxeAngajat, cam);
		
		
		mv.setViewName("afisareSalariuComplet");
		mv.addObject("brut", brut);
		mv.addObject("persoaneInIntretinere", persoaneInIntretinere);
		mv.addObject("cas", cas);
		mv.addObject("cass", cass);
		mv.addObject("totalContributii", totalContributii);
		mv.addObject("venitImpozabil", venitImpozabil);
		mv.addObject("impozit", impozit);
		mv.addObject("salariuNet", salariuNet);
		mv.addObject("totalTaxeAngajat", totalTaxeAngajat);
		mv.addObject("cam", cam);
		mv.addObject("salariuComplet", salariuComplet);
		mv.addObject("taxeCatreStat", taxeCatreStat);
		mv.addObject("deducereSalariu", deducereSalariu);
		return mv;
	}
	
	@RequestMapping(value="/calculSalariuConstructii", method=RequestMethod.GET)
	public String calculSalariuConstructii() {
		return "calculSalariuConstructii";
	}
	
	@RequestMapping(value="/afisareConstructii",  method=RequestMethod.GET)
	public ModelAndView afisareNetConstructii(@RequestParam("brutConstructii") Double brutConstructii, @RequestParam("persoaneInIntretinereConstructii") Integer persoaneInIntretinereConstructii, ModelAndView mv) {
		Double casConstructii=calculSalariuConstructii.calculCas(brutConstructii);
		Double cassConstructii=calculSalariuConstructii.calculCass(brutConstructii);
		Double totalContributiiConstructii=calculSalariuConstructii.totalContributii(casConstructii, cassConstructii);
		Double deducereSalariu=calculSalariuConstructii.alegereDeducere(brutConstructii, persoaneInIntretinereConstructii);
		Double venitImpozabilConstructii=calculSalariuConstructii.calculVenit(brutConstructii, deducereSalariu, totalContributiiConstructii);
		Double impozitConstructii=calculSalariuConstructii.calculImpozit(venitImpozabilConstructii);
		Double totalTaxeAngajatConstructii=calculSalariuConstructii.totalTaxePlatiteAngajat(totalContributiiConstructii, impozitConstructii);
		Double salariuNetConstructii=calculSalariuConstructii.salariuNet(brutConstructii, totalTaxeAngajatConstructii);
		Double camConstructii=calculSalariuConstructii.calculCam(brutConstructii);
		Double salariuCompletConstructii=calculSalariuConstructii.salariuComplet(brutConstructii, camConstructii);
		Double taxeCatreStatConstructii=calculSalariuConstructii.totalTaxePlatiteCatreStat(totalTaxeAngajatConstructii, camConstructii);
		
		mv.setViewName("afisareConstructii");
		mv.addObject("brutConstructii", brutConstructii);
		mv.addObject("persoaneInIntretinereConstructii", persoaneInIntretinereConstructii);
		mv.addObject("casConstructii", casConstructii);
		mv.addObject("cassConstructii", cassConstructii);
		mv.addObject("totalContributii", totalContributiiConstructii);
		mv.addObject("venitImpozabilConstructii", venitImpozabilConstructii);
		mv.addObject("impozitConstructii", impozitConstructii);
		mv.addObject("salariuNetConstructii", salariuNetConstructii);
		mv.addObject("totalTaxeAngajatConstructii", totalTaxeAngajatConstructii);
		mv.addObject("camConstructii", camConstructii);
		mv.addObject("salariuCompletConstructii", salariuCompletConstructii);
		mv.addObject("taxeCatreStatConstructii", taxeCatreStatConstructii);
		mv.addObject("deducereSalariu", deducereSalariu);
		return mv; 
		
		
	}
}