package my.BattleSimulator;

// Developed By: Edwin Kim

// Test the battle simulator without using the GUI. Results are printed in console.
public class BattleSimTester 
{
    public static void main(String[] args)
    {
        BattleSimModel model = new BattleSimModel();
        
        model.createPlayer1("Player 1", 100, "Assassin", "Dagger");
        model.createPlayer2("Player 2", 100, "Tank", "Dagger");
        model.simulateBattle();
        System.out.print(model.getBattleResults());
        model.clearBattleResults();
    }
}
