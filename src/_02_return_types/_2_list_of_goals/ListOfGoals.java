package _02_return_types._2_list_of_goals;



import javax.swing.JOptionPane;

public class ListOfGoals {
	static String listOfGoals ="";
	static int numberOfGoals = 0;
	
	public static void main(String[] args) {
		//1. Call the appropriate method to make your list of goals
		createListOfGoals();
		//2. Call the appropriate method to get your list of goals, 
		//   so you can use a pop-up to display them
		String listOfGoals2 = getListOfGoals();
		JOptionPane.showMessageDialog(null, listOfGoals2);
		//3. Call the appropriate method to get the number of goals you entered,
		//   and using a pop-up display the number of goals
		int getnumberGoals2 = getNumberOfGoals();
		JOptionPane.showConfirmDialog(null, getnumberGoals2);
		//4. Call the appropriate method to see if you put a lot of goals,
		//   if you did put a lot of goals use a pop-up to say "Wow that's a lot of goals! Awesome!"
		boolean isManyGoals2 = isManyGoals();
		if(isManyGoals2 == true) {
			JOptionPane.showMessageDialog(null, "Wow thats a lot of goals! Awesome!  bn ");
		}
	}
	
	static void createListOfGoals() {
		String input = "";
		while(true) {
			input = JOptionPane.showInputDialog("Enter a goal you have\n(Or X to stop entering goals)");
			if( input.equalsIgnoreCase("X") ) {
				break;
			}
			listOfGoals += input+ "\n";
			numberOfGoals++;
		}
	}
	
	static String getListOfGoals() {
		return listOfGoals;
	}
	
	static int getNumberOfGoals() {
		return numberOfGoals;
	}
	
	static boolean isManyGoals() {
		if( getNumberOfGoals() > 5) {
			return true;
		}
		return false;  
	}
	
}
