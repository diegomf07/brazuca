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
public class Productos {
    String marca, modelo, color, precio;
    Conexion cn = new Conexion();

    public void insertar() {
        String sql = "INSERT INTO productos (marca, modelo, color, precio) VALUES (?,?,?,?)";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setString(3, color);
            ps.setString(4, precio);
            ps.executeUpdate();
            System.out.println("Producto insertado");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }

    public void modificar(int id) {
        String sql = "UPDATE productos SET marca=?, modelo=?, color=?, precio=? WHERE id=?";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setString(3, color);
            ps.setString(4, precio);
            ps.setInt(5, id);
            ps.executeUpdate();
            System.out.println("Producto modificado");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM productos WHERE id=?";
        try (PreparedStatement ps = cn.conectar().prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Producto eliminado");
        } catch (SQLException e) { System.out.println("Error: " + e.getMessage()); }
    }
}
