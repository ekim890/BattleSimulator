package my.BattleSimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

// Developed By: Edwin Kim

public class BattleSimController 
{
    private final BattleSimModel model;
    private final BattleSimView view;

    public BattleSimController(BattleSimModel bsm, BattleSimView bsv) 
    {
        model = bsm;
        view = bsv;

        view.resetListener1(new resetListener1());
        view.resetListener2(new resetListener2());
        view.confirmListener1(new confirmListener1());
        view.confirmListener2(new confirmListener2());
        view.helpListener(new helpListener());
        view.duelListener(new duelListener());
    }

    private class resetListener1 implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            view.resetPlayer1();
        }
    }

    private class resetListener2 implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            view.resetPlayer2();
        }
    }

    // Prints out all of Player 1's information in a window IF
    // given a valid name, level, player class, and weapon.
    private class confirmListener1 implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String name = view.getPlayerName1();
            String level = view.getPlayerLevel1();
            String playerClass = view.getPlayerClass1();
            String weapon = view.getWeapon1();

            boolean nameIsValid = playerNameCheck1(name);
            boolean levelIsValid = playerLevelCheck1(level);
            boolean playerClassSelected = playerClassCheck1(playerClass);
            boolean weaponSelected = playerWeaponCheck1(weapon);

            if (nameIsValid && levelIsValid && playerClassSelected && weaponSelected)
            {
                Player playerOne = new Player(name, Integer.parseInt(level), playerClass, weapon);

                String message = "Name: " + name + "\nLevel: " + level + "\nClass: " + playerClass + "\nWeapon: " + weapon
                        + "\n\n***** Base Attributes *****" + "\nHealth Points: " + playerOne.getHpValue()
                        + "\nConstitution: " + playerOne.getConValue() + "\nEvasion: " + playerOne.getEvdValue()
                        + "\nHit: " + playerOne.getHitValue() + "\nLuck: " + playerOne.getLukValue() + "\nSpeed: "
                        + playerOne.getSpdValue() + "\nStrength: " + playerOne.getStrValue();
                String title = "Player 1 Information";
                int messageType = JOptionPane.INFORMATION_MESSAGE;
                JOptionPane.showMessageDialog(view, message, title, messageType);
            }
        }
    }

    // Prints out all of Player 1's information in a window IF
    // given a valid name, level, player class, and weapon.
    private class confirmListener2 implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String name = view.getPlayerName2();
            String level = view.getPlayerLevel2();
            String playerClass = view.getPlayerClass2();
            String weapon = view.getWeapon2();

            boolean nameIsValid = playerNameCheck2(name);
            boolean levelIsValid = playerLevelCheck2(level);
            boolean playerClassSelected = playerClassCheck2(playerClass);
            boolean weaponSelected = playerWeaponCheck2(weapon);

            if (nameIsValid && levelIsValid && playerClassSelected && weaponSelected)
            {
                Player playerTwo = new Player(name, Integer.parseInt(level), playerClass, weapon);

                String message = "Name: " + name + "\nLevel: " + level + "\nClass: " + playerClass + "\nWeapon: " + weapon
                        + "\n\n***** Base Attributes *****" + "\nHealth Points: " + playerTwo.getHpValue()
                        + "\nConstitution: " + playerTwo.getConValue() + "\nEvasion: " + playerTwo.getEvdValue()
                        + "\nHit: " + playerTwo.getHitValue() + "\nLuck: " + playerTwo.getLukValue() + "\nSpeed: "
                        + playerTwo.getSpdValue() + "\nStrength: " + playerTwo.getStrValue();
                String title = "Player 2 Information";
                int messageType = JOptionPane.INFORMATION_MESSAGE;
                JOptionPane.showMessageDialog(view, message, title, messageType);
            }
        }
    }

    // Prints out helpful information in a window.
    private class helpListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            StringBuilder sb = new StringBuilder();
            sb.append("*********************************** PLAYER ATTRIBUTES *************************************");
            sb.append("\nHP: Points reduced by successful attacks. Player is defeated when this value reaches 0.");
            sb.append("\nConstitution: Reduces damage done by attacks.");
            sb.append("\nEvasion: Increases the chance to evade an attack.");
            sb.append("\nHit: Increases the chance to hit an attack.");
            sb.append("\nLuck: Determines the chance to score a critical hit.");
            sb.append("\nSpeed: Determines the number and order of attacks in a battle.");
            sb.append("\nStrength: Increases damage dealt by attacks.\n\n");
            sb.append("*********************************** BASE CLASS ATTRIBUTES *******************************");
            sb.append("\nAssassin: 250 HP  |  5 CON  |  30 EVD  |  25 HIT  |  25 LUK  |  25 SPD  |  10 STR");
            sb.append("\nBerserker: 250 HP  |  5 CON  |  5 EVD  |  10 HIT  |  10 LUK  |  10 SPD  |  40 STR");
            sb.append("\nMarksman: 250 HP  |  5 CON  |  15 EVD  |  30 HIT  |  30 LUK  |  15 SPD  |  15 STR");
            sb.append("\nTank: 400 HP  |  35 CON  |  35 EVD  |  10 HIT  |  10 LUK  |  10 SPD  |  10 STR");
            sb.append("\nWarrior: 300 HP  |  15 CON  |  15 EVD  |  20 HIT  |  20 LUK  |  20 SPD  |  20 STR\n\n");
            sb.append("*********************************** BASE WEAPON TYPES ***********************************");
            sb.append("\nAxe: +5 CON  |  +5 EVD  |  +5 HIT  |  +5 LUK  |  +5 SPD  |  +25 STR");
            sb.append("\nDagger: +5 CON  |  +15 EVD  |  +15 HIT  |  +15 LUK  |  +15 SPD  |  +5 STR");
            sb.append("\nMace: +10 CON  |  +5 EVD  |  +5 HIT  |  +25 LUK  |  +5 SPD  |  +10 STR");
            sb.append("\nSpear: +10 CON  |  +5 EVD  |  +10 HIT  |  +10 LUK  |  +5 SPD  |  +15 STR");
            sb.append("\nSword: +10 CON  |  +10 EVD  |  +10 HIT  |  +10 LUK  |  +10 SPD  |  +10 STR\n\n");
            sb.append("*********************************** HOW THE SIMULATOR WORKS ***********************************");
            sb.append("\n1a. CON, EVD, HIT, LUK, SPD, and STR has a 50% chance to increase by 1 per level.");
            sb.append("\n1b. HP has two chances to increase by 1 per level.\n");
            sb.append("\n2a. Damage Done = Attacker's Strength - Defender's Constitution.");
            sb.append("\n2b. If defender's constitution > attacker's strength then attacker inflicts 1 damage.\n");
            sb.append("\n3a. An attacker with a speed advantage of 3 or more attacks 3 times. Defender counterattacks twice.");
            sb.append("\n3b. If the speed difference is between 2 and -2 then both players get 2 attacks.");
            sb.append("\n3c. An attacker with a speed disadvantage of 3 or more attacks twice. Defender counterattacks 3 times.\n");
            sb.append("\n4a. An attack cannot be evaded if attacker's hit is higher than or equal to the defender's evasion.");
            sb.append("\n4b. If attacker's hit is less than the defender's evasion then dodge chance is calculated.");
            sb.append("\n4c. Dodge Chance = (Defender's Evasion - Attacker's Hit) * 2.\n");
            sb.append("\n5a. An attack cannot crit if their luck is less than or equal to the defender's luck.");
            sb.append("\n5b. If attacker's luck is higher than the defender's luck then crit chance is calculated.");
            sb.append("\n5c. Critical Strike Chance = (Attacker's Luck - Defender's Luck) * 2.");

            String message = sb.toString();
            String title = "Battle Simulator Information";
            int messageType = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }
    }

    // Simulates a battle between two players if all input is valid.
    private class duelListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String playerName1 = view.getPlayerName1();
            String playerLevel1 = view.getPlayerLevel1();
            String playerClass1 = view.getPlayerClass1();
            String playerWeapon1 = view.getWeapon1();
            boolean nameIsValid1 = playerNameCheck1(playerName1);
            boolean levelIsValid1 = playerLevelCheck1(playerLevel1);
            boolean playerClassSelected1 = playerClassCheck1(playerClass1);
            boolean weaponSelected1 = playerWeaponCheck1(playerWeapon1);
            boolean validInput1 = nameIsValid1 && levelIsValid1 && playerClassSelected1 && weaponSelected1;

            String playerName2 = view.getPlayerName2();
            String playerLevel2 = view.getPlayerLevel2();
            String playerClass2 = view.getPlayerClass2();
            String playerWeapon2 = view.getWeapon2();
            boolean nameIsValid2 = playerNameCheck2(playerName2);
            boolean levelIsValid2 = playerLevelCheck2(playerLevel2);
            boolean playerClassSelected2 = playerClassCheck2(playerClass2);
            boolean weaponSelected2 = playerWeaponCheck2(playerWeapon2);
            boolean validInput2 = nameIsValid2 && levelIsValid2 && playerClassSelected2 && weaponSelected2;

            if (validInput1 && validInput2) 
            {
                model.createPlayer1(playerName1, Integer.parseInt(playerLevel1), playerClass1, playerWeapon1);
                model.createPlayer2(playerName2, Integer.parseInt(playerLevel2), playerClass2, playerWeapon2);
                model.simulateBattle();

                view.setTextArea(model.getBattleResults());
                model.clearBattleResults();

                Player winner = model.getWinner();
                String message = winner.getName() + " won the duel with " + winner.getHpValue() + " HP remaining.";
                String title = "Victory!";
                int messageType = JOptionPane.INFORMATION_MESSAGE;
                JOptionPane.showMessageDialog(view, message, title, messageType);
            }
        }
    }

    // Name is valid if text field is not blank.
    // A window message informs the user if name is not provided.
    private boolean playerNameCheck1(String name) 
    {
        boolean nameIsValid = true;

        if (name.equals(""))
        {
            nameIsValid = false;
            String message = "Please enter a name for Player 1.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        return nameIsValid;
    }

    // Player level is valid if text field is an integer between 1-100.
    // A window message informs the user if the level is not valid.
    private boolean playerLevelCheck1(String level) 
    {
        int playerLevel = 1;
        boolean levelIsInteger = true;
        boolean levelInRange = true;

        try 
        {
            playerLevel = Integer.parseInt(level);
        } 
        catch (NumberFormatException ex) 
        {
            levelIsInteger = false;
            String message = "Please enter an integer between 1-100 for Player 1's level.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        if (levelIsInteger) 
        {
            if (playerLevel < 1 || playerLevel > 100) 
            {
                levelInRange = false;
                String message = "Please enter an integer between 1-100 for Player 1's level.";
                String title = "Invalid Input";
                int messageType = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(view, message, title, messageType);
            }
        }

        boolean levelIsValid = levelIsInteger && levelInRange;
        return levelIsValid;
    }

    // Makes sure that the user selects a class.
    // If no class is selected, then prompts the user to pick one.
    private boolean playerClassCheck1(String playerClass)
    {
        boolean playerClassSelected = true;

        if (playerClass.equals("")) 
        {
            playerClassSelected = false;
            String message = "Please select a class for Player 1.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        return playerClassSelected;
    }

    // Makes sure that the user selects a weapon.
    // If no weapon is selected, then prompts the user to pick one.
    private boolean playerWeaponCheck1(String weapon) 
    {
        boolean weaponSelected = true;

        if (weapon.equals("")) 
        {
            weaponSelected = false;
            String message = "Please select a weapon for Player 1.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        return weaponSelected;
    }

    // Same as playerNameCheck1 except this method is used for Player 2.
    private boolean playerNameCheck2(String name) 
    {
        boolean nameIsValid = true;

        if (name.equals(""))
        {
            nameIsValid = false;
            String message = "Please enter a name for Player 2.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        return nameIsValid;
    }

    // Same as playerLevelCheck1 except this method is used for Player 2.
    private boolean playerLevelCheck2(String level) 
    {
        int playerLevel = 1;
        boolean levelIsInteger = true;
        boolean levelInRange = true;

        try 
        {
            playerLevel = Integer.parseInt(level);
        } 
        catch (NumberFormatException ex)
        {
            levelIsInteger = false;
            String message = "Please enter an integer between 1-100 for Player 2's level.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        if (levelIsInteger) 
        {
            if (playerLevel < 1 || playerLevel > 100) 
            {
                levelInRange = false;
                String message = "Please enter an integer between 1-100 for Player 2's level.";
                String title = "Invalid Input";
                int messageType = JOptionPane.WARNING_MESSAGE;
                JOptionPane.showMessageDialog(view, message, title, messageType);
            }
        }

        boolean levelIsValid = levelIsInteger && levelInRange;
        return levelIsValid;
    }

    // Same as playerClassCheck1 except this method is used for Player 2.
    private boolean playerClassCheck2(String playerClass) 
    {
        boolean playerClassSelected = true;

        if (playerClass.equals("")) 
        {
            playerClassSelected = false;
            String message = "Please select a class for Player 2.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        return playerClassSelected;
    }

    // Same as playerWeaponCheck1 except this method is used for Player 2.
    private boolean playerWeaponCheck2(String weapon) 
    {
        boolean weaponSelected = true;

        if (weapon.equals("")) 
        {
            weaponSelected = false;
            String message = "Please select a weapon for Player 2.";
            String title = "Invalid Input";
            int messageType = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(view, message, title, messageType);
        }

        return weaponSelected;
    }
}