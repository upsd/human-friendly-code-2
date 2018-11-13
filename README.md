# Human Friendly Code #2 - Football Match
This project demonstrates refactoring code so it is much easier for humans (developers) to understand and make changes to if required.

## The scenario
The program's purpose is to record the score of a football match.

For instance:

`Given` the score is 0-0

`When` the home team scores a goal

`Then` the score is now 1-0

Furthermore, imagine that football match winners were based on a target score as opposed to a time-limit:

`Given` the target score is 5 goals and the score is currently 4-0

`When` the home team scores a goal

`Then` the home team has won

## How it was refactored
See [this branch](https://github.com/upsd/human-friendly-code-2/tree/original-code) for how an original solution was
reached, and how it was refactored into a much more human-friendly solution.

Take a look at the [commits](https://github.com/upsd/human-friendly-code-2/commits/master) for more detail on the steps
taken to refactor the original solution.

N.B. You can change the public interface of this code, this code is not in production. As long as it satisfies the
requirements supplied above, any changes are valid.