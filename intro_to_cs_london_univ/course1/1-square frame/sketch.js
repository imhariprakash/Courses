//This is a simple template for you to experiment with

//This is a comment  ... the two slashes at the start mean that the computer ignores it

//You can look up more commands here ... https://p5js.org/reference/

function setup()
{
    //this function runs once at the start of your program
    
    //this command creates a drawing area in the browser - it should only be called once
    createCanvas(500,500);
}

function draw()
{
    
    //this command clears the background to black (try changing the numbers)
    background(255,0,0);
    
    //change the fill color
    fill(0,0,255);
    
    //change the outline color
    stroke(255,255,255);
    
    //this command draws a rectangle with the outline and fill colors that we just set
    rect(125,125,250,250);
    
}