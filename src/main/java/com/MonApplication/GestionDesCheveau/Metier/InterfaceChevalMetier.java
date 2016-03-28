package com.MonApplication.GestionDesCheveau.Metier;

import java.util.List;

import com.MonApplication.GestionDesCheveau.Entitis.Cheval;

public interface InterfaceChevalMetier {


	public void addCheval(Cheval c);
	public void updateChevale(Cheval c);
	public void deleteChevel(Long idCheval);
	public Cheval getCheval(Long idCheval);
	public List<Cheval> getListOfCheval();
}
