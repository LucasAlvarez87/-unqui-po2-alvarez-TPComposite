package Cultivos;

public class Region extends Cultivo {
	
	private Cultivo[] cultivos = new Cultivo[4];
	
	public Region(){
		super();
	}
	
	public Cultivo[] getCultivos() {
		return cultivos;
	}

	
	public void setCultivos(Cultivo[] cultivos) {
		this.cultivos = cultivos;
	}
	
	@Override
	public int getGananciaAnual() {
		int gananciaTotal = 0;
		for (Cultivo cultivo : this.getCultivos()) {
	       gananciaTotal += cultivo.getGananciaAnual();
	        }
		 return gananciaTotal / this.getCultivos().length;
	}
}
