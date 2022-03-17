package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/516ntR4xoCL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Moonlight-Branco/dp/B07YJHXZT6");
		pedido.setDescricao("descricao qualquer");
		
		List<Pedido> pedidos =  Arrays.asList(pedido,pedido,pedido);
		
		model.addAttribute("pedidos",pedidos);
		
		return "home";
	}

}
