package com.sefin.beneficiarios.negocio;

import java.util.ArrayList;
import java.util.List;

public class Ficha {
	private Beneficiario beneficiario;
	private List<Cuenta> lstCuentas;
	
	public Ficha(Beneficiario ben) {
		// TODO Auto-generated constructor stub
		Cuenta cuentaInicial = new Cuenta();
		cuentaInicial.setId(1001);
		cuentaInicial.setCuenta("Inicial");
		this.lstCuentas = new ArrayList<Cuenta>();
		this.lstCuentas.add(cuentaInicial);
		this.beneficiario = ben;
	}

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public List<Cuenta> getLstCuentas() {
		return lstCuentas;
	}

	public void setLstCuentas(List<Cuenta> lstCuentas) {
		this.lstCuentas = lstCuentas;
	}
	
	
}
