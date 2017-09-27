package tacs.leilaotdd.dominio;

public class Usuario {

		private int id;
		private String nome;
		
		public Usuario(String nome) {
			this(0, nome);
		}
		
		public Usuario(int id, String nome) {
			super();
			this.id = id;
			this.nome = nome;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		
}
