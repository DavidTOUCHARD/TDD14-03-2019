package eu.ensup.testunitaire.dao.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import eu.ensup.testunitaire.dao.EtudiantDao;
import eu.ensup.testunitaire.domaine.Etudiant;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;

public class EtudiantDaoTest {
	private EtudiantDao etudiantdao = new EtudiantDao();
	
	@Test
	public void testLectureEtudiant(){
		Etudiant recupere = etudiantdao.read(1);
		Etudiant attendu = new Etudiant(1,"TOUCHARD","David","blabla@gmail.com");
		System.out.println(recupere +"\t"+attendu);		
		assertEquals(recupere.equals(attendu),true);
			
	}
	
	
	@Test
	public void testInsertionEtudiant(){
		
		Etudiant insertEtu = new Etudiant("KHADY","khady","lala@gmail.com");
		boolean result = etudiantdao.insertEtudiant(insertEtu);
		assertEquals(result, true);
		
	}
	
	@Test
	public void testSuppressionEtudiant(){
		boolean result = etudiantdao.deleteEtudiant(2);
		assertEquals(result, true);
	}
	
	@Test
	public void testMiseAJourEtudiant(){
		boolean result = etudiantdao.updateEtudiant(2,"MonNom");
		assertEquals(result, true);
	}

}
