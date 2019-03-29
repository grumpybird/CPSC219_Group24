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

The GITHUB link respitory link: https://github.com/grumpybird/CPSC219_Group24.git

To locate demo1, you will have to go to SpaceInvaders.java in our repository and then download the file and compile it through command javac and after compilation run program with java SpaceInvaders in console. Or in eclipse by downloading file and running it. 


Referenced to develop code:

(1) Space Invaders an Accelerated Tutorial: Accessed Monday February 25th, 2019.
http://www.cokeandcode.com/info/tut2d.html?fbclid=IwAR3sCqHy-sJhQbDlU632HTuKlMD44M0nonQxzfUlZQPRz6Dw88MLenVhQJc

(2) Space Invaders clone tutorial: Accessed Monday February 25th, 2019.
http://zetcode.com/tutorials/javagamestutorial/spaceinvaders/?fbclid=IwAR3vAz1YxWej1MDVjSO7J6KC3evf57nWm-iQYQcRNfFcOvcHL4u8DLic0TQ

(3) TicTacToe Game made in Java for Eclipse IDE by Benjamin Pottinger: Accessed Monday February 25th, 2019.
https://gist.github.com/xSputnicKx/fbf9a329818cff0a4a02f773b22ed9a7?fbclid=IwAR0ojil66TCbkFd4DlJT5zh35pDCxidxa_RFCssuYXWBCaEO2bDXCSfzGk8

(4) Lectures and materials from Course (CPSC 219) Instructor: Nathaly Verwaal 

(5) Code from TicTacToe Example in Lecture to develop board and board class.

(6) Knowledge and course material gathered from current course CPSC 219: Intro to Computer Science for Multidisciplinary Studies II

(7) Knowledge and course material gathered from previous course  CPSC 217: Intro to Computer Science for Multidisciplinary Studies I

(6) Java Official Oracle documentation.

(7) StackOverflow to solve syntax and logic errors during development for java.

DEMO 2:

For DEMO 2 we are making the GUI for our Space Invaders game. We will also stop running everything form the SpaceInvaders.java file and instead use various classes for each attribute of the game. 
The main file will be SpaceInvaders.java, this will be the file that starts, manages and quits the game. It will also call the other classes and get information back from them to determine the status of all objects on the board, as well as, update the displayed information accordingly.

The GITHUB link respitory: https://github.com/grumpybird/CPSC219_Group24.git

To locate demo2, you will have to go to our github respitory and download all the files into a zip fileand compile it through command javac and after compilation run program with java SpaceInvaders in console. Or in Eclipse by importing all the class files and running it. 

FOR DEMO #2 REFERENCE USED:

(8) SpaceInvadersFx Java program w/ JavaFx by tonysaavedra: Accessed March 11th, 2019.
https://github.com/ajsaavedra/SpaceInvadersFX/blob/master/src/com/tonyjs/spaceinvadersfx/SpaceInvadersFX.java?fbclid=IwAR3AcB9vlOk-X9vefARmNS2MSdIlTWzpVsenYw7k7GC2kHGGmNRPvMxmT34

(9) SpaceInvadersApp.java by Almas Baimagambetov: Accessed March 11th, 2019.
https://github.com/AlmasB/FXTutorials/blob/master/src/com/almasb/invaders/SpaceInvadersApp.java

(10) Space Invaders - Moving The Bullet: Accessed March 11th, 2019.
https://www.dreamincode.net/forums/topic/201658-space-invaders-moving-the-bullet/

(11) Introduction to JavaFX for game development: Accessed March 12th & 13th, 2019.
https://gamedevelopment.tutsplus.com/tutorials/introduction-to-javafx-for-game-development--cms-23835?fbclid=IwAR12HZJYDyIkOlPnMyq1zEHVuX2UhoqgjZRY8EDqa6TpMYXr_hDkS3SxoCA

(12) SpaceInvaders Barrier Image: Accessed March 13, 2019.
https://forum.mafiascum.net/viewtopic.php?f=84&t=60133

(13) Bullet png. Accessed: March 13, 2019.
http://pluspng.com/png-5832.html

(14) Shindanaide's space invaders https://github.com/Shindanaide/SpaceInvaders

(15) space invaders using imageview http://technolark.blogspot.com/2009/06/space-invaders-fx-part-1.html

(16) ccanon94's space invaders https://github.com/ccannon94/javafx-space-invaders

(17) alien1.gif https://github.com/Shindanaide/SpaceInvaders/blob/master/src/it/gov/casimiri/spaceinvaders/resources/invasore1.gif



DEMO 3: 

In DEMO 3, there is both the text-based and GUI version of the code. The GUI version consists of the main file SpaceInvaders.java, where it will manage and quit the game. It will also be able to call the other classes and get information back from them to determine the status of all objects on the board, as well as, update the diplayed information accordingly. The text-based version will have the ability to shoot. 

The GITHUB link respitory: https://github.com/grumpybird/CPSC219_Group24.git

To locate DEMO3, you will have to go to our github respitory and download all the files into a zip file and compile it through command javac and after compilation run program with java SpaceInvaders in console. Or in Eclipse by importing all the class files and running it. 

FOR DEMO 3 REFERENCES USED: 

(18) Space Invaders Game by Shindanaide. Date accessed: March 28th, 2019.
https://github.com/Shindanaide/SpaceInvaders?fbclid=IwAR3U7CdlqdrY7XtfpggYKJnRUT1srazyE1mFN_zpYgg2H5mYoIZL8oZieZo
