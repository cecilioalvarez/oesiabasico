package com.arquitecturajava.jdbc4.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.jdbc4.models.Compra;
import com.arquitecturajava.jdbc4.repositories.db.DataBaseHelper;

public class CompraRepository {
	
	static final String SELECCIONAR = "SELECT * FROM Compras";
	static final String SELECCIONAR_ORDENADOS = "SELECT * FROM Compras order by %s";

	static final String INSERCION = "Insert into Compras (concepto,importe,personas_dni) values(?,?,?)";
	static final String BORRAR = "DELETE from Compras where id=?";



	public static List<Compra> buscarTodos() {

		List<Compra> listaPersonas = new ArrayList<Compra>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Compra compra = new Compra();
					compra.setId(rs.getInt("id"));
					compra.setConcepto(rs.getString("concepto"));
					compra.setImporte(rs.getDouble("importe"));
					compra.setDni(rs.getString("personas_dni"));
					listaPersonas.add(compra);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaPersonas;

	}

	public void insertar(Compra compra) {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERCION, compra.getConcepto(), compra.getImporte(),compra.getDni());
				Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	public void borrar(Compra compra) {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(BORRAR, compra.getId());
				Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}
	
	
	public static List<Compra> buscarTodosOrdenados(String campo) {

		List<Compra> listaCompras = new ArrayList<Compra>();

		String SQL_Final= String.format(SELECCIONAR_ORDENADOS,campo);
		
		
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SQL_Final);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Compra compra = new Compra();
					compra.setId(rs.getInt("id"));
					compra.setConcepto(rs.getString("concepto"));
					compra.setImporte(rs.getDouble("importe"));
					compra.setDni(rs.getString("personas_dni"));
					listaCompras.add(compra);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaCompras;

	}
	
	

}
