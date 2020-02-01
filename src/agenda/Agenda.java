package agenda;

public class Agenda {
	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int d) {
		if((d >= 1) && (d <= 30)) {
			this.dia = d;
		}else {
			this.dia = 0;
		}
	}
	
	public void setMes(int m) {
		if((m >= 1) && (m <= 12)) {
			this.mes = m;
		}else {
			this.mes = 0;
		}
	}
	
	public void setAno(int a) {
		if((a >= 1900) && (a <= 2100)) {
			this.ano = a;
		}else {
			this.ano = 0;
		}
	}
	
	public String showData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
