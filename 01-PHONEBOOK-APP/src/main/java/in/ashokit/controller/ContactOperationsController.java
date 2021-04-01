package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.Service.ContactService;
import in.ashokit.entity.Contact;

@Controller
public class ContactOperationsController {
	
	private ContactService service;
	 
	public ContactOperationsController (ContactService service) {
	
	this.service=service;
	}
	
	@GetMapping("/edit")
	public String editContact(@RequestParam("cid") Integer contactId,Model model) {
		
		Contact cbj = service.getContactById(contactId);
		model.addAttribute("contact" ,cbj);
		return "contact";
	} {
		
	}

}
  
