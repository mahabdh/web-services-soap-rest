package service;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Banque Stub=new BanqueWS().getBanquePort();
		Compte emp= Stub.getCompte();
		System.out.println("Id employe "+emp.getId());
		System.out.println("nom employe "+emp.getNom());
		System.out.println("prenom employe "+emp.getPrenom());
		System.out.println("adress employe "+emp.getMontant());
	}

}
