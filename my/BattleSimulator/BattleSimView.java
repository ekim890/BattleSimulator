package my.BattleSimulator;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

// Developed By: Edwin Kim

public class BattleSimView extends JFrame 
{
	private static final long serialVersionUID = 3327046830017405127L;
    private JRadioButton assassinButton1;
    private JRadioButton assassinButton2;
    private JRadioButton axeButton1;
    private JRadioButton axeButton2;
    private JTextArea battleResults;
    private JRadioButton berserkerButton1;
    private JRadioButton berserkerButton2;
    private JPanel characterPanel1;
    private JPanel characterPanel2;
    private ButtonGroup classGroup1;
    private ButtonGroup classGroup2;
    private JLabel classLabel1;
    private JLabel classLabel2;
    private JButton confirmButton1;
    private JButton confirmButton2;
    private JRadioButton daggerButton1;
    private JRadioButton daggerButton2;
    private JButton duelButton;
    private JButton helpButton;
    private JScrollPane jScrollPane1;
    private JLabel levelLabel1;
    private JLabel levelLabel2;
    private JTextField levelTextField1;
    private javax.swing.JTextField levelTextField2;
    private JRadioButton maceButton1;
    private JRadioButton maceButton2;
    private JRadioButton marksmanButton1;
    private JRadioButton marksmanButton2;
    private JLabel nameLabel1;
    private JLabel nameLabel2;
    private JTextField nameTextField1;
    private JTextField nameTextField2;
    private JButton resetButton1;
    private JButton resetButton2;
    private JRadioButton spearButton1;
    private JRadioButton spearButton2;
    private JRadioButton swordButton1;
    private JRadioButton swordButton2;
    private JRadioButton tankButton1;
    private JRadioButton tankButton2;
    private JRadioButton warriorButton1;
    private JRadioButton warriorButton2;
    private ButtonGroup weaponGroup1;
    private ButtonGroup weaponGroup2;
    private JLabel weaponLabel1;
    private JLabel weaponLabel2;
	
	public BattleSimView() 
    {
        initComponents();
    }

