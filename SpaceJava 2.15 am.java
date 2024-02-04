

import java.util.Scanner;

public class SpaceJava {
   int fourInputs(int var, String opt1, String opt2, String opt3, String opt4) {
      var = 0;
      while (var == 0) {
         Scanner scnr = new Scanner(System.in);
      int userInput = scnr.nextInt();
      if (userInput == 1) {
      System.out.println(opt1);
      var = 1;
      }
      else if (userInput == 2) {
      System.out.println(opt2);
      var = 2;
      }
      else if (userInput == 3) {
      System.out.println(opt3);
      var = 3;
      }
      else if (userInput == 4) {
      System.out.println(opt4);
      var = 4;
      }
      else {
      System.out.println("OOPS... try again");
      }
      }
      return var;
      }

      int threeInputs(int var, String opt1, String opt2, String opt3) {
         var = 0;
         while (var == 0) {
            Scanner scnr = new Scanner(System.in);
         int userInput = scnr.nextInt();
         if (userInput == 1) {
         System.out.println(opt1);
         var = 1;
         }
         else if (userInput == 2) {
         System.out.println(opt2);
         var = 2;
         }
         else if (userInput == 3) {
         System.out.println(opt3);
         var = 3;
         }
         else {
         System.out.println("OOPS... try again");
         }
         }
         return var;
         }
          int twoInputs(int var, String opt1, String opt2) {
              
              var = 0;
              while (var == 0) {
               Scanner scnr = new Scanner(System.in);
               int userInput = scnr.nextInt();
              if (userInput == 1) {
              System.out.println(opt1);
              var = 1;
              }
              else if (userInput == 2) {
              System.out.println(opt2);
              var = 2;
              }
              else {
              System.out.println("OOPS... try again");
              }
              }
              return var;
            }

