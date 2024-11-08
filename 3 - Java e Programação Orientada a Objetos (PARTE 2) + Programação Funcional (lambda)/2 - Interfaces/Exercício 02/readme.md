<!Doctype html>
<html>
<body>
<h2>Exercicio fixação</h2>
<p>Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.</p>
<br>
<p>
A empresa utiliza um <ins>servico de pagamento</ins> online para realizar o pagamento das parcelas. Os servicos de pagamento online  tipicamente cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica <b>juros simples</b> de 1% a cada parcela, mais uma <b>taxa</b> de pagamento de 2%.</p>
<br>
<p>
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total do contrato). Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.</p>
<hr>

<h3>Exemplo</h3>

<p>
Entre os dados do contrato:<br>
Numero:<b> 8028</b><br>
Data (dd/MM/yyyy):<b> 25/06/2018</b><br>
Valor do contrato: <b>600.00</b><br>
Parcelas:<br>
25/07/2018 - 206.04<br>
25/08/2018 - 208.08<br>
25/09/2018 - 210.12<br>
</p>

<p>
<h3>Calculations:</h3>
Cálculos (1% juro simples mensal + 2% taxa de pagamento):<br>
<br>
Parcela #1:<br>
200+1% * 1 = 202<br>
202 + 2% = 206.04<br>
<br>
Parcela #2:<br>
200+1% * 2 = 204<br>
202 + 2% = 208.08<br>
<br>
Parcela #3:<br>
200+1% * 3 = 206<br>
202 + 2% = 210.12<br>
<br>
</p>
<body>
</html>