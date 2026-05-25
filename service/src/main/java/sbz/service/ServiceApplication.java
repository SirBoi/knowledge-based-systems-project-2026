package sbz.service;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import sbz.service.simulations.BasicSimulation;
import sbz.service.simulations.CriticalSimulation;
import sbz.service.simulations.DriverSimulation;
import sbz.service.simulations.TrafficSimulation;
import sbz.service.simulations.WeatherSimulation;

@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Bean
	public KieContainer kieContainer() {
		KieServices ks = KieServices.Factory.get();
		KieContainer container = ks.newKieContainer(ks.newReleaseId("sbz", "kjar", "0.0.1-SNAPSHOT"));
		KieScanner scanner = ks.newKieScanner(container);
		
		scanner.start(1000);
		
		return container;
	}

	@Override
	public void run(String... args) throws Exception
	{
		// BasicSimulation.run();
		// CriticalSimulation.run();
		// DriverSimulation.run();
		TrafficSimulation.run();
		// WeatherSimulation.run();

		System.out.println("\n > Simulation finished.");
	}
}