package ar.edu.unju.escmi.tp8.service;

import java.util.List;

import ar.edu.unju.escmi.tp8.model.Ticket;

public interface ITicketService {
	
	void guardarTicket(Ticket ticket);
	List<Ticket> obtenterTickets();
	void modificarTicket(Ticket ticket);
	void modificarParcialmenteTicket(Ticket ticket);
	void eliminarTicket(int id);
	Ticket buscarTicketId(int id);
	Ticket getTicket();

}
