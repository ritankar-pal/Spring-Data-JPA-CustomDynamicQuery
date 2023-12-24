package in.ineuron.service;
import java.util.List;
import in.ineuron.bo.CoronaVaccine;
import in.ineuron.type.ResultView1;
import in.ineuron.type.View;


public interface ICoronaVaccineMgmtService {
	
	//the first '<>' controls the return type and the second '<>' controls the input type in Generics::
	public <T extends View> List<T> searchVaccineByCompany(String company, Class<T> clazz);
}

