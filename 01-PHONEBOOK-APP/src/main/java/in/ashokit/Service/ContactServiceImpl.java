package in.ashokit.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
	
	private ContactRepository repository;
	
	public ContactServiceImpl(ContactRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveOrUpdateContact(Contact contact) {
		Contact savedobj = repository.save(contact);
		
		return savedobj.getContactId() != null;
		 
	}

	@Override
	public List<Contact> getAllContacts() {
		 
		return repository.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repository.findById(contactId);
		if (findById.isPresent()) {
			
			return findById.get();
			
		}
		return null;
	}
	@Override
	public boolean deleteContactById(Integer contactId) {
		boolean isDeleted = false;
		try {
			repository.deleteById(contactId);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}
}



	