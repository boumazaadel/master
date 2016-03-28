package com.MonApplication.GestionDesCheveau.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.MonApplication.GestionDesCheveau.Entitis.Cheval;

public class ImplementChevalDao implements InterfaceChevalDao {
  
	@PersistenceContext	
    private EntityManager em;
	
	@Override
	public void addCheval(Cheval c) {
		em.persist(c);
		
	}

	@Override
	public void updateChevale(Cheval c) {
		em.merge(c);
		
	}

	@Override
	public void deleteChevel(Long idCheval) {
		Cheval c=em.find(Cheval.class,idCheval);
		em.remove(c);
		
	}

	@Override
	public Cheval getCheval(Long idCheval) {
		
		return em.find(Cheval.class,idCheval);
	}

	@Override
	public List<Cheval> getListOfCheval() {
		Query req=em.createQuery("select c from Cheval c");
		return req.getResultList();
	}

}
