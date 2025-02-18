package interfaces;
import java.lang.*;
import classes.*;

public interface ITicket{


	void BookTicket(Ticket t);
	void cancelTicket(int ticketNumber);
}