public class PhraseOMatic {

	public static void main(String[] args) {
		
String[] wordListOne = {"24/7", "multi-Tier", "30,00 foot","B-to-B","win-win","front-end","webbased","presuasive","smart","six-sigma","critical-path","dynamic"};

String[] wordListTwo = {"empowered", "sticky", "value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","leverageed","aligned", "targeted", "shared", "cooperative", "accelerated"};

String[] wordListThree = {"process", "tripping-point", "solution","architecture","core competency","strategy","mindshare","portal","space","paradigm","mission"};

int oneLength = wordListOne.length;
int twoLength = wordListTwo.length;
int threeLength = wordListThree.length;


int rand1 = (int) (Math.random() * oneLength);
int rand2 = (int) (Math.random() * twoLength);
int rand3 = (int) (Math.random() * threeLength);
	
String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

System.out.println("What we need is a " + phrase);
	
	
	
}}