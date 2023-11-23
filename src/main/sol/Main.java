package sol;

import sol.model.Donor;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // HashMap to store the details of the donors
    // with the donor's ID as the key and the donor object as the value.
    HashMap<Integer, Donor> donors = new HashMap<>();
    Donor d1 = new Donor("John Doe", "1234567890", "johndoe@gmail.com");
    donors.put(d1.getId(), d1);
    System.out.println(donors);

  }
}
