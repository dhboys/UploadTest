import org.bmi.service.BMIService;
import org.bmi.ui.BMIUserInterface;

public class Main {

	public static void main(String[] args) {
		BMIService service = new BMIService();
		BMIUserInterface userInterface = new BMIUserInterface(service);
		userInterface.input();
	}
}