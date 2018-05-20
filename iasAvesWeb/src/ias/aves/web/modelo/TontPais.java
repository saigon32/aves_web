package ias.aves.web.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the tont_paises database table.
 * 
 */
@Entity
@Table(name = "tont_paises")
@NamedQuery(name = "TontPais.findAll", query = "SELECT t FROM TontPais t")
public class TontPais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdpais;

	private String dsnombre;

	// bi-directional many-to-one association to TontZona
	@ManyToOne
	@JoinColumn(name = "CDZONA")
	private TontZona tontZona;

	public TontPais() {
	}

	public String getCdpais() {
		return this.cdpais;
	}

	public void setCdpais(String cdpais) {
		this.cdpais = cdpais;
	}

	public String getDsnombre() {
		return this.dsnombre;
	}

	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}

	public TontZona getTontZona() {
		return this.tontZona;
	}

	public void setTontZona(TontZona tontZona) {
		this.tontZona = tontZona;
	}

}