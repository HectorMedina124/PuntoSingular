import java.util.Scanner;


public class PrincpalObjetos {


	public static void main(String[] args) {
		System.out.println("Introduce el lado deseado");
		Scanner sn= new Scanner(System.in);
		float lado=sn.nextFloat();
		Cuadrado cuadrado = new Cuadrado(lado);
		Cubo cubo= new Cubo(lado);
		int opcion=0;
		String menu="Calculos disponibles\n";
		menu+="1.-Calcular perimetro\n";
		menu+="2.- Calcular Area\n";
		menu+="3.- Calcular Volumen\n";
		menu+="4.- Cancelar\n";
		menu+="5.- Salir";
		do{
			System.out.println(menu);
			opcion=sn.nextInt();
			switch (opcion) {
			case 1:
				cuadrado.calcularPerimetro();
				System.out.println("El resultado del perimetro es: "+cuadrado.getPerimetro());
				break;
			case 2:
				cuadrado.calcularArea();
				System.out.println("El resultado del area es: "+cuadrado.getArea());
				break;

			case 3:
				cubo.calcularVolumen();
				System.out.println("El resultado del volumen es: "+cubo.getVolumen());
				break;
			case 4:
				System.out.println("Introduce el lado deseado");
				lado=sn.nextFloat();
				cubo.setLado(lado);
				cuadrado.setLado(lado);
			}
			if(opcion<4) {
				int op2=mensajeFinal();
				if(op2==1) {
					System.out.println("Introduce el lado deseado");
					lado=sn.nextFloat();
					cubo.setLado(lado);
					cuadrado.setLado(lado);
				}
			}

		}while(opcion!=5);


	}
	public static int mensajeFinal() {
		Scanner sn= new Scanner(System.in);
		String mensaje="1.-Pedir un nuevo lado\n";
		mensaje+="2.-Salir al menu calculos";
		int op=0;
                do{
		System.out.println(mensaje);
		op=sn.nextInt();
                }while(op>2);
		return op;
	}

}
