package connection;

import entities.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection connection = null;

    public ClienteDAO() {
        ConnectionManager connectionManager = new ConnectionManager();
        connection = connectionManager.getConnection();
    }

    public void inserirCliente(Cliente cliente) {
        try {
            String insertQuery = "INSERT INTO CLIENTE (nome, email, telefone) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, cliente.getNome());
                preparedStatement.setString(2, cliente.getEmail());
                preparedStatement.setString(3, cliente.getTelefone());

                int rowsInserted = preparedStatement.executeUpdate();

                if (rowsInserted > 0) {
                    try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int novoId = generatedKeys.getInt(1);
                            cliente.setId(novoId);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente obterClientePorId(int id) {
        try {
            String selectQuery = "SELECT id, nome, email, telefone FROM CLIENTE WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                preparedStatement.setInt(1, id);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        String nome = resultSet.getString("nome");
                        String email = resultSet.getString("email");
                        String telefone = resultSet.getString("telefone");

                        return new Cliente(id, nome, email, telefone);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualizarCliente(Cliente cliente) {
        try {
            String updateQuery = "UPDATE CLIENTE SET nome = ?, email = ?, telefone = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                preparedStatement.setString(1, cliente.getNome());
                preparedStatement.setString(2, cliente.getEmail());
                preparedStatement.setString(3, cliente.getTelefone());
                preparedStatement.setInt(4, cliente.getId());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarCliente(int id) {
        try {
            String deleteQuery = "DELETE FROM CLIENTE WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> obterTodosClientes() {
        List<Cliente> clientes = new ArrayList<>();

        try {
            String selectAllQuery = "SELECT id, nome, email, telefone FROM CLIENTE";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectAllQuery)) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("nome");
                    String email = resultSet.getString("email");
                    String telefone = resultSet.getString("telefone");

                    Cliente cliente = new Cliente(id, nome, email, telefone);
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public void fecharConexao() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}