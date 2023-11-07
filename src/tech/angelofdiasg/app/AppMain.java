package tech.angelofdiasg.app;

import java.time.LocalDate;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.pessoas.*;

public class AppMain {

	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa();
//		Cliente cliente01 = new Cliente();
		Funcionario func01 = new Funcionario();
		
		Endereco endreco1 = new Endereco();
		
//		cliente01.cadastrar("nomme obj", "01/01/2021","Endereco Obj", "819999999","codigo obj","Profissao obj");
		
		pessoa01.cadastrar("Dias", 
				LocalDate.of(2000, 9, 1), endreco1, null);

	}

}



