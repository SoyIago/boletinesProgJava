package xxxxxxxx;

import java.util.Random;
import java.util.ArrayList;

public class MasterMindExcep {
    public String secreto;
    public int numIntento;
    public static final int TAM_NUMERO = 4;
    public static final int MAX_INTENTOS = 10;
    public ArrayList <ResultadoMasterMind> listaIntentos;
    
    
MasterMindExcep () { 
    String cad;
    do { cad=cadenaAlAzar(TAM_NUMERO);} while (cadenaConDuplicados(cad));
    this.secreto = cad; 
    this.numIntento=0;
    listaIntentos = new ArrayList <>();
}    

public ResultadoMasterMind comprobar (String i){
    int b=0, m=0; boolean gano=false, finTurnos=false;
    if (cadenaConDuplicados(i) || i.length()!= TAM_NUMERO)  
        return new ResultadoMasterMind (i, -1,-1, false,false);
    for (int cont=0; cont <i.length(); cont++) {
         char letra=i.charAt(cont);
         if (letra==secreto.charAt(cont)) b++;
         else if (secreto.indexOf(letra)!=-1) m++;
        }
    if (b==TAM_NUMERO) gano=true;
    if (++this.numIntento==MAX_INTENTOS) finTurnos=true;
    ResultadoMasterMind r=new ResultadoMasterMind (i,b,m,gano,finTurnos);
    this.listaIntentos.add(r);
    return r;
}

private boolean  cadenaConDuplicados(String cad) {
   for (int i=0;i<cad.length();i++){
      char c= cad.charAt(i);
      if (cad.indexOf(c,i+1)!=-1) return true;
   }
   return false;
}
private String cadenaAlAzar(int n) {
   Random r = new Random();
   String cad =""; int x;
   for (int i=0;i<n;i++){
       x = r.nextInt (10);
       cad+=Integer.toString(x); 
   }
   return cad;
}

public void pintarConsola() {
   System.out.println ("\nN  intento  ok mal");
   System.out.println ("==================");
   for (int i=0;i<this.listaIntentos.size();i++){
      System.out.printf ("%02d %s     %d   %d\n", 
                          i+1, 
                          this.listaIntentos.get(i).intento,
                          this.listaIntentos.get(i).bienColocados,
                          this.listaIntentos.get(i).malColocados   );   
   }
   System.out.println ("..................");
}

} // fin clase

class ResultadoMasterMind {
  String intento;
  int bienColocados;
  int malColocados;
  boolean gano;
  boolean sinMasTurnos;

    public ResultadoMasterMind(String intento, int bienColocados, int malColocados, 
                      boolean gano, boolean sinMasTurnos) {
        this.intento = intento;
        this.bienColocados = bienColocados;
        this.malColocados = malColocados;
        this.gano = gano;
        this.sinMasTurnos = sinMasTurnos;
    }
    ResultadoMasterMind (){}

}