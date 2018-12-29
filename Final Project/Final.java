/*Author Cooter Gale
December 6 2018
Final Project*/

import java.util.Scanner;
import java.util.Random;

class Final {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String[] attack = {
			"Dab",
			"Ur Mom Gay",
			"I'm Already Tracer",
			"Whip and Nae Nae",
			"This ain't it cheif",
		
		};
		
		String[] defense = {
			"Gamer Girls",
			"Flex Tape",
			"Sprite Cranberry",
			"Fortnite Dance",
			"Oof",
		};
		
		String start = "You have entered the battle of the memes. You will have to fight 5 challenging bosses. A death is punishible by restarting the game. Do you choose to continue?";
		String startNo = "I TAKE PITY ON YOUR IGNORANCE";
		String startYes = "Good choice. You will now be transported into the realm of the memes.";
		System.out.println(start);
		String choice1 = input.nextLine();
		if (choice1.equalsIgnoreCase("Yes")){
			System.out.println(startYes);
		}
		else {
			System.out.println(startNo); System.exit(0);
		}
		String pepesGuidance = "You are now in the Battle of the Memes. You are greeted by the almighty Pepe, the ruler of this realm. He decrees to you the rules of the game. In each boss fight you have an option to attck or defend. One wrong choice and you will die. Continue with caution my child. Pepe waves his hand and you are engulfed in light.";
		System.out.println(pepesGuidance);
		System.out.println();
				
		String shiaLebouf = "As the blinding light fades you find yourself walking in the woods. There's no one around and your phone is dead. Out of the corner of your eye, you spot him (Shia LaBeouf). He's following you, about thirty feet back. He gets down on all fours and breaks into a sprint. He's gaining on you (Shia LaBeouf). You need to act now! Do you choose to attack or defend?";
		
		String shiaLeboufDefense = "You have chosen to defend. In fear for your life you decide to use the powerful defensive spell known as ";
		
		String shiaLeboufDefensePtTwo = ". You mutter the incantation. Shia Labeouf seems surprised. Victory! But wait! You forget that Shia Labeouf is a powerful wizard like yourself. The sacred phrase leaves his lips, JUST DO IT. Your shield is no match. You run but he chases. You're looking for your car, but you're all turned around. He's almost upon you now, and you can see there's blood on his face. My God, there's blood everywhere! Shia then tackles you to the ground, all the while biting off chuncks of flesh. The light slowly fades from your eyes as you watch the mad man rip out your heart with his teeth. You have died.";
			
		String shiaLeboufAttack = "You have chosen to attack. As he approaches you wait for the perfect moment to attack. When he gets in range you do it. Everything around you becomes deep fried, your eyes begin to shoot lazers. You open your mouth and speak in an earrape tone. You cast the spell ";
 
		String shiaLeboufAttackPtTwo = " .As the dust clears you see that you have won. You begin to walk to the next challenge. Wait! He isn't dead! Shia surprise! There's a gun to your head and death in his eyes. But you can do Jiu Jitsu (You can do it). Body slam superstar Shia LaBeouf. Legendary fight with Shia LaBeouf. Normal Tuesday night for Shia Labeouf. You try to swing an axe at Shia LaBeouf. But blood is draining fast from your stump leg. He's dodging every swipe, he parries to the left. You counter to the right, you catch him in the neck. You're chopping off his head now… You have just decapitated Shia LaBeouf. His head topples to the floor, expressionless. You fall to your knees and catch your breath. You're finally safe from Shia LaBeouf… You won! Before you can celebrate the light once again engulfs you.";
		System.out.println(shiaLebouf);
		String choice2 = input.nextLine();
		
		if (choice2.equalsIgnoreCase("attack")){
			System.out.println(shiaLeboufAttack + attack[rand.nextInt(5) + 1] + shiaLeboufAttackPtTwo);
		}
		else {
			System.out.println(shiaLeboufDefense + defense[rand.nextInt(5) + 1] + shiaLeboufDefensePtTwo); System.exit(0);
		}
		
