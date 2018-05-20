package jpaOrmAves;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tont_aves_pais database table.
 * 
 */
@Embeddable
public class TontAvesPaiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String cdpais;

	private String cdave;

	public TontAvesPaiPK() {
	}
	public String getCdpais() {
		return this.cdpais;
	}
	public void setCdpais(String cdpais) {
		this.cdpais = cdpais;
	}
	public String getCdave() {
		return this.cdave;
	}
	public void setCdave(String cdave) {
		this.cdave = cdave;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TontAvesPaiPK)) {
			return false;
		}
		TontAvesPaiPK castOther = (TontAvesPaiPK)other;
		return 
			this.cdpais.equals(castOther.cdpais)
			&& this.cdave.equals(castOther.cdave);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cdpais.hashCode();
		hash = hash * prime + this.cdave.hashCode();
		
		return hash;
	}
}