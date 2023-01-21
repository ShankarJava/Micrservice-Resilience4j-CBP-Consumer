package microservice.resilience.circuitbreaker.serviceb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/a")
public class ServiceAController {

	@Autowired
	RestTemplate restTemplate;

	private static final String BASE_URL = "http://localhost:8081/b";
	private static final String SERVICE = "serviceA";

	@GetMapping
	@CircuitBreaker(name = SERVICE, fallbackMethod = "serviceAFallBackMet")
	public String serviceA() {
		System.out.println("Service A Controller");
		return restTemplate.getForObject(BASE_URL, String.class);

	}

	public String serviceAFallBackMet(Exception e) {

		return "THIS IS THE FALLBACK METHOD RESPONSE";
	}
}
