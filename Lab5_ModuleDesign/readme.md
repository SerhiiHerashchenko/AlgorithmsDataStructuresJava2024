**The game consists of 4 modules:**
1. **Computer**
1. **Player**
1. **DataProcessing**
1. **GameProcessing**

2. **Computer module** consists of 2 structures:
    * **Computer interface**, that states basic functionality of ai player, more precisely, the ability to pick the number and check player's move.
    * **ComputerImpl class** that implements previous interface. This class implements methods wich give us posibility to pick a number, check the player's move, and check player's position (winner/ continue to play).
2. **Player module** has also 2 structures:
    * **Player interface**, that states the makeMove() method.
    * **PLayerImpl class**, that implements previous interface, and realize method wich allows player to make move and enter the number.
2. **DataProcessing** *has 2 submodules*:
    3. **Input module** is composed of two structures:
        * **InputData interface**, that states basic method of data collection.
        * **InputDataConsole class**, that implements InputData methods for console users(players)
    3. **Output module**:
        * **OutputData interface**, that states basic method of data returning.
        * **OutputDataImpl class** implements method from previous interface, and allows us to return data collected by InputDataConsole method.
2. **GameProcessing** is a main class wich implements game process.

>[!IMPORTENT]
>Current problem of implementation: exeption of the empty input after the first player's move.