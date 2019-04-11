import java.util.Collections;

public class Obstacles extends SpaceInvadersT{
	
public Obstacles () {
	super(getLocation(), getTargetQuads(), getPoints());
	}

public static void moveRight() {
	if (getLocation() < 62) {
		Collections.swap(myList, getLocation(), getLocation() + 1);
		location = location + 1;
		System.out.println ("                            points:" + getPoints());
			for (int i = 0; i < myList.size(); i++) {
				System.out.print(myList.get(i) + "          ");
					if ((i + 1) % 7 == 0){
						System.out.println("");
					}
			}	
	
	}
	else 
		System.out.println("Sorry can't move farther right.");
	
}
public static void moveLeft () {
	if (getLocation() > 56) {
		Collections.swap(myList, getLocation(), getLocation() - 1);
		location = location - 1;
		System.out.println ("                            points:" + getPoints());
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + "          ");
			if ((i + 1) % 7 == 0){
				System.out.println("");
			}
		}
	
	}
	else 
		System.out.println("Sorry can't move farther left.");	
	
}


}
