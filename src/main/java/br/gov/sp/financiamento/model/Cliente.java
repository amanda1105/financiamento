package br.gov.sp.financiamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereco;
	private String numeroe;
	private String cidade;
	private String estado;
	private String cep;
	private String cpf;
	private String rg;
	private String datanasc;
	private String email;
	private String telred;
	private String celular;
	private String tipofinanciamento;
	private String qtdparce;
	private String valorint;
	private String salario;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumeroe() {
		return numeroe;
	}
	public void setNumeroe(String numeroe) {
		this.numeroe = numeroe;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelred() {
		return telred;
	}
	public void setTelred(String telred) {
		this.telred = telred;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTipoFinanciamento() {
		return tipofinanciamento;
	}
	public void setTipoFinanciamento(String tipofinanciamento) {
		this.tipofinanciamento = tipofinanciamento;
	}
	public String getQtdparce() {
		return qtdparce;
	}
	public void setQtdParce(String qtdparce) {
		this.qtdparce = qtdparce;
	}
	public String getValorint() {
		return valorint;
	}
	public void setValorint(String valorint) {
		this.valorint = valorint;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
}