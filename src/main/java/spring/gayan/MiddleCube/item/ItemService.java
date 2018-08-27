package spring.gayan.MiddleCube.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.TomcatPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//define as a service by using service annotation
@Service
public class ItemService {
	
	//Inject ItemRepository
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems(){
		List<Item> items = new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}
	
	public Item getItem(String id) {
		return itemRepository.findById(id).orElse(null);
	}
	
	public void addItem(Item item) {
		itemRepository.save(item);
	}
	
	public void updateItem(String id, Item item) {
		itemRepository.save(item);
	}
	
	public void deleteItem(String id) {
		itemRepository.deleteById(id);
	}
}