		String guy = "As the light begins to fade, you find yourself crashing through a small diner. As the glass settles around you, a feeling of disturing familiarity surrouds you, like you've been her before.  In the distance you hear a food review being filmed, and peeking out of the shadows, a figure of a man - no, a God - with spikes surrounding his head like a halo.  You decide to try some of the food. In the rubble you find a dish undisturbed. You pick up a rib covered in BBQ sauce. You take a bite and sure enough it is full of flavor. One could even say it took you to FlavorTown®. Fear overcomes you as you realize what you have just done. This isn't a diner, its a combination of a diner, a drive in, and a dive. You turn around and are face to face with the legend, Guy Ferrari. Do you choose to attack or defend?";
		
		String guyAttack = "You have chosen to attack. Guy is moving ever closer, moving to avenge drive in diner dive. As soon as he gets in range you attack with ";
		String guyAttackPtTwo = ". Unfortunatly Guy was prepared. Right before your attack hits he parries it with his frosted tips. With your attack being useless you try to run. Guy then waves his hand and incapacites you with a spell of his own. As you stand there helpless, Guy approaches. He wips out a Colt 45. He takes a bullet and smothers it in his signature BBQ sauce. He loads the bullet and sticks the gun in your mouth.  With tear in your eyes, you know its over. He stares into your soul the same way he would stare at an overcooked steak and utters one final sentance. Flavortown will welcome me with raised arms, can you say the same? You have died.";
		String guyDefend = "You have chosen to defend. Not being disturbed by your last fight with labeouf, you calmly bide your time. He laughs, and slowly walks toward you. His hair begins to glow, ready to impail you. He bows his head ready to ram into you. He charges toward you running close to the speed of sound! Now is your chance! You must act fast! The moment before he rips your heart out with those wicked frosted tips, you parry with ";
		String guyDefendPtTwo = ". Guy is now vulenerable to attack! You decide that the only way to defeat this madman is to remove the very core of his being. Quickly, you capture him in a cage that is dangling from the celing. You reach for the sky chanting, KALI MAAAA! KALI MAAAA! He screams but no one can hear him. You reach for his chest, the screams echoing in your soul. You burrow through his rib cage, grab his heart, and rip it out. While you hold his still beating heart, you open the celar. Inside is enough flaming hot bbq sauce to last a lifetime. You then open every single bottle and pour it on the floor. By the end the heat is so intense that stone surrounding it begins to melt. You lower his still twitching body into the celar. As he reaches the bottom the heart in your hand bursts into flames, just like the body it came from. Its over, guy is no more. Once again the light engulfs you.";
		System.out.println();
		System.out.println(guy);
		String choice3 = input.nextLine();
		
		if (choice3.equalsIgnoreCase("defend")){
			System.out.println(guyDefend + defense[rand.nextInt(5) + 1] + guyDefendPtTwo);
		}
		else {
			System.out.println(guyAttack + attack[rand.nextInt(5) + 1] + guyAttackPtTwo); System.exit(0);
		}
		
		
		String shrek = "As the light fades the first sensation you get is smell. A kind of smelly smell, a smelly smell that smells, smelly. Its not just the smell that is odd, you are standing in knee deep marsh. You wade to dry land. As you reach land you smell the smell again, but this time its stronger. It is the smell of onions. You begin to walk around. The smell of onions becoming ever stronger. Then you see it. A giant tree that is so big that someone made a house out of it. The smell is so bad it is bringing tears to your eyes. You walk to the door of the house. As you are about to enter you hear a voice behind you. What are you doing in my swamp, says the voice. You turn around and are face to face with none other than Shrek! Do you choose to attack or defend?";
		String shrekAttack = "You have chosen to attack. He repeats himself, but with more force. WHAT ARE YOU DOIN IN MY SWAMP!!! The sheer power of his screech caused an explosion. When the dust settles you find yourself in a crater with Shrek. Now is the time to strike! Shrek is very good at close quarters combat, you decide to use more ranged weapons. You whip out the most powerful ranged weapons you have. Yeet, Yoink, and Big Mood. You launch a Yeet follwed by a Yoink and then a Big Mood. Each one hitting him causing an explosion subsequently followed by a large shockwave. You continue doing this, rattling off shot after shot. You keep doing this until long after you know he is dead. When you finaly stop you take a breath of fresh air, wating for the light to come again. But when you look at the massive hole in the ground, there is absolutly no sign of Shrek. You know its over now, you can feel him standing behind you now. He whispers in your ear, Shrek is Love, Shrek is Life. Wait wrong fanfic! He actually said, Nobody messes with my swamp. Shrek then did what all Ogers do, he brutally ripped your head off. You have died.";
		String shrekDefend = "You have chosen to defend. Shrek is a might being, no mere sheild will help you. You need to do something more than just block his blow, you need to somehow meet his force with something of equal force. Shrek repeats himself, this time with more force. WHAT ARE YOU DOING IN MY SWAMP!! You panic trying to figure out what to do. Shrek walks closter, anger consuming him. You've got it! You need to summon a being that will not only counter his massive anger, but also beat the devil out of him. You begin to whistle and sing in a high pitched voice, like Snow White you call upon small woodland creatures. Lots of small creatures begin to attack Shrek. The animals do no damage to him, they only annoy him. Because of their small size and quick movement they can dodge all of his attacks. But wait! Shrek managed to land a blow on a small squirrel. He is so small that he could fit into your pocket, and when you gaze upon him you are reminded of a pea pod. Oh no! Shrek has injured Peapod the Pocket Squirrel! Before you know it, reality itself tears apart. When the massive tear dissapears none other than Bob Ross is standing there! Shrek is frozen; he is overcome with fear! Bob Ross walks over and picks up Peapod. He smiles and says, There are no mistakes, just happy accidents. But for this mistake, well, let's get crazy. Shrek screams, but it is too late. A beam of pure happiness erupts from Bob Ross. Shrek just got the devil beat out of him. Shrek then walks home, an oger with no anger left. As Bob Ross tends to Peapods injuries, the light once again engulfs you.";
		System.out.println();
		System.out.println(shrek);
		String choice4 = input.nextLine();
		
