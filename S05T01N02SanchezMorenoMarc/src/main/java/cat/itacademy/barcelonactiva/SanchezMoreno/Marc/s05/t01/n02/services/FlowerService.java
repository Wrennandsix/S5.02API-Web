package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.services;

import java.util.List;

import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.domain.Flower;
import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.dto.FlowerDTO;

public interface FlowerService {
			
	    public void addFlower(Flower flower);
	    public void updateFlower(Flower flower);
	    public void deleteFlower(Integer id);
	    public Flower getOneFlower(Integer id);
	    public FlowerDTO flowerToDTO(Flower flower);
	    public List<FlowerDTO> getAllFlower();
	}

