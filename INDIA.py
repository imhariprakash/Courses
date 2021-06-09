from karel.stanfordkarel import *

def main():
    color_fill(GREEN)
    white_fill()
    color_fill(ORANGE)

def color_fill(color):
    for i in range(4):
        while front_is_clear():
            paint_corner(color)
            move()
            paint_corner(color)
        back_to_position()
        next_stage()

def white_fill():
    row5()
    row6()
    row7()
    row8()

def row5():
    color(8,WHITE)
    color(2,BLUE)
    color(8,WHITE)
    back_to_position()
    next_stage()

def row6():
    color(7,WHITE)
    color(1,BLUE)
    color(1,WHITE)
    color(2,BLUE)
    color(7,WHITE)
    back_to_position()
    next_stage()

def row7():
    color(7,WHITE)
    color(2,BLUE)
    color(1,WHITE)
    color(1,BLUE)
    color(7,WHITE)
    back_to_position()
    next_stage()

def row8():
    row5()
    
def color(steps,color):
    for i in range(steps):
        paint_corner(color)
        if front_is_clear():
            move()
    

def back_to_position():
    turn_around()
    while front_is_clear():
        move()

def next_stage():
    turn_right()
    if front_is_clear():
        move()
        turn_right()
    else:
        turn_right()
        back_to_position()

def turn_right():
    for i in range(3):
        turn_left()

def turn_around():
    for i in range(2):
        turn_left()
    


if __name__=="__main__":
    run_karel_program("18x12.w")

