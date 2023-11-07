package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import tech.angelofdiasg.composicoes.*;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private List<Telefone> telsContato;
	
	public void cadastraEndereco(String rua, String numero,
    String cep, String cidade,String estado, String pais) {
		this.endereco.setCep(cep);
		this.endereco.setCidade(cidade);
		this.endereco.setEstado(estado);
		this.endereco.setNumero(numero);
		this.endereco.setRua(rua);
		this.endereco.setPais(pais);
	}
	
	public void cadastrar(String nome, LocalDate dataNascimento,
			Endereco endereco, List<Telefone> telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}
	public int obterIdade() {
		int idade = 0;
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return idade = periodo.getYears();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Telefone> getTelsContato() {
		return telsContato;
	}
	public void setTelsContato(List<Telefone> telsContato) {
		this.telsContato = telsContato;
	}
	
	

}
