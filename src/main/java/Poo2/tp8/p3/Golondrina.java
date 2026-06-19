package Poo2.tp8.p3;

public class Golondrina {
	private float energia; //joules

	public Golondrina() {
		this.energia = 45;
	}

	public EstadoGolondrina getEstado(){
		if(energia < 50){
			return new Debil();
		}else if (energia > 500){
			return new Euforica();
		}else{
			return new Normal();
		}
	}

	public void comer(float gramos) {
		if(gramos <= 0) {
			this.energia += (5 * gramos);
		}else{
			System.out.println("No es suficiente comida");
		}
	}

	public void volar(float distancia) {
		float costo = (1*distancia)+10;
		if(costo <= this.energia){
			this.energia = costo;
		}else{
			System.out.println("no hay suficiente energia");
		}
	}

	public void realizarDeseo() {
		getEstado().realizarDeseo(this);
	}

}

