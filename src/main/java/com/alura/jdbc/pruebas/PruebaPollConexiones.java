package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPollConexiones {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		int par;
	for (int i = 0; i < 20 ; i++) {
		Connection connection = connectionFactory.recuperaConexion();
		System.out.println("abriendo conexión " + (i + 1));
		
		if (i%2 == 0) {
			connection.close();
		}
	}
	}

}
