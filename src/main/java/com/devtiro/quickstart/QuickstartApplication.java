package com.devtiro.quickstart;

import com.devtiro.quickstart.services.PrintingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//@Slf4j
//public class QuickstartApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication.run(QuickstartApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		final ColourPrinter colourPrinter = new ColourPrinterImpl();
//		log.info(colourPrinter.print());
//	}
//}

@SpringBootApplication
@Slf4j
public class QuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(PrintingService service){
		return args -> {
			log.info("from CommandLineRunner");
			service.printSomething();
		};
	}


	// dynamic number of inputs of same type
	// can be represented with ... operator
	public void takesInteger(String s, Integer... a ){
	}
}
