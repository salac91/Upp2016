package activiti.spring.tender.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class Ponudjac implements Serializable {

		
		
		private String naziv;
		
		private String email;
		private boolean dokumentacija;
		private long ponuda;
		
		public Ponudjac(int id, String naziv, String email, boolean dokumentacija, long ponuda) {
			super();
			this.naziv = naziv;
			this.email = email;
			this.ponuda = ponuda;
			this.dokumentacija = dokumentacija;
		}

		public Ponudjac() {
			// TODO Auto-generated constructor stub
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

		public long getPonuda() {
			return ponuda;
		}

		public void setPonuda(long ponuda) {
			this.ponuda = ponuda;
		}
		
		
}