    private void initComponents() 
    {
        classGroup1 = new ButtonGroup();
        weaponGroup1 = new ButtonGroup();
        classGroup2 = new ButtonGroup();
        weaponGroup2 = new ButtonGroup();
        characterPanel1 = new JPanel();
        nameLabel1 = new JLabel();
        levelLabel1 = new JLabel();
        nameTextField1 = new JTextField();
        levelTextField1 = new JTextField();
        classLabel1 = new JLabel();
        assassinButton1 = new JRadioButton();
        berserkerButton1 = new JRadioButton();
        marksmanButton1 = new JRadioButton();
        tankButton1 = new JRadioButton();
        warriorButton1 = new JRadioButton();
        weaponLabel1 = new JLabel();
        axeButton1 = new JRadioButton();
        daggerButton1 = new JRadioButton();
        maceButton1 = new JRadioButton();
        spearButton1 = new JRadioButton();
        swordButton1 = new JRadioButton();
        resetButton1 = new JButton();
        confirmButton1 = new JButton();
        helpButton = new JButton();
        duelButton = new JButton();
        characterPanel2 = new JPanel();
        nameLabel2 = new JLabel();
        levelLabel2 = new JLabel();
        nameTextField2 = new JTextField();
        levelTextField2 = new JTextField();
        classLabel2 = new JLabel();
        assassinButton2 = new JRadioButton();
        berserkerButton2 = new JRadioButton();
        marksmanButton2 = new JRadioButton();
        tankButton2 = new JRadioButton();
        warriorButton2 = new JRadioButton();
        weaponLabel2 = new JLabel();
        axeButton2 = new JRadioButton();
        daggerButton2 = new JRadioButton();
        maceButton2 = new JRadioButton();
        spearButton2 = new JRadioButton();
        swordButton2 = new JRadioButton();
        resetButton2 = new JButton();
        confirmButton2 = new JButton();
        jScrollPane1 = new JScrollPane();
        battleResults = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Battle Simulator");

        characterPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 0, 255))); // NOI18N

        nameLabel1.setFont(new Font("Tahoma", 0, 12));
        nameLabel1.setText("Name:");

        levelLabel1.setFont(new Font("Tahoma", 0, 12));
        levelLabel1.setText("Level:");

        classLabel1.setFont(new Font("Tahoma", 0, 12));
        classLabel1.setText("Class:");

        classGroup1.add(assassinButton1);
        assassinButton1.setFont(new Font("Tahoma", 0, 12));
        assassinButton1.setText("Assassin");

        classGroup1.add(berserkerButton1);
        berserkerButton1.setFont(new Font("Tahoma", 0, 12));
        berserkerButton1.setText("Berserker");

        classGroup1.add(marksmanButton1);
        marksmanButton1.setFont(new Font("Tahoma", 0, 12));
        marksmanButton1.setText("Marksman");

        classGroup1.add(tankButton1);
        tankButton1.setFont(new Font("Tahoma", 0, 12));
        tankButton1.setText("Tank");

        classGroup1.add(warriorButton1);
        warriorButton1.setFont(new Font("Tahoma", 0, 12));
        warriorButton1.setText("Warrior");

        weaponLabel1.setFont(new Font("Tahoma", 0, 12));
        weaponLabel1.setText("Weapon:");

        weaponGroup1.add(axeButton1);
        axeButton1.setFont(new Font("Tahoma", 0, 12));
        axeButton1.setText("Axe");

        weaponGroup1.add(daggerButton1);
        daggerButton1.setFont(new Font("Tahoma", 0, 12));
        daggerButton1.setText("Dagger");

        weaponGroup1.add(maceButton1);
        maceButton1.setFont(new Font("Tahoma", 0, 12));
        maceButton1.setText("Mace");

        weaponGroup1.add(spearButton1);
        spearButton1.setFont(new Font("Tahoma", 0, 12));
        spearButton1.setText("Spear");

        weaponGroup1.add(swordButton1);
        swordButton1.setFont(new Font("Tahoma", 0, 12));
        swordButton1.setText("Sword");

        resetButton1.setFont(new Font("Tahoma", 0, 12));
        resetButton1.setText("Reset");

        confirmButton1.setFont(new Font("Tahoma", 0, 12));
        confirmButton1.setText("Confirm");

        GroupLayout characterPanel1Layout = new GroupLayout(characterPanel1);
        characterPanel1.setLayout(characterPanel1Layout);
        characterPanel1Layout.setHorizontalGroup(
            characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(characterPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(characterPanel1Layout.createSequentialGroup()
                        .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(classLabel1)
                            .addComponent(berserkerButton1)
                            .addComponent(marksmanButton1)
                            .addComponent(tankButton1)
                            .addComponent(warriorButton1)
                            .addComponent(assassinButton1))
                        .addGap(63, 63, 63)
                        .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(characterPanel1Layout.createSequentialGroup()
                                .addComponent(axeButton1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.LEADING, characterPanel1Layout.createSequentialGroup()
                                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(weaponLabel1, GroupLayout.Alignment.LEADING)
                                    .addComponent(daggerButton1, GroupLayout.Alignment.LEADING)
                                    .addComponent(maceButton1, GroupLayout.Alignment.LEADING)
                                    .addComponent(spearButton1, GroupLayout.Alignment.LEADING)
                                    .addComponent(swordButton1, GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(characterPanel1Layout.createSequentialGroup()
                        .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(characterPanel1Layout.createSequentialGroup()
                                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel1)
                                    .addComponent(levelLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(levelTextField1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(characterPanel1Layout.createSequentialGroup()
                                .addComponent(confirmButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton1)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        characterPanel1Layout.setVerticalGroup(
            characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(characterPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1)
                    .addComponent(nameTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel1)
                    .addComponent(levelTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(classLabel1)
                    .addComponent(weaponLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(assassinButton1)
                    .addComponent(axeButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(berserkerButton1)
                    .addComponent(daggerButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(marksmanButton1)
                    .addComponent(maceButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tankButton1)
                    .addComponent(spearButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(warriorButton1)
                    .addComponent(swordButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(characterPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton1)
                    .addComponent(confirmButton1))
                .addContainerGap())
        );

        helpButton.setFont(new Font("Tahoma", 0, 12));
        helpButton.setText("Help");

        duelButton.setFont(new Font("Tahoma", 0, 12));
        duelButton.setText("Duel");

        characterPanel2.setBorder(BorderFactory.createTitledBorder(null, "Player 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
        		javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 0, 255)));

        nameLabel2.setFont(new Font("Tahoma", 0, 12));
        nameLabel2.setText("Name:");

        levelLabel2.setFont(new Font("Tahoma", 0, 12));
        levelLabel2.setText("Level:");

        classLabel2.setFont(new Font("Tahoma", 0, 12));
        classLabel2.setText("Class:");

        classGroup2.add(assassinButton2);
        assassinButton2.setFont(new Font("Tahoma", 0, 12));
        assassinButton2.setText("Assassin");

        classGroup2.add(berserkerButton2);
        berserkerButton2.setFont(new Font("Tahoma", 0, 12));
        berserkerButton2.setText("Berserker");

        classGroup2.add(marksmanButton2);
        marksmanButton2.setFont(new Font("Tahoma", 0, 12));
        marksmanButton2.setText("Marksman");

        classGroup2.add(tankButton2);
        tankButton2.setFont(new Font("Tahoma", 0, 12));
        tankButton2.setText("Tank");

        classGroup2.add(warriorButton2);
        warriorButton2.setFont(new Font("Tahoma", 0, 12));
        warriorButton2.setText("Warrior");

        weaponLabel2.setFont(new Font("Tahoma", 0, 12));
        weaponLabel2.setText("Weapon:");

        weaponGroup2.add(axeButton2);
        axeButton2.setFont(new Font("Tahoma", 0, 12));
        axeButton2.setText("Axe");

        weaponGroup2.add(daggerButton2);
        daggerButton2.setFont(new Font("Tahoma", 0, 12));
        daggerButton2.setText("Dagger");

        weaponGroup2.add(maceButton2);
        maceButton2.setFont(new Font("Tahoma", 0, 12));
        maceButton2.setText("Mace");

        weaponGroup2.add(spearButton2);
        spearButton2.setFont(new Font("Tahoma", 0, 12));
        spearButton2.setText("Spear");

        weaponGroup2.add(swordButton2);
        swordButton2.setFont(new Font("Tahoma", 0, 12));
        swordButton2.setText("Sword");

        resetButton2.setFont(new Font("Tahoma", 0, 12));
        resetButton2.setText("Reset");

        confirmButton2.setFont(new Font("Tahoma", 0, 12));
        confirmButton2.setText("Confirm");

        GroupLayout characterPanel2Layout = new GroupLayout(characterPanel2);
        characterPanel2.setLayout(characterPanel2Layout);
        characterPanel2Layout.setHorizontalGroup(
            characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(characterPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(characterPanel2Layout.createSequentialGroup()
                        .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(classLabel2)
                            .addComponent(berserkerButton2)
                            .addComponent(marksmanButton2)
                            .addComponent(tankButton2)
                            .addComponent(warriorButton2)
                            .addComponent(assassinButton2))
                        .addGap(63, 63, 63)
                        .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(characterPanel2Layout.createSequentialGroup()
                                .addComponent(axeButton2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.LEADING, characterPanel2Layout.createSequentialGroup()
                                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(weaponLabel2, GroupLayout.Alignment.LEADING)
                                    .addComponent(daggerButton2, GroupLayout.Alignment.LEADING)
                                    .addComponent(maceButton2, GroupLayout.Alignment.LEADING)
                                    .addComponent(spearButton2, GroupLayout.Alignment.LEADING)
                                    .addComponent(swordButton2, GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(characterPanel2Layout.createSequentialGroup()
                        .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(characterPanel2Layout.createSequentialGroup()
                                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel2)
                                    .addComponent(levelLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(levelTextField2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(characterPanel2Layout.createSequentialGroup()
                                .addComponent(confirmButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton2)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        characterPanel2Layout.setVerticalGroup(
            characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(characterPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel2)
                    .addComponent(nameTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel2)
                    .addComponent(levelTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(classLabel2)
                    .addComponent(weaponLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(assassinButton2)
                    .addComponent(axeButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(berserkerButton2)
                    .addComponent(daggerButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(marksmanButton2)
                    .addComponent(maceButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tankButton2)
                    .addComponent(spearButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(warriorButton2)
                    .addComponent(swordButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(characterPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton2)
                    .addComponent(confirmButton2))
                .addContainerGap())
        );

        battleResults.setEditable(false);
        battleResults.setColumns(20);
        battleResults.setFont(new java.awt.Font("Tahoma", 0, 12));
        battleResults.setRows(5);
        jScrollPane1.setViewportView(battleResults);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(helpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(duelButton))
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(characterPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(characterPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(characterPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(characterPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(helpButton)
                    .addComponent(duelButton))
                .addContainerGap())
        );

        pack();
    }

    void resetListener1(ActionListener l)
    {
        resetButton1.addActionListener(l);
    }
    
    void confirmListener1(ActionListener l)
    {
        confirmButton1.addActionListener(l);
    }
    
    void resetListener2(ActionListener l)
    {
        resetButton2.addActionListener(l);
    }
    
    void confirmListener2(ActionListener l)
    {
        confirmButton2.addActionListener(l);
    }
    
    void helpListener(ActionListener l)
    {
        helpButton.addActionListener(l);
    }
    
    void duelListener(ActionListener l)
    {
        duelButton.addActionListener(l);
    }
    
    public void setTextArea(String results)
    {
        battleResults.setText(results);
    }
    
    public String getPlayerName1()
    {
        return nameTextField1.getText();
    }
    
    public String getPlayerName2()
    {
        return nameTextField2.getText();
    }
    
    public String getPlayerLevel1()
    {
        return levelTextField1.getText();
    }
    
    public String getPlayerLevel2()
    {
        return levelTextField2.getText();
    }
    
    public String getPlayerClass1()
    {
        String playerClass = "";
        
        if (assassinButton1.isSelected())
        {
            playerClass = assassinButton1.getText();
        }
        else if (berserkerButton1.isSelected())
        {
            playerClass = berserkerButton1.getText();
        }
        else if (marksmanButton1.isSelected())
        {
            playerClass = marksmanButton1.getText();
        }
        else if (tankButton1.isSelected())
        {
            playerClass = tankButton1.getText();
        }
        else if (warriorButton1.isSelected())
        {
            playerClass = warriorButton1.getText();
        }
        
        return playerClass;
    }
    
    public String getPlayerClass2()
    {
        String playerClass = "";
        
        if (assassinButton2.isSelected())
        {
            playerClass = assassinButton2.getText();
        }
        else if (berserkerButton2.isSelected())
        {
            playerClass = berserkerButton2.getText();
        }
        else if (marksmanButton2.isSelected())
        {
            playerClass = marksmanButton2.getText();
        }
        else if (tankButton2.isSelected())
        {
            playerClass = tankButton2.getText();
        }
        else if (warriorButton2.isSelected())
        {
            playerClass = warriorButton2.getText();
        }
        
        return playerClass;
    }
    
    public String getWeapon1()
    {
        String weapon = "";
        
        if (axeButton1.isSelected())
        {
            weapon = axeButton1.getText();
        }
        else if (daggerButton1.isSelected())
        {
            weapon = daggerButton1.getText();
        }
        else if (maceButton1.isSelected())
        {
            weapon = maceButton1.getText();
        }
        else if (spearButton1.isSelected())
        {
            weapon = spearButton1.getText();
        }
        else if (swordButton1.isSelected())
        {
            weapon = swordButton1.getText();
        }
        
        return weapon;
    }
    
    public String getWeapon2()
    {
        String weapon = "";
        
        if (axeButton2.isSelected())
        {
            weapon = axeButton2.getText();
        }
        else if (daggerButton2.isSelected())
        {
            weapon = daggerButton2.getText();
        }
        else if (maceButton2.isSelected())
        {
            weapon = maceButton2.getText();
        }
        else if (spearButton2.isSelected())
        {
            weapon = spearButton2.getText();
        }
        else if (swordButton2.isSelected())
        {
            weapon = swordButton2.getText();
        }
        
        return weapon;
    }
    
    public void resetPlayer1()
    {
        nameTextField1.setText("");
        levelTextField1.setText("");
        classGroup1.clearSelection();
        weaponGroup1.clearSelection();
    }
    
    public void resetPlayer2()
    {
        nameTextField2.setText("");
        levelTextField2.setText("");
        classGroup2.clearSelection();
        weaponGroup2.clearSelection();
    }
}
