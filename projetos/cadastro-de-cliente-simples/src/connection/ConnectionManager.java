package connection;

import java.sql.*;

public class ConnectionManager {
    
    private static final String URL = "jdbc:derby://localhost:1527/bdCliente"; 
    private static final String USERNAME = "bdCliente"; 
    private static final String PASSWORD = "bdCliente"; 
    
    private Connection connection = null;
    public ConnectionManager() {
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Exceção: " + ex.getMessage());
            throw new RuntimeException("Erro ao estabelecer a conexão com o banco de dados", ex);
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Exceção ao fechar a conexão: " + e.getMessage());
        }
    }
}