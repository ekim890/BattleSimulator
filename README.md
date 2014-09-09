BattleSimulator
===============
*********************************** PLAYER ATTRIBUTES *************************************<br>
HP: Points reduced by successful attacks. Player is defeated when this value reaches 0.<br>
Constitution: Reduces damage done by attacks.<br>
Evasion: Increases the chance to evade an attack.<br>
Hit: Increases the chance to hit an attack.<br>
Luck: Determines the chance to score a critical hit.<br>
Speed: Determines the number and order of attacks in a battle.<br>
Strength: Increases damage dealt by attacks.<br>
<br>
*********************************** BASE CLASS ATTRIBUTES *******************************<br>
Assassin: 250 HP  |  5 CON  |  30 EVD  |  25 HIT  |  25 LUK  |  25 SPD  |  10 STR<br>
Berserker: 250 HP  |  5 CON  |  5 EVD  |  10 HIT  |  10 LUK  |  10 SPD  |  40 STR<br>
Marksman: 250 HP  |  5 CON  |  15 EVD  |  30 HIT  |  30 LUK  |  15 SPD  |  15 STR<br>
Tank: 400 HP  |  35 CON  |  35 EVD  |  10 HIT  |  10 LUK  |  10 SPD  |  10 STR<br>
Warrior: 300 HP  |  15 CON  |  15 EVD  |  20 HIT  |  20 LUK  |  20 SPD  |  20 STR<br>
<br>
*********************************** BASE WEAPON TYPES ***********************************<br>
Axe: +5 CON  |  +5 EVD  |  +5 HIT  |  +5 LUK  |  +5 SPD  |  +25 STR<br>
Dagger: +5 CON  |  +15 EVD  |  +15 HIT  |  +15 LUK  |  +15 SPD  |  +5 STR<br>
Mace: +10 CON  |  +5 EVD  |  +5 HIT  |  +25 LUK  |  +5 SPD  |  +10 STR<br>
Spear: +10 CON  |  +5 EVD  |  +10 HIT  |  +10 LUK  |  +5 SPD  |  +15 STR<br>
Sword: +10 CON  |  +10 EVD  |  +10 HIT  |  +10 LUK  |  +10 SPD  |  +10 STR<br>
<br>
*********************************** HOW THE SIMULATOR WORKS ***********************************<br>
1a. Damage Done = Attacker's Strength - Defender's Constitution.<br>
1b. If defender's constitution > attacker's strength then attacker inflicts 1 damage.<br>
<br>
2a. A player with a speed advantage of 3 or greater attacks 3 times. Opponent counterattacks 2 times.<br>
2b. If the speed difference between both players is between 2 and -2 then both get 2 attacks.<br>
2c. A player with a speed disadvantage of 3 or greater attacks 2 times. Opponent counterattacks 3 times.<br>
<br>
3a. A player's attack cannot be evaded if their hit is higher than or equal to the defender's evasion.<br>
3b. If a player's hit is less than the opponent's evasion then dodge chance is calculated.<br>
3c. Dodge Chance = (Defender's Evasion - Attacker's Hit) * 2.<br>
<br>
4a. A player's attack cannot crit if their luck is less than or equal to the opponent's luck.<br>
4b. Critical Strikes are possible for the player with higher luck.<br>
4c. Crit Chance = (Attacker's Luck - Defender's Luck) * 2.
