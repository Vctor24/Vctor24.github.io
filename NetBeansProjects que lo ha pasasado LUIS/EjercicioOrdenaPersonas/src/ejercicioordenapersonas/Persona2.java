package ejercicioordenapersonas;




import java.util.Objects;


/**
 *
 * @author diurno
 */
public class Persona2 implements Comparable{

    
    
    public enum Gender { MALE, FEMALE, OTHER }
    //Atributos
    private String name;
    private String apellidos;
   
    private int fecha_nacimiento;
    private int telefono;
    private String email;
    private String DNI;
    
    //Como voluntario la comprovacion del dni y poner un campo aparte que sea letraDNi (char).

    public Persona2(String name,String apellidos, int fecha, Gender gender, String DNI, int telefono, String email) {
        this.name = name;
        this.fecha_nacimiento = fecha;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.email = email;
        this.telefono = telefono;
    }
    public static Persona2 makePersona(String name,int fecha, String DNI, String gender, String apellidos, int telefono, String email){
        /*Comprobaciones: 
        1. Genero sea correcto.
        2. Edad entre 0 y 130.
        3. Nombre no vacio.
        4. Dni correcto.
        if (genderOK(gender) && nameOK(name) && ageOK(age) && idOk(idCard)) {
            
        }*/
        Gender newGender = genderOk(gender);
        if(nameOK(name)){
            return new Persona2(name, apellidos, fecha, newGender, DNI, telefono, email);
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

    public int getFecha() {
        return fecha_nacimiento;
    }

    public void setFecha(int fecha) {
        this.fecha_nacimiento = fecha;
    }

    public String getIdCard() {
        return DNI;
    }

    public void setIdCard(String idCard) {
        this.DNI = idCard;
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
        if (!Objects.equals(this.DNI, other.DNI)) {
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
        return "Persona: " + "name=" + name + ", age=" + fecha_nacimiento + ", gender=" + gender + ", idCard=" + DNI;
    }
    
    public String showNameId (){
        return name + " whose idCard is: " + DNI;
    }
}