.. raw:: pdf

   PageBreak

.. _tic-tac-toe:

=====================================
Exercise #3 — How to Play Tic-Tac-Toe
=====================================

.. list-table:: Tic-Tac-Toe characteristics
   :widths: 10 25
   :header-rows: 1

   * - Characteristic
     - Details
   * - Players
     - 2
   * - Age
     - All
   * - Setup time
     - Minimal
   * - Playing time
     - ~ 1 minute
   * - Genre
     - Paper-and-pencil game
   * - Type
     - Finite combinatorial positional game
   * - Other names
     - Noughts and Crosses, Xs and Os

About the game
==============

**Tic-Tac-Toe (TTT)**, aka Noughts and Crosses or Xs and Os, is a simple
two-player game played on a board, which is a grid of squares. The object
of the game is placing a predefined number of tokens in a horizontal,
vertical, or diagonal row.

TTT belongs to the following game types:

* Combinatorial
   Game rules are known and involve no luck

* Positional
   Players alternate in taking possession of the grid squares to form a
   winning configuration of elements, which are the lines of a prefidined
   number of squares (horizontally, vertically, or diaginally)

* Finite
   The game has a finite number of legal moves. There is no moves sequence
   leading to an infinite game

* Zero-sum
   If played optimally by both players, every game ends in a tie

.. admonition:: **Historical reference**

   The TTT game takes roots from a Roman strategy game known as Terni
   lapilli. The first print reference to a game called `tick-tack-toe`
   occurred in the last decade of the XIXth century and referred
   to a game for children played on a slate.

Playing the game
================

TTT is a simple two-player game. The game is traditionally played by being
drawn on paper. If you do not have a live opponent, you can play at your
desktop or online using your web browser.

This procedure implies that you play TTT on paper on a grid of three by three
squares.

**To play TTT:**

#. Draw the board that is a grid of three by three squares:

   .. code-block:: bash

           |     |
           |     |
      -----+-----+-----
           |     |
           |     |
      -----+-----+-----
           |     |
           |     |

#. Take possession of tokens that are usually an ``X`` for the first player
   and an ``O`` for the second player. You can use `rock-paper-scissors`
   to decide who moves first.

#. Take turns placing your tokens on the game board. The object of the game is
   to get three tokens in a row either vertically, horizontally, or diagonally.

   All games can be no longer than nine moves that include five X-moves and
   four O-moves.

The game is over when one of the following statements is true:

* All nine squares are full and no player has got three tokens in a row.
  The game is a draw. If played optimally by both players, the game always ends
  in tie. The stalemate is called a cat game.

* One of the players forms the winning configuration of tokens, their opponent
  loses.

Winning strategy tips
=====================

Since TTT is a solved game, there exists an optimal sequence of moves that both
players can take to play a perfect game.

How to make the first move
++++++++++++++++++++++++++

The best first move is the central square. Otherwise, the chances to lose in
the game increase.

How to respond to the first move
++++++++++++++++++++++++++++++++

Avoid middle side squares when responding to the first move of your opponent.
If the first player possesses the central square, place your token to one of
the corner squares of the grid.

If your opponent is a novice player and does not mark the center of the
board, place your token in the center.

Further moves
+++++++++++++

There is a number of simple rules to follow for a perfect game:

* If the opponent marks the central corner, play the corner squares. Otherwise,
  place your token in the center.
* If the opponent plays one of the corner squares, mark the opposite corner.
* Block the opponent by placing your token to an empty square that continues
  their two-token line.
* Use the `fork` strategy. Create an opportunity where there are two ways
  to create the winning combination. Your opponent can only block one on their
  turn letting you win the game. Also, block your opponent's fork opportunity.
* Be attentive, do not miss the chance to win the game. When you have two
  tokens in a row, place the third one to create the winning line.

Taking the game to the next level
=================================

To increase the game tree and make the game less trivial, play TTT on larger
grids, for example, 4-by-4, 10-by-10, and others. For any grids greater than
5-by-5, set the goal to get 5 or more tokens in a row as in Gomoku, another
pencil-and-paper game where players alternate turns placing a stone of their
color on a 15-by-15 Go board.

.. admonition:: Where to next

   `Learn about Gomoku <https://en.wikipedia.org/wiki/Gomoku>`__
