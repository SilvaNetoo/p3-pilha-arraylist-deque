package br.cesed.si.p3.arrays.atividade;

public class TesteArrayListFacisa {

	public static void main(String[] args) {
		
		ArrayListFacisa alf = new ArrayListFacisa(3);
		
		alf.add("Objeto 1");
		System.out.println(alf.size()); //deve retornar 1
		
		alf.add("Objeto 2");
		System.out.println(alf.size()); //deve retornar 2
		
		alf.add("Objeto 3");
		System.out.println(alf.size()); //deve retornar 3
		
		alf.add("Objeto 4"); //deve criar outro array internamente e repassar
		System.out.println(alf.size()); //deve retornar 4
		
		try {
			System.out.println(alf.getByIndex(1)); //deve imprimir "Objeto 2"
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		alf.printAllElements();
		System.out.println(alf.findPosition("Objeto 2")); //deve retornar 1 
		
		alf.remove("Objeto 2");
		System.out.println(alf.size()); //deve retornar 3
		
		alf.printAllElements();
		
	}
}
