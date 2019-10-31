package org.multimodules.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesBd {

	public Connection cn;
	public Statement st;

	// TODO Connexion à la BD

	public Connection seConnecter() {

		String url = "jdbc:mysql://localhost/consultation?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String login = "root";
		String passwd = "";

		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
//			Class.forName("com.mysql.cj.jdbc.Driver");

			// Etape 2 : r�cup�ration de la connexion
			this.cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Cr�ation d'un statement
			this.st = this.cn.createStatement();

			System.out.println("Connect�.");
		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("hello");
			e.printStackTrace();
		}

		return this.cn;
	}

	// TODO D�connexion � la BD

	public void seDeconnecter() {
		try {
			this.cn.close();
			this.st.close();

			System.out.println("D�connect�.Bye \n ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
