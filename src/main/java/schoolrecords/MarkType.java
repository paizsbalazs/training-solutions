package schoolrecords;

public enum MarkType {

  A(5, "excellent"),
  B(4, "Excellent"),
  C(3, "Excellent"),
  D(2, "Excellent"),
  E(1, "Excellent"),
  F(0, "Excellent");

    private int value;
    private String description;


  MarkType(int value, String description) {
    this.value = value;
    this.description = description;
  }

  public int getValue() {
    return value;
  }

  public String getDescription() {
    return description;
  }
}
