package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.grifoInambari.core.dao.CustomerDAO;
import pe.com.grifoInambari.core.dao.DescriptionVentaDAO;
import pe.com.grifoInambari.core.dao.EnterPriceDAO;
import pe.com.grifoInambari.core.dao.GrifoDAO;
import pe.com.grifoInambari.core.dao.PriceDAO;
import pe.com.grifoInambari.core.dao.ProductoDAO;
import pe.com.grifoInambari.core.dao.RepositoryDAO;
import pe.com.grifoInambari.core.dao.RoleDAO;
import pe.com.grifoInambari.core.dao.UserSystemDAO;
import pe.com.grifoInambari.core.dao.VoucherDAO;

@Service("grifoInambariService")
public class GrifoInambariService {

	@Autowired
	private GrifoDAO grifoDAO;
	
	
	
	
	
	
//	public static List<Person> listPerson = new ArrayList<Person>();
//
//	@Autowired
//	private PersonDAO personDAO;

	// UserSystem findUserSystemById(Long id);
	//
	// void deleteUserSystem(UserSystem userSystem);

//	public void deleteUserSystem(Long id) {
//		UserSystem userSystem  = personDAO.findUserSystemById(id);
//		personDAO.deleteUserSystem(userSystem);
//	}
//
//	public UserSystem findUserSystemById(Long id) {
//		return personDAO.findUserSystemById(id);
//	}
//
//	public List<StatusUser> findStatusUser() {
//		return personDAO.findStatusUser();
//	}
//
//	public List<TypeDocument> findTypeDocument() {
//		return personDAO.findTypeDocument();
//	}
//
//	public List<StatusPerson> findStatusPerson() {
//		return personDAO.findStatusPerson();
//	}
//
//	public List<pe.com.grifoInambari.core.domain.Person> findAllPerson() {
//		return personDAO.findAllPerson();
//		// return listPerson;
//	}
//
//	public void savePerson(pe.com.grifoInambari.core.domain.Person person) {
//		// listPerson.add(person);
//		personDAO.savePerson(person);
//	}
//
//	public List<UserSystem> findUserSystem() {
//		return personDAO.findUserSystem();
//	}
//
//	public void saveUserSystem(UserSystem userSystem) {
//		if (userSystem.getId() == null) {
//			personDAO.saveUserSystem(userSystem);
//		} else {
//			personDAO.updateUserSystem(userSystem);
//		}
//	}
//
//	public void deletePerson(Long id) {
//		// peruInkaDAO.deletePerson(id);
//		List<Person> listPersoTemp = new ArrayList<Person>();
//
//		for (Person person : listPerson) {
//			if (id.compareTo(person.getId()) != 0) {
//				listPersoTemp.add(person);
//			}
//		}
//		listPerson = new ArrayList<Person>();
//		listPerson.addAll(listPersoTemp);
//	}
//
//	public void updatePerson(Person personUpdate) {
//		List<Person> listTemp = new ArrayList<Person>();
//
//		for (Person person : listPerson) {
//			if (personUpdate.getId().compareTo(person.getId()) == 0) {
//				listTemp.add(personUpdate);
//			} else {
//				listTemp.add(person);
//			}
//		}
//		listPerson = new ArrayList<Person>();
//		listPerson.addAll(listTemp);
//
//	}
//
//	public Person searchPerson(Long id) {
//		Person personReturn = new Person();
//		for (Person person : listPerson) {
//			if (id.compareTo(person.getId()) == 0) {
//				personReturn = person;
//				continue;
//			}
//		}
//		return personReturn;
//	}
	
	
}
