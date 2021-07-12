

function setup() 
{
    // Sets the screen to be 720 pixels wide and 400 pixels high
    createCanvas(1000, 250);

}

function draw()
{
    background(200);
    noStroke();
    fill(0,255,0);
    triangle(0,50,150,50,75,200);
    rect(200,50,150,150);
    ellipse(500,125,150,150);
    arc(700,125,150,150,0,PI);
    arc(900,200,150,150,PI,2*PI);

//     fill(204, 101, 192, 127);
    
//     triangle(18, 18, 18, 360, 81, 360);

//     rect(81, 81, 63, 63);

//     quad(189, 18, 216, 18, 216, 360, 144, 360);

//     ellipse(252, 144, 72, 72);

//     triangle(288, 18, 351, 360, 288, 360); 

//     arc(479, 300, 280, 280, PI, TWO_PI);
}

