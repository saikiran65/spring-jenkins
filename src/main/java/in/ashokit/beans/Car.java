package in.ashokit.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Car implements CommandLineRunner {
	
	public Car() {
		System.out.println("car constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("car moving");		
	}

}
