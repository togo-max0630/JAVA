public class Switch01 {
  public static void main(String[] args) {
    int val = 2;
    // switch文:分岐処理の開始
    switch (val) {
    // case:値が3の場合にブロック処理を実行
    case 3:
      System.out.println("よくできました!");
      // break:switc文を終了する
      break;
    case 2:
      System.out.println("ふつうでした!");
      break;
    default:
      System.out.println("がんばろう!");
      }
  }
}

//if文バージョン
//public class Switch02 {
//    public static void main(String[] args) {
//        int val = 2;
//        if (val == 3) {
//            System.out.println("よくできました！");
//        } else if (val == 2) {
//            System.out.println("ふつうでした！");
//        } else {
//            System.out.println("がんばろう！");
//        }
//    }
//}