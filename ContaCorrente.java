package senai_2021_tp.aula1;

public class ContaCorrente implements Conta{

	@Override
	public void depositar(float valor) {		
		System.out.println("executando depositar de ContaCorrente: " + valor);
	}

	@Override
	public void sacar(float valor) {
		System.out.println("executando sacar de ContaCorrente: " + valor);		
	}

}
