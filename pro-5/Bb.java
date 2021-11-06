class Bb {
  private String name;
  private String color;
  
  Bb(String name, String color) {
    this.name = name;
    this.color = color;
  }
  
 public void printData() {
  System.out.print("名前：" + this.name);
  System.out.print("色：" + this.color);
 }
}