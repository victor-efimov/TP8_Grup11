package ar.edu.unju.escmi.tp8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.escmi.tp8.collections.CollectionTicket;
import ar.edu.unju.escmi.tp8.collections.CollectionEmpresa;

@SpringBootApplication
public class TrabajoPractico8Application {

	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico8Application.class, args);
		CollectionTicket.precargarTickets();
		CollectionEmpresa.precargarEmpresas();
	}

}
