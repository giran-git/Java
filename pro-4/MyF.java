class MyF {
  public static void main(String[] args) {
    Pf pf1 = new Pf("Kate", "Jones", 27, 1.6, 50.0);
    pf1.printData();
    Pf pf2 = new Pf("John", "Christopher", "Smith", 65, 1.75, 80.0);
    pf2.printData();
    Pf.printCount();
  }
}
