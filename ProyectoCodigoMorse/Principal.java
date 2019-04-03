import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Introdusca la cadena");
		String cadena=sn.nextLine();
		cadena=cadena.toUpperCase();
		boolean morse=false;
		if(cadena.contains(".")|| cadena.contains("-")) {
			morse=true;
		}
		String cadenaFinal="";
		if(!morse) {
			for (int i = 0; i < cadena.length(); i++) {
				String caracter="";
				caracter+=cadena.charAt(i);
				cadenaFinal+=morse(caracter,morse);

			}
		}
		else {
			String caracter="";
			cadena+=" "; 
			int count=0;
			for (int i = 0; i <cadena.length(); i++) {
				if(cadena.charAt(i)!=32) {
					caracter+=cadena.charAt(i);
					count=0;
				}
				if(cadena.charAt(i)==32){
					count++;
					if(count==1) {
						cadenaFinal+=morse(caracter,morse);
						caracter="";
					}
					else if(count==3) {
						cadenaFinal+=" ";
					}
				}
			}	
		}
		System.out.println(cadenaFinal);

	}
	public static String morse(String c,boolean morse) {
		String[] texto= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7",
				"8","9","0"};
		String [] morseVec= {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-",
				".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...",
				"---..", "----.","-----" };
		if(!morse) {
			for (int i = 0; i < texto.length; i++) {
				if(texto[i].equals(c)) {
					return morseVec[i]+" ";

				}
				else if(c.equals(" ")) {
					return "   ";
				}
			}
		}
		else {
			for (int i = 0; i < morseVec.length; i++) {
				if(morseVec[i].equals(c)) {
					return texto[i];
				}
			}
		}
		return null;
	}
}
