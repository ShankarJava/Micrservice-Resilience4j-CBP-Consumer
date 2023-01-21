package microservice.resilience.circuitbreaker.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ResilienceCbServiceB1Application {

	public static void main(String[] args) {
		SpringApplication.run(ResilienceCbServiceB1Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
//	http://localhost:8081/b
//		http://localhost:8080/a
	
//		http://localhost:8080/actuator/health
	
//	{
//	    "status": "UP",
//	    "components": {
//	        "circuitBreakers": {
//	            "status": "UP",
//	            "details": {
//	                "serviceA": {
//	                    "status": "UP",
//	                    "details": {
//	                        "failureRate": "-1.0%",
//	                        "failureRateThreshold": "50.0%",
//	                        "slowCallRate": "-1.0%",
//	                        "slowCallRateThreshold": "100.0%",
//	                        "bufferedCalls": 0,
//	                        "slowCalls": 0,
//	                        "slowFailedCalls": 0,
//	                        "failedCalls": 0,
//	                        "notPermittedCalls": 0,
//	                        "state": "CLOSED"
//	                    }
//	                }
//	            }
//	        },
//	        "discoveryComposite": {
//	            "description": "Discovery Client not initialized",
//	            "status": "UNKNOWN",
//	            "components": {
//	                "discoveryClient": {
//	                    "description": "Discovery Client not initialized",
//	                    "status": "UNKNOWN"
//	                }
//	            }
//	        },
//	        "diskSpace": {
//	            "status": "UP",
//	            "details": {
//	                "total": 202374115328,
//	                "free": 125183533056,
//	                "threshold": 10485760,
//	                "exists": true
//	            }
//	        },
//	        "ping": {
//	            "status": "UP"
//	        },
//	        "refreshScope": {
//	            "status": "UP"
//	        }
//	    }
//	}
}