		if (choice4.equalsIgnoreCase("defend")){
			System.out.println(shrekDefend);
		}
		else {
			System.out.println(shrekAttack); System.exit(0);
		}
		
		String gregRockey = "As the light fades you find yourself in an empty compter lab. Everything is dark. But in the corner you see the shadow of a man. The shadow moves toward the light. You panick because you can sense the raw power of this being. As the shadow steps into the light your worst fear is realized. The powerful being is none other than Greg Davis. Do you choose to attack or defend?";
		
		String gregRockeyAttack = "You decide to attack. You know that no mere meme reference can defeat such a being. As Greg calmly walks toward you; panic overcomes you. Then inspiration hits you! You decide to summon power of both God and Anime to help defeat the beast.  As you rage with power from the likes of Goku and Naruto, Greg’s expressionless face creeps into a smile.  You decide to end the fight fast. You gather all of your power into one, single punch. In a brilliant show of light you wind up and punch at Greg. An explosion that would rival a nuclear bomb ensues. As the dust settles you take a deep breath, it's over. As you stand up and are about to leave, you hear something. You hear a friendly hello right behind you. Your stomach sinks. You turn around and are terrified by what you see. Greg is looming behind you, not a scratch on his body. Greg laughs maniacally: you know it’s over for you, for he is using merely 5% of his power. As he laughed his eyes shine a brilliant red . He raises his hand preparing to kill. In your moment of desperation you are saved! Your savior is none other than the mythical Rockey, late as always! You smile because you know she is the only being capable of matching Greg. She is the light to his dark, the yin to his yang. You run away, leaving the two absolutes to fight an endless battle.";
			
		String gregRockeyDefense = "In fear you decide to defend. You pull out the ancient book of scripture, found in the deepest Hebrew cave. You flip through the pages then read the sacred phrase, No U. You have just summoned into existence the most powerful shield ever known to man. You laugh as you think it’s over. Not even Gregorious the Great could get through that shield. You watch as Greg steps back, fear overcomes you. He laughs and says, Puny child, I won't even need to use 5% of my power. You scream but no one can hear you. You try to run but you cannot get through your no u shield. Greg maniacally laughs as he lets out a holy beam of light. Your shield is no match for such power. As the light hits you, there is no pain. A tear streaks down your face as you realize Greg had mercy. He had mercy for the foolish child who dare challenge him. In your last moments you feel grateful to the man who gave you such an honorable ending.";
		String ending = "Congratulations! You have beaten this game. Now go do something productive.";
		
		System.out.println();
		System.out.println(gregRockey);
		String choice5 = input.nextLine();
		
		if (choice5.equalsIgnoreCase("attack")){
			System.out.println(gregRockeyAttack);
		}
		else {
			System.out.println(gregRockeyDefense); System.exit(0);
		}
		System.out.println();
		System.out.println(ending);
		
			}
}