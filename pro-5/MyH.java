import java.util.Scanner;

class MyH {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bh bh = new Bh("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bh.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int bhDistance = scanner.nextInt();
    bh.run(bhDistance);
    
    System.out.println("=================");
    Ch ch = new Ch("フェラーリ", "赤");
    System.out.println("【車の情報】");
    ch.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int chDistance = scanner.nextInt();
    ch.run(chDistance);
    
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int litre = scanner.nextInt();
    ch.charge(litre);
  }
}