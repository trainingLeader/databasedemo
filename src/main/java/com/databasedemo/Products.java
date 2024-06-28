package com.databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Products {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/products";
        String user = "root";
        String password = "123456";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            // Crear tabla
            // String createTableSQL = "CREATE TABLE IF NOT EXISTS category (" +
            // "id INT PRIMARY KEY AUTO_INCREMENT, " +
            // "name VARCHAR(50))";
            // statement.execute(createTableSQL);
            // Crear tabla
            // String query = "INSERT INTO category (name) VALUES " +
            // "('Pinturas'), " +
            // "('Herramientas')";

            // statement.executeUpdate(query);
            // System.out.println("Categorias registradas");
            // Consultar datos

            // String query = "SELECT id,name FROM category;";
            // ResultSet rs = statement.executeQuery(query);

            // // Procesar resultados
            // while (rs.next()) {
            //     int id = rs.getInt("id");
            //     String name = rs.getString("name");
            //     System.out.println(MessageFormat.format("Id Categoria {0} - Nombre {1}", id, name));
            // }

            // Operación UPDATE
            // String updateSQL = "UPDATE category SET name = 'Grifos' WHERE id = 1";
            // int rowsUpdated = statement.executeUpdate(updateSQL);
            // System.out.println("Número de filas actualizadas: " + rowsUpdated);

            // Operación DELETE
            String deleteSQL = "DELETE FROM category WHERE id = 1";
            int rowsDeleted = statement.executeUpdate(deleteSQL);
            System.out.println("Número de filas eliminadas: " + rowsDeleted);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // try (Connection connection = DriverManager.getConnection(url, user,
        // password);
        // Statement statement = connection.createStatement()) {

        // // Crear tabla
        // String createTableSQL = "CREATE TABLE IF NOT EXISTS inventario (" +
        // "id INT PRIMARY KEY AUTO_INCREMENT, " +
        // "name VARCHAR(50))";
        // statement.execute(createTableSQL);

        // System.out.println("Tabla creada !");

        // }
    }
}