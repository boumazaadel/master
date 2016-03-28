package com.MonApplication.GestionDesCheveau;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.MonApplication.GestionDesCheveau.Entitis.Cheval;
import com.MonApplication.GestionDesCheveau.Metier.InterfaceChevalMetier;

public class TestCheval {
	ClassPathXmlApplicationContext Context;
    @Before
	public void setup() throws Exception{
		Context=new ClassPathXmlApplicationContext( new String[]{"applicationContext.xml"} );
	}
    
	/*@Test
	public void testMethodeInsertAndGetListe() {
		try {				
			InterfaceChevalMetier metier=(InterfaceChevalMetier) Context.getBean("Metier");
			List<Cheval> c1=metier.getListOfCheval();
			metier.addCheval(new Cheval("popou", "01/01/2015","28/03/2016",580));
			metier.addCheval(new Cheval("sousou", "01/01/2015","28/03/2016",580));
			List<Cheval> c2=metier.getListOfCheval();
			assertTrue(c1.size()+2==c2.size());
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}*/
	/*@Test
	public void testMethodedelete() {
		try {				
			InterfaceChevalMetier metier=(InterfaceChevalMetier) Context.getBean("Metier");
			List<Cheval> c1=metier.getListOfCheval();
			metier.deleteChevel(1L);
			List<Cheval> c2=metier.getListOfCheval();
			assertTrue(c1.size()==c2.size()-1);
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}*/
  /*  @Test
	public void testMethodeupdate() {
		try {				
			InterfaceChevalMetier metier=(InterfaceChevalMetier) Context.getBean("Metier");
			Cheval c= metier.getCheval(1L);
			c.setNomCheval("bobbo");
			metier.updateChevale(c);
			assertTrue(c.getNomCheval().equals("bobbo"));
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}*/
}
