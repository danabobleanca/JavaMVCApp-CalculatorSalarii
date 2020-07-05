<html>
	<head>
	<style><%@include file="style.css"%></style>
	</head>
	<body>
	
		<header id="navigare">
			<ul>
				<li> <a href="/CalculareSalarii">BRUT LA NET</a></li>
				<li><a href="/CalculareSalarii/calculSalariuConstructii">CALCUL SALARIU CONSTRUCTII</a></li>
				<li><a href="/CalculareSalarii/calculSalariuComplet">CALCULT SALARIU COMPLET</a></li>
			</ul>
		</header>
		
		<section id="continut">			
			<div id="continut_salariu">
				<div id="continut_net"> 
					<h3>CALCULATOR SALARIU BRUT ${brut} LA NET CU ${persoaneInIntretinere} PERSOANE IN INTRETINERE</h3>
					<table>
						<thead>
							<tr class="culori1">
								<td>ANGAJAT</td>
								<td>Procent</td>
								<td>Lei</td>
							</tr>
						</thead>
						<tbody>
							<tr id="sal_brut">
								<td> SALARIU BRUT</td>
								<td> </td>
								<td>${brut}</td>
							</tr>
							<tr id="taxe">
								<td> Asigurari sociale (CAS)</td>
								<td> 25.00% </td>
								<td> ${cas}</td>
							</tr>
							<tr id="taxe">
								<td> Asigurari sociale de sanatate (CASS)</td>
								<td> 10.00% </td>
								<td> ${cass} </td>
							</tr>
							<tr id="taxe">
								<td> Impozit pe venit (IV)</td>
								<td> 10.00% </td>
								<td> ${impozit}</td>
							</tr>
							<tr id="taxe">
								<td> Deducere personala</td>
								<td>  </td>
								<td> ${deducereSalariu}</td>
							</tr>
							<tr id="net" class="salariu">
								<td> SALARIU NET</td>
								<td>  </td>
								<td> ${salariuNet}</td>
							</tr>
							<tr class="culori1">
								<td>ANGAJATOR</td>
								<td>Procent</td>
								<td>Lei</td>
							</tr>
							<tr id="cam">
								<td>Contributie Asiguratorie pentru Munca (CAM)</td>
								<td>2.25%</td>
								<td>${cam}</td>
							</tr>
							<tr id="complet">
								<td>SALARIU COMPLET</td>
								<td></td>
								<td>${salariuComplet}</td>
							</tr>
							<tr class="culori1">
								<td>TOTAL TAXE</td>
								<td></td>
								<td>Lei</td>
							</tr>
							<tr id="total_taxe">
								<td>Angajatul plateste statului</td>
								<td></td>
								<td>${totalTaxeAngajat}</td>
							</tr>
							<tr id="total_taxe">
								<td >Angajatorul plateste statului</td>
								<td></td>
								<td>${cam}</td>
							</tr>
							<tr id="total_taxe">
								<td>TOTAL TAXE INCASATE DE STAT</td>
								<td></td>
								<td>${taxeCatreStat}</td>
							</tr>
						</tbody>
					</table>
					<div id="patrat">
						<span id="salariu" class="patrat"></span> Salariu 
						<span id="angajat" class="patrat"></span>Angajat
						<span id="angajator" class="patrat"></span>Angajator
						<span id="stat" class="patrat"></span>Statul
					</div>
				</div>
			</div>
		
		</section>
	</body>
</html>