
<html>
	<head>
	<style><%@include file="style.css"%></style>
	</head>
	<body>
	
		<header id="navigare">
			<ul>
				<li> <a href="/CalculareSalarii">BRUT LA NET</a></li>
				<li><a href="/CalculareSalarii/netLaBrut">NET LA BRUT</a></li>
				<li><a href="/CalculareSalarii/calculSalariuConstructii">CALCUL SALARIU CONSTRUCTII</a></li>
				<li><a href="/CalculareSalarii/calculSalariuComplet">CALCULT SALARIU COMPLET</a></li>
			</ul>
		</header>
		
		<section id="continut">			
			<div id="continut_salariu">
				<div id="continut1"> 
				<h4>Calculator salariu</h4><hr/><br/><br/>
					<form action="/CalculareSalarii/afisareSalariuNet" method="get">
						<label for="brut"> Salariu Brut (RON): </label>
						<input type="text" name="brut" id="brut"/>
						<h5>Salariul brut in ron</h5>
						<br/>	<br/>
						
						<label for="persoaneInIntretinere"> Persoane in intretinere:  </label>
						<select name="persoaneInIntretinere" id="persoaneInIntretinere"> 
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
					<h3>CALCULATOR  BRUT LA NET CU 0 PERSOANE IN INTRETINERE</h3>
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
								<td> 0</td>
							</tr>
							<tr id="taxe">
								<td> Asigurari sociale (CAS)</td>
								<td> 25% </td>
								<td> 0</td>
							</tr>
							<tr id="taxe">
								<td> Asigurari sociale de sanatate (CASS)</td>
								<td> 10% </td>
								<td> 0</td>
							</tr>
							<tr id="taxe">
								<td> Impozit pe venit (IV)</td>
								<td> 10% </td>
								<td> 0</td>
							</tr>
							<tr id="taxe">
								<td> Deducere personala</td>
								<td>  </td>
								<td> 0</td>
							</tr>
							<tr id="net">
								<td> SALARIU NET</td>
								<td>  </td>
								<td> 0</td>
							</tr>
							<tr class="culori1">
								<td>ANGAJATOR</td>
								<td>Procent</td>
								<td>Lei</td>
							</tr>
							<tr id="cam">
								<td>Contributie Asiguratorie pentru Munca (CAM)</td>
								<td>2.25%</td>
								<td>0</td>
							</tr>
							<tr id="complet">
								<td>SALARIU COMPLET</td>
								<td></td>
								<td>0</td>
							</tr>
							<tr class="culori1">
								<td>TOTAL TAXE</td>
								<td></td>
								<td>Lei</td>
							</tr>
							<tr id="total_taxe">
								<td>Angajatul plateste statului</td>
								<td></td>
								<td>0</td>
							</tr>
							<tr id="total_taxe">
								<td >Angajatorul plateste statului</td>
								<td></td>
								<td>0</td>
							</tr>
							<tr id="total_taxe">
								<td>TOTAL TAXE INCASATE DE STAT</td>
								<td></td>
								<td>0</td>
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