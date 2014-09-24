package my.BattleSimulator;

// Developed By: Edwin Kim

public class BattleSimulator 
{
	public static void main(String[] args)
	{
		BattleSimModel model = new BattleSimModel();
		BattleSimView view = new BattleSimView();
		BattleSimController controller = new BattleSimController(model, view);
		view.setVisible(true);
	}
}