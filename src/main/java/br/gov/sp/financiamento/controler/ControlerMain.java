package br.gov.sp.financiamento.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.financiamento.model.Cliente;
import br.gov.sp.financiamento.repository.ClienteRepository;

@Controller
public class ControlerMain {
	@Autowired
	ClienteRepository repository;
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home");
		List<Cliente> cliente = repository.findAll();
		view.addObject("clientes", cliente);
		view.addObject(new Cliente());
		return view;
			}
	@GetMapping("/cadastro")
	public String cadastro(Model model) {
		model.addAttribute(new Cliente());
	return "cadastro";
			}
	@PostMapping("/salvar")
    public String salvar(Cliente cliente) {
    repository.save(cliente);
    return "redirect:/";
        }
}
