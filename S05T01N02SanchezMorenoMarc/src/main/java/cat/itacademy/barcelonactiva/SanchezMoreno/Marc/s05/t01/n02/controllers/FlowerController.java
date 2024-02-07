package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.domain.Flower;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.services.FlowerService;
import io.swagger.v3.oas.annotations.Operation;


@Controller
@CrossOrigin(origins = "http://localhost:9001")
public class FlowerController {
	@Autowired
	private FlowerService flowerService;
	
	@Operation(summary = "Add a new flower")
	@PostMapping("/flower/add")
	public ResponseEntity<String> addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);		
		return new ResponseEntity<>(flower.toString()+" succefully created in our database", HttpStatus.OK);
	}
	@Operation(summary = "Get all flowers")
	@GetMapping("/flower/getAll")
	public ResponseEntity<List<FlowerDTO>> getAllFlowers() {
		
	        List<FlowerDTO> flowerList = new ArrayList<>();
	        flowerService.getAllFlower().forEach(flowerList::add);

	        if (flowerList.isEmpty()) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }else {
	        	return new ResponseEntity<>(flowerList, HttpStatus.OK);
	        	
	   }	        
	}
	@Operation(summary = "Delete a flower by id")
	@DeleteMapping("/flower/delete/{id}")
	public ResponseEntity<String> flowerFruit(@PathVariable int id) {
		flowerService.deleteFlower(id);
		return new ResponseEntity<>("flower with id:"+id+" succefully deleted",HttpStatus.OK);
	}
}


