import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      Scanner scan = new Scanner(System.in);



      System.out.println("Welcome to my game, type start to start");
         String command = scan.next();

            if(command.equals("start")) {
               
                  System.out.println("\nYou wake up in a cave. You don't remember how you got there nor how to get out. There's a light but you're unsure if it brings you somewhere safe or more dangerous. Do you contine into the cave or go to the light? (continue/arise) ");
                  command = scan.next();

                  if(command.equals("continue")) {
                     System.out.print("\nYou wander into the darkness, unknowing of what will come ahead. You see an orc ahead, but he looks rather friendly. Do you try to kill him or befriend him? (kill,befriend)");
                     command = scan.next();

                     if(command.equals("kill")) {
                        System.out.println("\nHe tries to hug you as you sink a sharp rock into him. He proceeds to smile and rip you to shreds. Lol game over");
                     }

                     if(command.equals("befriend")) {
                        System.out.println(" \nYou walk up to him for a hug. He looks at you angrily then turns into a grin and hugs you back. Although your back hurts from his brute strength, you appreciate it. He tells you his names Bernard he's a merchant and gives you a potion with a green ooze leaking from it, he tells you open it when it's most needed. You leave the cave with directions he gave you, and continue into the world. You see a nearby village in need of assistance due to pillagers. Do you help? (yes/no)");
                     }

                  }




            }


            else {
               System.out.print("Learn to spell and restart, thanks.");
            }
   }
}
