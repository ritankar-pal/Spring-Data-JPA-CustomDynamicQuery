package in.ineuron;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import in.ineuron.service.CoronaVaccineMgmtServiceImpl;
import in.ineuron.service.ICoronaVaccineMgmtService;
import in.ineuron.type.ResultView2;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(Application.class, args);
		ICoronaVaccineMgmtService service = factory.getBean(CoronaVaccineMgmtServiceImpl.class);
			
		List<ResultView2> vaccines = service.searchVaccineByCompany("Bharat-Biotech", ResultView2.class);
		
		vaccines.forEach(vacc -> {
			System.out.print(vacc.getRegNo() + " --> " + vacc.getCountry() + " --> " + vacc.getPrice());
			System.out.println();
		});
		
		((ConfigurableApplicationContext) factory).close();
	}

}
