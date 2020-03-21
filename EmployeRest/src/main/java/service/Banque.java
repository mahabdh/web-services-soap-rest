package service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.Client;


@Path("/service")
public class Banque {
	@GET //psk get compte si on cree on met POST
	@Path("/getEmploey")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Client getCompte() {
		Client c = new Client(1L,"Maha","Boudah",99999);
		return c;
		
	}
	@GET 
	@Path("/getEmploey")
	@Produces(MediaType.APPLICATION_XML)
	public List<Client> getComptes() {
		List<Client> cpt = new ArrayList<Client>();
		cpt.add(new Client (2L,"nour","Boudah",99989));
		cpt.add(new Client (3L,"youcef","Boudah",456985));
		return cpt;
		
	}
	@WebMethod
	public double conversionMontant(@WebParam(name="montant") double mt) {// web param ki tesha9i tpassi haja en parametre
		return mt*11;
	}

}
