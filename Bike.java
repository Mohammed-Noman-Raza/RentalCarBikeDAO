package RentalCarBikeDAO;

class Bike {
	 private String bname, bnoplate, uniqueId;
	 private int bmodel, bprice;
	 Bike(String a, String b, int c, int d, String e) {
	 bname = a;
	 bnoplate = b;
	 bmodel = c;
	 bprice = d;
	 uniqueId = e;
	 }
	 String sendBname() {
	 return bname;
	 }
	 String sendBNoplate() {
	 return bnoplate;
	 }
	 int sendBModel() {
	 return bmodel;
	 }
	 int sendBPrice() {
	 return bprice;
	 }
	 String senduniqueId() {
	 return uniqueId;
	 }
	}
