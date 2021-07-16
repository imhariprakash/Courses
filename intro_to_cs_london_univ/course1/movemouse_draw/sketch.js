function setup()
{
	createCanvas(800, 600);
    background(0);
}



function draw()
{
    noStroke();
    fill(255,255,255,100);
    ellipse(mouseX,mouseY,25,25);
}
function mousePressed()
{
    fill(0,100,0,100);
}