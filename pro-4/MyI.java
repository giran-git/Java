class MyI {
  public static void main(String[] args) {
    // 仕事を「医者」にしてください
    Pi pi1 = new Pi("Kate", "Jones", 27, 1.6, 50.0, "医者");
    pi1.printData();
    // 仕事を「教師」にしてください
    Pi pi2 = new Pi("John", "Christopher", "Smith", 65, 1.75, 80.0, "教師");
    pi2.printData();
    
    System.out.println("----------------------");
    // person1の仕事を「獣医」に変更してください
    pi1.setJob("獣医");
    
    // 「person1の仕事を◯◯に変更しました」と出力されるようにしてください
    System.out.println("pi1の仕事を" + pi1.getJob() + "に変更しました");
    
      pi1.printData();
  }
}