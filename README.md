This program was made to demonstrate the Monty Hall problem. For those unfamiliar with the paradox:
> Suppose you're on a game show, and you're given the choice of three doors: Behind one door is a car;
> behind the others, goats. You pick a door, say No. 1, and the host, who knows what's behind the doors,
> opens another door, say No. 3, which has a goat. He then asks, "Do you want to pick door No. 2?"
> Is it to your advantage to switch your choice?

A common misconception is that since there are two unopened doors, one with a car and one without, 
you have a 50/50 chance of winning and therefore it doesn't matter if you switch. In reality, switching actually doubles your chances of winning.

Program output:

```
Games where initial choice was changed: 
Won: 66%
Lost: 33%

Games where initial choice was not changed: 
Won: 33%
Lost: 66%
```
Explanation: Switching your choice will reverse the potential outcome -- if you previously chose a door with a goat, 
you now get the car, and vice versa. It's more likely that you chose the wrong door in the beginning 
(two wrong doors, one right door), so switching is more likely to have the desired outcome. More info can be found [here](https://en.wikipedia.org/wiki/Monty_Hall_problem).
