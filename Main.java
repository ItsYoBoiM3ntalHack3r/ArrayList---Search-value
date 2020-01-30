//Take 10 integer inputs from a user and store them in an ArrayList. Again ask the user to give a number. Now, tell the user whether that number is present in the array or not.
import java.util.*;
class Main {
    public static void main(String[] args) {
    //creates array list
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int x = 0; x<10; x++){
    System.out.println("Input an integer");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    //Adds the input in the array list
    nums.add(num);
    }
    //Asks user for a number and says whether it is in the Arraylist or not
    System.out.println("Input a integer to determine if it is in the Arraylist");
    Scanner input2 = new Scanner(System.in);
    int search = input2.nextInt();
    int count = 0;
    for(int y: nums){// for each loop
      if(nums.get(y)==search){
        count++;
      }
    }
    if(count!=0){
      System.out.println(search+" is in the array list");
    }else{
      System.out.println("It is not in the array");
    }
}
}