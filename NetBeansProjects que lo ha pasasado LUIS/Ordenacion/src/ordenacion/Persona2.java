/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacion;

import java.util.Objects;

/**
 *
 * @author diurno
 */
public class Persona2 implements Comparable{

    
    
    public enum Gender { MALE, FEMALE, OTHER }
    //Atributos
    private String name;
    private byte age;
    private Gender gender;
    private String idCard;
    
    //Como voluntario la comprovacion del dni y poner un campo aparte que sea letraDNi (char).

    public Persona2(String name, byte age, Gender gender, String idCard) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idCard = idCard;
    }
    public static Persona2 makePersona(String name, byte age, String gender, String idCard){
        /*Comprobaciones: 
        1. Genero sea correcto.
        2. Edad entre 0 y 130.
        3. Nombre no vacio.
        4. Dni correcto.
        if (genderOK(gender) && nameOK(name) && ageOK(age) && idOk(idCard)) {
            
        }*/
        Gender newGender = genderOk(gender);
        if(nameOK(name)){
            return new Persona2(name, age, newGender, idCard);
        } else {
            return null;
        }
    }
    public static Gender genderOk(String gender){
        Gender result; 
        try {
            result = Gender.valueOf(gender.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            result = Gender.OTHER;
        }
        return result;
    }
   
    public static boolean nameOK(String Myname){
        return !Myname.trim().isEmpty();//Le quitamos los espacios en blanco y comprovamos si la linea de texto tiene texto o su valor es 0.
    }
    //Falta retocar los setters para comprobar que todo va bien y hacer los demas OK.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(nameOK(name))this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    //EQUAL CON EL IDCARD

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona2 other = (Persona2) obj;
        if (!Objects.equals(this.idCard, other.idCard)) {
            return false;
        }
        return true;
    }
    //ORDENA SEGUN EL IDCARD
//    @Override
//    public int compareTo(Object t) {
//        Persona newPerson = (Persona) t;
//        int numberNewPerson = Integer.parseInt(newPerson.getIdCard().substring(0, 8));
//        int number = Integer.parseInt(getIdCard().substring(0, 8));
//        if (number == numberNewPerson) return 0;
//        else if (number < numberNewPerson) return -1;
//        else return 1;
//    }
    
    @Override
    public int compareTo(Object t) {
        Persona2 newPerson = (Persona2) t;
        return getName().compareToIgnoreCase(newPerson.getName());
    }
    
    @Override
    public String toString() {
        return "Persona: " + "name=" + name + ", age=" + age + ", gender=" + gender + ", idCard=" + idCard;
    }
    
    public String showNameId (){
        return name + " whose idCard is: " + idCard;
    }
}
