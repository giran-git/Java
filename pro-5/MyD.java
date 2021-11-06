class MyD {
  public static void main(String[] args) {
    Bd bd = new Bd("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bd.printData();
    System.out.println("-----------------");
    bd.run(10);
  }
}