package in.ineuron.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import in.ineuron.bo.CoronaVaccine;
import in.ineuron.type.ResultView1;
import in.ineuron.type.View;


public interface ICoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	
	//the first '<>' controls the return type and the second '<>' controls the input type in Generics::
	public <T extends View> List<T> findByCompanyOrderByCompanyDesc(String company, Class<T> clazz);
}
