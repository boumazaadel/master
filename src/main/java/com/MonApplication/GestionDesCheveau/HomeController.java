package com.MonApplication.GestionDesCheveau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MonApplication.GestionDesCheveau.Entitis.Cheval;
import com.MonApplication.GestionDesCheveau.Metier.InterfaceChevalMetier;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private InterfaceChevalMetier metier;
	
	@RequestMapping(value="/")
	public String index(Model model){
		model.addAttribute("chevalModel",new Cheval());
		model.addAttribute("chevalModel",metier.getListOfCheval());
		return "home";
	}
	
	
	@RequestMapping(value="/addChevale")
	public String addChevale(Model model, Cheval c){
		metier.addCheval(c);
		model.addAttribute("chevalModel",new Cheval());
		model.addAttribute("chevalModel",metier.getListOfCheval());
		return "home";
	}
	
    
	@RequestMapping(value="/removechev")
	public String suprimerClients(Model model,Long idCheval){
		metier.deleteChevel(idCheval);
		model.addAttribute("chevalModel",new Cheval());
		model.addAttribute("chevalModel",metier.getListOfCheval());
		 return "home";
	}
	
}
	

	
























	
	/*private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	*//**
	 * Simply selects the home view to render by returning its name.
	 *//*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
*/