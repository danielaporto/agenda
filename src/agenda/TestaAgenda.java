package agenda;

public class TestaAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a1 = new Agenda();
		a1.setDia(5);
		a1.setMes(10);
		a1.setAno(2001);
		
		Agenda a2 = new Agenda();
		a2.setDia(30);
		a2.setMes(9);
		a2.setAno(2019);
		
		Agenda a3 = new Agenda();
		a3.setDia(21);
		a3.setMes(12);
		a3.setAno(1999);
		
		System.out.println(a1.showData());
		System.out.println(a2.showData());
		System.out.println(a3.showData());
	}

}

