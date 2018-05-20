package jpaOrmAves;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tont_aves database table.
 * 
 */
@Entity
@Table(name="tont_aves")
@NamedQuery(name="TontAve.findAll", query="SELECT t FROM TontAve t")
public class TontAve implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdave;

	@Column(name="DSNOMBRE_CIENTIFICO")
	private String dsnombreCientifico;

	@Column(name="DSNOMBRE_COMUN")
	private String dsnombreComun;

	//bi-directional many-to-one association to TontAvesPai
	@OneToMany(mappedBy="tontAve")
	private List<TontAvesPai> tontAvesPais;

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

	public List<TontAvesPai> getTontAvesPais() {
		return this.tontAvesPais;
	}

	public void setTontAvesPais(List<TontAvesPai> tontAvesPais) {
		this.tontAvesPais = tontAvesPais;
	}

	public TontAvesPai addTontAvesPai(TontAvesPai tontAvesPai) {
		getTontAvesPais().add(tontAvesPai);
		tontAvesPai.setTontAve(this);

		return tontAvesPai;
	}

	public TontAvesPai removeTontAvesPai(TontAvesPai tontAvesPai) {
		getTontAvesPais().remove(tontAvesPai);
		tontAvesPai.setTontAve(null);

		return tontAvesPai;
	}

}