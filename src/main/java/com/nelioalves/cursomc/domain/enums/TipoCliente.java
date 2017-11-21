package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	private Integer cod;
	private String descrição;

	private TipoCliente(Integer cod, String descrição) {
		this.cod = cod;
		this.descrição = descrição;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescrição() {
		return descrição;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (TipoCliente tipoCliente : TipoCliente.values()) {
			if (cod == tipoCliente.getCod()) {
				return tipoCliente;
			}
		}
		throw new IllegalArgumentException("Id inválido" + cod);
	}

}
