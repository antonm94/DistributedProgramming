package util;

public class Int {
  public int inner;

  public Int(int i) {
    inner = i;
  }

  public static Int valueOf(int i) {
    return new Int(i);
  }
}
