package veneco;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cosun
 */
public class Marca {
    String producto, color, talla, precio;
    Conexion cn = new Conexion();

    public void insertar() {
        String sql = "INSERT INTO marca (producto, color, talla, precio) VALUES (?,?,?,?)";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setString(1, producto);
            ps.setString(2, color);
            ps.setString(3, talla);
            ps.setString(4, precio);
            ps.executeUpdate();
            System.out.println("Marca insertada");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }

    public void modificar(int id) {
        String sql = "UPDATE marca SET producto=?, color=?, talla=?, precio=? WHERE id=?";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setString(1, producto);
            ps.setString(2, color);
            ps.setString(3, talla);
            ps.setString(4, precio);
            ps.setInt(5, id);
            ps.executeUpdate();
            System.out.println("Marca modificada");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM marca WHERE id=?";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Marca eliminada");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }
}
