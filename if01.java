public class If01 {
  public static void main(String[] args) {
    int number = 7;
    // if文:
    // numberが5未満の場合、ブロックの処理を実行
    if (number < 5) {
      // ブロック:「◯ は5未満です」を出力
      System.out.println(number + "は5未満です");
    }
    if (number < 10) {
    // if文:
    // numberが10未満の場合、ブロックの処理を実行
      System.out.println(number + "は10未満です");
      // ブロック:「◯ は10未満です」を出力
    }
    if (number < 15) {
    // if文:
    // numberが15未満の場合、ブロックの処理を実行
      System.out.println(number + "は15未満です");
      // ブロック:「◯ は15未満です」を出力
    }
  }
}