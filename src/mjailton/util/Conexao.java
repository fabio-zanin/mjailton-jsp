package mjailton.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection conexaoBanco() {
		
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/mjailton_jsp";
		String user = "postgres";
		String pass = "postgres";
		
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException();
		}		
	}

	//teste conexao
	public static void main(String[] args) {
		Connection con = new Conexao().conexaoBanco();
		System.out.println("conectado");
	}
}
