package com.arquitecturajava.miproyecto.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.jdbc4.models.Compra;
import com.arquitecturajava.jdbc4.models.Persona;
import com.arquitecturajava.miproyecto.repositories.PersonaRepository;
import com.arquitecturajava.miproyecto.repositories.jdbc.config.DataBaseHelper;

public class PersonaRepositoryJDBC implements PersonaRepository {

	static final String SELECCIONAR_MEDIA = "SELECT AVG(edad) as media FROM Personas";
	static final String SELECCIONAR = "SELECT * FROM Personas";
	static final String SELECCIONAR_UNA = "SELECT * FROM Personas where dni=?";
	static final String SELECCIONAR_COMPRAS = "SELECT * FROM Compras where personas_dni=?";
	static final String SELECCIONAR_PERSONAS_COMPRAS = "SELECT * FROM Personas inner join Compras on Personas.dni=Compras.personas_dni";

	static final String INSERCION = "Insert into Personas values(?,?,?,?,?)";
	static final String BORRAR = "DELETE from Personas where dni=?";

	
	@Override
	public  List<Persona> buscarTodos() {

		List<Persona> listaPersonas = new ArrayList<Persona>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				while (rs.next()) {
					Persona persona = new Persona();
					persona.setDni(rs.getString("dni"));
					persona.setNombre(rs.getString("nombre"));
					persona.setApellidos(rs.getString("apellidos"));
					persona.setEdad(rs.getInt("edad"));
					persona.setPais(rs.getString("pais"));
					listaPersonas.add(persona);
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaPersonas;

	}

	@Override
	public  List<Persona> buscarTodosConCompras() {

		List<Persona> listaPersonas = new ArrayList<Persona>();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR_PERSONAS_COMPRAS, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				Persona persona = null;

				while (rs.next()) {

					// proceso fila a fila
					// cada fila tiene una persona y una compra
					if (persona == null || !persona.getDni().equals(rs.getString("dni"))) {
						persona = new Persona();
						persona.setDni(rs.getString("dni"));
						persona.setNombre(rs.getString("nombre"));
						persona.setApellidos(rs.getString("apellidos"));
						persona.setEdad(rs.getInt("edad"));
						persona.setPais(rs.getString("pais"));
						listaPersonas.add(persona);
					}

					
					Compra compra = new Compra();
					compra.setDni(rs.getString("dni"));
					compra.setConcepto(rs.getString("concepto"));
					compra.setImporte(rs.getDouble("importe"));
					persona.addCompra(compra);
					
				}
			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

		return listaPersonas;

	}

	@Override
	public  Persona buscarUna(String dni) {

		Persona persona = new Persona();

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR_UNA, dni);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				rs.next();

				persona.setDni(rs.getString("dni"));
				persona.setNombre(rs.getString("nombre"));
				persona.setApellidos(rs.getString("apellidos"));
				persona.setEdad(rs.getInt("edad"));
				persona.setPais(rs.getString("pais"));

			} catch (SQLException e) {
				throw new RuntimeException("error de datos", e);
			}

		} catch (SQLException e1) {
			throw new RuntimeException("error de datos", e1);
		}

		return persona;

	}

//	public List<CompraAR> getCompras() {
//
//		List<CompraAR> listaCompras = new ArrayList<CompraAR>();
//
//		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR_COMPRAS, getDni());
//				Connection conn = sentencia.getConnection();) {
//
//			try (ResultSet rs = sentencia.executeQuery();) {
//
//				while (rs.next()) {
//					CompraAR compra = new CompraAR();
//					compra.setId(rs.getInt("id"));
//					compra.setConcepto(rs.getString("concepto"));
//					compra.setImporte(rs.getDouble("importe"));
//					compra.setDni(rs.getString("personas_dni"));
//					listaCompras.add(compra);
//				}
//
//			} catch (SQLException e) {
//				throw new RuntimeException("error de datos", e);
//			}
//
//		} catch (SQLException e) {
//			throw new RuntimeException("error de datos", e);
//		}
//
//		return listaCompras;
//
//	}

	@Override
	public void insertar(Persona p) {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(INSERCION, p.getDni(), p.getNombre(),
				p.getApellidos(), p.getEdad(), p.getPais()); Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	@Override
	public void borrar(Persona p) {

		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(BORRAR, p.getDni());
				Connection conn = sentencia.getConnection();) {
			sentencia.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("error de datos", e);
		}

	}

	@Override
	public double calcularEdadMedia() {
		double media=0;
		
		try (PreparedStatement sentencia = DataBaseHelper.crearSentenciaPreparada(SELECCIONAR_MEDIA, null);
				Connection conn = sentencia.getConnection();) {

			try (ResultSet rs = sentencia.executeQuery();) {

				rs.next();
				media= rs.getDouble("media");
				
			} 

		} catch (SQLException e1) {
			throw new RuntimeException("error de datos", e1);
		}

		
		return media;
	}

	@Override
	public double calculaEdadMayor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculaEdadMenor() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
