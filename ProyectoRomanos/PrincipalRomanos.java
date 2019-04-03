
import java.util.Scanner;

public class PrincipalRomanos {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Introdusca el numero");
		int numero=sn.nextInt();
		String numeroRomano="";
		String[] vector;
		if(numero<=1000) {
			String num=""+numero;
			if(num.length()==4) {
				numeroRomano="M";
			}
			else {
				String aux="";
				for (int i =num.length()-1 ; i >= 0; i--) {
					aux+=num.charAt(i);
					
				}
				vector=aux.split("");
				for (int i = 0; i < vector.length; i++) {
					numeroRomano=romano(vector[i],i)+numeroRomano;
				}

				System.out.println(numeroRomano);
			}
		}}

	public static String romano(String numero,int pos) {
		String cadena="";
		int numaux=Integer.parseInt(numero);
		if(pos==0) {
			if(numaux<4) {
				for (int i = 0; i < numaux; i++) {
					cadena="I";
				}
			}
			else if(numaux>=5 && numaux<9){
				cadena+="V";
				numaux=numaux-5;
				for (int i = 0; i < numaux; i++) {
					cadena+="I";
				}
			}
			else if(numaux==4){
				cadena+="IV";
			}
			else if(numaux==9) {
				cadena+="IX";
			}

		}
		else if(pos==1) {
			if(numaux<4) {
				for (int i = 0; i < numaux; i++) {
					cadena+="X";
				}
			}
			else if(numaux>=5 && numaux<9){
				cadena+="L";
				numaux=numaux-5;
				for (int i = 0; i < numaux; i++) {
					cadena+="X";
				}
			}
			else if(numaux==4) {
				cadena+="XL";
			}
			else if(numaux==9) {
				cadena+="XC";
			}

		}
		else if(pos==2) {
			if(numaux<4) {
				for (int i = 0; i < numaux; i++) {
					cadena+="C";
				}
			}
			else if(numaux>=5 && numaux<9){
				cadena+="D";
				numaux=numaux-5;
				for (int i = 0; i < numaux; i++) {
					cadena+="C";
				}
			}
			else if(numaux==4) {
				cadena+="CD";
			}
			else if(numaux==9) {
				cadena+="CM";
			}


		}
		return cadena;
	}
}



