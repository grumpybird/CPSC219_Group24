
public class Bullets extends SpaceInvadersT{

public Bullets () {
super(getLocation(), getTargetQuads(), getPoints());
}

public static void fire() {
	int count = 1;
	for (count = 1; count<=8 ;count++) {
	 if (getTargetQuads()[(getLocation() - 7*(count))].equals (" ") == false){
		 getTargetQuads()[(getLocation() - 7*count)] = " ";
  		myList.set((getLocation() - 7*(count)), " ");
  		
  		break;	
	 }
	}
	System.out.println ("                            points:" + getPoints());
  	for (int i = 0; i < myList.size(); i++) {
  		System.out.print(myList.get(i) + "          ");
  		if ((i + 1) % 7 == 0){
		System.out.println("");
				}
  			}
  	if (myList.contains("*") == false) {
  		System.out.println("YOU WON!!!");
  	}
}
}