print("Rules: Rock beats Scissors, Scissors beats Paper, Paper beats Rock\n")
while True:
    player1 = input("Player 1, enter Rock, Paper, or Scissors: ").strip().lower()
    player2 = input("Player 2, enter Rock, Paper, or Scissors: ").strip().lower()
        if player1 == player2:
        print("It's a tie!")
    elif player1 == "rock":
        if player2 == "scissors":
            print("Player 1 wins! Rock beats Scissors.")
        elif player2 == "paper":
            print("Player 2 wins! Paper beats Rock.")
        else:
            print("Invalid input by Player 2.")
    elif player1 == "paper":
        if player2 == "rock":
            print("Player 1 wins! Paper beats Rock.")
        elif player2 == "scissors":
            print("Player 2 wins! Scissors beats Paper.")
        else:
            print("Invalid input by Player 2.")
    elif player1 == "scissors":
        if player2 == "paper":
            print("Player 1 wins! Scissors beats Paper.")
        elif player2 == "rock":
            print("Player 2 wins! Rock beats Scissors.")
        else:
            print("Invalid input by Player 2.")
    else:
        print("Invalid input by Player 1.")
    play_again = input("\nDo you want to play another round? (yes/no): ").strip().lower()
    if play_again != "yes":
        print("Thanks for playing! Goodbye :wave:")
        break







