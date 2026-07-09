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
public class Cliente {
     String nombre, apellido, edad, telefono;
    Conexion cn = new Conexion();

    public void insertar() {
        String sql = "INSERT INTO cliente (nombre, apellido, edad, telefono) VALUES (?,?,?,?)";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, edad);
            ps.setString(4, telefono);
            ps.executeUpdate();
            System.out.println("Cliente insertado");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }

    public void modificar(int id) {
        String sql = "UPDATE cliente SET nombre=?, apellido=?, edad=?, telefono=? WHERE id=?";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, edad);
            ps.setString(4, telefono);
            ps.setInt(5, id);
            ps.executeUpdate();
            System.out.println("Cliente modificado");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM cliente WHERE id=?";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Cliente eliminado");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }
}
