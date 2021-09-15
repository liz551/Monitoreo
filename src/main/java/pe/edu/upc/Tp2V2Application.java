package pe.edu.upc;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Tp2V2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2V2Application.class, args);

	}

	@Bean
	public ModelMapper modelMapper() {return new ModelMapper();}

}
