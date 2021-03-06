import java.util.Scanner;

public class Generator {
	static String[] hex = new String[6];
	static String[] hexChanged = new String[6];
	static String[][] Iching = new String[9][64];
	static boolean[] coinTosses = new boolean[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Question:");
		Scanner s = new Scanner(System.in);
		String q = s.next();
		s.close();
		System.out.print("\n\r");
		for(int i=0; i <6; i++){
			
			flip();
			int sum = coinToNum();
			if(sum == 6){
				hex[i] = "changing yin";
			}if(sum == 7){
				hex[i] = "unchanging yang";
			}if(sum == 8){
				hex[i] = "unchanging yin";
			}if(sum == 9){
				hex[i] = "changing yang";
			}
		}
		hexchanged();
		//printHexes();
		String[][] Iching = IchingFiller();
		
		
		
		
			for(int j=0; j<63; j++){
				//System.out.println(hex[i]);
				//System.out.println(Iching[j][i]);
				if(hex[0].contains(Iching[0][j]) && hex[1].contains(Iching[1][j]) && hex[2].contains(Iching[2][j]) && hex[3].contains(Iching[3][j]) && hex[4].contains(Iching[4][j]) && hex[5].contains(Iching[5][j])){
				//	for(int k =7; k< 9; k++){
						
						System.out.println("			"+Iching[7][j]+"\n");
						
						System.out.println(stringFormatter(Iching[8][j]));
				//	}
				}
			}
			
			System.out.println("\n");
			
			for(int j=0; j<63; j++){
				//System.out.println(hex[i]);
				//System.out.println(Iching[j][i]);
				if(hexChanged[0].contains(Iching[0][j]) && hexChanged[1].contains(Iching[1][j]) && hexChanged[2].contains(Iching[2][j]) && hexChanged[3].contains(Iching[3][j]) && hexChanged[4].contains(Iching[4][j]) && hexChanged[5].contains(Iching[5][j])){
				//	for(int k =7; k< 9; k++){
						
						System.out.println("			"+Iching[7][j]+"\n");
						
						System.out.println(stringFormatter(Iching[8][j]));
				//	}
				}
			}
			
			
			/*System.out.println("Press Enter to run again.");
			Scanner s2 = new Scanner(System.in);
			String enter = s2.next();
			while(enter != "\n"){
				 s2 = new Scanner(System.in);
				 enter = s2.next();
			}*/
			
	}
	
	public static void flip(){
		
		for(int i = 0; i<3; i++){
			double num = Math.random();
			long round =  Math.round(num);
			boolean flip;
			if(round == 1){
				flip = true;
			}else{
				flip = false;
			}
			 
			coinTosses[i] = flip;
		}
	}
	
	public static int coinToNum(){
		 int sum = 0;
		 for(int i = 0; i<coinTosses.length; i++){
			 if(coinTosses[i] == true){
				 sum = sum + 3;
			 }else{
				 sum = sum + 2;
			 }
			 
		 }
		 return sum;
	}
	
	public static void hexchanged(){
		for(int i =0; i< hex.length; i++){
			if(hex[i] == "changing yin"){
				hexChanged[i] = "unchanging yang";
			}else if(hex[i] == "changing yang"){
				hexChanged[i] = "unchanging yin";
			}else{
				hexChanged[i] = hex[i];
			}
		}
	}
	
	public static void printHexes(){
		for(int i =0; i< hex.length; i++){
			System.out.println(hex[i]);
		}
		System.out.println("\n");

		
		for(int i =0; i< hex.length; i++){
			System.out.println(hexChanged[i]);
		}
	}
	
