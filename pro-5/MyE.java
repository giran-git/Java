import java.util.Scanner;
class MyE {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Be be = new Be("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    be.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int beDistance = scanner.nextInt();
    be.run(beDistance);
  }
}