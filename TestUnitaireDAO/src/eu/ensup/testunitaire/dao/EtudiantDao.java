package eu.ensup.testunitaire.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import eu.ensup.testunitaire.dao.ConnectionDao;
import eu.ensup.testunitaire.domaine.Etudiant;

public class EtudiantDao {

	public static Etudiant read(int i) {
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		Etudiant etu = null;
		try {

			String sql = "SELECT * FROM `etudiants` where `id` = "+ i +";";
			ResultSet rs = cd.stat.executeQuery(sql);
			while (rs.next()) {
				//idstudent = rs.getInt("id"); + rs.getString("nom") + "\t\t" + rs.getString("prenom");
				 etu = new Etudiant(rs.getInt("id"), rs.getString("nom"),rs.getString("prenom"),rs.getString("email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
		
		return etu;

		
	}


	public boolean insertEtudiant(Etudiant insertEtu) {
		// TODO Auto-generated method stub
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "INSERT INTO `etudiants` (`nom`,`prenom`,`email`) VALUES ('" + insertEtu.getNom() + "','"
					+ insertEtu.getPrenom() + "','" + insertEtu.getEmail() + "' );";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
		
		return true;
	}


	public boolean deleteEtudiant(int i) {
		// TODO Auto-generated method stub
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "DELETE FROM `etudiants` where `id` = "+ i +";";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
		return true;	
	}


	public boolean updateEtudiant(int i, String nom) {
		// TODO Auto-generated method stub
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "UPDATE `etudiants` set `nom` = '" + nom + "' where `id` = "+ i +";";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
		return true;
	}

}
