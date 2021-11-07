import java.util.Scanner;

class MyF {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bf bf = new Bf("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bf.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int beDistance = scanner.nextInt();
    bf.run(beDistance);
    
    System.out.println("=================");
    Cf cf = new Cf("フェラーリ", "赤");
    System.out.println("【車の情報】");
    cf.printData();
  }
}