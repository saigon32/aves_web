package jpaOrmAves;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tont_aves_pais database table.
 * 
 */
@Entity
@Table(name="tont_aves_pais")
@NamedQuery(name="TontAvesPai.findAll", query="SELECT t FROM TontAvesPai t")
public class TontAvesPai implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TontAvesPaiPK id;

	//bi-directional many-to-one association to TontAve
	@ManyToOne
	@JoinColumn(name="CDPAIS")
	private TontAve tontAve;

	//bi-directional many-to-one association to TontPais
	@ManyToOne
	@JoinColumn(name="CDPAIS")
	private TontPais tontPais;

	public TontAvesPai() {
	}

	public TontAvesPaiPK getId() {
		return this.id;
	}

	public void setId(TontAvesPaiPK id) {
		this.id = id;
	}

	public TontAve getTontAve() {
		return this.tontAve;
	}

	public void setTontAve(TontAve tontAve) {
		this.tontAve = tontAve;
	}

	public TontPais getTontPais() {
		return this.tontPais;
	}

	public void setTontPais(TontPais tontPais) {
		this.tontPais = tontPais;
	}

}