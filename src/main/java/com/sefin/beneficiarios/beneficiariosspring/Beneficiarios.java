package com.sefin.beneficiarios.beneficiariosspring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sefin.beneficiarios.negocio.Beneficiario;
import com.sefin.beneficiarios.negocio.Cuenta;
import com.sefin.beneficiarios.negocio.Ficha;

@RestController
public class Beneficiarios {
	
	@RequestMapping(value="/sefin/api/beneficiario", 
	method = RequestMethod.POST,
	consumes = "application/json",
	produces = "application/json")
	public Ficha getFicha(@RequestBody Beneficiario beneficiario) {
		Ficha ficha = new Ficha(beneficiario);
		Cuenta cuentaInicial = new Cuenta();
		cuentaInicial.setId(1001);
		cuentaInicial.setCuenta("Inicial");
		
		return ficha;
	}
}
