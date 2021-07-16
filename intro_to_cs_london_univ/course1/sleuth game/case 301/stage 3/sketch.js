/*
The case of the Python Syndicate
Stage 3


Officer: 3698339
CaseNum: 301-2-44861760-3698339

Right kid let’s work out which of our ‘friends’ is connected to the syndicate.

- An object for Cecil karpinski has been declared and initialised
- Modify the x and y parameters of each image command using the x and y
properties from the Cecil karpinski object so the images remain at their correct
positions on the board.
- To do this you will need to combine add and subtract operators with the
relevant property for each parameter



*/

var photoBoard;
var rockyKrayImg;
var pawelKarpinskiImg;
var cecilKarpinskiImg;
var countessHamiltonImg;
var robbieKrayImg;
var linaLovelaceImg;

var cecilKarpinskiObject;




function preload()
{
	photoBoard = loadImage('photoBoard.png');
	rockyKrayImg = loadImage("krayBrothers1.png");
	pawelKarpinskiImg = loadImage("karpinskiBros2.png");
	cecilKarpinskiImg = loadImage("karpinskiBros1.png");
	countessHamiltonImg = loadImage("countessHamilton.png");
	robbieKrayImg = loadImage("krayBrothers2.png");
	linaLovelaceImg = loadImage("lina.png");

}

function setup()
{
	createCanvas(photoBoard.width, photoBoard.height);
	cecilKarpinskiObject = {
		x: 701,
		y: 40,
		image: cecilKarpinskiImg
	};
}

function draw()
{
	image(photoBoard, 0, 0);

	//And update these image commands with your x and y coordinates.
	image(cecilKarpinskiObject.image, cecilKarpinskiObject.x, cecilKarpinskiObject.y);

	image(rockyKrayImg, cecilKarpinskiObject.x-586, cecilKarpinskiObject.y);
	image(pawelKarpinskiImg, cecilKarpinskiObject.x-293, cecilKarpinskiObject.y);
	image(countessHamiltonImg, cecilKarpinskiObject.x-586, cecilKarpinskiObject.y+269);
	image(robbieKrayImg, cecilKarpinskiObject.x-293, cecilKarpinskiObject.y+269);
	image(linaLovelaceImg, cecilKarpinskiObject.x, cecilKarpinskiObject.y+269);

}