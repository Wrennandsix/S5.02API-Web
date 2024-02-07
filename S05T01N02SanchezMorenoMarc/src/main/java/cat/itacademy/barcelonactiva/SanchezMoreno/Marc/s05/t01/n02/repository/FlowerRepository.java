package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.repository;

import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s05.t01.n02.domain.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
