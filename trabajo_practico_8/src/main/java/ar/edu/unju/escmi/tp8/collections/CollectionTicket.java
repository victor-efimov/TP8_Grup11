package ar.edu.unju.escmi.tp8.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.tp8.model.Ticket;

public abstract class CollectionTicket {
	
	public static List<Ticket> tickets = new ArrayList<Ticket>();
	
	public static void precargarTickets() {
		if(tickets.isEmpty()) {
			tickets.add(new Ticket(1,"Iniciado","María Diaz", "Baja", "Desarrollo", 20));
			tickets.add(new Ticket(2,"En Progreso","Juan Perez", "Alta", "Diseño", 80));
			tickets.add(new Ticket(3,"Iniciado","Julieta Marquez", "Media", "Testing", 0));
		}
	}

}
