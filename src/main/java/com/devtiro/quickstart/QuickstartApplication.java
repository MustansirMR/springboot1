package com.devtiro.quickstart;

import com.devtiro.quickstart.services.ColourPrinter;
import com.devtiro.quickstart.services.impl.ColourPrinterImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class QuickstartApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final ColourPrinter colourPrinter = new ColourPrinterImpl();
		log.info(colourPrinter.print());
	}
}
