package hello;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import io.spring.guides.spring_boot_soap_helloworld.Country;
import io.spring.guides.spring_boot_soap_helloworld.Currency;

@Component
public class CountryRepository {
	private static final List<Country> countries = new ArrayList<Country>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.add(spain);

		Country poland = new Country();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setCurrency(Currency.PLN);
		poland.setPopulation(38186860);

		countries.add(poland);

		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(63705000);

		countries.add(uk);
		
		Country ind = new Country();
		ind.setName("India");
		ind.setCapital("New Delhi");
		ind.setCurrency(Currency.INR);
		ind.setPopulation(1320266741);

		countries.add(ind);
	}

	public Country findCountry(String name) {
		Assert.notNull(name);

		Country result = null;

		for (Country country : countries) {
			if (name.equals(country.getName())) {
				result = country;
			}
		}

		return result;
	}
}