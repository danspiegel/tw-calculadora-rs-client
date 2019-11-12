package br.com.treinaweb.calculadora.rs.dtos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultadoDTO {

	//--> Atributos
	
	private int resultado;

	//--> Getters e Setters
	
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
}
