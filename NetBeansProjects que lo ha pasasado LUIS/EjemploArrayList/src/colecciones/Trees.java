/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Objects;

/**
 *
 * @author diurno
 */
enum Leaves {FALLEN, EVERGREEN, UNKNOWN}
public class Trees implements Comparable <Trees>{
    String name;
    String especies;
    Leaves leaves;
    int years;

    public Trees(String name, String especies, Leaves leaves, int years) {
        this.name = name;
        this.especies = especies;
        this.leaves = leaves;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public Leaves getLeaves() {
        return leaves;
    }

    public void setLeaves(Leaves leaves) {
        this.leaves = leaves;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Trees{" + "name=" + name + ", especies=" + especies + ", leaves=" + leaves + ", years=" + years + '}';
    }
    

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
        final Trees other = (Trees) obj;
        if (!Objects.equals(this.especies, other.especies)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Trees t) {
        return this.name.compareToIgnoreCase(t.name);
        
    }

    
   

    
    
    
    
}
