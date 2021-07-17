var r;
function setup()
{
	createCanvas(800, 600);
    
}

function draw()
{
    background(255);
    r=random();
    fill(0);
    ellipse(width/2,height/2,r*250,r*250);
}



