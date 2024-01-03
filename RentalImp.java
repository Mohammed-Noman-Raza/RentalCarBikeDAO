package RentalCarBikeDAO;

import java.util.*;

class RentalImp implements RentalInterface{
	 List<Car> car = new ArrayList<>();
	 List<Bike> bike = new ArrayList<>();
	 List<Customer> cust = new ArrayList<>();
	 List<Bike> storB = new ArrayList<>();
	 List<Car> storC = new ArrayList<>();
	 public RentalImp() {
	 bike.add(new Bike("YAMAHA_MT15 ", "KA_41_EN_2996", 2022, 350, "123Asad700"));
	 bike.add(new Bike("KAWASAKI_Z900 ", "KA_24_ER_5922", 2020, 500, "123Asad701"));
	 bike.add(new Bike("HARLEY_DAVIDSON_883", "KA_11_AL_5001", 2021, 400, "123Asad702"));
	 bike.add(new Bike("ROYAL_ENFIELD ", "KA_19_ES_2485", 2016, 300, "123Asad703"));
	 bike.add(new Bike("HUNTER_350 ", "KA_22_LP_5511", 2022, 350, "123Asad704"));
	 bike.add(new Bike("Honda_CB650 ", "KA_32_TK_1963", 2019, 450, "123Asad705"));
	 bike.add(new Bike("Triumph_Trident_660", "KA_12_TC_3317", 2021, 350, "123Asad706"));
	 bike.add(new Bike("Aprilia_RS660 ", "KA_06_AS_0070", 2023, 500, "123Asad707"));
	 bike.add(new Bike("ROYAL_ENFIELD_GT650", "KA_29_AD_1270", 2021, 450, "123Asad708"));
	 bike.add(new Bike("H-D FORTY EIGHT ", "KA_25_KH_7936", 2023, 450, "123Asad709"));
	 car.add(new Car("Audi_R8 ", "KA_04_AS_7 ", 2014, 4500, "007ASAD200"));
	 car.add(new Car("Acura_NSX ", "KA_01_CD_9090", 2019, 3800, "007ASAD201"));
	 car.add(new Car("Lamborghini ", "KA_01_BY_1300", 2020, 4000, "007ASAD202"));
	 car.add(new Car("Zenvo_ST1 ", "KA_50_AL_007 ", 2021, 4500, "007ASAD203"));
	 car.add(new Car("Pagani_Huayra ", "KA_32_AD_4000", 2022, 4000, "007ASAD204"));
	 car.add(new Car("McLaren_P1 ", "KA_03_TK_1001", 2020, 3500, "007ASAD205"));
	 car.add(new Car("Bugatti_Veyro ", "KA_10_LP_4090", 2021, 3900, "007ASAD206"));
	 car.add(new Car("Ferrari_Enz ", "KA_03_CK_2244", 2023, 4900, "007ASAD207"));
	 car.add(new Car("Aston_Martin ", "KA_05_QT_1432", 2018, 3600, "007ASAD208"));
	 car.add(new Car("Porsche_911 ", "KA_29_WW_9009", 2019, 3200, "007ASAD209"));
	 cust.add(new Customer("Asad", "LATPK4351G", 6309667257l, "Asad@007"));
	 cust.add(new Customer("Ikram", "KASTL2976F", 7661046835l, "Ikram1212"));
	 cust.add(new Customer("Saleem", "KSBLW4312Z", 7760595290l, "Saleem#123"));
	 }
	 public void addBike(boolean a, String b) {
	 if (a == true) {
	 System.out.println("-------------***************----------------");
	 for (int i = 0; i < storB.size(); i++) {
	 if (storB.get(i).senduniqueId().equals(b)) {
	 System.out.println("Bike recived successfully ");
	 bike.add(storB.get(i));
	 storB.remove(i);
	 }
	 }
	 }
	 else if(a==false){
	 System.out.println("invalid username (or) password (or) unique id");
	 }
	 }
	 public void addCar(boolean a, String b) {
	 if (a == true) {
	 for (int i = 0; i < storC.size(); i++) {
	 if (storC.get(i).senduniqueIdC().equals(b)) {
	 System.out.println("Car recived successfully ");
	 car.add(storC.get(i));
	 storC.remove(i);
	 }
	 }
	 }
	 else if(a==false){
	 System.out.println("invalid username (or) password (or) unique id");
	 }
	 }
	 public void carMenu() {
	 int s = 1;
	 System.out.println( " CAR NAME PLATE NO MODEL PER DAY PRICE Unique Id\n----------------------------------------------------------------");
	 for (int i = 0; i < car.size(); i++) {
	 System.out.print(s + ".");
	 System.out.printf("%-15s%13s", car.get(i).sendCname(),
	 car.get(i).sendCNoplate() + " " + car.get(i).sendCModel() + " " + car.get(i).sendCPrice()
	 + " " + car.get(i).senduniqueIdC());
	 System.out.println();
	 s++;
	 }
	 System.out.println("----------------------------------------------------------------");
	 }
	 public void bikeMenu() {
	 int s = 1;
	 System.out.println(" BIKE NAME PLATE NO MODEL PER DAY PRICE Unique Id\n----------------------------------------------------------------");
	 for (int i = 0; i < bike.size(); i++) {
	 System.out.print(s + ".");
	 System.out.printf("%-25s%13s", bike.get(i).sendBname(), bike.get(i).sendBNoplate() + " "
	 + bike.get(i).sendBModel() + " " + bike.get(i).sendBPrice() + " "
	 + bike.get(i).senduniqueId());
	 System.out.println();
	 s++;
	 }
	 System.out.println("----------------------------------------------------------------");
	 }
	 public void addCustDetails(String a, String b, long c, String d) {
	 cust.add(new Customer(a, b, c, d));
	 }
	 public void showCustomer() {
	 for (int i = 0; i < cust.size(); i++) {
	 System.out.println(cust.get(i).sendCustName() + " " + cust.get(i).sendCustPan() + " "
	 + cust.get(i).sendCustPhone());
	 }
	 }
	 public boolean checkCustomer(String a, String b) {
	 boolean k = false;
	 for (int i = 0; i < cust.size(); i++) {
	 if (cust.get(i).sendCustName().equals(a) && cust.get(i).sendCustPass().equals(b)) {
	 k = true;
	 }
	 }
	 return k;
	 }
	 public void pickBike(int a, int b) {
	 storB.add(bike.get(a - 1));
	 int total = b * bike.get(a - 1).sendBPrice();
	 System.out.println("total amount : " + total);
	 float gst = total * 0.10f;
	 System.out.println("10% GST : " + gst);
	 float totgst = total + gst;
	 System.out.println("total + gst : " + totgst + "\n---------------------------------------------");
	 int totals = (int) totgst;
	 System.out.println( "your total amount with gst in Rupees:" + totals + "\n---------------------------------------------");
	 bike.remove(a - 1);
	 System.out.println("Bike delivered successfully");
	 }
	 public void pickCar(int a, int b) {
	 storC.add(car.get(a - 1));
	 int total = b * car.get(a - 1).sendCPrice();
	 System.out.println("total amount : " + total);
	 float gst = total * 0.10f;
	 System.out.println("10% GST : " + gst);
	 float totgst = total + gst;
	 System.out.println("total + gst : " + totgst + "\n---------------------------------------------");
	 int totals = (int) totgst;
	 System.out.println(
	 "your total amount with gst in Rupees:" + totals + "\n---------------------------------------------");
	 car.remove(a - 1);
	 System.out.println("Car delivered successfully");
	 }
	 public boolean bikeReturn(String a, String b, String c) {
	 boolean k = false;
	 for (int i = 0; i < cust.size(); i++) {
	 if (cust.get(i).sendCustName().equals(a) && cust.get(i).sendCustPass().equals(b)) {
	 for (int j = 0; j < storB.size(); j++) {
	 if (storB.get(j).senduniqueId().equals(c)) {
	 k = true;
	 break;
	 }
	 }
	 }
	 }
	 return k;
	 }
	 public boolean carReturn(String a, String b, String c) {
	 boolean k = false;
	 for (int i = 0; i < cust.size(); i++) {
	 if (cust.get(i).sendCustName().equals(a) && cust.get(i).sendCustPass().equals(b)) {
	 for (int j = 0; j < storC.size(); j++) {
	 if (storC.get(j).senduniqueIdC().equals(c)) {
	 k = true;
	 break;
	 }
	 }
	 }
	 }
	 return k;
	 }
}