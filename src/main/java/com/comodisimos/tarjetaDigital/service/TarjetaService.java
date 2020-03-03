package com.comodisimos.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import com.comodisimos.tarjetaDigital.model.Tarjeta;

//@WebService con esto se indica que esta interfaz va estar poublicada como un webservice

@WebService 
public interface TarjetaService {
	
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
