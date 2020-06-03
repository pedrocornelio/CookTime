package entities;

public class Ingredientes {

	private String tipo;
	private String formaDePreparo;
	private String nomeIngrediente;

	public Ingredientes() {

	}

	public Ingredientes(String tipo, String formaDePreparo, String nomeIngrediente) {

		this.tipo = tipo;
		this.formaDePreparo = formaDePreparo;
		this.nomeIngrediente = nomeIngrediente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFormaDePreparo() {
		return formaDePreparo;
	}

	public void setFormaDePreparo(String formaDePreparo) {
		this.formaDePreparo = formaDePreparo;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}
	
	public void adicionarIngrediente() {
		return;
	}
	
	public void removerIngrediente() {
		return;
	}
	
	public void filtrarIngrediente() {
		return;
	}
	
	public void solicitarIngrediente() {
		return;
	}
	
}
