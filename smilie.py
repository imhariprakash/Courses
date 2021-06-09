from karel.stanfordkarel import *

"""
File: ExtensionKarel.py
-----------------------
This file is for optional extension programs. 
"""

def turn_right():
    for i in range(3):
        turn_left()

def turn_around():
    for i in range(2):
        turn_left()

def rreturn():
    turn_around()
    while front_is_clear():
        move()
    turn_right()
    move()
    turn_right()
    
    

def main():
    #line 1
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(11):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    rreturn()
    #line 2
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(11):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
    rreturn()
    #line 3
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(3):
        paint_corner(GREEN)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()
    #line 4 and 5
    for i in range(2):
        for i in range(1):
            paint_corner(RED)
            move()
        for i in range(1):
            paint_corner(WHITE)
            move()
        for i in range(5):
            paint_corner(RED)
            move()
        for i in range(2):
            paint_corner(GREEN)
            move()
        for i in range(4):
            paint_corner(RED)
            move()
        for i in range(1):
            paint_corner(WHITE)
            move()  
        for i in range(1):
            paint_corner(RED)
        rreturn()
    #line 6 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(3):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(GREEN)
        move()
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()

    #line 7 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(GREEN)
        move()
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(GREEN)
        move()
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(GREEN)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()

    #line 8 
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(8):
        paint_corner(GREEN)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()
    #line 9 
    for i in range(5):
        paint_corner(WHITE)
        move()
    for i in range(6):
        paint_corner(GREEN)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()
    # line 10 
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(7):
        paint_corner(GREEN)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()
    # line 11
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(3):
        paint_corner(WHITE)
        move()
    for i in range(5):
        paint_corner(GREEN)
        move()
    for i in range(3):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()
    #line 12 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(3):
        paint_corner(RED)
        move()
    for i in range(6):
        paint_corner(GREEN)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()
    #line 13
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(3):
        paint_corner(RED)
        move()
    for i in range(5):
        paint_corner(GREEN)
        move()
    for i in range(3):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
    rreturn()
    #line 14 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(4):
        paint_corner(GREEN)
        move()
    for i in range(3):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
    rreturn()
    #line 15 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(6):
        paint_corner(GREEN)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    rreturn()
    #line 16 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(5):
        paint_corner(GREEN)
        move()
    rreturn()
    #line 17 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(4):
        paint_corner(GREEN)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(3):
        paint_corner(RED)
        move()
    paint_corner(RED)
    rreturn()
    #line 18
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(2):
        paint_corner(RED)
        move()
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(4):
        paint_corner(GREEN)
        move()
    for i in range(4):
        paint_corner(WHITE)
        move()
    paint_corner(RED)
    rreturn()
    #line 19 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(5):
        paint_corner(RED)
        move()
    for i in range(2):
        paint_corner(GREEN)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    paint_corner(RED)
    rreturn()
    #line 20 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(4):
        paint_corner(GREEN)
        move()
    for i in range(3):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    paint_corner(RED)
    rreturn()
    #line 21 
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(3):
        paint_corner(GREEN)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    paint_corner(RED)
    rreturn()
    #line 22
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(4):
        paint_corner(RED)
        move()
    for i in range(2):
        paint_corner(GREEN)
        move()
    for i in range(3):
        paint_corner(RED)
        move()
    for i in range(1):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    rreturn()
    #line 23
    for i in range(2):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    for i in range(9):
        paint_corner(WHITE)
        move()
    for i in range(1):
        paint_corner(RED)
        move()
    rreturn()
    # line 24 
    for i in range(3):
        paint_corner(WHITE)
        move()
    for i in range(9):
        paint_corner(RED)
        move()

if __name__ == "__main__":
    run_karel_program("15x24.w")
