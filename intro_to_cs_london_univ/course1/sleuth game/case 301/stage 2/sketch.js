/*
The case of the Python Syndicate
Stage 2


Officer: 3698339
CaseNum: 301-1-22933981-3698339

- Word on the street is that there is a new gang in town - The Python Syndicate.
It seems my bones were correct on this one. I need you to organise the gang
around the suspected leader Lina lovelace

- The variables for Lina lovelace have been declared and
initialised.
- Modify the x and y parameters of each image command using these two variables
so the images maintain their correct positions their correct positions on the board.
- To do this you will need to combine add and subtract operators with variables
Lina lovelace for for each parameter.
- Do not create any new variables
- Do not add any additional commands


*/

var photoBoard;
var pawelKarpinskiImg;
var rockyKrayImg;
var robbieKrayImg;
var bonesKarpinskiImg;
var linaLovelaceImg;
var countessHamiltonImg;


var linaLovelaceLocationX = 408;
var linaLovelaceLocationY = 309;


function preload()
{
	photoBoard = loadImage('photoBoard.png');
	pawelKarpinskiImg = loadImage("karpinskiBros2.png");
	rockyKrayImg = loadImage("krayBrothers1.png");
	robbieKrayImg = loadImage("krayBrothers2.png");
	bonesKarpinskiImg = loadImage("karpinskiDog.png");
	linaLovelaceImg = loadImage("lina.png");
	countessHamiltonImg = loadImage("countessHamilton.png");

}

function setup()
{
	createCanvas(photoBoard.width, photoBoard.height);
}

function draw()
{
	image(photoBoard, 0, 0);

	//And update these image commands with your x and y coordinates.
	image(linaLovelaceImg, linaLovelaceLocationX, linaLovelaceLocationY);

	image(pawelKarpinskiImg, linaLovelaceLocationX-293, linaLovelaceLocationY-269);
	image(rockyKrayImg, linaLovelaceLocationX, linaLovelaceLocationY-269);
	image(robbieKrayImg, linaLovelaceLocationX+293, linaLovelaceLocationY-269);
	image(bonesKarpinskiImg, linaLovelaceLocationX-293, linaLovelaceLocationY);
	image(countessHamiltonImg, linaLovelaceLocationX+293, linaLovelaceLocationY);

}