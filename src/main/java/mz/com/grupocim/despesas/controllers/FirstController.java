/**
 * 
 */
package mz.com.grupocim.despesas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author user Aug 30, 2016 3:16:41 PM despesas
 *         mz.com.grupocim.despesas.controllers 2016
 *
 */
@Controller
public class FirstController {

	@RequestMapping("/bemvindoDespesas")
	public String execute() {
		System.out.println("Executando a lógica com Spring MVC");
		return "bemvindo";
	}
}
