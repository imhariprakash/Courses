#include<stdio.h>

#include<conio.h>

#include "graphics.h"

#include<dos.h>

#include<stdlib.h>

void main()

int gd-DETECT, gm, i, j, k, maxx, maxy, midx, midy;

clrscr();

initgraph (&gd, &gm," ");

setbkcolor (0); maxx-getmaxx ();

maxy=getmaxy();

midx-maxx/2; midy-maxy/2;

setcolor (15); // floodfil1 (0,0, RED);

rectangle (0,0,maxx, maxy); setcolor (2);

rectangle (5, 5, maxx-5, maxy-5); setcolor (4);

settextstyle (10, HORIZ DIR, 2); outtextxy (130, 10, "BY SUDHIR DAWRA");

// FOR FACE SHAPE

for(i=0; i<-40; i++)

setcolor (4);

ellipse (300, 150, 270, 330, 120,290); setcolor (4);

ellipse (300, 150, 210, 270, 120, 290);

setcolor (8);

ellipse (370, 250, 320, 130, 42+1, 80+1); setcolor (8);

ellipse (278, 255, 43, 207, 90+1, 95+1);

setcolor (8);

ellipse (300, 150, 295, 330, 120+1,290+1);

setcolor (8);

ellipse (300, 150,210,248, 120+1,290+1);

//FOR BINDI

setcolor (4);

ellipse(300, 225, 0,360, 9, 9-1);

//LIPS

setcolor (4);

ellipse (250, 442, 60, 80, 100, 50)

ellipse (350, 442, 100, 120, 100, 50);

ellipse (300, 313,255, 285, 80, 100); ellipse (370, 422, 145, 166, 50, 50);

ellipse (230, 422, 13, 35, 50, 50);

//bottom

ellipse (310, 390, 27, 133, 12,9); ellipse (290, 390,27, 140, 12,9);

ellipse (264, 384,270, 358, 15,9); ellipse (336, 384,190, 265,15,9);

//FOR MANG

setcolor (0);

line (360, 120, 345, 185); line (355, 120, 340,185);

//FOR HAIR

setcolor (8);

ellipse (390, 250, 300, 120, 60,150-1);

//RIGHT HAIR

setcolor (2);

ellipse (490, 440, 139, 205, 90+1, 95+1); setcolor (8);

ellipse (278,265, 53, 223, 130, 180-1);

setcolor (3);

ellipse (108, 440, 335, 394,90+1, 95+1);

//LEFT HAIR

//FOR NECK

ellipse (4 140, 165,205,90-1,95-1);

ellipse (168, 440, 335, 372, 90-1, 95-1);

//FOR NOSE

setcolor (4);

ellipse (354, 330, 150, 190, 38,100); //FOR LINE

setcolor (4); ellipse (318, 355, 238, 90, 9,8);

setcolor (4); ellipse (302, 353, 210, 340, 12, 13);

setcolor (4);

ellipse (287,355, 90, 300, 9,8);

//FOR EYE BROW

//FOR LEFT EYE BROW

ellipse (275, 247, 200, 90, 8, 8); ellipse (253, 304, 70, 130, 60, 701;

ellipse (247, 327, 77, 115, 85,80);

ellipse (325, 247,84,320,8,8);

ellipse (347, 304, 40, 110, 60, 70);

ellipse (354,329, 64, 107,85,80);

//FOR RIGHT EYE BROW

while (!kbhit())

//FOR EYES

for (1-0:1<-35; i++)

setcolor (15);

ellipse (250, 275, 0, 360,8,8-1);

//FOR LEFT INNER EYE

setcolor (9);

ellipse (250, 282, 22,157,30-1,25-1); delay (40);

//FOR LEFT EYE

ellipse (250, 265, 210, 330, 35,18);

setcolor (15);

ellipse (350,275,0, 360, 8,8-1);

//FOR RIGHT INNER EYE

setcolor (9);

//FOR RIGHT EYE

ellipse (350,282, 22, 157, 30-1,25-1); delay (40);

ellipse (350, 265, 210, 330, 35,18);

//ANOTHER METHOD FOR MOVING EYES FROM LEFT TO RIGHT

setcolor (WHITE);

ellipse (235+1,272, 0,360,8,8);

//FOR INNER EYE

setcolor (WHITE); ellipse (350+1, 272,0, 360, 8,8-1);

setcolor (BLACK);

//FOR INNER EYE

ellipse (215+1, 272, 90, 270,8,8);

delay (20);

//setcolor (BLACK) ;

//ellipse (245-1, 272, 270, 90,8,8); //delay (20);

for(i=0; i<-40; i++)

setcolor (BLACK) ;

ellipse (250, 300, 30, 150, 30, 1);

delay (1);

setcolor (BLACK);

ellipse (350, 300, 30, 150, 30,1);

delay (1);

}

//TERMINATION FOR WHILE LOOP

closegraph (); restorecrtmode ();

