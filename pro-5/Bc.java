class Bc {
  private String name;
  private String color;
  private int distance = 0;

  Bc(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
}