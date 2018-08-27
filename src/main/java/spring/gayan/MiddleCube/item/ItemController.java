package spring.gayan.MiddleCube.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//annotation for REST Controller
@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	// request mapping for  "/"
	@RequestMapping("/")
	public String root() {
		return "<h1 align='center'>Welcome to Simple Inventory!</h1>";
	}
	
	//get all items
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/items/{id}")
	public Item getItem(@PathVariable String id) {
		return itemService.getItem(id);
	}
	
	@PostMapping("/items")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	@PutMapping("/items/{id}")
	public void updateItem(@RequestBody Item item,@PathVariable String id) {
		itemService.updateItem(id, item);
	}
	
	@DeleteMapping("/items/{id}")
	public void deleteItem(@PathVariable String id) {
		itemService.deleteItem(id);
	}
}
