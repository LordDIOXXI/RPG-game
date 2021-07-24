/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogameproject;

import java.util.Scanner;
import java.util.Random;

public class WeaponsAndArmor {
    
    //Create random object
    Random rand = new Random();
    
    //Instantiate player armor and weapon variables
    private int armorClass;
    public int weaponDamage;
    public int weapon1;
    public int weapon2;
    public int weapon3;
    public int weapon4;
    
    //get ac
    public int getArmorClass(){
        return armorClass;
    }
    
    //set ac
    public void setAC() {
        
        System.out.println("--------------------------");
        System.out.println("What kind of armor do you want?");
        System.out.println("1. Leather (15 AC)");
        System.out.println("2. Chain (18 AC)");
        System.out.println("3. Plate (20 AC)");
        System.out.println("--------------------------");
        
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        
        switch(choice) {
            
            case "1":
                
                armorClass = 15;
                
                System.out.println("You chose the leather armor! (15 AC)");
                
                break;
                
            case "2":
                
                armorClass = 18;
                
                System.out.println("You chose the chain mail armor! (18 AC)");
                
                break;
            
            case "3":
                
                armorClass = 20;
                
                System.out.println("You chose the plate armor! (20 AC)");
                
                break;
                
            default:
                System.out.println("Invalid choice, try again.");
                setAC();
            }
        }
        
    //random weapon roll
    public void rollWeaponDamage(int strMod, int agiMod){
        
        weapon1 = 8 + agiMod;
        
        weapon2 = 10 + agiMod;
        
        weapon3 = 8 + strMod;
        
        weapon4 = 10 + strMod;
               
    }
    
    //Set the different weapon type
    public void setWeapon(){
        
        System.out.println("--------------------------");
        System.out.println("What kind of weapon do you want?");
        System.out.println("1. Shortsword (1d8 + Agi)");
        System.out.println("2. Bow (1d10 + Agi)");
        System.out.println("3. Battleaxe (1d8 + Str)");
        System.out.println("4. Greatsword (1d10 + Str)");
        System.out.println("--------------------------");
        
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        
        switch(choice){
            
                case "1":
                
                    weaponDamage = weapon1;
                
                    System.out.println("You chose the shortsword! (1d8 + Agi mod)");

                
                    break;
            
                case "2":
                
                    weaponDamage = weapon2;
                
                    System.out.println("You chose the bow! (1d10 + Agi mod)");

                    break;
            
                case "3":
                
                    weaponDamage = weapon3;
                
                    System.out.println("You chose the battleaxe! (1d8 + Str mod)");
                
                    break;
            
                case "4":
                
                    weaponDamage = weapon4;
                
                    System.out.println("You chose the greatsword! (1d10 + Str mod)");
                
                    break;
                    
                default:
                    
                    System.out.println("Invalid Choice, try again.");
                    setWeapon();
                    
            }
        }  
    
    //Get weapon damage
    public int getWeaponDamage(){
        
        return weaponDamage;
        
    }
}
       

