package spring.gayan.MiddleCube.item;

import org.springframework.data.repository.CrudRepository;

//CrudRepository required generic types 1.) Entity 2) primary key
public interface ItemRepository extends CrudRepository <Item, String>{
	
}