	public static String[][] IchingFiller(){
		Iching[5][0] = "yang";
		Iching[4][0] = "yang";
		Iching[3][0] = "yang";
		Iching[2][0] = "yang";
		Iching[1][0] = "yang";
		Iching[0][0] = "yang";
		Iching[6][0] = "??? Hexagram 1 - The Creative";
		Iching[7][0] = "The first hexagram is made up of six unbroken lines. These unbroken lines stand for the primal power, which is light-giving, active, strong, and of the spirit. The hexagram is consistently strong in character, and since it is without weakness, its essence is power or energy. Its image is heaven. Its energy is represented as unrestricted by any fixed conditions in space and is therefore conceived of as motion. Time is regarded as the basis of this motion. Thus the hexagram includes also the power of time and the power of persisting in time, that is, duration. The power represented by the hexagram is to be interpreted in a dual sense in terms of its action on the universe and of its action on the world of men. In relation to the universe, the hexagram expresses the strong, creative action of the Deity. In relation to the human world, it denotes the creative action of the holy man or sage, of the ruler or leader of men, who through his power awakens and develops their higher nature.";
		
		Iching[5][1] = "yin";
		Iching[4][1] = "yin";
		Iching[3][1] = "yin";
		Iching[2][1] = "yin";
		Iching[1][1] = "yin";
		Iching[0][1] = "yin";
		Iching[6][1] = "??? Hexagram 2 - The Flow";
		Iching[7][1] = "This hexagram is made up of broken lines only. The broken lines represents the dark, yielding, receptive primal power of yin. The attribute of the hexagram is devotion; its image is the earth. It is the perfect complement of The Creative the complement, not the opposite, for the Receptive does not combat the Creative but completes it . It represents nature in contrast to spirit, earth in contrast to heaven, space as against time, the female-maternal as against the male-paternal. However, as applied to human affairs, the principle of this complementary relationship is found not only in the relation between man and woman, but also in that between prince and minister and between father and son. Indeed, even in the individual this duality appears in the coexistence of the spiritual world and the world of the senses. But strictly speaking there is no real dualism here, because there is a clearly defined hierarchic relationship between the two principles. In itself of course the Receptive is just as important as the Creative, but the attribute of devotion defines the place occupied by this primal power in relation to the Creative. For the Receptive must be activated and led by the Creative; then it is productive of good. Only when it abandons this position and tries to stand as an equal side by side with the Creative, does it become evil. The result then is opposition to and struggle against the Creative, which is productive of evil to both.";

		
		
		Iching[5][2] = "yin";
		Iching[4][2] = "yang";
		Iching[3][2] = "yin";
		Iching[2][2] = "yin";
		Iching[1][2] = "yin";
		Iching[0][2] = "yang";
		Iching[7][2] = "??? Hexagram 3 - Gathering Support";
		Iching[8][2] = "The name of the hexagram, Chun, really connotes a blade of grass pushing against an obstacle as it sprouts out of the earth--hence the meaning, \"difficulty at the beginning.\" The hexagram indicates the way in which heaven and earth bring forth individual beings. It is their first meeting, which is beset with difficulties. The lower trigram Chen is the Arousing; its motion is upward and its image is thunder. The upper trigram K'an stands for the Abysmal, the dangerous. Its motion is downward and its image is rain. The situation points to teeming, chaotic profusion; thunder and rain fill the air. But the chaos clears up. While the Abysmal sinks, the upward movement eventually passes beyond the danger. A thunderstorm brings release from tension, and all things breathe freely again.";

		Iching[5][3] = "yang";
		Iching[4][3] = "yin";
		Iching[3][3] = "yin";
		Iching[2][3] = "yin";
		Iching[1][3] = "yang";
		Iching[0][3] = "yin";
		Iching[7][3] = "??? Hexagram 4 - Discovering";
		Iching[8][3] = "In this hexagram we are reminded of youth and folly in two different ways. The image of the upper trigram, Ken, is the mountain, that of the lower, K'an, is water; the spring rising at the foot of the mountain is the image of inexperienced youth. Keeping still is the attribute of the upper trigram; that of the lower is the abyss, danger. Stopping in perplexity on the brink of a dangerous abyss is a symbol of the folly of youth. However, the two trigrams also show the way of overcoming the follies of youth. Water is something that of necessity flows on. When the spring gushes forth, it does not know at first where it will go. But its steady flow fills up the deep place blocking its progress, and success is attained.";
		
		Iching[5][4] = "yin";
		Iching[4][4] = "yang";
		Iching[3][4] = "yin";
		Iching[2][4] = "yang";
		Iching[1][4] = "yang";
		Iching[0][4] = "yang";
		Iching[7][4] = "??? Hexagram 5 - Nourishment";
		Iching[8][4] = "All beings have need of nourishment from above. But the gift of food comes in its own time, and for this one must wait. This hexagram shows the clouds in the heavens, giving rain to refresh all that grows and to provide mankind with food and drink. The rain will come in its own time. We cannot make it come; we have to wait for it. The idea of waiting is further suggested by the attributes of the two trigrams--strength within, danger in from. Strength in the face of danger does not plunge ahead but bides its time, whereas weakness in the face of danger grows agitated and has not the patience to wait.";
				
		Iching[5][5] = "yang";
		Iching[4][5] = "yang";
		Iching[3][5] = "yang";
		Iching[2][5] = "yin";
		Iching[1][5] = "yang";
		Iching[0][5] = "yin";
		Iching[7][5] = "??? Hexagram 6 - Conflicted";
		Iching[8][5] = "The upper trigram, whose image is heaven, has an upward movement; the lower trigram, water, in accordance with its nature tends downward. Thus the two halves move away from each other, giving rise to the idea of conflict. The attribute of the Creative is strength, that of the Abysmal is danger, guile. Where cunning has force before it, there is conflict. A third indication of conflict, in terms of character, is presented by the combination of deep cunning within and fixed determination outwardly. A person of this character will certainly be quarrelsome.";

		Iching[5][6] = "yin";
		Iching[4][6] = "yin";
		Iching[3][6] = "yin";
		Iching[2][6] = "yin";
		Iching[1][6] = "yang";
		Iching[0][6] = "yin";
		Iching[7][6] = "??? Hexagram 7 - Leading";
		Iching[8][6] = "This hexagram is made up of the trigrams K'an, water, and K'un, earth, and thus it symbolizes the ground water stored up in the earth. In the same way military strength is stored up in the mass of the people--invisible in times of peace but always ready for use as a source of power. The attributes of the two trig rams are danger inside and obedience must prevail outside. Of the individual lines, the one that controls the hexagram is the strong nine in the second place, to which the other lines, all yielding, are subordinate. This line indicates a commander, because it stands in the middle of one of the two trigrams. But since it is in the lower rather than the upper trigram, it represents not the ruler but the efficient general, who maintains obedience in the army by his authority.";
		
		//8
		Iching[5][7] = "yin";
		Iching[4][7] = "yang";
		Iching[3][7] = "yin";
		Iching[2][7] = "yin";
		Iching[1][7] = "yin";
		Iching[0][7] = "yang";
		Iching[7][7] = "??? Hexagram 8 - Alliance";
		Iching[8][7] = "The waters on the surface of the earth flow together wherever they can, as for example in the ocean, where all the rivers come together. Symbolically this connotes holding together and the laws that regulate it. The same idea is suggested by the fact that all the lines of the hexagram except the fifth, the place of the ruler, are yielding. The yielding lines hold together because they are influenced by a man of strong will in the leading position, a man who is their center of union. Moreover, this strong and guiding personality in turn holds together with the others, finding in them the complement of his own nature.";

		//9
		Iching[5][8] = "yang";
		Iching[4][8] = "yang";
		Iching[3][8] = "yin";
		Iching[2][8] = "yang";
		Iching[1][8] = "yang";
		Iching[0][8] = "yang";
		Iching[7][8] = "??? Hexagram 9 - Small Harvest";
		Iching[8][8] = "This hexagram means the force of the small--the power of the shadowy--that restrains, tames, impedes. A weak line in the fourth place, that of the minister, holds the five strong lines in check. In the Image it is the wind blowing across the sky. The wind restrains the clouds, the rising breath of the Creative, and makes them grow dense, but as yet is not strong enough to turn them to rain. The hexagram presents a configuration of circumstances in which a strong element is temporarily held in leash by a weak element. It is only through gentleness that this can have a successful outcome.";
		
		
		//10
		Iching[5][9] = "yang";
		Iching[4][9] = "yang";
		Iching[3][9] = "yang";
		Iching[2][9] = "yin";
		Iching[1][9] = "yang";
		Iching[0][9] = "yang";
		Iching[7][9] = "??? Hexagram 10 - Continuing";
		Iching[8][9] = "The name of the hexagram means on the one hand the right way of conducting oneself. Heaven, the father, is above, and the lake, the youngest daughter, is below. This shows the difference between high and low, upon which composure correct social conduct, depends. On the other hand the word for the name of the hexagram, Treading, means literally treading upon something. The small and cheerful [Tui] treads upon the large and strong [Ch'ien]. The direction of movement of the two primary trigrams is upward. The fact that the strong treads on the weak is not mentioned in the Book of Changes, because it is taken for granted. For the weak to take a stand against the strong is not dangerous here, because it happened in good humor [Tui] and without presumption, so that the strong man is not irritated but takes it all in good part.";
		
		//11
		Iching[5][10] = "yin";
		Iching[4][10] = "yin";
		Iching[3][10] = "yin";
		Iching[2][10] = "yang";
		Iching[1][10] = "yang";
		Iching[0][10] = "yang";
		Iching[7][10] = "??? Hexagram 11 - Peace";
		Iching[8][10] = "The Receptive, which moves downward, stands above; the Creative, which moves upward, is below. Hence their influences meet and are in harmony, so that all living things bloom and prosper. This hexagram belongs to the first month (February-March), at which time the forces of nature prepare the new spring.";
		
		//12
		Iching[5][11] = "yang";
		Iching[4][11] = "yang";
		Iching[3][11] = "yang";
		Iching[2][11] = "yin";
		Iching[1][11] = "yin";
		Iching[0][11] = "yin";
		Iching[7][11] = "??? Hexagram 12 - Stagnation";
		Iching[8][11] = "This hexagram is the opposite of the preceding one. Heaven is above, drawing farther and farther away, while the earth below sinks farther into the depths. The creative powers are not in relation. It is a time of standstill and decline. This hexagram is linked with the seventh month (August-September), when the year has passed its zenith and autumnal decay is setting in.";

		//13
		Iching[5][12] = "yang";
		Iching[4][12] = "yang";
		Iching[3][12] = "yang";
		Iching[2][12] = "yang";
		Iching[1][12] = "yin";
		Iching[0][12] = "yang";
		Iching[7][12] = "??? Hexagram 13 - Concording People";
		Iching[8][12] = "The image of the upper trigram Ch'ien is heaven, and that of the lower, Li, is flame. It is the nature of fire to flame up to the heaven. This gives the idea of fellowship. It is the second line that, by virtue of its central character, unites the five strong lines around it. This hexagram forms a complement to Shih, The Army (7). In the latter, danger is within and obedience without the character of a warlike army, which, in order to hold together, needs one strong man among the many who are weak. Here, clarity is within and strength without--the character of a peaceful union of men, which, in order to hold together, needs one yielding nature among many firm persons.";
				
		//14
		Iching[5][13] = "yang";
		Iching[4][13] = "yin";
		Iching[3][13] = "yang";
		Iching[2][13] = "yang";
		Iching[1][13] = "yang";
		Iching[0][13] = "yang";
		Iching[7][13] = "??? Hexagram 14 - The great possession";
		Iching[8][13] = "The fire in heaven above shines far, and all things stand out in the light and become manifest. The weak fifth line occupies the place of honor and all the strong lines are in accord with it. All things come to the man who is modest and kind in a high position.";
		
		//15
		Iching[5][14] = "yin";
		Iching[4][14] = "yin";
		Iching[3][14] = "yin";
		Iching[2][14] = "yang";
		Iching[1][14] = "yin";
		Iching[0][14] = "yin";
		Iching[7][14] = "??? Hexagram 15 - Modesty";
		Iching[8][14] = "This hexagram is made up of the trigrams Ken, Keeping Still, mountain, and K'un. The mountain is the youngest son of the Creative, the representative of heaven and earth. It dispenses the blessings of heaven, the clouds and rain that gather round its summit, and thereafter shines forth radiant with heavenly light. This shows what modesty is and how it functions in great and strong men. K'un, the earth, stands above. Lowliness is a quality of the earth: this is the very reason why it appears in this hexagram as exalted, by being placed above the mountain. This shows how modesty functions in lowly, simple people: they are lifted up by it.";
		
		//16
		Iching[5][15] = "yin";
		Iching[4][15] = "yin";
		Iching[3][15] = "yang";
		Iching[2][15] = "yin";
		Iching[1][15] = "yin";
		Iching[0][15] = "yin";
		Iching[7][15] = "??? Hexagram 16 - Excess";
		Iching[8][15] = "The strong line in the fourth place, that of the leading official, meets with response and obedience from all the other lines, which are all weak. The attribute of the upper trigram, Chen, is movement; the attributes of K'un, the lower, are obedience and devotion. This begins a movement that meets with devotion and therefore inspires enthusiasm, carrying all with it. Of great importance, furthermore, is the law of movement along the line of least resistance, which in this hexagram is enunciated as the law for natural events and for human life.";
		
		//17
		Iching[5][16] = "yin";
		Iching[4][16] = "yang";
		Iching[3][16] = "yang";
		Iching[2][16] = "yin";
		Iching[1][16] = "yin";
		Iching[0][16] = "yang";
		Iching[7][16] = "??? Hexagram 17 - Following";
		Iching[8][16] = "The trigram Tui, the Joyous, whose attribute is gladness, is above; Chen, the Arousing, which has the attribute of movement, is below. Joy in movement induces following. The Joyous is the youngest daughter, while the Arousing is the eldest son. An older man defers to a young girl and shows her consideration. By this he moves her to follow him.";
		
		//18
		Iching[5][17] = "yang";
		Iching[4][17] = "yin";
		Iching[3][17] = "yin";
		Iching[2][17] = "yang";
		Iching[1][17] = "yang";
		Iching[0][17] = "yin";
		Iching[7][17] = "??? Hexagram 18 - Correcting";
		Iching[8][17] = "The Chinese character ku represents a bowl in whose contents worms are breeding. This means decay. It is come about because the gentle indifference in the lower trigram has come together with the rigid inertia of the upper, and the result is stagnation. Since this implies guilt, the conditions embody a demand for removal of the cause. Hence the meaning of the hexagram is not simply 'what has been spoiled' but 'work on what has been spoiled'.";
		
		//19
		Iching[5][18] = "yin";
		Iching[4][18] = "yin";
		Iching[3][18] = "yin";
		Iching[2][18] = "yin";
		Iching[1][18] = "yang";
		Iching[0][18] = "yang";
		Iching[7][18] = "??? Hexagram 19 - Nearing";
		Iching[8][18] = "The Chinese word lin has a range of meanings that is not exhausted by any single word of another language. The ancient explanations in the Book of Changes give as its first meaning, becoming great. What becomes great are the two strong lines growing into the hexagram from below; the light-giving power expands with them. The meaning is then further extended to include the concept of approach, especially the approach of what is lower. Finally the meaning includes the attitude of condescension of a man in high position toward the people, and in general the setting to work on affairs. This hexagram is linked with the twelfth month (January-February), when after the winter solstice, the light power begins to ascend again.";
		
		//20
		Iching[5][19] = "yang";
		Iching[4][19] = "yang";
		Iching[3][19] = "yin";
		Iching[2][19] = "yin";
		Iching[1][19] = "yin";
		Iching[0][19] = "yin";
		Iching[7][19] = "??? Hexagram 20 - Viewing";
		Iching[8][19] = "A slight variation of tonal stress gives the Chinese name for this hexagram a double meaning. It means both contemplating and being seen, in the sense of being an example. These ideas are suggested by the fact that the hexagram can be understood as picturing a type of tower characteristic of ancient China. A tower of this kind commanded a wide view of the country, at the same time, when situated on a mountain, it became a landmark that could be seen for miles around. Thus the hexagram shows a ruler who contemplates the law of heaven above him and the ways of the people below, and who, by means of good government, sets a lofty example to the masses. This hexagram is linked with the eight month (September-October). The light-giving power retreats and the dark power is again on the increase. However, this aspect is not material in the interpretation of the hexagram as a whole.";
		
		//21
		Iching[5][20] = "yang";
		Iching[4][20] = "yin";
		Iching[3][20] = "yang";
		Iching[2][20] = "yin";
		Iching[1][20] = "yin";
		Iching[0][20] = "yang";
		Iching[7][20] = "??? Hexagram 21 - Biting Through";
		Iching[8][20] = "This hexagram represents an open mouth hexagram 27 with an obstruction (in the fourth place) between the teeth. As a result the lips cannot meet. To bring them together one must bite energetically through the obstacle. Since the hexagram is made up of the trigrams for thunder and for lightning, it indicates how obstacles are forcibly removed in nature. Energetic biting through overcomes the obstacle that prevents joining of the lips; the storm with its thunder and lightning overcomes the disturbing tension in nature. Recourse to law and penalties overcomes the disturbances of harmonious social life caused by criminals and slanderers. The theme of this hexagram is a criminal lawsuit, in contradistinction to that of Sung, Conflict (6), which refers to civil suits.";
		
		//22
		Iching[5][21] = "yang";
		Iching[4][21] = "yin";
		Iching[3][21] = "yin";
		Iching[2][21] = "yang";
		Iching[1][21] = "yin";
		Iching[0][21] = "yang";
		Iching[7][21] = "??? Hexagram 22 - Adorning";
		Iching[8][21] = "This hexagram shows a fire that breaks out of the secret depths of the earth and, blazing up, illuminates and beautifies the mountain, the heavenly heights. Grace-beauty of form-is necessary in any union if it is to be well ordered and pleasing rather than disordered and chaotic.";
		
		//23
		Iching[5][22] = "yin";
		Iching[4][22] = "yin";
		Iching[3][22] = "yin";
		Iching[2][22] = "yin";
		Iching[1][22] = "yin";
		Iching[0][22] = "yang";
		Iching[7][22] = "??? Hexagram 23 - Splitting Apart";
		Iching[8][22] = "The dark lines are about to mount upward and overthrow the last firm, light line by exerting a disintegrating influence on it. The inferior, dark forces overcome what is superior and strong, not by direct means, but by undermining it gradually and imperceptibly, so that it finally collapses. The lines of the hexagram present the image of a house, the top line being the roof, and because the roof is being shattered the house collapses. The hexagram belongs to the ninth month (October-November). The yin power pushes up ever more powerfully and is about to supplant the yang power altogether.";
		
		//24
		Iching[5][23] = "yang";
		Iching[4][23] = "yin";
		Iching[3][23] = "yin";
		Iching[2][23] = "yin";
		Iching[1][23] = "yin";
		Iching[0][23] = "yin";
		Iching[7][23] = "??? Hexagram 24 - Returning";
		Iching[8][23] = "The idea of a turning point arises from the fact that after the dark lines have pushed all of the light lines upward and out of the hexagram, another light line enters the hexagram from below. The time of darkness is past. The winter solstice brings the victory of light. This hexagram is linked with the eleventh month, the month of the solstice (December-January).";
		
		//25
		Iching[5][24] = "yang";
		Iching[4][24] = "yang";
		Iching[3][24] = "yang";
		Iching[2][24] = "yin";
		Iching[1][24] = "yin";
		Iching[0][24] = "yang";
		Iching[7][24] = "??? Hexagram 25 - The Unexpected";
		Iching[8][24] = "Ch'ien, heaven is above; Chen, movement, is below. The lower trigram Chen is under the influence of the strong line it has received form above, from heaven. When, in accord with this, movement follows the law of heaven, man is innocent and without guile. His mind is natural and true, unshadowed by reflection or ulterior designs. For wherever conscious purpose is to be seen, there the truth and innocence of nature have been lost. Nature that is not directed by the spirit is not true but degenerate nature. Starting out with the idea of the natural, the train of thought in part goes somewhat further and thus the hexagram includes also the idea of the fundamental or unexpected.";
		
		//26
		Iching[5][25] = "yang";
		Iching[4][25] = "yin";
		Iching[3][25] = "yin";
		Iching[2][25] = "yang";
		Iching[1][25] = "yang";
		Iching[0][25] = "yang";
		Iching[7][25] = "??? Hexagram 26 - Great Accumulating";
		Iching[8][25] = "The Creative is tamed by Ken, Keeping Still. This produces great power, a situation in contrast to that of the ninth hexagram, Hsiao Chu, The Taming Power of the Small, in which the Creative is tamed by the Gentle alone. There one weak line must tame five strong lines, but here four strong lines are restrained by two weak lines; in addition to a minister, there is a prince, and the restraining power therefore is afar stronger. The hexagram has a threefold meaning, expressing different aspects of the concept 'Holding firm.' Heaven within the mountain gives the idea of holding firm in the sense of holding together; the trigram Ken which holds the trigram ch'ien still, gives the idea of holding firm in the sense of holding back; the third idea is that of holding firm in the sense of caring for and nourishing. This last is suggested by the fact that a strong line at the top, which is the ruler of the hexagram, is honored and tended as a sage. The third of these meanings also attaches specifically to this strong line at the top, which represents the sage.";
		
		//27
		Iching[5][26] = "yang";
		Iching[4][26] = "yin";
		Iching[3][26] = "yin";
		Iching[2][26] = "yin";
		Iching[1][26] = "yin";
		Iching[0][26] = "yang";
		Iching[7][26] = "??? Hexagram 27 - Providing Nourishment";
		Iching[8][26] = "This hexagram is a picture of an open mouth; above and below are firm lines of the lips, and between them the opening. Starting with the mouth, through which we take food for nourishment, the thought leads to nourishment itself. Nourishment of oneself, specifically of the body, is represented in the three lower lines, while the three upper lines represent nourishment and care of others, in a higher, spiritual sense.";
		
		//28
		Iching[5][27] = "yin";
		Iching[4][27] = "yang";
		Iching[3][27] = "yang";
		Iching[2][27] = "yang";
		Iching[1][27] = "yang";
		Iching[0][27] = "yin";
		Iching[7][27] = "??? Hexagram 28 - Great Exceeding";
		Iching[8][27] = "This hexagram consists of four strong lines inside and two weak lines outside. When the strong are outside and the weak inside, all is well and there is nothing out of balance, nothing extraordinary in the situation. Here, however, the opposite is the case. The hexagram represents a beam that is thick and heavy in the middle but too weak at the ends. This is a condition that cannot last; it must be changed, must pass, or misfortune will result.";
		
		//29
		Iching[5][28] = "yin";
		Iching[4][28] = "yang";
		Iching[3][28] = "yin";
		Iching[2][28] = "yin";
		Iching[1][28] = "yang";
		Iching[0][28] = "yin";
		Iching[7][28] = "??? Hexagram 29 - The Abyss";
		Iching[8][28] = "This hexagram consists of a doubling of the trigram K'an. It is one of the eight hexagrams in which doubling occurs. The trigram K'an means a plunging in. A yang line has plunged in between two yin lines and is closed in by them like water in a ravine. The trigram K'an is also the middle son. The Receptive has obtained the middle line of the Creative, and thus K'an develops. As an image it represents water, the water that comes from above and is in motion on earth in streams and rivers, giving rise to all life on earth. In man's world K'an represents the heart, the soul locked up within the body, the principle of light inclosed in the dark--that is, reason. The name of the hexagram, because the trigram is doubled, has the additional meaning, repetition of danger. Thus the hexagram is intended to designate an objective situation to which one must become accustomed, not a subjective attitude. For danger due to a subjective attitude means either foolhardiness or guile. Hence too a ravine is used to symbolize danger, it is a situation in which a man is in the same pass as the water in a ravine, and, like the water, he can escape if he behaves correctly.";
		
		//30
		Iching[5][29] = "yang";
		Iching[4][29] = "yin";
		Iching[3][29] = "yang";
		Iching[2][29] = "yang";
		Iching[1][29] = "yin";
		Iching[0][29] = "yang";
		Iching[7][29] = "??? Hexagram 30 - Radiance";
		Iching[8][29] = "This hexagram is another double sign. The trigram Li means to cling to something, and also brightness. A dark line clings to two light lines, one above and one below--the image of an empty space between two strong lines, whereby the two strong lines are made bright. The trigram represents the middle daughter. The Creative has incorporated the central line of the Receptive, and thus Li develops. As an image, it is fire. Fire has no definite form but clings to the burning object and thus is bright. As water pours down from heaven, so fire flames up from the earth. While K'an means the soul shut within the body, Li stands for nature in its radiance.";
		
		//31
		Iching[5][30] = "yin";
		Iching[4][30] = "yang";
		Iching[3][30] = "yang";
		Iching[2][30] = "yang";
		Iching[1][30] = "yin";
		Iching[0][30] = "yin";
		Iching[7][30] = "??? Hexagram 31 - Conjoining";
		Iching[8][30] = "The name of the hexagram means universal, general, and in a figurative sense to influence, to stimulate. The upper trigram is Tui, the Joyous; the lower is Ken, Keeping still. By its persistent, quiet influence, the lower, rigid trigram stimulates the upper, weak trigram, which responds to this stimulation cheerfully and joyously. Ken, the lower trigram, is the youngest son; the upper, Tui, is the youngest daughter. Thus the universal mutual attraction between the sexes is represented. In courtship, the masculine principle must seize the initiative and place itself below the feminine principle. Just as the first part of book 1 begins with the hexagrams of heaven and earth, the foundations of all that exists, the second part begins with the hexagrams of courtship and marriage, the foundations of all social relationships.";
		
		//32
		Iching[5][31] = "yin";
		Iching[4][31] = "yin";
		Iching[3][31] = "yang";
		Iching[2][31] = "yang";
		Iching[1][31] = "yang";
		Iching[0][31] = "yin";
		Iching[7][31] = "??? Hexagram 32 - Persevering";
		Iching[8][31] = "The strong trigram Chen is above, the weak trigram Sun below. This hexagram is the inverse of the preceding one. In the latter we have influence, here we have union as an enduring condition. The two images are thunder and wind, which are likewise constantly paired phenomena. The lower trigram indicates gentleness within; the upper, movement without. In the sphere of social relationships, the hexagram represents the institution of marriage as the enduring union of the sexes. During courtship the young man subordinates himself to the girl, but in marriage, which is represented by the coming together of the eldest son and the eldest daughter, the husband is the directing and moving force outside, while the wife, inside, is gentle and submissive.";
		
		//33
		Iching[5][32] = "yang";
		Iching[4][32] = "yang";
		Iching[3][32] = "yang";
		Iching[2][32] = "yang";
		Iching[1][32] = "yin";
		Iching[0][32] = "yin";
		Iching[7][32] = "??? Hexagram 33 - Yielding";
		Iching[8][32] = "The power of the dark is ascending. The light retreats to security, so that the dark cannot encroach upon it. This retreat is a matter not of man's will but of natural law. Therefore in this case withdrawal is proper; it is the correct way to behave in order not to exhaust one's forces. In the calendar this hexagram is linked with the sixth month (July-August), in which the forces of winter are already showing their influence.";
		
		//34
		Iching[5][33] = "yin";
		Iching[4][33] = "yin";
		Iching[3][33] = "yang";
		Iching[2][33] = "yang";
		Iching[1][33] = "yang";
		Iching[0][33] = "yang";
		Iching[7][33] = "??? Hexagram 34 - Great Invigorating";
		Iching[8][33] = "The great lines, that is, the light, strong lines, are powerful. Four light lines have entered the hexagram from below and are about to ascend higher. The upper trigram is Chen, the Arousing; the lower is ch'ien, the Creative. Ch'ien is strong, Chen produces movement. The union of movement and strength gives the meaning of The Power of the Great. The hexagram is linked with the second month (March-April).";
		
		//35
		Iching[5][34] = "yang";
		Iching[4][34] = "yin";
		Iching[3][34] = "yang";
		Iching[2][34] = "yin";
		Iching[1][34] = "yin";
		Iching[0][34] = "yin";
		Iching[7][34] = "??? Hexagram 35 - Prospering";
		Iching[8][34] = "The hexagram represents the sun rising over the earth. It is therefore the symbol of rapid, easy progress, which at the same time means ever widening expansion and clarity.";
		
		//36
		Iching[5][35] = "yin";
		Iching[4][35] = "yin";
		Iching[3][35] = "yin";
		Iching[2][35] = "yang";
		Iching[1][35] = "yin";
		Iching[0][35] = "yang";
		Iching[7][35] = "??? Hexagram 36 - Brilliance Injured";
		Iching[8][35] = "Here the sun has sunk under the earth and is therefore darkened. The name of the hexagram means literally 'wounding of the bright'; hence the individual lines contain frequent references to wounding. The situation is the exact opposite of that in the foregoing hexagram. In the latter a wise man at the head of affairs has able helpers, and in company with them makes progress; here a man of dark nature is in a position of authority and brings harm to the wise and able man.";
		
		//37
		Iching[5][36] = "yang";
		Iching[4][36] = "yang";
		Iching[3][36] = "yin";
		Iching[2][36] = "yang";
		Iching[1][36] = "yin";
		Iching[0][36] = "yang";
		Iching[7][36] = "??? Hexagram 37 - The Family";
		Iching[8][36] = "The hexagram represents the laws obtaining within the family. The strong line at the top represents the father, the lowest the son. The strong line in the fifth place represents the husband, the yielding second line the wife. On the other hand, the two strong lines in the fifth and the third place represent two brothers, and the two weak lines correlated with them in the fourth and the second place stand for their respective wives. Thus all the connections and relationships within the family find their appropriate expression. Each individual line has the character according with its place. The fact that a strong line occupies the sixth place-where a weak line might be expected-indicates very clearly the strong leadership that must come from the head of the family. The line is to be considered here not in its quality as the sixth but in its quality as the top line. The Family shows the laws operative within the household that, transferred to outside life, keep the state and the world in order. The influence that goes out from within the family is represented by the symbol of the wind created by fire.";
		
		//38
		Iching[5][37] = "yang";
		Iching[4][37] = "yin";
		Iching[3][37] = "yang";
		Iching[2][37] = "yin";
		Iching[1][37] = "yang";
		Iching[0][37] = "yang";
		Iching[7][37] = "??? Hexagram 38 - Polarising";
		Iching[8][37] = "This hexagram is composed of the trigram Li above, i.e., flame, which burns upward, and Tui below, i.e., the lake, which seeps downward. These two movements are indirect contrast. Furthermore, Li is the second daughter and Tui the youngest daughter, and although they live in the same house they belong to different men; hence their wills are not the same but are divergently directed.";
		
		//39
		Iching[5][38] = "yin";
		Iching[4][38] = "yang";
		Iching[3][38] = "yin";
		Iching[2][38] = "yang";
		Iching[1][38] = "yin";
		Iching[0][38] = "yin";
		Iching[7][38] = "??? Hexagram 39 - Obstruction";
		Iching[8][38] = "The hexagram pictures a dangerous abyss lying before us and a steep, inaccessible mountain rising behind us. We are surrounded by obstacles; at the same time, since the mountain has the attribute of keeping still, there is implicit a hint as to how we can extricate ourselves. The hexagram represents obstructions that appear in the course of time but that can and should be overcome. Therefore all the instruction given is directed to overcoming them.";
		
		//40
		Iching[5][39] = "yin";
		Iching[4][39] = "yin";
		Iching[3][39] = "yang";
		Iching[2][39] = "yin";
		Iching[1][39] = "yang";
		Iching[0][39] = "yin";
		Iching[7][39] = "??? Hexagram 40 - Untangled";
		Iching[8][39] = "Here the movement goes out of the sphere of danger. The obstacle has been removed, the difficulties are being resolved. Deliverance is not yet achieved; it is just in its beginning, and the hexagram represents its various stages.";
		
		//41
		Iching[5][40] = "yang";
		Iching[4][40] = "yin";
		Iching[3][40] = "yin";
		Iching[2][40] = "yin";
		Iching[1][40] = "yang";
		Iching[0][40] = "yang";
		Iching[7][40] = "??? Hexagram 41 - Diminishing";
		Iching[8][40] = "This hexagram represents a decrease of the lower trigram in favor of the upper, because the third line, originally strong, has moved up to the top, and the top line, originally weak, has replaced it. What is below is decreased to the benefit of what is above. This is out-and-out decrease. If the foundations of a building are decreased in strength and the upper walls are strengthened, the whole structure loves its stability. Likewise, a decrease in the prosperity of the people in favor of the government is out-and-out decrease. And the entire theme of the hexagram is directed to showing how this shift of wealth can take place without causing the sources of wealth can take place without causing the sources of wealth in the nation and its lower classes to fail.";
		
		//42
		Iching[5][41] = "yang";
		Iching[4][41] = "yang";
		Iching[3][41] = "yin";
		Iching[2][41] = "yin";
		Iching[1][41] = "yin";
		Iching[0][41] = "yang";
		Iching[7][41] = "??? Hexagram 42 - Augmenting";
		Iching[8][41] = "The idea of increase is expressed in the fact that the strong lowest line of the upper trigram has sunk down and taken its place under the lower trigram. This conception also expresses the fundamental idea on which the Book of Changes is based. To rule truly is to serve. A sacrifice of the higher element that produces an increase of the lower is called an out-and-out increase: it indicates the spirit that alone has power to help the world.";
		
		//43
		Iching[5][42] = "yin";
		Iching[4][42] = "yang";
		Iching[3][42] = "yang";
		Iching[2][42] = "yang";
		Iching[1][42] = "yang";
		Iching[0][42] = "yang";
		Iching[7][42] = "??? Hexagram 43 - Parting";
		Iching[8][42] = "This hexagram signifies on the one hand a break-through after a long accumulation of tension, as a swollen river breaks through its dikes, or in the manner of a cloudburst. On the other hand, applied to human conditions, it refers to the time when inferior people gradually begin to disappear. Their influence is on the wane; as a result of resolute action, a change in conditions occurs, a break-through. The hexagram is linked with the third month [April-May].";
		
		//44
		Iching[5][43] = "yang";
		Iching[4][43] = "yang";
		Iching[3][43] = "yang";
		Iching[2][43] = "yang";
		Iching[1][43] = "yang";
		Iching[0][43] = "yin";
		Iching[7][43] = "??? Hexagram 44 - Coupling";
		Iching[8][43] = "This hexagram indicates a situation in which the principle of darkness, after having been eliminated, furtively and unexpectedly obtrudes again from within and below. Of its own accord the female principle comes to meet the male. It is an unfavorable and dangerous situation, and we must understand and promptly prevent the possible consequences. The hexagram is linked with the fifth month [June-July], because at the summer solstice the principle of darkness gradually becomes ascendant again.";
		
		//45
		Iching[5][44] = "yin";
		Iching[4][44] = "yang";
		Iching[3][44] = "yang";
		Iching[2][44] = "yin";
		Iching[1][44] = "yin";
		Iching[0][44] = "yin";
		Iching[7][44] = "??? Hexagram 45 - Gathering Together";
		Iching[8][44] = "This hexagram is related in form and meaning to Pi, Holding Together (8). In the latter, water is over the earth; here a lake is over the earth. But since the lake is a place where water collects, the idea of gathering together is even more strongly expressed here than in the other hexagram. The same idea also arises from the fact that in the present case it is two strong lines (the fourth and the fifth) that bring about the gather together, whereas in the former case one strong line (the fifth) stands in the midst of weak lines.";
		
		//46
		Iching[5][45] = "yin";
		Iching[4][45] = "yin";
		Iching[3][45] = "yin";
		Iching[2][45] = "yang";
		Iching[1][45] = "yang";
		Iching[0][45] = "yin";
		Iching[7][45] = "??? Hexagram 46 - Ascending";
		Iching[8][45] = "The lower trigram, Sun, represents wood, and the upper, K'un, means the earth. Linked with this is the idea that wood in the earth grows upward. In contrast to the meaning of Chin, Progress (35), this pushing upward is associated with effort, just as a plant needs energy for pushing upward through the earth. That is why this hexagram, although it is connected with success, is associated with effort of the will. In Progress the emphasis is on expansion; Pushing Upward indicates rather a vertical ascent-direct rise from obscurity and lowliness to power and influence.";
				
		//47
		Iching[5][46] = "yin";
		Iching[4][46] = "yang";
		Iching[3][46] = "yang";
		Iching[2][46] = "yin";
		Iching[1][46] = "yang";
		Iching[0][46] = "yin";
		Iching[7][46] = "??? Hexagram 47 - Confining";
		Iching[8][46] = "The lake is above, water below; the lake is empty, dried up. Exhaustion is expressed in yet another way: at the top, a dark line is holding down two light line; below, a light line is hemmed in between two dark ones. The upper trigram belongs to the principle of darkness, the lower to the principle of light. Thus everywhere superior men are oppressed and held in restraint by inferior men.";
		
		//48
		Iching[5][47] = "yin";
		Iching[4][47] = "yang";
		Iching[3][47] = "yin";
		Iching[2][47] = "yang";
		Iching[1][47] = "yang";
		Iching[0][47] = "yin";
		Iching[7][47] = "??? Hexagram 48 - The Well";
		Iching[8][47] = "Wood is below, water above. The wood goes down into the earth to bring up water. The image derives from the pole-and-bucket well of ancient China. The wood represents not the buckets, which in ancient times were made of clay, but rather the wooden poles by which the water is hauled up from the well. The image also refers to the world of plants, which lift water out of the earth by means of their fibers. The well from which water is drawn conveys the further idea of an inexhaustible dispensing of nourishment.";
		
		//49
		Iching[5][48] = "yin";
		Iching[4][48] = "yang";
		Iching[3][48] = "yang";
		Iching[2][48] = "yang";
		Iching[1][48] = "yin";
		Iching[0][48] = "yang";
		Iching[7][48] = "??? Hexagram 49 - Skinning";
		Iching[8][48] = "The Chinese character for this hexagram means in its original sense an animal's pelt, which is changed in the course of the year by molting. From this word is carried over to apply to the 'moltings' in political life, the great revolutions connected with changes of governments. The two trigrams making up the hexagram are the same two that appear in K'uei, Opposition (38), that is, the two younger daughters, Li and Tui. But while there the elder of the two daughters is above, and what results is essentially only an opposition of tendencies, here the younger daughter is above. The influences are in actual conflict, and the forces combat each other like fire and water (lake), each trying to destroy the other. Hence the idea of revolution.";
		
		//50
		Iching[5][49] = "yang";
		Iching[4][49] = "yin";
		Iching[3][49] = "yang";
		Iching[2][49] = "yang";
		Iching[1][49] = "yang";
		Iching[0][49] = "yin";
		Iching[7][49] = "??? Hexagram 50 - The Cauldron";
		Iching[8][49] = "The six lines construct the image of Ting, The Caldron; at the bottom are the legs, over them the belly, then come the ears (handles), and at the top the carrying rings. At the same time, the image suggests the idea of nourishment. The ting, cast of bronze, was the vessel that held the cooked viands in the temple of the ancestors and at banquets. The heads of the family served the food from the ting into the bowls of the guests. The Well (48) likewise has the secondary meaning of giving nourishment, but rather more in relation to the people. The ting, as a utensil pertaining to a refined civilization, suggests the fostering and nourishing of able men, which redounded to the benefit of the state. This hexagram and The Well are the only two in the Book of Changes that represent concrete, men-made objects. Yet here too the thought has its abstract connotation. Sun, below, is wood and wind; Li, above, is flame. Thus together they stand for the flame kindled by wood and wind, which likewise suggests the idea of preparing food.";
		
		//51
		Iching[5][50] = "yin";
		Iching[4][50] = "yin";
		Iching[3][50] = "yang";
		Iching[2][50] = "yin";
		Iching[1][50] = "yin";
		Iching[0][50] = "yang";
		Iching[7][50] = "??? Hexagram 51 - Thunder";
		Iching[8][50] = "The hexagram Chen represents the eldest son, who seizes rule with energy and power. A yang line develops below two yin lines and presses upward forcibly. This movement is so violent that it arouses terror. It is symbolized by thunder, which bursts forth from the earth and by its shock causes fear and trembling.";
		
		//52
		Iching[5][51] = "yang";
		Iching[4][51] = "yin";
		Iching[3][51] = "yin";
		Iching[2][51] = "yang";
		Iching[1][51] = "yin";
		Iching[0][51] = "yin";
		Iching[7][51] = "??? Hexagram 52 - Bound";
		Iching[8][51] = "The image of this hexagram is the mountain, the youngest son of heaven and earth. The male principle is at the top because it strives upward by nature; the female principle is below, since the direction of its movement has come to its normal end. In its application to man, the hexagram turns upon the problem of achieving a quiet heart. It is very difficult to bring quiet to the heart. While Buddhism strives for rest through an ebbing away of all movement in nirvana, the Book of Changes holds that rest is merely a state of polarity that always posits movement as its complement. Possibly the words of the text embody directions for the practice of yoga.";
		
		//53
		Iching[5][52] = "yang";
		Iching[4][52] = "yang";
		Iching[3][52] = "yin";
		Iching[2][52] = "yang";
		Iching[1][52] = "yin";
		Iching[0][52] = "yin";
		Iching[7][52] = "??? Hexagram 53 - Advancement";
		Iching[8][52] = "This hexagram is made up of Sun (wood, penetration) above, ie., without, and Ken (mountain, stillness) below, i.e., within. A tree on a mountain develops slowly according to the law of its being and consequently stands firmly rooted. This gives the idea of a development that proceeds gradually, step by step. The attributes of the trigrams also point to this: within is tranquility, which guards against precipitate actions, and without is penetration, which makes development and progress possible.";
		
		//54
		Iching[5][53] = "yin";
		Iching[4][53] = "yin";
		Iching[3][53] = "yang";
		Iching[2][53] = "yin";
		Iching[1][53] = "yang";
		Iching[0][53] = "yang";
		Iching[7][53] = "??? Hexagram 54 - The Marrying Maiden";
		Iching[8][53] = "Above we have Chen, the eldest son, and below, Tui, the youngest daughter. The man leads and the girl follows him in gladness. The picture is that of the entrance of the girl into her husband's house. In all, there are four hexagrams depicting the relationship between husband and wife. Hsien, Influence, (31) , describes the attraction that a young couple have for each other; Heng, Duration (32), portrays the permanent relationships of marriage; Chien,Development (53), reflects the protracted, ceremonious procedures attending The Marrying Maiden (54), shows a young girl under the guidance of an older man who marries her.";
		
		//55
		Iching[5][54] = "yin";
		Iching[4][54] = "yin";
		Iching[3][54] = "yang";
		Iching[2][54] = "yang";
		Iching[1][54] = "yin";
		Iching[0][54] = "yang";
		Iching[7][54] = "??? Hexagram 55 - Abundance";
		Iching[8][54] = "Chen is movement; Li is flame, whose attribute is clarity. Clarity within, movement without-this produces greatness and abundance. The hexagram pictures a period of advanced civilization. However, the fact that development has reached a peak suggests that this extraordinary condition of abundance cannot be maintained permanently.";
				
		//56
		Iching[5][55] = "yang";
		Iching[4][55] = "yin";
		Iching[3][55] = "yang";
		Iching[2][55] = "yang";
		Iching[1][55] = "yin";
		Iching[0][55] = "yin";
		Iching[7][55] = "??? Hexagram 56 - Traveling";
		Iching[8][55] = "The mountain, Ken, stands still; above it fire, Li, flames up and does not tarry. Therefore the two trigrams do not stay together. Strange lands and separation are the wanderer's lot.";
		
		//57
		Iching[5][56] = "yang";
		Iching[4][56] = "yang";
		Iching[3][56] = "yin";
		Iching[2][56] = "yang";
		Iching[1][56] = "yang";
		Iching[0][56] = "yin";
		Iching[7][56] = "??? Hexagram 57 - The Gentle";
		Iching[8][56] = "Sun is one of the eight doubled trigrams. It is the eldest daughter and symbolizes wind or wood; it has for its attribute gentleness, which nonetheless penetrates like the wind or like growing wood with its roots. The dark principle, in itself rigid and immovable, is dissolved by the penetrating light principle, to which it subordinates itself in gentleness. In nature, it is the wind that disperses the gathered clouds, leaving the sky clear and serene. In human life it is penetrating clarity of judgment that thwarts all dark hidden motives. In the life of the community it is the powerful influence of a great personality that uncovers and breaks up those intrigues which shun the light of day.";
		
		//58
		Iching[5][57] = "yin";
		Iching[4][57] = "yang";
		Iching[3][57] = "yang";
		Iching[2][57] = "yin";
		Iching[1][57] = "yang";
		Iching[0][57] = "yang";
		Iching[7][57] = "??? Hexagram 58 - Open";
		Iching[8][57] = "This hexagram, like sun, is one of the eight formed by doubling of a trigram. The trigram Tui denotes the youngest daughter; it is symbolized by the smiling lake, and its attribute is joyousness. Contrary to appearances, it is not the yielding quality of the top line that accounts for joy here. The attribute of the yielding or dark principle is not joy but melancholy. However, joy is indicated by the fact that there are two strong lines within, expressing themselves through the medium of gentleness. True joy, therefore, rests on firmness and strength within, manifesting itself outwardly as yielding and gentle.";
		
		//59
		Iching[5][58] = "yang";
		Iching[4][58] = "yang";
		Iching[3][58] = "yin";
		Iching[2][58] = "yin";
		Iching[1][58] = "yang";
		Iching[0][58] = "yin";
		Iching[7][58] = "??? Hexagram 59 - Dispersal";
		Iching[8][58] = "Wind blowing over water disperses it, dissolving it into foam and mist. This suggests that when a man's vital energy is dammed up within him (indicated as a danger by the attribute of the lower trigram), gentleness serves to break up and dissolve the blockage.";
		
		//60
		Iching[5][59] = "yin";
		Iching[4][59] = "yang";
		Iching[3][59] = "yin";
		Iching[2][59] = "yin";
		Iching[1][59] = "yang";
		Iching[0][59] = "yang";
		Iching[7][59] = "??? Hexagram 60 - Moderation";
		Iching[8][59] = "A lake occupies a limited space. When more water comes into it, it overflows. Therefore limits must be set for the water. The image shows water below and water above, with the firmament between them as a limit. The Chinese word for limitation really denotes the joints that divide a bamboo stalk. In relation to ordinary life it means the thrift that sets fixed limits upon expenditures. In relation to the moral sphere it means the fixed limits that the superior man sets upon his actions the limits of loyalty and disinterestedness.";
		
		//61
		Iching[5][60] = "yang";
		Iching[4][60] = "yang";
		Iching[3][60] = "yin";
		Iching[2][60] = "yin";
		Iching[1][60] = "yang";
		Iching[0][60] = "yang";
		Iching[7][60] = "??? Hexagram 61 - Inner truth";
		Iching[8][60] = "The wind blows over the lake and stirs the surface of the water. Thus visible effects of the invisible manifest themselves. The hexagram consists of firm lines above and below, while it is open in the center. This indicates a heart free of prejudices and therefore open to truth. On the other hand, each of the two trigrams has a firm line in the middle; this indicates the force of inner truth in the influences they present. The attributes of the two trigrams are: above, gentleness, forbearance toward inferiors; below, joyousness in obeying superiors. Such conditions create the basis of a mutual confidence that makes achievements possible. The character of fu ('truth') is actually the picture of a bird's foot over a fledgling. It suggests the idea of brooding. An egg is hollow. The light-giving power must work to quicken it from outside, but there must be a germ of life within, if life is to be awakened. Far-reaching speculations can be linked with these ideas.";
		
		//62
		Iching[5][61] = "yin";
		Iching[4][61] = "yin";
		Iching[3][61] = "yang";
		Iching[2][61] = "yang";
		Iching[1][61] = "yin";
		Iching[0][61] = "yin";
		Iching[7][61] = "??? Hexagram 62 - Small Exceeding";
		Iching[8][61] = "While in the hexagram Ta Kuo, Preponderance of the Great (28), the strong lines preponderate and are within, inclosed between weak lines at the top and bottom, the present hexagram has weak lines preponderating, though here again they are on the outside, the strong lines being within. This indeed is the basis of the exceptional situation indicated by the hexagram. When strong lines are outside, we have the hexagram I, Providing Nourishment (27), or Chung Fu, Inner Truth, (61); neither represents and exceptional state. When strong elements within preponderate, they necessarily enforce their will. This creates struggle and exceptional conditions in general. But in the present hexagram it is the weak element that perforce must mediate with the outside world. If a man occupies a position of authority for which he is by nature really inadequate, extraordinary prudence is necessary.";
		
		//63
		Iching[5][62] = "yin";
		Iching[4][62] = "yang";
		Iching[3][62] = "yin";
		Iching[2][62] = "yang";
		Iching[1][62] = "yin";
		Iching[0][62] = "yang";
		Iching[7][62] = "??? Hexagram 63 - Already Completed";
		Iching[8][62] = "This hexagram is the evolution of T'ai Peace (11) . The transition from confusion to order is completed, and everything is in its proper place even in particulars. The strong lines are in the strong places, the weak lines in the weak places. This is a very favorable outlook, yet it gives reason for thought. For it is just when perfect equilibrium has been reached that any movement may cause order to revert to disorder. The one strong line that has moved to the top, thus effecting complete order in details, is followed by the other lines. Each moving according to its nature, and thus suddenly there arises again the hexagram P'i, Standstill (12).Hence the present hexagram indicates the conditions of a time of climax, which necessitate the utmost caution.";
		
		//64
		Iching[5][63] = "yang";
		Iching[4][63] = "yin";
		Iching[3][63] = "yang";
		Iching[2][63] = "yin";
		Iching[1][63] = "yang";
		Iching[0][63] = "yin";
		Iching[7][63] = "??? Hexagram 64 - Not Yet Completed";
		Iching[8][63] = "This hexagram indicates a time when the transition from disorder to order is not yet completed. The change is indeed prepared for, since all the lines in the upper trigram are in relation to those in the lower. However, they are not yet in their places. While the preceding hexagram offers an analogy to autumn, which forms the transition from summer to winter, this hexagram presents a parallel to spring, which leads out of winter's stagnation into the fruitful time of summer. With this hopeful outlook the Book of Changes come to its close.";
		return Iching;
	}
	
	public static StringBuffer stringFormatter(String s){
		StringBuffer sb = new StringBuffer(s);
		
		int i = 0;
		int offset = 85;
		while( i < sb.length()){
			if(i == offset){
				while((sb.charAt(i)) != ' '){
					i--;
				}
				if((sb.charAt(i)) == ' '){
					sb.insert(i +1, "\n");
				}
				offset = offset + 80;
			}
		i++;
		}
		return sb;
	}
}
