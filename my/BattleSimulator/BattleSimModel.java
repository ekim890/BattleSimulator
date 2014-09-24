package my.BattleSimulator;

import java.util.Random;

// Developed By: Edwin Kim

public class BattleSimModel 
{
    private Player playerOne;
    private Player playerTwo;
    private final Random random;
    private final StringBuilder results;
    
    public BattleSimModel()
    {
        random = new Random();
        results = new StringBuilder();
    }
    
    public void createPlayer1(String name, int level, String playerClass, String weaponType)
    {
        playerOne = new Player(name, level, playerClass, weaponType);
        playerOne.levelPlayer();
    }
    
    public void createPlayer2(String name, int level, String playerClass, String weaponType)
    {
        playerTwo = new Player(name, level, playerClass, weaponType);
        playerTwo.levelPlayer();
    }
    
    public Player getPlayer1()
    {
        return playerOne;
    }
    
    public Player getPlayer2()
    {
        return playerTwo;
    }
    
    public void simulateBattle()
    {
        printFinalAttributes();
        
        // Player 1 attacks first when the application starts. If other player is not dead, then 
        // Player 2 becomes the attacker and Player 1 defends. Repeats until a player dies.
        Player attacker = playerOne;
        Player defender = playerTwo;
        
        while (attacker.checkIfAlive() && defender.checkIfAlive())
        {
            // Gets players' speed and calculates the difference.
            int spdCalc = attacker.getSpdValue() - defender.getSpdValue();
            
            int numOfAtksForAtker;
            int numOfAtksForDfder;
            
            // If attacker's speed is greater than defender's speed by 3 or more
            // then the attacker get 3 attacks and the defender gets 2.
            if (spdCalc >= 3)
            {
                numOfAtksForAtker = 3;
                numOfAtksForDfder = 2;
            }
            // If attacker's speed is less than defender's speed by 3 or more then
            // the attacker gets 2 attacks and the defender gets 3.
            else if (spdCalc <= -3)
            {
                numOfAtksForAtker = 2;
                numOfAtksForDfder = 3;
            }
            // Attacker and defender get 2 attacks each if the speed difference is between 2 and -2.
            else
            {
                numOfAtksForAtker = 2;
                numOfAtksForDfder = 2;
            }
            
            if (numOfAtksForAtker == 3 && numOfAtksForDfder == 2)
            {
                String s = "------------------------------ " + attacker.getName() + "'s ATTACK PHASE ------------------------------\n";
                results.append(s);
                
                // First parameter is the attacking player. Second parameter is the defending player.
                attackCalculation(attacker, defender);
                attackCalculation(defender, attacker);
                attackCalculation(attacker, defender);
                attackCalculation(defender, attacker);
                attackCalculation(attacker, defender);
            }
            else if (numOfAtksForAtker == 2 && numOfAtksForDfder == 3)
            {
                String s = "------------------------------ " + attacker.getName() + "'s ATTACK PHASE ------------------------------\n";
                results.append(s);
                
                // First parameter is the attacking player. Second parameter is the defending player.
                attackCalculation(attacker, defender);
                attackCalculation(defender, attacker);
                attackCalculation(defender, attacker);
                attackCalculation(attacker, defender);
                attackCalculation(defender, attacker);
            }
            else
            {
                String s = "------------------------------ " + attacker.getName() + "'s ATTACK PHASE ------------------------------\n";
                results.append(s);
                
                // First parameter is the attacking player. Second parameter is the defending player.
                attackCalculation(attacker, defender);
                attackCalculation(defender, attacker);
                attackCalculation(attacker, defender);
                attackCalculation(defender, attacker);
            }
            
            if (attacker.checkIfAlive() && defender.checkIfAlive())
            {
                Player formerAttacker = attacker;
                Player formerDefender = defender;

                attacker = formerDefender;
                defender = formerAttacker;
            }
        }
    }
    
    private void printFinalAttributes()
    {
        String playerOneStats = "------------------------------ " + playerOne.getName() + "'s FINAL ATTRIBUTES ------------------------------"
                                + "\nHP: " + playerOne.getHpValue() + "\nConstitution: " + playerOne.getConValue()
                                + "\nEvasion: " + playerOne.getEvdValue() + "\nHit: " + playerOne.getHitValue()
                                + "\nLuck: " + playerOne.getLukValue() + "\nSpeed: " + playerOne.getSpdValue()
                                + "\nStrength: " + playerOne.getStrValue() + "\n";
        
        String playerTwoStats = "------------------------------ " + playerTwo.getName() + "'s FINAL ATTRIBUTES ------------------------------"
                                + "\nHP: " + playerTwo.getHpValue() + "\nConstitution: " + playerTwo.getConValue()
                                + "\nEvasion: " + playerTwo.getEvdValue() + "\nHit: " + playerTwo.getHitValue()
                                + "\nLuck: " + playerTwo.getLukValue() + "\nSpeed: " + playerTwo.getSpdValue()
                                + "\nStrength: " + playerTwo.getStrValue() + "\n";
        
        results.append("****************************** BATTLE START ******************************\n\n");
        results.append(playerOneStats);
        results.append(playerTwoStats);
    }
    
