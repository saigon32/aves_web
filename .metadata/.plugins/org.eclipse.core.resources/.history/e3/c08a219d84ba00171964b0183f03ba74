package jpaOrmAves;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tont_paises database table.
 * 
 */
@Entity
@Table(name="tont_paises")
@NamedQuery(name="TontPais.findAll", query="SELECT t FROM TontPais t")
public class TontPais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cdpais;

	private String dsnombre;

	//bi-directional many-to-one association to TontAvesPai
	@OneToMany(mappedBy="tontPais")
	private List<TontAvesPai> tontAvesPais;

	//bi-directional many-to-one association to TontZona
	@ManyToOne
	@JoinColumn(name="CDZONA")
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

	public List<TontAvesPai> getTontAvesPais() {
		return this.tontAvesPais;
	}

	public void setTontAvesPais(List<TontAvesPai> tontAvesPais) {
		this.tontAvesPais = tontAvesPais;
	}

	public TontAvesPai addTontAvesPai(TontAvesPai tontAvesPai) {
		getTontAvesPais().add(tontAvesPai);
		tontAvesPai.setTontPais(this);

		return tontAvesPai;
	}

	public TontAvesPai removeTontAvesPai(TontAvesPai tontAvesPai) {
		getTontAvesPais().remove(tontAvesPai);
		tontAvesPai.setTontPais(null);

		return tontAvesPai;
	}

	public TontZona getTontZona() {
		return this.tontZona;
	}

	public void setTontZona(TontZona tontZona) {
		this.tontZona = tontZona;
	}

}