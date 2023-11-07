package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.composicoes.Profissao;

public class Cliente extends Pessoa{
	private String codigo;
	private Profissao profissao;
	
	public void cadastrar(String nome, String dataNascimento,
			String endereco, String telsContato,
			String codigo, Profissao profissao) {
		 setNome(nome); 
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelsContato(telsContato);
		this.codigo = codigo;
		this.profissao = profissao;
	}

}
