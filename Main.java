package senai_2021_tp.aula2;





public class Main {

	public static void main(String[] args) {
				CalculadoraPagamento calculadoraPagamento = 
				new CalculadoraPagamento(new CalculadoraPagamentoParameter("maria", 30, "26/06/1990", 500));
                float retorno = calculadoraPagamento.retornaCalculoFuncionario();
                System.out.println("salario " + retorno);
	}

}
