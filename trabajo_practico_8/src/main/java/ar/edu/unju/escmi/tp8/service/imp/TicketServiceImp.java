package ar.edu.unju.escmi.tp8.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.edu.unju.escmi.tp8.collections.CollectionTicket;
import ar.edu.unju.escmi.tp8.model.Ticket;
import ar.edu.unju.escmi.tp8.service.ITicketService;

@Service
public class TicketServiceImp implements ITicketService {
	private final Ticket ticket;

	public TicketServiceImp(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public void guardarTicket(Ticket ticket) {
		// uso la collection para guardar el objeto ticket
		CollectionTicket.tickets.add(ticket);
		System.out.println("ticket guardado! "+ ticket);
		
	}

	@Override
	public List<Ticket> obtenterTickets() {
		return CollectionTicket.tickets;
	}

	@Override
	public void modificarTicket(Ticket ticket) {
		for(Ticket tic : CollectionTicket.tickets) {
			if(tic.getId() == ticket.getId()) {
				tic.setAsignado(ticket.getAsignado());
				tic.setCategoria(ticket.getCategoria());
				tic.setEstado(ticket.getEstado());
				tic.setPorcentaje(ticket.getPorcentaje());
				tic.setPrioridad(ticket.getPrioridad());
				System.out.println("Se modificó el ticket: "+ tic);
			}
		}
	}

	@Override
	public void eliminarTicket(int id) {
		
		Optional<Ticket> tic = CollectionTicket.tickets.stream().filter(t -> t.getId()== id).findFirst();
		if(tic.isPresent()) {
			CollectionTicket.tickets.remove(tic.get());
			System.out.println("se eliminó el ticket con id "+id);
		}
	}

	@Override
	public Ticket buscarTicketId(int id) {
		Optional<Ticket> tic = CollectionTicket.tickets.stream().filter(t -> t.getId()== id).findFirst();
		if(tic.isPresent()) {
			return tic.get();
		}
		return null;
	}

	@Override
	public Ticket getTicket() {
		return ticket;
	}

	@Override
	public void modificarParcialmenteTicket(Ticket ticket) {
		for(Ticket tic : CollectionTicket.tickets) {
			if(tic.getId() == ticket.getId()) {
				if(ticket.getAsignado()!=null)tic.setAsignado(ticket.getAsignado());
				if(ticket.getCategoria()!=null)tic.setCategoria(ticket.getCategoria());
				if(ticket.getEstado()!=null)tic.setEstado(ticket.getEstado());
				if(ticket.getPorcentaje()>=0)tic.setPorcentaje(ticket.getPorcentaje());
				if(ticket.getPrioridad()!=null)tic.setPrioridad(ticket.getPrioridad());
				System.out.println("Se modificó parcialmente el ticket: "+tic);
				
			}
		}
		
	}

}
