
public class Main {

	public static void main(String[] args) {
		Cliente rose = new Cliente();
		rose.setNome("Rose");
		
		Conta cc = new ContaCorrente(rose);
		Conta poupanca = new ContaPoupanca(rose);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
