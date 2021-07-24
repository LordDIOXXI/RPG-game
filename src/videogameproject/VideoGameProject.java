/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogameproject;

import java.util.Scanner;
import java.util.Random;

public class VideoGameProject {

   
    public static void main(String[] args) {
        
        
        Random rand = new Random();
        
        //Create enemy to fight
        Enemy enemy = new Enemy();
        enemy.setHitPoints();        
        enemy.setStrength();
        enemy.setStrMod();
        enemy.setAgility();
        enemy.setAgiMod();
        enemy.setEndurance();
        enemy.setEndMod();
        enemy.setIntelligence();
        enemy.setIntMod();
        enemy.setWisdom();
        enemy.setWisMod();
        enemy.setCharisma();
        enemy.setChaMod();
        enemy.setArmorClass();
        enemy.setWeapon();
        
        //Create constants to hold values from the object
        int enemyHealth = enemy.getHitPoints();
        int enemyStrength = enemy.getStrength();
        int enemyStrMod = enemy.getStrMod();
        int enemyAgility = enemy.getAgility();
        int enemyAgiMod = enemy.getAgiMod();
        int enemyEndurance = enemy.getEndurance();
        int enemyEndMod = enemy.getEndMod();
        int enemyIntelligence = enemy.getIntelligence();
        int enemyIntMod = enemy.getIntMod();
        int enemyWisdom = enemy.getWisdom();
        int enemyWisMod = enemy.getWisMod();
        int enemyCharisma = enemy.getCharisma();
        int enemyChaMod = enemy.getChaMod();
        int enemyAC = enemy.getArmorClass();
        int enemyWeapon = enemy.getWeapon();
        
        //Initialize character for play
        Character player = new Character();
        player.modSet();
        player.setStrength();
        player.setAgility();
        player.setEndurance();
        player.setIntelligence();
        player.setWisdom();
        player.setCharisma();
        player.setHitPoints();
        
        
        
        //Initialize Weapons and Armor
        WeaponsAndArmor armorAndWeapon = new WeaponsAndArmor();
        
        //Get name
        System.out.println("Please enter your character's name:");
        Scanner sc = new Scanner(System.in);
        player.setPlayerName(sc.nextLine());
        
        //set AC
        armorAndWeapon.setAC();
        
        //Display Character stats
        System.out.println("Your character's name is: " +player.getPlayerName());
        System.out.println("--------------------------");
        System.out.println("Your stats are as follows");
        System.out.println("--------------------------");
        System.out.println("Hit Points: " + player.getHitPoints());
        System.out.println("AC: " + armorAndWeapon.getArmorClass());
        System.out.println("Strength: " + player.getStrength());
        System.out.println("Strength Mod: " + player.strMod);
        System.out.println("Agility: " + player.getAgility());
        System.out.println("Agility Mod: " + player.agiMod);
        System.out.println("Endurance: " + player.getEndurance());
        System.out.println("Endurance Mod: " + player.endMod);
        System.out.println("Intelligence: " + player.getIntelligence());
        System.out.println("Intelligence Mod: " + player.intMod);
        System.out.println("Wisdom: " + player.getWisdom());
        System.out.println("Wisdom Mod: " + player.wisMod);
        System.out.println("Charisma: " + player.getCharisma());
        System.out.println("Charisma Mod: " + player.chaMod);
        
        //Get player weapon
        armorAndWeapon.rollWeaponDamage(enemyStrMod, enemyAgiMod);
        armorAndWeapon.setWeapon();
        
        //Show enemy stats
        System.out.println("You're apporached by a very strong looking man \n");
        System.out.println("------------------------------");
        System.out.println("The enemy stats are as follows");
        System.out.println("------------------------------");
        System.out.println("Hit Points: " + enemyHealth);
        System.out.println("Armor Class: " + enemyAC);
        System.out.println("Strength: " + enemyStrength);
        System.out.println("Strength Mod: " + enemyStrMod);
        System.out.println("Agility: " + enemyAgility);
        System.out.println("Agility Mod: " + enemyAgiMod);
        System.out.println("Endurance: " + enemyEndurance);
        System.out.println("Endurance Mod: " + enemyEndMod);
        System.out.println("Intelligence: " + enemyIntelligence);
        System.out.println("Intelligence Mod: " + enemyIntMod);
        System.out.println("Wisdom: " + enemyWisdom);
        System.out.println("Wisdom Mod: " + enemyWisMod);
        System.out.println("Charisma: " + enemyCharisma);
        System.out.println("Charisma Mod: " + enemyChaMod + "\n");
        
        //Enemy dialogue
        System.out.println("???: \"My name is Stronk Von Punchowitz and I seek battle"
                + " with the strongest people in the realm.\"\n");
        System.out.println("The strong man approaches with a very violent intent.\n");
        System.out.println("Stronk: \"Are you the strongest person here?\"\n");
        System.out.println("The hulk of a man now towers over you.\n");
        
        //Create constants to hold values from the player object
        int playerHealth = player.getHitPoints();
        int playerAC = armorAndWeapon.getArmorClass();
        int playerWeapon = armorAndWeapon.getWeaponDamage();
        int playerStrMod = player.getStrengthMod();
        int playerAgiMod = player.getAgilityMod();
        int playerIntMod = player.getIntelligenceMod();
        int playerWisMod = player.getWisMod();
        int playerChaMod = player.getChaMod();
        
        //Area where the conversation in the game happens
        conversation(playerIntMod, enemyIntMod);
        
        //Area where the fight begins
        System.out.println("Stronk: \"It is time to fight puny human.\"");
        System.out.println("");
        System.out.println("The fight begins!");
        System.out.println("-------------------------------------------");
        Scanner act = new Scanner(System.in);
        
        while (enemyHealth > 0){
            
            System.out.println("HP: " + playerHealth);
            System.out.println("Enemy HP: " + enemyHealth);
            System.out.println("How will you resolve this round?");
            System.out.println("1. Attack");
            System.out.println("2. Coerce");
            System.out.println("3. Belittle");
            System.out.println("4. Run");

            String input = act.nextLine();
            
            //Attacking
            if(input.equals("1")){
                
                int playerAttack = rand.nextInt(20) + 1 + playerStrMod + playerAgiMod; 
                int enemyAttack = rand.nextInt(20) + 1 + enemyStrMod + enemyAgiMod;
                System.out.println("Your roll to hit: " + playerAttack);
                System.out.println("Stronk's roll to hit: " + enemyAttack);
                int damageDone = rand.nextInt(playerWeapon) + 1;
                int damageRecieved = rand.nextInt(enemyWeapon) + 1;
                
                //If you both match AC
                if (playerAttack >= enemyAC && enemyAttack >= playerAC){        
                    
                    enemyHealth -= damageDone;
                    playerHealth -= damageRecieved;
                
                    System.out.println("You dealt " + damageDone + " damage.");
                    System.out.println("You recieved " + damageRecieved + " damage.");
                    
                }
                
                //if only enemy matches AC
                else if(playerAttack < enemyAC && enemyAttack >= playerAC){
                    
                    damageDone = 0;
                    playerHealth -= damageRecieved;
                    
                    System.out.println("You dealt " + damageDone + " damage.");
                    System.out.println("You recieved " + damageRecieved + " damage.");
                    
                }
                
                //if only player hits
                else if(playerAttack >= enemyAC && enemyAttack < playerAC){
                    
                    enemyHealth -= damageDone;
                    damageRecieved = 0;
                    
                    System.out.println("You dealt " + damageDone + " damage.");
                    System.out.println("You recieved " + damageRecieved + " damage.");
                    
                }
                
                else if(playerAttack < enemyAC && enemyAttack < playerAC){
                    
                    System.out.println("Neither of you hit.");
                    
                }

                
                if(playerHealth < 1){
                    System.out.println("Stronk has bested you in battle.");
                    System.out.println("Better luck next time!");
                    System.exit(0);
                }
                
            }
            
            //Coercing
            else if(input.equals("2")){
                
                int playerCoerce = rand.nextInt(20) + 1 + playerChaMod + playerWisMod;
                int enemyResist = rand.nextInt(20) + 1 + + enemyIntMod + enemyWisMod;
                int enemyAttack = rand.nextInt(20) + 1 + enemyStrMod + enemyAgiMod;
                
                System.out.println("Your attempt to coerce Stronk to stop.");
                
                int damageRecieved = rand.nextInt(enemyWeapon);
                
                if(playerCoerce >= enemyResist){
                    
                    System.out.println("You convinced Stronk to stop!");
                    System.out.println("You and Stronk go out for some tea.");
                    System.out.println("The End.");
                    System.exit(0);
                    
                }
                
                else{
                    
                    System.out.println("Your couldn't convince Stronk");
                    System.out.println("Stronk's roll to hit: " + enemyAttack);
                    
                    if(enemyAttack >= playerAC){
                        
                        playerHealth -= damageRecieved;
                        System.out.println("You recieved " + damageRecieved + " damage.\n");
                        
                    }
                    
                    else{
                        
                        System.out.println("Stronk missed his opportunity.\n");
                        
                    }
                    
                }
                    
            }
            
            //Belittling
            else if(input.equals("3")){
                
                int playerBelittle = rand.nextInt(20) + 1 + playerIntMod;
                int enemyResist = rand.nextInt(20) + 1 + enemyIntMod;
                int enemyAttack = rand.nextInt(20) + 1 + enemyStrMod + enemyAgiMod;
                
                System.out.println("You try to belittle Stronk.");
                
                int damageRecieved = rand.nextInt(enemyWeapon);
                
                if(playerBelittle >= enemyResist){
                    
                    System.out.println("You speak words incomprehensible to Stronk.");
                    System.out.println("Stronk sits down and contemplates his intelligence.");
                    System.out.println("The End.");
                    System.exit(0);
                    
                }
                
                else{
                    
                    System.out.println("Stronk see's through your trickery!");
                    System.out.println("Stronk's roll to hit: " + enemyAttack);
                    
                    if(enemyAttack >= playerAC){
                        
                        playerHealth -= damageRecieved;
                        System.out.println("You recieved " + damageRecieved + " damage.\n");
                        
                    }
                    
                    else{
                        
                        System.out.println("Stronk missed his opportunity.\n");
                        
                    }
                }
                
            }
            
            //runing
            else if(input.equals("4")){
                
                int playerRun = rand.nextInt(20) + 1 + playerAgiMod;
                int enemyRun = rand.nextInt(20) + 1 + enemyAgiMod;
                int enemyAttack = rand.nextInt(20) + 1 + enemyStrMod + enemyAgiMod;
                
                System.out.println("Your try to flee from Stronk\n");
                
                int damageRecieved = rand.nextInt(enemyWeapon);
                
                if(playerRun >= enemyRun){
                    
                    System.out.println("You escape Stronk!");
                    System.out.println("You hear faint laughter that sounds eerily like Stronk.");
                    System.out.println("The End.");
                    System.exit(0);
                    
                }
                
                else{
                    
                    System.out.println("Stronk catches up to you!");
                    System.out.println("Stronk's roll to hit: " + enemyAttack);
                    
                    if(enemyAttack >= playerAC){
                        
                        playerHealth -= damageRecieved;
                        System.out.println("You recieved " + damageRecieved + " damage.\n");
                        
                    }
                    
                    else{
                        
                        System.out.println("Stronk missed his opportunity.\n");
                        
                    }
                }
                
            }
            
            else{
                System.out.println("Inavlid input.");
            }
        }

        System.out.println("You have bested Stronk Von Punchowitz!");
        System.out.println("The game is over, thank you for playing!");
        
        }
    
    public static void conversation(int playerPer, int enemyIns){
        Random rand = new Random();
        Scanner conversationChoice = new Scanner(System.in);
        String choice;
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("3. Am I?");

        choice = conversationChoice.nextLine(); 
            switch(choice) {

                case "1":
                    
                    break;
                    
                case "2":
                    
                    System.out.println("Alright wimp, on to the next person.");
                    System.out.println("The End.");
                    System.exit(0);

                case "3":
                    
                    int playerPersuasion = rand.nextInt(20) + 1 + playerPer;
                    int enemyInsight = rand.nextInt(20) + 1 + enemyIns;

                    if (enemyInsight < playerPersuasion){
                        System.out.println("It doesn't seem so, smart one.");
                        System.out.println("The End.");
                        System.exit(0);
                    }
                    
                    else{
                        break;
                    }
                    
                default:
                    
                    System.out.println("Invalid Input./n");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("3. Am I?");
                    conversation(playerPer, enemyIns);

        } 
    }
}   

