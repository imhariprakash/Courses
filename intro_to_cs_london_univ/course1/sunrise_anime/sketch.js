var groundHeight;
var mountain1;
var mountain2;

var tree;

var moon;
var sun;
var darkness;

function setup()
{
	createCanvas(800, 600);
	//set the groundHeight proportional to the canvas size
	groundHeight = (height / 3) * 2;

	//initalise the mountain objects with properties to help draw them to the canvas
	mountain1 = {
		x: 400,
		y: groundHeight,
		height: 320,
		width: 230
	};
	mountain2 = {
		x: 550,
		y: groundHeight,
		height: 200,
		width: 130
	};

	//initalise the tree object
	tree = {
		x: 150,
		y: groundHeight + 20,
		trunkWidth: 40,
		trunkHeight: 150,
		canopyWidth: 120,
		canopyHeight: 100
	};

    //initalise the sun 
	sun = {
		x: 150,
		y: 70,
		diameter: 80,
	};
    
    //TASK: intialise a moon object with an extra property for brightness
    moon={
        x:700,
        y:70,
        diameter:80,
        brightness:0
    };


	//set the initial darkness
	darkness = 0;
}



function draw()
{
	//TASK: update the values for the moons brightness, the sun's position and the darkness.
	//You can either map this to the mouse's location (i.e. the futher left the mouse is the more daylight) or you can just change the values gradually over time.


	//draw the sky
	background(150, 200, 255);
	noStroke();

	//draw the sun
	fill(255, 255, 0);
	ellipse(sun.x, sun.y+mouseX*0.425, sun.diameter);
    
    //TASK: you'll need to draw the moon too. Make sure you use brightness to adjust the colour
    moon.brightness=mouseX*0.41875;
    fill(255,255,255,moon.brightness);
    ellipse(moon.x, moon.y, moon.diameter,moon.diameter);

	//draw the ground and make it green
	fill(70, 200, 0);
	rect(0, groundHeight, width, height - groundHeight);

	//draw the mountains
	fill(120);
	triangle(mountain1.x, mountain1.y,
		mountain1.x + mountain1.width, mountain1.y,
		mountain1.x + (mountain1.width / 2), mountain1.y - mountain1.height);

	triangle(mountain2.x, mountain2.y,
		mountain2.x + mountain2.width, mountain2.y,
		mountain2.x + (mountain2.width / 2), mountain2.y - mountain2.height);
    
    //TASK: You can draw the tree yourself
    fill(0,255,0);
    ellipse(168,268,100,80);
    fill(150,75,0);
    rect(150,305,40,105);
    

	//TASK: make the scene dark by drawing a rectangle that covers the whole canvas.
	//Use the alpha value of fill to determine how dark to make it
    darkness=mouseX*0.11875;
    fill(255,255,255,darkness);
    rect(0,0,width,height);



}