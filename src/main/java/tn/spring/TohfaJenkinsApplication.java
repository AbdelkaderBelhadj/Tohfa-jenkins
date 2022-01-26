package tn.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TohfaJenkinsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TohfaJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world Jenkins !");
		System.out.println("Web hook Jenkins !");
		
	}

}
