package com.MonApplication.GestionDesCheveau.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.MonApplication.GestionDesCheveau.Dao.InterfaceChevalDao;
import com.MonApplication.GestionDesCheveau.Entitis.Cheval;
@Transactional
public class ImplementChevalMetier implements InterfaceChevalMetier {
	@Autowired
	private InterfaceChevalDao dao;
	
	

	public void setDao(InterfaceChevalDao dao) {
		this.dao = dao;
		System.out.println("injected");
	}

	@Override
	public void addCheval(Cheval c) {
		dao.addCheval(c);
	}

	@Override
	public void updateChevale(Cheval c) {
		dao.updateChevale(c);
		
	}

	@Override
	public void deleteChevel(Long idCheval) {
		dao.deleteChevel(idCheval);
	}

	@Override
	public Cheval getCheval(Long idCheval) {
		// TODO Auto-generated method stub
		return dao.getCheval(idCheval);
	}

	@Override
	public List<Cheval> getListOfCheval() {
		// TODO Auto-generated method stub
		return dao.getListOfCheval();
	}

}
