package com.eiv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    
    private static final Logger LOG = LoggerFactory.getLogger(App.class);
    
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        double rv = potencia.calcular(2);
        LOG.debug("Resultado: {}", rv);
    }
    
    @Autowired @Qualifier("potenciaBiasImpl") private Potencia potencia;
    @Autowired Campo campo;
}
