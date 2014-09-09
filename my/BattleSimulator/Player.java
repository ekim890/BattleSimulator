package my.BattleSimulator;

import java.util.Random;

// Developed By: Edwin Kim

public class Player 
{
    // ****************************** PLAYER ATTRIBUTES *******************************
    // Health Points: Points reduced by successful attacks. Player is defeated when this value reaches 0.
    // Constitution: Reduces damage done by attacks.
    // Evasion: Increases the chance to evade an attack.
    // Hit: Increases the chance to hit an attack.
    // Luck: Determines the chance to score a critical hit.
    // Speed: Determines the number and order of attacks in a battle.
    // Strength: Increases damage dealt by attacks.
    
    private final String name;
    private final int level;
    private final String playerClass;
    private final String weaponType;
    
    private int conValue;
    private int evdValue;
    private int hitValue;
    private int hpValue;
    private int lukValue;
    private int spdValue;
    private int strValue;
    
    public Player(String name, int level, String playerClass, String weaponType)
    {
        this.name = name;
        this.level = level;
        this.playerClass = playerClass;
        this.weaponType = weaponType;
        calculateBaseStats();
    }  
    
    private void calculateBaseStats()
    {
        // ****************************** BASE CLASS ATTRIBUTES  **************************
        // Assassin     [250 HP, 5 CON, 30 EVD, 25 HIT, 25 LUK, 25 SPD, 10 STR]    = 120 POINTS
        // Berserker    [250 HP, 5 CON, 5 EVD, 10 HIT, 10 LUK, 10 SPD, 40 STR]     = 80 POINTS
        // Marksman     [250 HP, 5 CON, 15 EVD, 30 HIT, 30 LUK, 15 SPD, 15 STR]    = 110 POINTS
        // Tank         [400 HP, 35 CON, 35 EVD, 10 HIT, 10 LUK, 10 SPD, 10 STR]   = 110 POINTS
        // Warrior      [300 HP, 15 CON, 15 EVD, 20 HIT, 20 LUK, 20 SPD, 20 STR]   = 110 POINTS
        
        switch (playerClass)
        {
            case "Assassin":
                hpValue = 250;
                conValue = 5;
                evdValue = 30;
                hitValue = 25;
                lukValue = 25;
                spdValue = 25;
                strValue = 10;
                break;
            case "Berserker":
                hpValue = 250;
                conValue = 5;
                evdValue = 5;
                hitValue = 10;
                lukValue = 10;
                spdValue = 10;
                strValue = 40;
                break;
            case "Marksman":
                hpValue = 250;
                conValue = 10;
                evdValue = 10;
                hitValue = 35;
                lukValue = 35;
                spdValue = 15;
                strValue = 15;
                break;
            case "Tank":
                hpValue = 400;
                conValue = 35;
                evdValue = 35;
                hitValue = 10;
                lukValue = 10;
                spdValue = 10;
                strValue = 10;
                break;
            case "Warrior":
                hpValue = 300;
                conValue = 15;
                evdValue = 15;
                hitValue = 20;
                lukValue = 20;
                spdValue = 20;
                strValue = 20;
                break;
        }
        
        // ****************************** BASE WEAPON TYPES *******************************
        // Axe          [+5 CON, +5 EVD, +5 HIT, +5 LUK, +5 SPD, +25 STR]           = 50 POINTS
        // Dagger       [+5 CON, +15 EVD, +15 HIT, +15 LUK, +15 SPD, +5 STR]        = 70 POINTS
        // Mace         [+10 CON, +5 EVD, +5 HIT, +25 LUK, +5 SPD, +10 STR]         = 60 POINTS
        // Spear        [+10 CON, +5 EVD, +10 HIT, +10 LUK, +5 SPD, +15 STR]        = 55 POINTS
        // Sword        [+10 CON, +10 EVD, +10 HIT, +10 LUK, +10 SPD, +10 STR]      = 60 POINTS
        
        switch (weaponType)
        {
            case "Axe":
                conValue = conValue + 5;
                evdValue = evdValue + 5;
                hitValue = hitValue + 5;
                lukValue = lukValue + 5;
                spdValue = spdValue + 5;
                strValue = strValue + 25;
                break;
            case "Dagger":
                conValue = conValue + 5;
                evdValue = evdValue + 15;
                hitValue = hitValue + 15;
                lukValue = lukValue + 15;
                spdValue = spdValue + 15;
                strValue = strValue + 5;
                break;
            case "Mace":
                conValue = conValue + 10;
                evdValue = evdValue + 5;
                hitValue = hitValue + 5;
                lukValue = lukValue + 25;
                spdValue = spdValue + 5;
                strValue = strValue + 10;
                break;
            case "Spear":
                conValue = conValue + 10;
                evdValue = evdValue + 5;
                hitValue = hitValue + 10;
                lukValue = lukValue + 10;
                spdValue = spdValue + 5;
                strValue = strValue + 15;
                break;
            case "Sword":
                conValue = conValue + 10;
                evdValue = evdValue + 10;
                hitValue = hitValue + 10;
                lukValue = lukValue + 10;
                spdValue = spdValue + 10;
                strValue = strValue + 10;
                break;
        }
    }
    
    public void levelPlayer()
    {
        Random random = new Random();
        
        // Levels up player starting from 1 to current level.
        for (int i = 1; i < level; i++)
        {
            // Each attribute has a 50% chance to increase by 1 per level.
            // HP has two chances to level up.
            boolean increaseHp = random.nextBoolean();
            boolean increaseHp2 = random.nextBoolean();
            boolean increaseCon = random.nextBoolean();
            boolean increaseEvd = random.nextBoolean();
            boolean increaseHit = random.nextBoolean();
            boolean increaseLuk = random.nextBoolean();
            boolean increaseSpd = random.nextBoolean();
            boolean increaseStr = random.nextBoolean();
            
            if (increaseHp)
            {
                hpValue++;
            }
            
            if (increaseHp2)
            {
                hpValue++;
            }
            
            if (increaseCon)
            {
                conValue++;
            }
            
            if (increaseEvd)
            {
                evdValue++;
            }
            
            if (increaseHit)
            {
                hitValue++;
            }
            
            if (increaseLuk)
            {
                lukValue++;
            }
            
            if (increaseSpd)
            {
                spdValue++;
            }
            
            if (increaseStr)
            {
                strValue++;
            }
        }
    }
    
    public boolean checkIfAlive()
    {
        boolean isAlive = true;
        
        if (hpValue <= 0)
        {
            isAlive = false;
        }
        
        return isAlive;
    }

    public String getName() 
    {
        return name;
    }

    public int getLevel()
    {
        return level;
    }

    public String getPlayerClass() 
    {
        return playerClass;
    }

    public String getWeaponType() 
    {
        return weaponType;
    }

    public int getConValue()
    {
        return conValue;
    }

    public int getEvdValue() 
    {
        return evdValue;
    }

    public int getHitValue() 
    {
        return hitValue;
    }

    public int getHpValue() 
    {
        return hpValue;
    }

    public int getLukValue()
    {
        return lukValue;
    }

    public int getSpdValue()
    {
        return spdValue;
    }

    public int getStrValue()
    {
        return strValue;
    }
    
    public void setHpValue(int hpValue)
    {
        this.hpValue = hpValue;
    }
}