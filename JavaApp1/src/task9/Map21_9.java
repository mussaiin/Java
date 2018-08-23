package task9;
import java.util.*;
/**
 *
 * @author Nurlybek
 */
public class Map21_9 {
    public static void main(String[] args) {	
	Scanner input = new Scanner(System.in);
	Map<String, String> map = getData();
	System.out.print("Enter a state: ");
	String state = input.nextLine();
	if (map.get(state) != null) {
            System.out.println("The capital of " + state + " is " + map.get(state));
	}
    }

    public static Map<String, String> getData() {
	Map<String, String> map = new HashMap<>();
	String[][] data = {
			{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"}};
		for (int i = 0; i < data.length; i++) {
			map.put(data[i][0], data[i][1]);
		}
		return map;
	}
}
