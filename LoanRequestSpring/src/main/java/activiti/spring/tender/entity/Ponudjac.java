package activiti.spring.tender.entity;

public class Ponudjac {

		private int id;
		private String naziv;
		private String email;
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
		
		
}

