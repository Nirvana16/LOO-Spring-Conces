package com.nirvana.revenda.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Veiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
		
	//trocar marca por fabricante no futuro
	private String marca, modelo, placa, cor, anoFabricacao, anoModelo, motor, combustivel, observacoes;
	
	
	//@NotNull(message = "Data não pode ficar em branco")
	@DateTimeFormat (pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataEntradaEstoque;
	
	//@NotNull(message = "Valor não pode ficar em branco")
	//@DecimalMin(value = "0.01", message = "valor não pode ser zero")
	//@DecimalMax(value = "9999999.99", message="valor não pode ser maior que 9.999.999,99")
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valor;
	
	
	@Enumerated(EnumType.STRING)
	private Situacao situacao;	
	
	
	//implementar 
	//private Fabricante fabricante;
	
	//implementar 
	//private Cliente cliente;
	

	public Veiculo(Long id, String marca, String modelo, String placa, String cor, String anoFabricacao,
			String anoModelo, String motor, String combustivel, String observacoes, Date dataEntradaEstoque,
			BigDecimal valor, Situacao situacao) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.motor = motor;
		this.combustivel = combustivel;
		this.observacoes = observacoes;
		this.dataEntradaEstoque = dataEntradaEstoque;
		this.valor = valor;
		this.situacao = situacao;
	}
	
	public Veiculo() {}
	
	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Date getDataEntradaEstoque() {
		return dataEntradaEstoque;
	}

	public void setDataEntradaEstoque(Date dataEntradaEstoque) {
		this.dataEntradaEstoque = dataEntradaEstoque;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
