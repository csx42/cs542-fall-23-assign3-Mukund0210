package courseSequencer.util;

import java.util.Arrays;
import java.util.HashSet;

public class GroupIdentifier {
    
    HashSet<String> g1 = new HashSet<>(Arrays.asList("A","B","C","D"));

    HashSet<String> g2 = new HashSet<>(Arrays.asList("E","F","G","H"));
    
    HashSet<String> g3 = new HashSet<>(Arrays.asList("I","J","K","L"));

    HashSet<String> g4 = new HashSet<>(Arrays.asList("M", "N", "O", "P"));

    HashSet<String> g5 = new HashSet<>(Arrays.asList("Q","R", "S", "T", "W"));


    public String findGroup(String course){
        if(g1.contains(course)) return "Group 1";

        else if(g2.contains(course)) return "Group 2";

        else if(g3.contains(course)) return "Group 3";

        else if(g4.contains(course)) return "Group 4";

        return "Group 5";
    }


    
}
