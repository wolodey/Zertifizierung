package OCP_SE8_1ZO_809_Tests.Java_Class_Design.B_AdvancedClassDesign_02.v8_2_1726;

public class Onion {
  private String data = "skin";

  private class Layer extends Onion {
    String data = "thegoodpart";
    public String getData(){
      return data;
    }
  }

  public String getData() {
    return new Layer().getData();
  }

  public static void main(String[] args) {
    Onion o = new Onion();
    System.out.println(o.getData());
  }
}
