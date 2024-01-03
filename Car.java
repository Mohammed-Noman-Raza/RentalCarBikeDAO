package RentalCarBikeDAO;

class Car {
	 private String cname, cnoplate, uniqueIdC;
	 private int cmodel, cprice;
	 Car(String a, String b, int c, int d, String e) {
	 cname = a;
	 cnoplate = b;
	 cmodel = c;
	 cprice = d;
	 uniqueIdC = e;
	 }
	 String sendCname() {
	 return cname;
	 }
	 String sendCNoplate() {
	 return cnoplate;
	 }
	 int sendCModel() {
	 return cmodel;
	 }
	 int sendCPrice() {
	 return cprice;
	 }
	 String senduniqueIdC() {
	 return uniqueIdC;
	 }
	}
