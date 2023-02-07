/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopracticaexamen;

/**
 *
 * @author USUARIO
 */
public class dniClase {
    boolean numerosdni;
    boolean tletradni;
    boolean cLetraDni;
    public dniClase(String suDni){
            numerosdni = compruebanumerosDni(suDni);
            tletradni = tieneletraDni(suDni, numerosdni);
            cLetraDni = compLetra(tletradni, suDni);
    }
    
public boolean compruebanumerosDni(String dni){
    int longDni = dni.length();
    boolean compDni = true;
    char [] mydni = dni.toCharArray();
    if (longDni == 9){
        for (int i = 0; i < 8 && compDni; i++) {
            boolean c = Character.isDigit(mydni[i]);
            if (!c){
                compDni=false;
            }
        }
        
    } else {
        compDni = false;
    }
    
    return compDni;
 }
    public boolean tieneletraDni(String dni, boolean numerosdni){
        boolean compDni = true;
        char [] mydni = dni.toCharArray();
        if (numerosdni){
          boolean c = Character.isLetter(mydni[9]);  
          if (!c){
              compDni = false;
          }
        } else {
            compDni = false;
        }
        return compDni; 
    }
    public boolean compLetra(boolean tLetra, String dni){
        char [] mydni = dni.toCharArray();
        char [] numeros = new char[8];
        boolean compLetra = true;
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        if(tLetra){
            for (int i = 0; i < numeros.length; i++) {
             
             numeros[i] = mydni[i];
            }
            int numero = Integer.parseInt(new String(numeros));
            System.out.println(numero);
            int pos = numero%23;
            char letra = caracteres.charAt(pos);
            if (mydni[9] != letra){
                compLetra = false;
            }
        } else{
            compLetra = false; 
        }
        return compLetra; 
    }
    public boolean getnumerodni() {
        return numerosdni;
    }

    public void setnumerodni(boolean Esdni) {
        this.numerosdni = Esdni;
    }


    public boolean getLetraDni() {
        return cLetraDni;
    }

    public void setLetraDni(boolean cLetraDni) {
        this.cLetraDni = cLetraDni;
    }

}
