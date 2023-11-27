package sol.service;

import java.util.ArrayList;
import java.util.List;
import sol.model.Donation;

public class DonationService {

  // instance attribute: database is required
  private List<Donation> donations = new ArrayList<>();

  public List<Donation> getDonations() {
    return donations;
  }

  public void setDonations(Donation donation) {
    this.donations.add(donation);
  }

  public double calculateTotalFunds(){
    /*
    double totalFunds = 0;
    for (Donation d: donations) {
      totalFunds += d.getAmount();
    }

    return totalFunds;
    */

    double totalFunds = donations.stream().mapToDouble(Donation ::getAmount).sum();
    return  totalFunds;


  }

}
