from karel.stanfordkarel import *

def main():
    row1()
    row2()
    row3()
    row4()
    row5()
    row6()
    row7()
    row8()

def row1():
    design(2)
    move_color(4,YELLOW)
    design(2)
    back_to_position()
    next_stage()

def row2():
    design(1)
    move_color(6,YELLOW)
    design(1)
    back_to_position()
    next_stage()

def row3():
    move_color(2,YELLOW)
    move_color(4,BLACK)
    move_color(2,YELLOW)
    back_to_position()
    next_stage()

def row4():
    move_color(1,YELLOW)
    move_color(1,BLACK)
    move_color(4,YELLOW)
    move_color(1,BLACK)
    move_color(1,YELLOW)
    back_to_position()
    next_stage()

def row5():
    move_color(8,YELLOW)
    back_to_position()
    next_stage()

def row6():
    move_color(2,YELLOW)
    move_color(1,BLACK)
    move_color(2,YELLOW)
    move_color(1,BLACK)
    move_color(2,YELLOW)
    back_to_position()
    next_stage()

def row7():
    design(1)
    move_color(6,YELLOW)
    design(1)
    back_to_position()
    next_stage()

def row8():
    design(2)
    move_color(4,YELLOW)
    design(2)

    
def back_to_position():
    turn_around()
    while front_is_clear():
        move()

def next_stage():
    turn_right()
    move()
    turn_right()

def turn_right():
    for i in range(3):
        turn_left()

def turn_around():
    for i in range(2):
        turn_left()


def move_color(steps,color):
    for i in range(steps):
        paint_corner(color)
        if front_is_clear():
            move()

def design(number):
    for i in range(number):
        paint_corner(RED)
        put_beeper()
        if front_is_clear():
            move()
    
    


if __name__=="__main__":
    run_karel_program("8x8.w")
