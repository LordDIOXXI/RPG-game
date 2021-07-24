/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogameproject;

public class Enemy {
    
    //Instantiate enemy stat variables
    private int hitPoints;
    private int armorClass;
    private int weaponDamage;
    private int strength;
    private int strMod;
    private int agility;
    private int agiMod;
    private int endurance;
    private int endMod;
    private int intelligence;
    private int intMod;
    private int wisdom;
    private int wisMod;
    private int charisma;
    private int chaMod;
    
    //Setters and getters for enemy stats
    public int getHitPoints(){
        return hitPoints;
    }
    
    public void setHitPoints(){
        hitPoints = 20;
    }
    
    public int getArmorClass(){
        return armorClass;
    }
   
    public void setArmorClass(){
        armorClass = 16;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public void setStrength(){
        strength = 20;
    }
    
    public int getStrMod(){
        return strMod;
    }
    
    public void setStrMod(){
        strMod = 6;
    }
    
    public int getAgility(){
        return agility;
    }
    
    public void setAgility(){
        agility = 10;
    }
    
    public int getAgiMod(){
        return agiMod;
    }
    
    public void setAgiMod(){
        agiMod = 0;
    }
    
    public int getEndurance(){
        return endurance;
    }
    
    public void setEndurance(){
        endurance = 20;
    }
    
    public int getEndMod(){
        return endMod;
    }
    
    public void setEndMod(){
        endMod = 6;
    }
    
    public int getIntelligence(){
        return intelligence;
    }
    
    public void setIntelligence(){
        intelligence = 14;
    }
    
    public int getIntMod(){
        return intMod;
    }
    
    public void setIntMod(){
        intMod = 0;
    }
    
    public int getWisdom(){
        return wisdom;
    }
    
    public void setWisdom(){
        wisdom = 15;
    }
    
    public int getWisMod(){
        return wisMod;
    }
    
    public void setWisMod(){
        wisMod = 1;
    }
    
    public int getCharisma(){
        return charisma;
    }
    
    public void setCharisma(){
        charisma = 12;
    }
    
    public int getChaMod(){
        return chaMod;
    }
    
    public void setChaMod(){
        chaMod = 0;
    }
         
    public int getWeapon(){
        return weaponDamage;
    }
    
    public void setWeapon(){
        weaponDamage = 3 + strMod;
    }
}
