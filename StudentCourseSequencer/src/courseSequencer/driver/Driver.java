package courseSequencer.driver;

public class Driver{

    static StateSwitch states = new StateSwitch();
    public static void main(String[] args) {

        if (args.length != 3 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}

        states.methodCall(args[0], args[1], args[2]);


    }

    public String toString(){ return "";}
}