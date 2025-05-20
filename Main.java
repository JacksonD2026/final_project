import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      Scanner scan = new Scanner(System.in);



      System.out.println("Welcome to my game, type start to start");
         String command = scan.next();

            if(command.equals("start")) {
               
                  System.out.println("\nYou wake up in a cave. You don't remember how you got there nor how to get out. There's a light but you're unsure if it brings you somewhere safe or more dangerous. (continue) ");
                  command = scan.next();
                  


                  if(command.equals("continue")) {
                     System.out.print("\nYou wander into the darkness, unknowing of what will come ahead. You see an orc ahead, but he looks rather friendly. Do you try to kill him or befriend him? (kill,befriend)");
                     command = scan.next();

                     if(command.equals("kill")) {
                        System.out.println("\nHe tries to hug you as you sink a sharp rock into him. He proceeds to smile and rip you to shreds. Lol game over \n\n\n ORC ENDING");
                     }

                     if(command.equals("befriend")) {
                        System.out.println(" \nYou walk up to him for a hug. He looks at you angrily then turns into a grin and hugs you back. Although your back hurts from his brute strength, you appreciate it. He tells you his names Bernard he's a merchant and gives you a potion with a green ooze leaking from it, he tells you open it when it's most needed. You leave the cave with directions he gave you, and continue into the world. You see a nearby village in need of assistance due to pillagers. Do you help? (yes/no)");
                        command = scan.next();

                        if(command.equals("no")) {
                           System.out.println("\nYou turn to run away from the fight, but the orc is staring at you. You turn and feel a need to fight, you know the orc will not reward for cowardness. Say yes.");
                           command = scan.next();
                        }

                     if(command.equals("yes")) {
                        System.out.println("\nYou run in to help and engage in combat with the dragon, you soon realize how overwhelmed you are in this fight. You can either use the potion or go for one last fight. (potion/fight)");
                        command = scan.next();
                     }
                     if(command.equals("potion")) {
                        System.out.println("\nThe orc appears in front of you, but says you've wasted his strength. He kill the dragon then turns into green smoke. Move on? (move on)");
                        command = scan.next();
                     }
                     
                     if(command.equals("fight")) {
                        System.out.println("\nYou dive at the dragon when a spear flies over your head. It nails the dragon in the head, and you turn around to see a pillager with spears aligned on his back. You thank him for the help, and he gives you one of his spears. You take the spear and thank him. Continue? (continue)");
                        command = scan.next();
                     }

                     if(command.equals("continue")) {
                     System.out.println("\nYou follow the dragons trail back to his (or her, you can't tell, its a dragon) lair and begin to explore. Atop a massive mountain of gold their lies a flame. you've heard about the everlastnig flame; and you've finally seen it. Do you touch it? (yes/no)");
                     command = scan.next();
                     }

                     if(command.equals("yes")) {
                        System.out.println("\nYou grab the flame and become embelished with pain. Your skin being to burn and you can't feel anything. You reach for the potion to summon the orc and bring him to your location. After the pain begins to die down you ask how you look...he says beautiful \n\n\n FLAME LORD ENDING");
                     }

                     if(command.equals("no")) {
                        System.out.println("\nYou hear a step behind you and see an elder dragon appear in front of you. You have your spear and potion, or you can fight and run. What do you choose? (spear,potion,fight,run)");
                     }
                     
                  }

                  }




            }


            else {
               System.out.print("\n\n Learn to spell and restart, thanks.");
            }
   }
}
