package com.comodisimos.tarjetaDigital.repository;

import java.util.List;

import com.comodisimos.tarjetaDigital.model.Tarjeta;

public interface TarjetaRepository {
	
	/**
	 * Metodo para crear una tarjeta nueva
	 * @param tarjeta
	 * @return
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * Metodo para devolver todas las tarjetas
	 * @return
	 */
	List<Tarjeta> obtenerTotas();
}
