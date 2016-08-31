/**
 * 
 */
package mz.com.grupocim.despesas.models;

import java.sql.Date;

/**
 * @author user Aug 30, 2016 3:04:19 PM despesas mz.com.grupocim.despesas.models
 *         2016
 *
 */
public abstract class Despesa {
	private Date data;
	private String descricao;
	private TipoDespesa tipoDespesa;
	double valor;

	
	
	
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the tipoDespesa
	 */
	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}

	/**
	 * @param tipoDespesa
	 *            the tipoDespesa to set
	 */
	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

}
