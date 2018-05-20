package ias.aves.web.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the tont_zonas database table.
 * 
 */
@Entity
@Table(name = "tont_zonas")
@NamedQuery(name = "TontZona.findAll", query = "SELECT t FROM TontZona t")
public class TontZona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdzona;

	private String dsnombre;

	public TontZona() {
	}

	public String getCdzona() {
		return this.cdzona;
	}

	public void setCdzona(String cdzona) {
		this.cdzona = cdzona;
	}

	public String getDsnombre() {
		return this.dsnombre;
	}

	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}

}