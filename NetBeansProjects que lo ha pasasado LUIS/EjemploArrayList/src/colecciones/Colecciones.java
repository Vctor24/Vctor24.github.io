/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diurno
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       workingArrayList();
       workingTrees();
       workingHashmap();
    }
    public static void workingHashmap(){
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        
        //añadir elementos --> put
        ages.put("Pepe", 30);
        ages.put("Margarita", 54);
        ages.put("Juan", 23);
        //Recorrer el hashmap
        showAges(ages);
        //Eliminar elementos
        if(ages.containsKey("Juan")) ages.remove("Juan");
        if(!ages.containsValue(33)) System.out.println("nobody aged 33");
        //Ver la devolucion de entrySet y values (Devuelve Set, lo vemos )
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Entrada " + entry.getKey());
            System.out.println("Valor " + entry.getValue());
            int nalea = (int) (Math.random()*100);
            
            entry.setValue((Integer) nalea);
            System.out.println("Actualizo valor " + entry.getValue());
        }
        showAges(ages);
        // Hashmap de trees 
        HashMap<String, Trees> trees = new HashMap<String, Trees>();
        trees.put("Arbol1", new Trees ("Holm Oak", "Quercus", Leaves.FALLEN, 10));
        trees.put("Arbol2", new Trees ("oak", "Quercus", Leaves.FALLEN, 10));
        trees.put("Arbol3", new Trees ("Olive Tree", "Olea Europea", Leaves.UNKNOWN, 10));
        trees.put("Arbol4", new Trees ("Pine", "Pinus Pinaster", Leaves.UNKNOWN, 10));
        trees.put("Arbol5", new Trees ("Spruce", "Abies Alba", Leaves.UNKNOWN, 10));
        trees.put("Arbol6", new Trees ("Pine", "Pinus Pinaster", Leaves.FALLEN, 10));
        Collections.sort(trees, OrdenaTrees());
    }
    public static void showAges (HashMap<String, Integer> myAges){
        // Muestro solamente los indices/claves
        for (String string : myAges.keySet()) {
            System.out.println(string);
        }
        //Muestro solamente los valores
        for (Integer value : myAges.values()) {
            System.out.println(value);
        }
        //Muestro indices y valor
        for (String string : myAges.keySet()) {
            System.out.println(string + "-->" + myAges.get(string));
        }
    }
    public static void workingArrayList(){
         ArrayList<String> colours = new ArrayList<String>();
        //Para añadir elementos
        colours.add("Red");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Purple");
        colours.add("Brown");
        System.out.println(colours.size());
        //obtener un valor ->get
        System.out.println("Colour in position 3: " + colours.get(3));
        //obtener el indice, dando un valor 
        System.out.println("The colour Yellow is in position: " + colours.indexOf("Yellow"));
        // Buscar un valor -> contains. ME OBLIGA A IMPLEMENTAR EL EQUALS
        if (colours.contains("Yellow")) {
            System.out.println("Yellow is in position "
                    + colours.indexOf("Yellow"));
        } else {
            System.out.println("Yellow doesn´t exists!!");
        }

        colours.set(4, "Pink");
        for (String colour : colours) {

        }

        //para borrar elementos con el metodo remove
        colours.remove("Pink");

        //para obtener el tamaño con el metodo size
        System.out.println("Colors´ size is " + colours.size());

        //mostrar directamente sin bucle el arraylist con el toString
        System.out.println(colours.toString());

        //ordenamos de forma ascendente y descendente
        Collections.sort(colours);
        showArrayList(colours);

        Collections.sort(colours, Collections.reverseOrder());
        showArrayList(colours);
    }
    public static void showArrayList(ArrayList<String> colours) {
        //recorrer el arraylist
        for (String colour : colours) {
            System.out.println(colour);
        }
    }

    public static void workingTrees() {
        ArrayList<Trees> forest = new ArrayList<Trees>();
        Trees t1 = new Trees("Oak", "Quercus", Leaves.FALLEN, 10);
        forest.add(t1);
        t1 = new Trees("Holm Oak", "Quercus", Leaves.FALLEN, 10);
        forest.add(t1);
        t1 = new Trees("Olive Tree", "Olea Europea", Leaves.UNKNOWN, 10);
        forest.add(t1);
        t1 = new Trees("Pine", "Pinus Pinaster", Leaves.UNKNOWN, 10);
        forest.add(t1);
        t1 = new Trees("Spruce", "Abies Alba", Leaves.UNKNOWN, 10);
        forest.add(t1);
        t1 = new Trees("Pine", "Pinus Pinaster", Leaves.FALLEN, 10);
        showForest(forest);
        if (forest.contains(t1)){
            System.out.println("I found it!");
            forest.remove(t1);
        } else {
            System.out.println("I couldn't found it");
        }
        /*Ordenarlos con sort*/
        //orden natural: name
        System.out.println("SORTING TREES BY NAME!");
        Collections.sort(forest);
        showForest(forest);
    }

    public static void showForest(ArrayList<Trees> forest) {
        //recorrer el arraylist
        for (Trees trees : forest) {
            System.out.println(trees);
        }

    }
}
