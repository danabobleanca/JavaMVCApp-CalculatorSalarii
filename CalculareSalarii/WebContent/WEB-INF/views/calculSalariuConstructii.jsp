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
				<div id="continut1"> 
				<h4>Calculator salariu</h4><hr/><br/><br/>
					<form action="/CalculareSalarii/afisareConstructii" method="get">
						<label for="brutConstructii"> Salariu Brut Constructii (RON): </label>
						<input type="text" name="brutConstructii" id="brutConstructii" placeholder="Ex: 3000"/>
						<h5>Salariul brut in ron</h5>
						<br/>	<br/>
						
						<label for="persoaneInIntretinereConstructii"> Persoane in intretinere:  </label>
						<select name="persoaneInIntretinereConstructii" id="persoaneInIntretinereConstructii"> 
							<option value="0"> Fara persoane in intretinere</option>
							<option value="1"> 1</option>
							<option value="2"> 2</option>
							<option value="3"> 3</option>
							<option value="4"> 4 sau mai multe</option>
						
						</select>
						<h5>Persoane aflate in intretinere</h5>
						
						<input type="submit" value="Calculeaza"/>
					</form>
				</div>
				<div id="continut2"> 
					<h3>CALCULATOR  BRUT 3000 LA NET CU 0 PERSOANE IN INTRETINERE</h3>
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
								<td> 638.00</td>
							</tr>
							<tr id="taxe">
								<td> Asigurari sociale (CAS)</td>
								<td> 21.25% </td>
								<td> 0</td>
							</tr>
							<tr id="taxe">
								<td> Asigurari sociale de sanatate (CASS)</td>
								<td> 0.00% </td>
								<td> 0</td>
							</tr>
							<tr id="taxe">
								<td> Impozit pe venit (IV)</td>
								<td> 0.00% </td>
								<td> 0</td>
							</tr>
							<tr id="taxe">
								<td> Deducere personala</td>
								<td>  </td>
								<td> 195.00</td>
							</tr>
							<tr id="net">
								<td> SALARIU NET</td>
								<td>  </td>
								<td> 2362.00</td>
							</tr>
							<tr class="culori1">
								<td>ANGAJATOR</td>
								<td>Procent</td>
								<td>Lei</td>
							</tr>
							<tr id="cam">
								<td>Contributie Asiguratorie pentru Munca (CAM)</td>
								<td>2.25%</td>
								<td>68.00</td>
							</tr>
							<tr id="complet">
								<td>SALARIU COMPLET</td>
								<td></td>
								<td>3068.00</td>
							</tr>
							<tr class="culori1">
								<td>TOTAL TAXE</td>
								<td></td>
								<td>Lei</td>
							</tr>
							<tr id="total_taxe">
								<td>Angajatul plateste statului</td>
								<td></td>
								<td>638.00</td>
							</tr>
							<tr id="total_taxe">
								<td >Angajatorul plateste statului</td>
								<td></td>
								<td>68.99</td>
							</tr>
							<tr id="total_taxe">
								<td>TOTAL TAXE INCASATE DE STAT</td>
								<td></td>
								<td>708.00</td>
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