import java.util.Stack;

public class Bakery {

  private int profits;

  Stack<Cake> products;

  public Bakery(){
    profits = 0;
    products = new Stack<>();
  }

  public boolean hasAnyCake(){
    return products.size() > 0;
  }

  public Cake getCake(){
    return products.peek();
  }

  public void bakeCake(){
    profits -= 3;
    products.push(new ChocolateCake());
  }

  public void sellSlice(){
    profits += 5;
  }

  public int getProfits(){
    return profits;
  }

}
