class MyH {
  public static void main(String[] args) {
    Ph ph1 = new Ph("Kate", "Jones", 27, 1.6, 50.0);
    ph1.printData();
    Ph ph2 = new Ph("John", "Christopher", "Smith", 65, 1.75, 80.0);
    ph2.printData();
    
    System.out.println("----------------------");
    ph1.setMiddleName("Claire");
    
    System.out.println("ミドルネームを" + ph1.getMiddleName() + "に変更しました");
      ph1.printData();
  }
}