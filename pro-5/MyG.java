import java.util.Scanner;

class MyG {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bg bg = new Bg("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bg.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int bgDistance = scanner.nextInt();
    bg.run(bgDistance);
    
    System.out.println("=================");
    Cg cg = new Cg("フェラーリ", "赤");
    System.out.println("【車の情報】");
    cg.printData();
    
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int cgDistance = scanner.nextInt();
    cg.run(cgDistance);
  }
}