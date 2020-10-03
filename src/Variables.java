public class Variables {
	public static void main(final String[] args) {
		//exo1
        char ch = 'A';
        int ascii = ch;
        System.out.println("La valeur ASCII de "+ch+" est: " + ascii);
        
		//exo2
		String txt = "a";
		System.out.println("La majuscule de:"+txt.toUpperCase());
		
		//exo3
		int premier = 4;
		int deuxieme = 6;
		int troisieme = 20;
		int moyenne = (premier + deuxieme + troisieme)/3;
		System.out.println("la moyenne de numbre 4+6+20 est: "+moyenne);
		
		//exo4
		int numbre = 10;
		int secondnumbre = 6;
		int sum =(numbre + secondnumbre);
		int quotient = (numbre % secondnumbre);
	      System.out.println("la somme des deux nombres'10 et 6' est : "+sum+"\n et le quotient est :"+quotient);
		
		//exo5
		String str = "abcd";
		StringBuilder lettersBuff = new StringBuilder(str);
		String str_inverse = lettersBuff.reverse().toString();
		System.out.println("'abcd' inverse donne : "+str_inverse);
		
	}
}
	