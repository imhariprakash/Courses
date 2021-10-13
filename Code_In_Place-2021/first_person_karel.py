N_ROW = 3
N_COL = 3


def main():
    print("Welcome to first person Karel. You're at row 1, column 1, facing East (facing column 3)")
    initial_row = 1
    initial_col = 1
    current_row = 1
    current_col = 1
    current_dir = 'east'
    initial_dir = 'east'
    decision = input("What would you like to do? You can move and turn left. Press enter to finish. ")
    while (decision != ""):
        if (decision.lower() == 'move'):
            if (current_dir == 'east' and current_col < N_COL):
                current_col += 1
                print("You moved one step forward and you're at row", current_row, "column", current_col)
            elif (current_dir == 'east' and current_col == N_COL):
                print("You can't move forward!")
            elif (current_dir == 'west' and current_col > initial_col):
                current_col -= 1
                print("You moved one step forward and you're at row", current_row, "column", current_col)
            elif (current_dir == 'west' and current_col == initial_col):
                print("You can't move forward")
            elif (current_dir == 'north' and current_row < N_ROW):
                current_row += 1
                print("You moved one step forward and you're at row", current_row, "column", current_col)
            elif (current_dir == 'north' and current_row == N_ROW):
                print("You can't move forward!")
            elif (current_dir == 'south' and current_row > initial_row):
                current_row -= 1
                print("You moved one step forward and you're at row", current_row, "column", current_col)
            elif (current_dir == 'south' and current_row == initial_row):
                print("You can't move forward!")
        elif (decision.lower() == 'turn left'):
            if (current_dir == 'east'):
                current_dir = 'north'
                print("You turned left and are now facing North.")
            elif (current_dir == 'north'):
                current_dir = 'west'
                print("You turned left and are now facing West.")
            elif (current_dir == 'west'):
                current_dir = 'south'
                print("You turned left and are now facing South.")
            elif (current_dir == 'south'):
                current_dir = 'east'
                print("You turned left and are now facing East.")
        else:
            print("you input is not matching! please enter move or turn left")
        decision = input("What would you like to do? You can move and turn left. Press enter to finish.")
    print("You've ended up at row", current_row, "and column", current_col, "facing", current_dir, ".")


if __name__ == "__main__":
    main()