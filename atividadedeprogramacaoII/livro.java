package atividadedeprogramacaoII;

public class livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
    
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void setAnopublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String exibirDetalhes() {
		return "Titulo" + titulo +", Autor: "+ autor +", Ano: " + anoPublicacao;
	}


	

}


