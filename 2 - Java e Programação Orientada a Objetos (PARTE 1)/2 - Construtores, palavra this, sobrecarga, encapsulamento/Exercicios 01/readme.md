<div>
  <h2>
     Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero. 
    <br>  <br>  
    Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo). 
    <br>     <br>
    Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa. 
    <br><br>
    Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.
  </h2>
    <table>
        <tr>
            <th>EXAMPLE 1</th>
        </tr>
        <tr>
            <td>
              Enter account number: 8532<br>
              Enter account holder: Alex Green<br>
              Is therena initial deposit (y/n)? y<br>
              Enter initial depositvalue: 500.00<br>
              <br><br>
              Account data:<br>
              Account 8532, Holder: Alex Green, Balance: $ 500.00<br>
              <br><br>
              Enter a depositvalue: 200.00<br>
              Updated accountdata:<br>
              Account 8532, Holder: Alex Green, Balance: $ 700.00<br>
              <br><br>
              Enter a withdraw value: 300.00<br>
              Updated accountdata:<br>
              Account 8532, Holder: Alex Green, Balance: $ 395.00<br>
            </td>
        </tr>
    </table>

<table>
        <tr>
            <th>EXAMPLE 2</th>
        </tr>
        <tr>
            <td>
              Enter account number: 7801<br>
              Enter account holder: Maria Brown<br>
              Is therena initial deposit (y/n)? n<br>
              <br><br>
              Account data:<br>
              Account 7801, Holder: Maria Brown, Balance: $ 0.00<br>
              <br><br>
              Enter a depositvalue: 200.00<br>
              Updated accountdata:<br>
              Account 7801, Holder: Maria Brown, Balance: $ 200.00<br>
              <br><br>
              Enter a withdraw value: 198.00<br>
              Updated accountdata:<br>
              Account 7801, Holder: Maria Brown, Balance: $ -3.00<br>
            </td>
        </tr>
    </table>
    </div>
