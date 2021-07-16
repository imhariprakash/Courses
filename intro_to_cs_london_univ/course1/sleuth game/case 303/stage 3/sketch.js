/*

Officer: 3698339
CaseNum: 303-2-98198175-3698339

Case 303 - The Case of the Crooked Attorney
Stage 3 - The Gates Bank

I’ve made an appointment for you at the Gates Bank to retrieve your safe deposit box from the vault.
Actually you will break into Torvalds’ one.

Crack the safe by doing the following:

	When the mouse button is released:
	- Make Secure_safe_codeA equal to the value of mouseX
	- Use the 'constrain' function to prevent Secure_safe_codeA from falling below 2 and going above 15

	Whilst the mouse is being dragged:
	- Increment Secure_safe_codeB by 2
	- Use the 'min' function to prevent Secure_safe_codeB from going above 15

	Whilst the mouse is moving:
	- Make Secure_safe_codeC equal to the value of mouseX
	- Use the 'min' function to prevent Secure_safe_codeC from going above 20

	When the mouse button is released:
	- Increment Secure_safe_codeD by 1
	- Use the 'max' function to prevent Secure_safe_codeD from falling below 3

	Whilst the mouse is being dragged:
	- Make Secure_safe_codeE equal to the value of mouseY
	- Use the 'min' function to prevent Secure_safe_codeE from going above 67



This time you'll need to create the relevant event handlers yourself.

There are many possible ways of investigating this case, but you
should use ONLY the following commands:

	- The assignment operator aka. the equals sign !
	- mouseX, mouseY
	- Incrementing +=
	- Decrementing -=
	- min, max
	- constrain

*/

//declare the variables

var Secure_safe_codeA;
var Secure_safe_codeB;
var Secure_safe_codeC;
var Secure_safe_codeD;
var Secure_safe_codeE;


function preload()
{
	//IMAGES WILL BE LOADED HERE

}

function setup()
{
	createCanvas(512,512);

	//initialise the variables
	Secure_safe_codeA = 0;
	Secure_safe_codeB = 0;
	Secure_safe_codeC = 0;
	Secure_safe_codeD = 0;
	Secure_safe_codeE = 0;

}

///////////////////EVENT HANDLERS///////////////////

function mouseMoved()
{
	console.log("mouseMoved", mouseX, mouseY);
    Secure_safe_codeC = mouseX;
    Secure_safe_codeC =min(Secure_safe_codeC , 20);
    

}

function mouseDragged()
{
	console.log("mouseDragged", mouseX, mouseY);
    Secure_safe_codeB += 2;
    Secure_safe_codeB = min(Secure_safe_codeB, 15);
    Secure_safe_codeE = mouseY;
    Secure_safe_codeE = min(Secure_safe_codeE, 67);

}

function mousePressed()
{
	console.log("mousePressed");

}

function mouseReleased()
{
	console.log("mouseReleased");
    Secure_safe_codeA = mouseX;
    Secure_safe_codeA = constrain(Secure_safe_codeA , 2, 15);
    Secure_safe_codeD += 1;
    Secure_safe_codeD = max(Secure_safe_codeD , 3);

}

function keyPressed()
{
	console.log("keyPressed", key);
}

function keyReleased()
{
	console.log("keyReleased", key);
}


///////////////DO NOT CHANGE CODE BELOW THIS POINT///////////////////

function draw()
{

	//Draw the safe door
	background(70);
	noStroke();
	fill(29,110,6);
	rect(26,26,width-52,width-52);

	//Draw the combination dials
	push();
	translate(120,170);
	drawDial(140,Secure_safe_codeA, 19);
	pop();

	push();
	translate(120,380);
	drawDial(140,Secure_safe_codeB, 22);
	pop();

	push();
	translate(280,170);
	drawDial(140,Secure_safe_codeC, 26);
	pop();

	push();
	translate(280,380);
	drawDial(140,Secure_safe_codeD, 15);
	pop();

	//Draw the lever
	push();
	translate(width - 125,256);
	drawLever(Secure_safe_codeE);
	pop();


}

function drawDial(diameter,num,maxNum)
{
	//the combination lock

	var r = diameter * 0.5;
	var p = r * 0.6;

	stroke(0);
	fill(255,255,200);
	ellipse(0,0,diameter,diameter);
	fill(100);
	noStroke();
	ellipse(0,0,diameter*0.66,diameter*0.66);
	fill(150,0,0);
	triangle(
		-p * 0.4,-r-p,
		p * 0.4,-r-p,
		0,-r-p/5
	);

	noStroke();

	push();
	var inc = 360/maxNum;

	rotate(radians(-num * inc));
	for(var i = 0; i < maxNum; i++)
	{
		push();
		rotate(radians(i * inc));
		stroke(0);
		line(0,-r*0.66,0,-(r-10));
		noStroke();
		fill(0);
		text(i,0,-(r-10));
		pop();
	}

	pop();
}

function drawLever(rot)
{
	push();
	rotate(radians(-rot))
	stroke(0);
	fill(100);
	rect(-10,0,20,100);
	ellipse(0,0,50,50);
	ellipse(0,100,35,35);
	pop();
}
