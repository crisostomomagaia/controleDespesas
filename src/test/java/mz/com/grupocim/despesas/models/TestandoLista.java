/**
 * 
 */
package mz.com.grupocim.despesas.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author user Aug 31, 2016 3:15:49 PM controleDespesas mz.com.grupocim.despesas.models 2016
 *
 */
/**
 * @author user Aug 31, 2016 3:23:50 PM controleDespesas mz.com.grupocim.despesas.models 2016
 *
 */
public class TestandoLista {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Despesa> despesas = new ArrayList<Despesa>();
		//Despesa despesa = new Despesa();
		Gasto gasto = new Gasto();
		Ganho ganho = new Ganho();
		despesas.add(ganho);
		despesas.add(gasto);
		
		System.out.println(despesas.size());
		System.out.println(despesas.get(0).getTipoDespesa());
		System.out.println(despesas.get(1).getTipoDespesa());
		
	}

}
