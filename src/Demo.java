import java.util.Scanner;

public class Demo {

  public static void main(String[] args){
    Bakery bakery = new Bakery();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many customers are being served?");
    int customers = scanner.nextInt();
    for(int i = 0; i < customers; i++){
      //If there is any cake
      if(bakery.hasAnyCake()){
        //If current cake has any slices
        if(bakery.getCake().getSlices() > 0){
          //Sell a slice
          bakery.sellSlice();
        }
        else{
          //else bake a cake and sell a slice
          bakery.bakeCake();
          bakery.sellSlice();
        }
      }
      //If there is not cake
      else{
        //Bake a cake and sell it
        bakery.bakeCake();
        bakery.sellSlice();
      }
    }
    System.out.println("Profits are: " + bakery.getProfits());
  }
}
