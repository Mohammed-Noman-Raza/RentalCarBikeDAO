package RentalCarBikeDAO;

class Customer {
	 private String cname, pan_card, pass;
	 private long ph_number;
	 public Customer(String a, String b, long c, String d) {
	 cname = a;
	 pan_card = b;
	 ph_number = c;
	 pass = d;
	 }
	 public String sendCustName() {
	 return cname;
	 }
	 public String sendCustPan() {
	 return pan_card;
	 }
	 public long sendCustPhone() {
	 return ph_number;
	 }
	 public String sendCustPass() {
	 return pass;
	 }
	}