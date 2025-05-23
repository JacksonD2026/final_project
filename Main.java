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
                        command = scan.next();

                        if(command.equals("run")) {
                           System.out.println("\n You try to run and get burnt to a crisp. \n\n\nBARABEQUE ENDING");
                        }

                        if(command.equals("fight")) {
                           System.out.println("You have two weapons...why are you just fighting..? You run at the dragon and jump for a sueprman punch; their tail nails you and you flatten to the floor, dead. \n\n\n WHACK-A-MOLE ENDING" );
                        }

                        if(command.equals("spear")) {
                           System.out.println("You charge at the dragon with your spear. You dodge it's flame and jump into the air, do you throw the spear at its eye or slam it down?(throw/slam) \n");
                           command = scan.next();

                           if(command.equals("throw")){
                              System.out.println("You throw the spear, nailing the dragon in the eye. Although it worked and impaired the dragon, you now don't have a spear. You open your potion, and the orc appears. You both charge the dragon, and the dragon attacks you, because his shot out eye cant see the green jugguarnat. As the tooth of the dragon sinks into you, the dragons head explodes from the orcs overwhelming force. The orc says you did good as your eyes finally close. \n\n\n SACRIFICE ENDING ");
                           }

                           if(command.equals("slam")) {
                              System.out.println("You slam down your spear into the dragon, twisting it and pushing it farther down to ensure it's demise. You get back down, take your loot. And continue back to the village, allowing for their wealth. You end up making inflation outrageous and messing up the economy, messing up the poor and helping the rich. But the orc is still happy for you slaying the best. \n\n\n INFLATION ENDING");
                           }
                        }

                        if(command.equals("potion")) {

                        }





                        
                     }
                     
                  }

                  }




            }


            else {
               System.out.print("\n\n Learn to spell and restart, thanks.");
            }
   }
}
