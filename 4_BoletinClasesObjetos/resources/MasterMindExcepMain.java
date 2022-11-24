package B4_ClasesObjetos_Recursos;

import java.util.Scanner;

public class MasterMindExcepMain {
	
    public static void main(String[] args) {
    
	  Scanner teclado= new Scanner(System.in);
      boolean fin=false; 
	  ResultadoMasterMind r =new ResultadoMasterMind();
      MasterMindExcep juego = new MasterMindExcepMain();
      System.out.println ("["+juego.secreto+"]");
      
	  while (!fin) {
        System.out.printf("Introduce intento %d: ",juego.numIntento+1);
        String intento = teclado.nextLine();
        r = juego.comprobar(intento);
        if (r.bienColocados == -1) System.out.println ("Intento incorrecto");
        else {
          juego.pintarConsola();
        }
        if (r.gano || r.sinMasTurnos) fin=true; 
     }
     if (r.gano) System.out.println ("Enhorabuena. Acertaste.");
     else System.out.println ("Lo sentimos. Era el "+juego.secreto);
    } //main
} //clase