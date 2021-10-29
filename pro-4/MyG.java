class MyG {
  public static void main(String[] args) {
    Pg pg1 = new Pg("Kate", "Jones", 27, 1.6, 50.0);
    pg1.printData();
    Pg pg2 = new Pg("John", "Christopher", "Smith", 65, 1.75, 80.0);
    pg2.printData();
    
    System.out.println("----------------------");
    // person2に対して、getMiddleNameメソッドを呼び出し、「person2のミドルネームは◯◯です」と出力してください
    System.out.println("pg2のミドルネームは" + pg2.getMiddleName() + "です");
  }
}
