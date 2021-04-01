package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.Service.ContactService;
import in.ashokit.entity.Contact;



@Controller
public class ContactInfoController {
	private ContactService service;
	public ContactInfoController(ContactService service) {
		this.service = service;
	}
	
	public 
	@GetMapping("/Load-Form")
	public String loadform(Model model) {
		Contact cbj = new Contact();
		model.addAttribute("contact", cbj);
		return  "contact";
	}
	@PostMapping("/savecontact")
	
	public String handleSubmitBtn( Contact contact,Model model) {
		boolean isSaved = service.saveOrUpdateContact(contact);
		if (isSaved) {
			model.addAttribute("Success Messege","Contact is Saved" );
		}
		else {
			model.addAttribute("Failed to load Messege","Contact is not Saved" );
		}
		
		return "contact";
	}
	
	@GetMapping("/View All contacts")
	public String handleContactHyperlink(Model model) {
		List<Contact>allContacts = service.getAllContacts();
		model.addAttribute("contacts", allContacts); 
		return "allcontacts";
	}

}
