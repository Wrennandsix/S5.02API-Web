package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.domain.Flower;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.repository.FlowerRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class FlowerServicesImpl implements FlowerService {
	
	
	private FlowerRepository flowerRepo;
	
	  public FlowerServicesImpl(FlowerRepository flowerRepo){
	        this.flowerRepo = flowerRepo;
	  }

	@Override
	public void addFlower(Flower flower) {
		flowerRepo.save(flower);		
	}

	@Override
	public void updateFlower(Flower flower) {
		flowerRepo.save(flower);	
	}

	@Override
	public void deleteFlower(Integer id) {
		
	       Optional<Flower> flower = flowerRepo.findById(id);
	        if(flower.isPresent()){
	        	flowerRepo.deleteById(id);
	        }
	        else{
	            throw new EntityNotFoundException();
	        }
	    }
		

	@Override
	public Flower getOneFlower(Integer id) {
		
	      Optional<Flower> flower = flowerRepo.findById(id);
	        if(flower.isPresent()){
	            return flower.get();
	        }
	        else {
	            throw new EntityNotFoundException();
	        }
	    }

		@Override
		public List<FlowerDTO> getAllFlower() {

			List<FlowerDTO> allFlowerDTO = new ArrayList<>();

			flowerRepo.findAll().forEach(f -> allFlowerDTO.add(flowerToDTO(f)));

			return allFlowerDTO;
		}

		@Override
		public FlowerDTO flowerToDTO(Flower flower) {

			return new FlowerDTO(flower);
		}

	}