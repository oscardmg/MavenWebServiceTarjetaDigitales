package com.comodisimos.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import com.comodisimos.tarjetaDigital.model.Tarjeta;
import com.comodisimos.tarjetaDigital.repository.TarjetaRepository;
import com.comodisimos.tarjetaDigital.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "com.comodisimos.tarjetaDigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService{

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTotas() {
		return tarjetaRepository.obtenerTotas();
	}
	

}
