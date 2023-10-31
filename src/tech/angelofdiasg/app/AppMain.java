package tech.angelofdiasg.app;

import tech.angelofdiasg.pessoas.*;

public class AppMain {

	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa();
		Cliente cliente01 = new Cliente();
		Funcionario func01 = new Funcionario();
		
		cliente01.cadastrar("nomme obj", "01/01/2021","Endereco Obj", "819999999","codigo obj","Profissao obj");

	}

}
