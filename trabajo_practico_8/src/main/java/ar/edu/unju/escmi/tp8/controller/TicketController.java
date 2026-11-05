package ar.edu.unju.escmi.tp8.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unju.escmi.tp8.model.Ticket;
import ar.edu.unju.escmi.tp8.service.ITicketService;


@RestController
@RequestMapping("/api/tickets")
public class TicketController {
	
	private final ITicketService ticketService;

	public TicketController(ITicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	
	@GetMapping
	public List<Ticket> getTickets(){
		return ticketService.obtenterTickets();
	}
	
	@GetMapping("/{id}")
	public Ticket getTicketById(@PathVariable int id) {
		return ticketService.buscarTicketId(id);
	}
	
	@PostMapping
	public void addTicket(@RequestBody Ticket ticket) {
		ticketService.guardarTicket(ticket);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTicket(@PathVariable int id) {
		ticketService.eliminarTicket(id);
		
	}
	
	@PutMapping
	public void updateTicket(@RequestBody Ticket ticket) {
		ticketService.modificarTicket(ticket);
		
	}
	
	@PatchMapping
	public void updatePartialTicket(@RequestBody Ticket ticket) {
		ticketService.modificarParcialmenteTicket(ticket);
		
	}

}
