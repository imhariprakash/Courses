/*
201 - The case of Judge Hopper:
Stage 1 - Department of Justice

Officer: 3698339
CaseNum: 201-0-41357720-3698339

Judge Hopper has gone missing and we’ve been booked to investigate. This is the big time kid. Now I need you to head over to Hopper’s office at the Department of Justice and gather clues.

Draw a separate ellipse around 4 pieces of evidence:
Letter opener,
Death threat letters,
telephone,
and the AGOL leaflet

Each ellipse should cover the entire object whilst keeping as close to the edges as possible. You will need to use different values for the width and height arguments.


*/

var img;

function preload()
{
    img = loadImage('scene.png');
}

function setup()
{
    createCanvas(img.width,img.height);
}

function draw()
{

    image(img,0,0);
    stroke(255, 0, 0);
    strokeWeight(3);
    noFill();

    ellipse(265,347,120,145);
    ellipse(263,230,225,113);
    ellipse(570,360,110,130);
    ellipse(415,300,50,150);
}
