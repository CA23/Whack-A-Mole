# Whack-A-Mole

A simple text based implementation of the Whack A Mole game

Added the Python version - works flawlessy

Yet to debug the Java version, contains errors and warnings.

The Python version of the game.

Run the python (whack.py) file using python whack.py on the termninal or you could also make it executable using chmdod +x whack.py and run it using ./whack.py on Linux (and the equivalent of running a python program on windows and other OS)

You will be prompted with basic info about the grid and an option to enter the size of the grid. The number of attempts depends on the size you choose

The game appears as a grid of characters with 'O' representing either an empty location or a hidden mole.

Next, you see a prompt to enter the coordinates of the location you intend to whack.

Once whacked, a grid representing the current status of your game appears and a 'W' represents a whacked mole.

The prompt asking for coordinates keeps appearing until you have either whacked all moles (winning the game) which is followed by a congratulatory message, or run out of attempts which is followed by an appropriate prompt or have chosen to quit the game. You can quit the game by entering -1 and -1 as coordinates. All these scenarios end with the final game grid and an End of Game message.



In the Java version, the grid appears as characters with 'M' representing a mole (initially not visible),  'W' representing a whacked mole and '*' representing either an unwhacked mole or an empty location

User manually enters the coordinates of a location to 'whack a mole' in a square grid

Yet to debug, contains errors and warnings.
