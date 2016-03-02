package activiti.spring.tender.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PONUDJAC")
public class Ponudjac {

		@Id 
		@GeneratedValue
		@Column(name = "id", nullable = false)
		private int id;
		@Column(name = "internalId", nullable = false)
		private String internalId;
		@Column(name = "naziv", nullable = false)
		private String naziv;
		@Column(name = "email", nullable = false)
		private String email;
		@Column(name = "dokumentacija", nullable = false)
		private boolean dokumentacija;
		
		public Ponudjac(int id, String naziv, String email, boolean dokumentacija) {
			super();
			this.id = id;
			this.naziv = naziv;
			this.email = email;
			this.dokumentacija = dokumentacija;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNaziv() {
			return naziv;
		}

		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public boolean isDokumentacija() {
			return dokumentacija;
		}

		public void setDokumentacija(boolean dokumentacija) {
			this.dokumentacija = dokumentacija;
		}

		public String getInternalId() {
			return internalId;
		}

		public void setInternalId(String internalId) {
			this.internalId = internalId;
		}
			
}

