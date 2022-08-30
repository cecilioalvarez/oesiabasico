package com.arquitecturajava.jdbc3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompraAR {
	
	static final String SELECCIONAR = "SELECT * FROM Compras";
	static final String SELECCIONAR_ORDENADOS = "SELECT * FROM Compras order by %s";

	static final String INSERCION = "Insert into Compras (concepto,importe,personas_dni) values(?,?,?)";
	static final String BORRAR = "DELETE from Compras where id=?";

	private int id;
	private String concepto;
	private double importe;
	private String dni;
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	
	public CompraAR(int id) {
		super();
		this.id = id;
	}

	public CompraAR() {
		super();
	}

	

	public CompraAR(String concepto, double importe,String dni) {
		super();
	
		this.concepto = concepto;
		this.importe = importe;
		this.dni= dni;
	}

	public static List<CompraAR> buscarTodos() {

		List<CompraAR> listaPersonas = new ArrayList<CompraAR>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					CompraAR compra = new CompraAR();
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

	public void insertar() {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERCION, getConcepto(), getImporte(),getDni());
				Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	public void borrar() {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(BORRAR, getId());
				Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}
	
	
	public static List<CompraAR> buscarTodosOrdenados(String campo) {

		List<CompraAR> listaPersonas = new ArrayList<CompraAR>();

		String SQL_Final= String.format(SELECCIONAR_ORDENADOS,campo);
		
		
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SQL_Final);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					CompraAR compra = new CompraAR();
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
	
	

}
