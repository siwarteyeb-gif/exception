package exeption;

public class Factorielle { public static void main (String[] args)
{
int i, nbEntiers=0, factorielle=1;
int ancien;


try {
	nbEntiers= Integer.parseInt(args[0]);
if(nbEntiers<0) {
	throw new Fact1("donner un argument positive");}
if(nbEntiers>20) {
	throw new Fact2("donner un entier inferieur a 20");}
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Erreur : aucun argument n'a été donné.");
}
catch(NumberFormatException e) {
	System.out.println("Erreur donner une parametre entiere");}

catch(Fact2  | Fact1 e) {
	System.out.println(e.getMessage());

}

for (i=2;i<= nbEntiers;i++)
{
ancien=factorielle;
factorielle *= i;
}
System.out.println(" Voila la factorielle des "+ nbEntiers +
" premiers entiers : "+ factorielle );
}}