    private void attackCalculation(Player attacker, Player defender)
    {
        if (attacker.checkIfAlive() && defender.checkIfAlive())
        {
            // Defender HP lost = difference between attacker's strength and defender's constitution.
            int attackCalc = attacker.getStrValue() - defender.getConValue();
            
            // Defender takes 1 damage if constitution is higher than attacker's strength.
            if (attackCalc <= 0)
            {
                attackCalc = 1;
            }
            
            // Attacker cannot miss if hit is greater than or equal to the defender's evasion.
            if (attacker.getHitValue() >= defender.getEvdValue())
            {
                // Attacker cannot crit if luck is less than or equal to the defender's luck.
                if (attacker.getLukValue() <= defender.getLukValue())
                {
                    attackSuccessful(attacker, defender, attackCalc);
                }
                // Attacker can crit if luck is greater than defender's luck.
                else
                {
                    int randomNumber = random.nextInt(100);
                    // Attacker has a (x * 2)% crit chance depending on difference of luck.
                    int critChance = ((attacker.getLukValue() - defender.getLukValue()) * 2);
                    
                    // Ex: critChance = ((70-50) * 2) = 40% chance to crit.
                    // So if randomNumber generates any number between 0-39 then the attack is a crit.
                    if (randomNumber <= critChance)
                    {
                        critSuccessful(attacker, defender, attackCalc);
                    }
                    // Enters statement if attacker did not crit.
                    else
                    {
                        attackSuccessful(attacker, defender, attackCalc);
                    }
                }
            }
            
            // Attacker can miss if hit is less than defender's evasion.
            else
            {
                int randomNumber = random.nextInt(100);
                // Defender has a (x * 2)% dodge chance depending on difference.
                int dodgeChance = ((defender.getEvdValue() - attacker.getHitValue()) * 2);
                
                // Ex: dodgeChance = ((70-50) * 2) = 40% chance to dodge attack.
                // So if randomNumber generates any number between 0-39 then the attack is evaded.
                if (randomNumber <= dodgeChance)
                {
                    String result = attacker.getName() + "'s attack has been evaded by " + defender.getName() + ".\n";
                    results.append(result);
                }
                // Enters statement if attack was not dodged by the defender.
                else
                {
                    // Attacker cannot crit if luck is less than or equal to the defender's luck.
                    if (attacker.getLukValue() <= defender.getLukValue())
                    {
                        attackSuccessful(attacker, defender, attackCalc);
                    }
                    // Attacker can crit if luck is greater than defender's luck.
                    else
                    {
                        int randomNumber2 = random.nextInt(100);
                        // Attacker has a (x * 2)% crit chance depending on difference of luck.
                        int critChance = ((attacker.getLukValue() - defender.getLukValue()) * 2);

                        // Ex: critChance = ((70-50) * 2) = 40% chance to crit.
                        // So if randomNumber generates any number between 0-39 then the attack is a crit.
                        if (randomNumber2 <= critChance)
                        {
                            critSuccessful(attacker, defender, attackCalc);
                        }
                        // Enters statement if attacker did not crit.
                        else
                        {
                            attackSuccessful(attacker, defender, attackCalc);
                        }
                    }
                }
            }
        }
    }
    
    private void attackSuccessful(Player attacker, Player defender, int attackCalc)
    {
        int attackResult = defender.getHpValue() - attackCalc;
                    
        if (attackResult > 0)
        {
            defender.setHpValue(attackResult);
            String result = attacker.getName() + " attacks " + defender.getName() + " for " + attackCalc + " damage. "
                            + defender.getName() + " now has " + defender.getHpValue() + " HP!\n";
            results.append(result);
        }
        else
        {
            defender.setHpValue(0);
            String result = attacker.getName() + " attacks " + defender.getName() + " for " + attackCalc + " damage. "
                            + defender.getName() + " now has " + defender.getHpValue() + " HP!\n" + defender.getName()
                            + " has been defeated. " + attacker.getName() + " has won the battle!\n"
                            + "\n****************************** BATTLE END ******************************";
            results.append(result);
        }
    }
    
    private void critSuccessful(Player attacker, Player defender, int attackCalc)
    {
        // A critical strike deals double damage.
        int critDmg = attackCalc * 2;
        int attackResult = defender.getHpValue() - critDmg;

        if (attackResult > 0)
        {
            defender.setHpValue(attackResult);
            String result = attacker.getName() + " crits " + defender.getName() + " for " + critDmg + " damage. "
                            + defender.getName() + " now has " + defender.getHpValue() + " HP!\n";
            results.append(result);
        }
        else
        {
            defender.setHpValue(0);
            String result = attacker.getName() + " crits " + defender.getName() + " for " + critDmg + " damage. "
                            + defender.getName() + " now has " + defender.getHpValue() + " HP!\n" + defender.getName()
                            + " has been defeated. " + attacker.getName() + " has won the battle!\n"
                            + "\n****************************** BATTLE END ******************************";
            results.append(result);
        }
    }
    
    public Player getWinner()
    {
        if (playerOne.checkIfAlive() && !playerTwo.checkIfAlive())
        {
            return playerOne;
        }
        else if (!playerOne.checkIfAlive() && playerTwo.checkIfAlive())
        {
            return playerTwo;
        }
        else
        {
            return null;
        }
    }
    
    public String getBattleResults()
    {
        return results.toString();
    }
    
    public void clearBattleResults()
    {
        results.delete(0, results.length());
    }
}