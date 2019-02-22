import java.util.ArrayList;
import java.util.Random; 

public class Board {
	private ArrayList<Obstacles> obstacles;
	private Avatar avatar; 
 char[][] grid;
	
	public static void main(String[] args) {
		char[][] startConfiguration = new char[5][5];
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				startConfiguration[row][column] = args[row*5+column].charAt(0)
 
 }
			
import java.util.Scanner;
public static void main(String args[])

{int p=4;

Scanner sc=new Scanner(System.in);

char ar[][]=new char[6][10];

for(i=0;i<6;i++)

for(j=0;j<10;j++)

ar[i][j]='';

for(i=0;i<10;i++)

ar[0][i]='S';

for(i=1;i<9;i++)

ar[1][i]='S';

for(i=2;i<8;i++)

ar[2][i]='S';

ar[5][4]='P';

        for(i=0;i<6;i++)

{for(j=0;j<10;j++)

System.out.print(ar[i][j]);

System.out.println();

}

String m=""+sc.nextLine();

if(m.length()==3)

{

ar[p]='';

p=Integer.parseInt(m);

ar[5][Integer.parseInt(m)]='P';

}

if(m.length()==1)

{

for(i=0;i<=2;i++)

ar[i][p]='';

}

}

}			
