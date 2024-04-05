import java.util.*;
class Main {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    while(true){
      System.out.println("Would you like a quote from:");
      System.out.println("1 - Corpse Bride");//ruby
      System.out.println("2 - Coraline");
      System.out.println("3 - Beetle Juice");
      int movie = input.nextInt();
      switch(movie){
        case 1:
          howl();
          break;
        case 2:
          chihiro();
          break;
        case 3:
          totoro();
          break;
        default:
          System.out.println("That isn't a valid response. Try again.");
          input.next();
      }
    }
  }
  public static void howl(){
    System.out.println("If I touch a burning candle, I can feel no pain. In the ice or in the sun, it's all the same.");
    input.nextLine();
    input.nextLine();
  }
  public static void chihiro(){
    System.out.println("Being brave doesn't mean you aren't scared,");
    System.out.println("being brave means you are scared, really scared, badly scared, and you do the right thing anyway.");
    input.nextLine();
    input.nextLine();
  }
  public static void totoro(){
    System.out.println("If you act now, you get a free demon possession with every exorcism.");
    input.nextLine();
    input.nextLine();
  }}
          
          
