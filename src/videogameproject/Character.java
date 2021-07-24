/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogameproject;

import java.util.Random;

class Character {
    
    //Create object for random
    Random rand = new Random();
    
    //Instantiate variables
    private int hitPoints;
    private String playerName;
    private int strength;
    private int agility;
    private int endurance;
    private int intelligence;
    private int wisdom;
    private int charisma;
    
    int strMod;
    int agiMod;
    int endMod;
    int intMod;
    int wisMod;
    int chaMod;
    
    //Instantiate random variables
    int str = rand.nextInt(20) + 1;
    int agi = rand.nextInt(20) + 1;
    int end = rand.nextInt(20) + 1; 
    int intl = rand.nextInt(20) + 1;
    int wis = rand.nextInt(20) + 1;
    int cha = rand.nextInt(20) + 1;
    int hp;
    
    //Setters and getters for different player characteristics
    public String getPlayerName(){
        return playerName;
    }
    
    public void setPlayerName(String name){
        playerName = name;
    }
    
    public int getHitPoints(){
        return hitPoints;
    }
    
    public void setHitPoints(){
        hp = 20 + endMod;
        hitPoints = hp; 
    }
    
    public int getStrength(){
        return strength;
    }
    
    public void setStrength(){
        strength = str;
    }
    
    public int getStrengthMod(){
        return strMod;
    }
    
    public int getAgility(){
        return agility;
    }
    
    public void setAgility(){
        agility = agi;
    }
    
    public int getAgilityMod(){
        return agiMod;
    }
    
    public int getEndurance(){
        return endurance;
    }
    
    public void setEndurance(){
        endurance = end;
    }
    
    public int getEndMod(){
        return endMod;
    }
    
    public int getIntelligence(){
        return intelligence;
    }
    
    public void setIntelligence(){
        intelligence = intl;
    }
    
    public int getIntelligenceMod(){
        return intMod;
    }
    
    public int getWisdom(){
        return wisdom;
    }
    
    public void setWisdom(){
        wisdom = wis;
    }
    
    public int getWisMod(){
        return wisMod;
    }
    
    public int getCharisma(){
        return charisma;
    }
    
    public void setCharisma(){
        charisma = cha;
    }
    
    public int getChaMod(){
        return chaMod;
    }
    
    //Set mods for character
    public void modSet(){
    
        switch(str){
        
            case 1:
                strMod = -6;
                break;
            
            case 2:
                strMod = -5;
                break;
                
            case 3:
                strMod = -4;
                break;
                
            case 4:
                strMod = -3;
                break;
             
            case 5:
                strMod = -2;
                break;
            
            case 6:
                strMod = -1;
                break;
            
            case 15:
                strMod = 1;
                break;
            
            case 16:
                strMod = 2;
                break;
                
            case 17:
                strMod = 3;
                break;
            
            case 18:
                strMod = 4;
                break;
                
            case 19:
                strMod = 5;
                break;
            
            case 20:
                strMod = 6;
                break;
                
            default:
                strMod = 0;      
        }
        
        switch(agi){
            
            case 1:
                agiMod = -6;
                break;
            
            case 2:
                agiMod = -5;
                break;
                
            case 3:
                agiMod = -4;
                break;
                
            case 4:
                agiMod = -3;
                break;
             
            case 5:
                agiMod = -2;
                break;
            
            case 6:
                agiMod = -1;
                break;
            
            case 15:
                agiMod = 1;
                break;
            
            case 16:
                agiMod = 2;
                break;
                
            case 17:
                agiMod = 3;
                break;
            
            case 18:
                agiMod = 4;
                break;
                
            case 19:
                agiMod = 5;
                break;
            
            case 20:
                agiMod = 6;
                break;
                
            default:
                agiMod = 0;      
        }
        
        switch(end){
            
            case 1:
                endMod = -6;
                break;
            
            case 2:
                endMod = -5;
                break;
                
            case 3:
                endMod = -4;
                break;
                
            case 4:
                endMod = -3;
                break;
             
            case 5:
                endMod = -2;
                break;
            
            case 6:
                endMod = -1;
                break;
            
            case 15:
                endMod = 1;
                break;
            
            case 16:
                endMod = 2;
                break;
                
            case 17:
                endMod = 3;
                break;
            
            case 18:
                endMod = 4;
                break;
                
            case 19:
                endMod = 5;
                break;
            
            case 20:
                endMod = 6;
                break;
                
            default:
                endMod = 0;      
        }
        
        switch(intl){
            
            case 1:
                intMod = -6;
                break;
            
            case 2:
                intMod = -5;
                break;
                
            case 3:
                intMod = -4;
                break;
                
            case 4:
                intMod = -3;
                break;
             
            case 5:
                intMod = -2;
                break;
            
            case 6:
                intMod = -1;
                break;
            
            case 15:
                intMod = 1;
                break;
            
            case 16:
                intMod = 2;
                break;
                
            case 17:
                intMod = 3;
                break;
            
            case 18:
                intMod = 4;
                break;
                
            case 19:
                intMod = 5;
                break;
            
            case 20:
                intMod = 6;
                break;
                
            default:
                intMod = 0;      
        }
        
        switch(wis){
            
            case 1:
                wisMod = -6;
                break;
            
            case 2:
                wisMod = -5;
                break;
                
            case 3:
                wisMod = -4;
                break;
                
            case 4:
                wisMod = -3;
                break;
             
            case 5:
                wisMod = -2;
                break;
            
            case 6:
                wisMod = -1;
                break;
            
            case 15:
                wisMod = 1;
                break;
            
            case 16:
                wisMod = 2;
                break;
                
            case 17:
                wisMod = 3;
                break;
            
            case 18:
                wisMod = 4;
                break;
                
            case 19:
                wisMod = 5;
                break;
            
            case 20:
                wisMod = 6;
                break;
                
            default:
                wisMod = 0;      
        }
        
        switch(cha){
            
            case 1:
                chaMod = -6;
                break;
            
            case 2:
                chaMod = -5;
                break;
                
            case 3:
                chaMod = -4;
                break;
                
            case 4:
                chaMod = -3;
                break;
             
            case 5:
                chaMod = -2;
                break;
            
            case 6:
                chaMod = -1;
                break;
            
            case 15:
                chaMod = 1;
                break;
            
            case 16:
                chaMod = 2;
                break;
                
            case 17:
                chaMod = 3;
                break;
            
            case 18:
                chaMod = 4;
                break;
                
            case 19:
                chaMod = 5;
                break;
            
            case 20:
                chaMod = 6;
                break;
                
            default:
                chaMod = 0;      
        }
    }
   
}