   public static void main(String[] args) {
      System.out.printf("   Welcome to Planet Old New Kansas, not way out in the Middle of Nowhere, but slightly \nto the left. You don't want to live the life of your parents: they are barley farmers (space \nbarley, to be exact), and they aren't terribly interesting people. Which explains why \nthere's *barley* anything to do around Old New Kansas. Clearly, the only thing to do is \nto get Somewhere besides this heckhole.\n \n");
      System.out.printf("   Of course, the best way to start getting Somewhere is to leave where you previously \nwere: in this case, bed.\n");
      
      
      //define all the strings
      String whichSideBed = ("\nDo you: \n1. Get up on the right side of the bed? (type '1')\nor\n2. Get up on the wrong side of the bed? (type '2')\n");
      System.out.printf(whichSideBed);
      String rightSide = ("\n   Today is a wonderful, magical day! You had a great night's sleep, and you are ready to \nstart the day with vigor and an irritating amount of pep! The galaxy is your oyster! There \nare oysters for breakfast! There are even other options for breakfast besides oysters! \n");
      String wrongSide = ("\n   Today is a terrible, awful day. You had a great night's sleep, which makes you reluctant to \nleave your cozy cocoon to actually start the day. You have no vigor, and certainly no pep. \nThe galaxy is your oyster, but you don't care for seafood all that much. \nUnfortunately, there are oysters for breakfast. And toast. \n");
      String whichFoodRightQ = ("What will you decide?\n1. Oysters\n2. Toast\n3. Oysters on Toast\n");
      String whichFoodWrongQ = ("What will you decide?\n1. Oysters (type '1')\nor\n2. Sad toast (type '2')\nor\n3. Oysters on sad toast (type '3')");
      String goodbye = ("   As you enjoy your breakfast (or suffer through it), you begin to think about not just \nleaving the bed, or even the house, but Old New Kansas itself. You don't want to be\nlike your parents, even if they are out standing in their field. Their field of barley, that is.\n Space barley. Boy, are they really standing there. \n");
      String goodbyeQ = ("How are you going to break their hearts by \nbreaking the news to them?\n1. Lie. Tell your parents that you're going to Tosche station to pick up some power \nconverters, but then actually leave.\nor\n2. Give them a long-winded explanation about the meaning of life, and then have a \ntearful goodbye.\nor\n3. Shake your parent's hands and walk away silently.\nor\n4. Leave a note in invisible ink. Your parents will find it eventually.\n");
      String careerChoice = ("\nPhew! Glad that's over!\n   Now that you're leaving, what are you going to do with the rest of your life? The only\nway to solve the existential crisis you face is to choose one of four options. That's just\nhow it works.\n");
      String careerChoiceQ = ("Which do you choose?\n\n1. Space Cowboy: Herd space manatees! Your neighbor has been wanting to get rid\nof his herd and is willing to give it to you for free. Suspicious, but a deal's a deal.\n The thing is, barley is terrible for space manatees' stomachs. Take them across the\n galaxy to ye olde outskirts, and sing a few campfire songs while you're at it.\n\n2. Food Critic: Find the ultimate Space Food! You have always been excellent at\neating food and destroying people's self-esteem, and you want to make a living\n out of it. There are so many gourmet delicacies out there! Go find the perfect\n dish!\n\n3. Desk Job: Occupy your own cubicle! You certainly never wanted to follow\n your parents career of being a farmer. So, go climb that corporate ladder! Jump\ninto the world of staples and small talk coffee breaks.\n\n4. Revel in your existential crisis for a little longer.\n");
      String whichTown = "\n   YEEEEHAWWWW! Now that you have suspiciously acquired the herd of space manatees, you \ntake the affordable if questionable interplanetary public transit out to the Next Planet Over \n(literally, that's what it's called). It's time to find you a reliable steed. You can't really afford \none. You need a spaceship. Where do you go to find one? You and your parents had barley \nany money. Perhaps a junkyard. Which town do you go to?\n1. Normal City?\nor\n2. Spooky City?";
      String normalCity = "\n   So, you like average things. That's cool. Once you \narrive at Next Planet Over, you take the space bus to Normal \nCity. You walk around and see lots of normal \nlooking houses with normal looking cars.";
      String normalCityQ = "How do you find the junkyard?\n1. Ask that person standing by the stop sign.\nor\n2. Who needs directions? Wander around until you find it.";
      String spookyCity = "So, you like scary things. That's cool. Once you arrive at Next Planet Over, you take the space \nbus to Spooky City. You walk around and see lots of spooky looking houses with spooky \nlooking cars.";
      String stopSign = "\n   His name is Gary, and he is glad to help you out. He says its right over yonder to \nthe left past that gray house. So, you head on over there and arrive at the junkyard. All you see is \npiles of ship for miles and miles.\n";
      String stopSignQ = "Which ship do you want to take?\n1. The blue sharp-looking futuristic ship\nor\n2. The orange retro stylish ship";
      String wanderingJunkyard = "You walk down the street until you hit the end of the road. Honestly do not know why you hit the \npoor end of the road. Anyways, you see several pieces of ship off to the left, and there is the \njunkyard right in front of you.\n";
      String blueShip = "\n   Great choice! Now that you have the ship, climb aboard and check if it works. . .  \nSurprisingly everything works great! However, while you were busy tending to the ship, one of your sea \nmanatees got in a quarrel with a junkyard cat! The manatee is critically injured. \n";
      String blueShipQ = "What do you do with your precious manatee?\n1. Leave him behind and keep him away from \nthe other manatees because he is displaying some questionable symptoms.\nor\n2. Take him to the Big City \nwhere all the best manatee doctors reside.";
      String abandonManatee = "\n   Alright, now you are ready to continue your journey. Wait! First you must decide what kind of music to listen to on the way.";
      String doctorManatee =  abandonManatee;
      String abandonManateeQ = "\nWhat music do you choose?\n1. Country. Duh. You're a cowboy who loves country and western music.\nor\n2. Indie Space Rock.";
      String country = "\n   Alright, now you are ready to go. You load up all the manatees and place the wounded \none in a separate room just in case. Off to the BigCity you go. You fly through the galaxy and arrive \nat the BigCity. Now what?";
      String indieSpaceRock = country;
      String countryAbandoned = "   Alright, now you are ready to go. You load up all the manatees except the one you wanted to \nleave behind. You start the engine. You are about to lift off when you hear a loud noise \noutside.\n";
      String countryDoctored = "   Alright, now you are ready to go. You load up all the manatees and place the wounded \none in a separate room just in case. Off to the BigCity you go. You fly through the galaxy and arrive \nat the BigCity.";
      String countryDoctoredQ = "Now what?\n1. Find the manatee doctor\nor\n2. Walk around a bit";
      String findDoctor = "You ask about and find the doctor. You drop off the sick manatee who is grateful to be in \nhelpful hands. ";
      String findDoctorQ = "What do you want to do while you wait?\n1. Visit a space museum\nor\n2. Visit the space bar";
      String walkAround = "Alright. Now go find the doctor.\n";
      String countryAbandonedQ = "What do you do?\n1. Ignore it and lift off\nor\n2. Open the hatch";
      String ignoreManatee = "   As you ascend, you look down and see a raving manatee foaming at the mouth. He is \nwhimpering. All the other manatees hear their fellow beast and revolt. You are no longer in \ncontrol of the ship. Actually, you are thrown out of the hatch.\n";
      String openHatch = "   Nothing happens. . . for two seconds. The deserted manatee comes barreling and bites you. \nOuch! Sadly, that is the end of your journey.\n";
      String talkSketch = "You waddle on over and ask the gentleman his name. He says that it does not matter. He asks if \nyou want in on a deal.";
      String talkSketchQ = "Do you accept?\n1.Accept\nor\n2.Decline";
      String declineSketch = "Well, that is probably for the best. You pick up your manatee from the doctor. You have a restful \nsleep despite the ever-increasing knowledge of your own mortality. The next morning, you put \non your hat and boots and hop on train 42 with all your manatees.";
      String talkDad = "   He gives you a hug. He is not angry at you for leaving. He says he is so proud of you for \nstepping out into the galaxy. He wants you to come back for the holidays though. You thank \nhim and spend the afternoon talking about your future plans. After a while though, you get a \ncall that your manatee is feeling better and is ready for pick up. You say goodbye to your dad. \nDo you talk to the sketchy guy on the way out?\n1. Talk to him\nor\n2. Walk right on by";
      String acceptSketch = "He hands you a nice silver watch and tells you to board train 42 tomorrow in the late afternoon. \nYou put on the watch and move on. You pick up your manatee from the doctor. You have a \nrestful sleep despite the ever-increasing knowledge of your own mortality. You wake up the \nnext morning and put on your boots and hat. You and your manatees board train 42.";
      String trainRobbery = "Oh no! There is a disruption in the front of the train. A group of robbers burst through \nto your car! ";
      String trainRobberyQ = "What do you do now?\n1.Hold up your hands and tell them to stop right where they are\nor\n2.Immediately think to tell your manatees to get ready for a fight.";
      String spaceMuseum = "   What a nice place. You learn all about the history of the universe which is not a lot really. Near \nthe exit, you spot a sketchy guy, a food critic, and your dad!";
      String spaceMuseumQ = "\nWho do you talk to?\n1. Chat it up with Mr. Sketch\n\n2. Talk to dad";
      String endingJoined = "Not the way to go. They use you as a scapegoat and you are left to pick up the pieces.";
      String foodCriticStart = "\n   You have one dream, one goal, one destiny: to eat everything in the galaxy and get paid for it. \nYour all-encompassing desire for something better than barley drives you to search for the \nUltimate Space Food. Of course, this space food is none other than the precious Astronaut Ice \nCream (specifically Neapolitan flavor). Wars have been fought over just a tiny crumb. Men and \nwomen have hungered in vain for this delicacy. Only the most severe food critics even get a \ntaste of freeze-dried, aluminum-wrapped goodness. Fortunately, you are about to become a \nsevere food critic. All you need to do is criticize enough restaurants to get a reputation!\n";
      String foodCriticStartQ = "Which restaurant do you visit and criticize first?\n1. The Grease Trap, on Plant Oleomargarine\nor\n2. The Cantweena, on Plant Aburridos";
      String greaseTrap = " You take the questionable-but-cheap space bus over to Planet Oleomargarine. It \nsure is slippery down here in the southern part of the galaxy. You feel yourself \ngetting a rootin'-tootin' hankering for something deep fried.";
      String greaseTrapQ = "The air is thick with a haze of sweat - or is that salted butter?\n1. It's sweat\nor\n2. It's salted butter";
      String sweat = "\n   You're a realist. You gag at the salty stench. It's worse than the \nsmell of the space bus you took to get over here.";
      String sweatQ = "Is it really \nworth critiquing this restaurant?\n1. Yes\nor\n2. No";
      String critiqueAnyway = "\n   You shoulder on, hoping that the food is bad. The review you plan to give is scathing.";
      String saltedButter = "\n   You're an optimist. They must be using an unholy amount of butter at this place. You push \nthrough the salty fog, hoping that the food is too buttery to eat. The review you want to give is scathing. \n   As you get a table at the Grease Trap, the owner of the restaurant personally waits on you. Her hair is in \nan extra-shiny, buttery blonde space perm. Her name tag reads Soosan.";
      String saltedButterQ = "She asks what you would like to eat.\n1. The 'Mac-and-Cheese is a Vegetable' Salad\nor\n2. The Crisco Surprise";
      String macAndCheese = "\n   It tasted surprisingly delicious, albeit a little buttery for your taste.";
      String macAndCheeseQ = "Will you write a positive review or a negative one?\n1. Postive\nor\n2. Negative";
      String positiveReview1 = "\n   You were... actually pleased with the food, and the Oleomargarinese \ndrawl is quite charming. You will not stain your conscience by lying in a \nreview, though you may have stained your shirt with grease. You continue to the next \nrestaurant: The Cantweena.";
      String negativeReview1 = "\n   You roast the place hotter than they fry their deep-fat fat. You \nare one step closer to that chocolate, vanilla, and strawberry goodness. Your \nconscience may be stained (with grease), but you continue to the next restaurant: \nThe Cantweena.";
      String criscoSurprise = "\n   It was awful. You write an absolutely scathing review. You roast \nthe place hotter than they fry their deep-fat fat. You are one step closer to \nthat chocolate, vanilla, and strawberry goodness. You continue to the next restaurant: \nThe Cantweena.";
      String doNotCritique = "\n   Unfortunately, without the money you would make by writing your review, \nyou cannot afford the bus fare off of Planet Oleomargarine. You sweat \nhere for the rest of your days.";
      String cantweena = "   You take the questionable-but-cheap space bus over to Planet Aburridos. The air \nsmells hot and spicy in this part of the galaxy. You feel like peppering the \nCantweena with insults. It’s a cantina for tweens, for crying out loud. You are \ngreeted by a *cool teenage hostess*. You roll your eyes.";
      String cantweenaQ = "What do you do?\n1. Approach her about seating\nor\n2. Ignore her and sit down wherever you want.";
      String approachHostess = "   You ask nicely where to sit. She rolls her eyes and motions behind her.";
      String ignoreHostess = "You walk past her and flop down at the nearst table. Another *cool teen* \nasks what you want to eat.";
      String ignoreHostessQ = "What do you choose?\n1. The Mild Taco (for losers)\nor\n2. The Muy Caliente Extra Hot Trendy Taco Supreme (for *cool* people)";
      String spaceBar = "You walk into a cool laidback atmosphere. The Space Bar is a great place to rest your thumbs. It \neven has those classic swinging saloon doors. So cowboy. They also have excellent food \nhere. Near the back, you spot a sketchy guy, a food critic, and your dad!";
      String surrenderRobbers = "The robbers notice the silver watch on your wrist. The sketchy man is among them and beckons \nto you to join them.\n";
      String rejectAttackRobbers = "Your manatees follow your lead and attack as well. You defeat the robbers with praise from all \nfellow passengers. You continue on the train ride with unlimited access to the food car. You \nhear of a lovely town in the outskirts of the galaxy which is a perfect place space cowboys like \nyourself.";
      String rejectAttackRobbersQ = "Do you make it to said lovely town?\n1.No\nor\nYes!";
      String attackRobbers = "They hype themselves up for a fight and you attack. You defeat the robbers with praise from all \nfellow passengers. You continue on the train ride with unlimited access to the food car. You \nhear of a lovely town in the outskirts of the galaxy which is a perfect place space cowboys like \nyourself.";
      String endingTarnation = "Why in tarnation would you pick that! The end...\nor, I guess, one of many possible ends.\n";
      String youLose = "Well, that was a bad choice. Do you want to try again? (START OVER)";
      String surrenderRobbersQ = "What do you do?\n1.Join them obviously, they get money\nor\n2.Reject and attack for the good of fellow train passengers";
      String happyEndingCowboy = "Congratulations! You have won at life. \nYou are the best space cowboy ever!";
      String Drafted = ("\n   You reveled in your existential crisis for too long! The space battalion has come into\ntown and has drafted you into its ranks. Only you and your fellow soldiers can save\nthis great galaxy! Only you can fight insurgents and alien invaders! Only you can\nprevent forest fires!\n");

      //first choice
      SpaceJava a = new SpaceJava();
      int result = a.twoInputs(0, rightSide, wrongSide);
      if (result == 1) {
         System.out.println(whichFoodRightQ);
      }
      else {
         System.out.println(whichFoodWrongQ);
      }

      System.out.println(goodbye);
      System.out.println(goodbyeQ);
      
      SpaceJava b = new SpaceJava();
      b.fourInputs(0, careerChoice, careerChoice, careerChoice, careerChoice);

      System.out.println(careerChoiceQ);

      SpaceJava c = new SpaceJava();
      result = c.fourInputs(0, whichTown, foodCriticStart, "office job", "drafted" );

      if (result == 1) {
         //cowboy code
         
         SpaceJava d = new SpaceJava();
         result = d.twoInputs(0, normalCity, spookyCity);
         // stop sign or wander
         System.out.println(normalCityQ);
         SpaceJava e = new SpaceJava();
         result = e.twoInputs(0, stopSign + stopSignQ, wanderingJunkyard + stopSignQ);
                // stop sign
                  SpaceJava f = new SpaceJava();
                  result = f.twoInputs(0, blueShip + blueShipQ, blueShip + blueShipQ);
                  // no "if" here bc both have same result
                  SpaceJava g = new SpaceJava();
                  result = g.twoInputs(0, abandonManatee + abandonManateeQ, doctorManatee + abandonManateeQ);
                  if (result == 1) { // abandon manatee
                     SpaceJava l = new SpaceJava();
                     result = l.twoInputs(0, countryAbandoned + countryAbandonedQ, countryAbandoned + countryAbandonedQ);
                        SpaceJava s = new SpaceJava();
                        result = s.twoInputs(0, ignoreManatee + youLose, openHatch + youLose);
                        
                  }
                  if (result == 2) { // doctor manatee
                  SpaceJava h = new SpaceJava();
                  result = h.twoInputs(0, countryDoctored + countryDoctoredQ, indieSpaceRock);
                     // no "if" here bc both have same result
                     SpaceJava j = new SpaceJava();
                     result = j.twoInputs(0, findDoctor + findDoctorQ, walkAround + findDoctor + findDoctorQ);
                     // no "if" here bc both have same result, except walkAround walks around first
                     SpaceJava k = new SpaceJava();
                     result = k.twoInputs(0, spaceMuseum + spaceMuseumQ, spaceBar + spaceMuseumQ);
                     // no "if" here bc both have same question posed next
                     SpaceJava l = new SpaceJava();
                     result = l.twoInputs(0, talkSketch + talkSketchQ, talkDad);
                     if(result == 2); { // if Dad chosen and q talk or decline sketch
                        SpaceJava m = new SpaceJava();
                        result = m.twoInputs(0, talkSketch + talkSketchQ, declineSketch);
                        // if result = 1, line of code below will execute anyway, which is what we want
                        if (result == 1) {
                           SpaceJava n = new SpaceJava();
                           result = n.twoInputs(0, acceptSketch, declineSketch);
                           // FINISH THIS CODE - needs input "1" to continue but doesn't ask a question
                        }
                     }
                     if(result == 1) { //if you talk to Sketch
                        SpaceJava o = new SpaceJava();
                        result = o.twoInputs(0, acceptSketch, declineSketch);
                     }
                     System.out.println(trainRobbery);
                     System.out.println(trainRobberyQ);
                     SpaceJava p = new SpaceJava();
                     result = p.twoInputs(0, surrenderRobbers + surrenderRobbersQ, attackRobbers);
                        if (result == 1); { // if surrender
                        SpaceJava q = new SpaceJava();
                        result = q.twoInputs(0, endingJoined + youLose, rejectAttackRobbers + rejectAttackRobbersQ);
                           if (result == 2); { // you attack robbers after refusing offer
                              SpaceJava r = new SpaceJava();
                              result = r.twoInputs(0, endingTarnation + youLose, happyEndingCowboy);
                           }
                        }
         }  
               

      
      
      else if (result == 2) {
         //food critic code
      }
      else if (result == 3) {
         //office job code?
      }
      else {
         //drafted code
      }
      }

      
   }}



    
   

      
   
   
     
   

      




