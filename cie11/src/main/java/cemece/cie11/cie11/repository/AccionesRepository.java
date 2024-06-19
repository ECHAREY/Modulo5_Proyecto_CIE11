package cemece.cie11.cie11.repository;


import cemece.cie11.cie11.entity.Defuncion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface AccionesRepository extends JpaRepository<Defuncion, Integer>{

}