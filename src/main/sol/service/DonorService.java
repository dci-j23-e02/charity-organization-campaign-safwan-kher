package sol.service;

import java.util.HashMap;
import java.util.Map;
import sol.model.Donor;

public class DonorService {

// instance Attribute : database is required
private Map<Integer, Donor> donors = new HashMap<>();

  public Map<Integer, Donor> getDonors() {
    return donors;
  }

  public void setDonors(Donor donor) {
    this.donors.put(donor.getId(),  donor);
  }

  // methods to update Donor details (name, contactNumber or emailAddress)
public void updateDonorContactNumber(Integer id, String contactNumber){
  this.donors.get(id).setContactNumber(contactNumber);
  System.out.println("Donor's ContactNumber updated successfully.");
}

public void updateDonorEmailAddress(Integer id, String emailAddress){
    this.donors.get(id).setEmailAddress(emailAddress);
  System.out.println("Donor's EmailAddress updated successfully.");
  }


public void updateDonorName(Integer id, String name){
    this.donors.get(id).setName(name);
  System.out.println("Donor's Name updated successfully.");
  }
}
