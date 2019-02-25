Project for Computer Science 219
Group 24:
Paula Almeida
Gabriel Atienza
Sharon Chan
Hayden Kerr
Theresa Lam

Animation game similar to "space invaders"

How it works:

The alien,shield and avatar objects are stored in a 5x5 2D array [row][col] list. For our first demo we are making a text based version of our game where we prompt the user for input that will be processed and displays the result. Which will be asking user to move the avatar left or right which will update the array list and a new board will be created with the updated input from user. In the first demo, all of our methods and classes are under the main class, this includes initalizing the 2D list with enemies, the avatar class that initializes the location and movement of the avatar and asking for input from user and displaying the result. However, in the following demos we will split everything into its own classes: Avatar, Space Invaders, Points, Board and Obstacles, that will have its own methods and will only be called in the main class. 

To locate demo1, you will have to go to SpaceInvaders.java in our repository and then download the file and compile it through command javac and after compilation run program with java SpaceInvaders in console. Or in eclipse by downloading file and running it. 
