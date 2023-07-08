package in.saffu.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.saffu.binding.Contact;

@RestController
@CrossOrigin
public class ContactRestController {
	
	private Map<Integer, Contact> contacMap= new HashMap<>();
	
	@PostMapping("/contact")
	private Collection<Contact> craeteContact(@RequestBody Contact contact) {
		//System.out.println(contact);
		
		contacMap.put(UUID.randomUUID().hashCode(), contact);
		return contacMap.values();
		
		
	}

}
