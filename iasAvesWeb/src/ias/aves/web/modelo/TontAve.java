package ias.aves.web.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the tont_aves database table.
 * 
 */
@Entity
@Table(name = "tont_aves")
@NamedQuery(name = "TontAve.findAll", query = "SELECT t FROM TontAve t")
public class TontAve implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdave;

	@Column(name = "DSNOMBRE_COMUN")
	private String dsnombreComun;

	@Column(name = "DSNOMBRE_CIENTIFICO")
	private String dsnombreCientifico;

	public TontAve() {
	}

	public String getCdave() {
		return this.cdave;
	}

	public void setCdave(String cdave) {
		this.cdave = cdave;
	}

	public String getDsnombreCientifico() {
		return this.dsnombreCientifico;
	}

	public void setDsnombreCientifico(String dsnombreCientifico) {
		this.dsnombreCientifico = dsnombreCientifico;
	}

	public String getDsnombreComun() {
		return this.dsnombreComun;
	}

	public void setDsnombreComun(String dsnombreComun) {
		this.dsnombreComun = dsnombreComun;
	}

}