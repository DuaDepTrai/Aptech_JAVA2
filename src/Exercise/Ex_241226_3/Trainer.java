/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241226_3;

/**
 *
 * @author DUADEPTRAI
 */
public class Trainer {
    private String name;
    private int experience;
    private String speciaty;
    
    public Trainer(String name, int exp, String spec) {
        this.name = name;
        this.experience = exp;
        this.speciaty = spec;
    }
    
    public String getName() {
        return name;
    }
    public int getExp() {
        return experience;
    }
    public String getSpec() {
        return speciaty;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setExp(int exp) {
        this.experience = exp;
    }
    public void setSpec(String spec) {
        this.speciaty = spec;
    }
    
    @Override
    public String toString() {
        return "Trainer: " + name + " - Exp: " + experience + " - Spec: " + speciaty;
    }
}
