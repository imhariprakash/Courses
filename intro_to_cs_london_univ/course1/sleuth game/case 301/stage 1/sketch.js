/*
The case of the Python Syndicate
Stage 1

Officer: 3698339
CaseNum: 301-0-81480794-3698339

I gotta give it to you kid, you’ve made an excellent start, but now it’s time
to take things up a level. For some time I’ve suspected that there’s something
big going down in Console City.

These cases that we’ve been working are all connected somehow. I need to use
that considerable brain of yours to work it all out. Let’s start by laying out
who we know.

Place each mugshot in its designated position by doing the following:

- Create a new variable for the X and Y coordinates of each mugshot.
    - One has already been done for you.
    - Make sure you use the same style and format for the variable name.
- Find coordinates for the mugshot and initialise your variable with these
values.
- Replace the hard-coded constants in the corresponding image command so that
the mugshot appears in its designated position.

*/

var photoBoard;
var countess_hamilton_img;
var lina_lovelace_img;
var cecil_karpinski_img;
var pawel_karpinski_img;
var anna_karpinski_img;
var robbie_kray_img;



//declare your new variables below
var pawel_karpinski_x_location = 115;
var pawel_karpinski_y_location = 309;
var countess_hamilton_x_location=115;
var countess_hamilton_y_location=40;
var lina_lovelace_x_location=408;
var lina_lovelace_y_location=40;
var cecil_karpinski_x_location=701;
var cecil_karpinski_y_location=40;
var anna_karpinski_x_location=408;
var anna_karpinski_y_location=309;
var robbie_kray_x_location=701;
var robbie_kray_y_location=309;






function preload()
{
	photoBoard = loadImage('photoBoard.png');
	countess_hamilton_img = loadImage("countessHamilton.png");
	lina_lovelace_img = loadImage("lina.png");
	cecil_karpinski_img = loadImage("karpinskiBros1.png");
	pawel_karpinski_img = loadImage("karpinskiBros2.png");
	anna_karpinski_img = loadImage("karpinskiWoman.png");
	robbie_kray_img = loadImage("krayBrothers2.png");

}

function setup()
{
	createCanvas(photoBoard.width, photoBoard.height);
}

function draw()
{
	image(photoBoard, 0, 0);



	//And update these image commands with your x and y coordinates.
	image(pawel_karpinski_img, pawel_karpinski_x_location, pawel_karpinski_y_location);

	image(countess_hamilton_img, countess_hamilton_x_location, countess_hamilton_y_location);
	image(lina_lovelace_img,lina_lovelace_x_location, lina_lovelace_y_location);
	image(cecil_karpinski_img, cecil_karpinski_x_location, cecil_karpinski_y_location);
	image(anna_karpinski_img, anna_karpinski_x_location, anna_karpinski_y_location);
	image(robbie_kray_img, robbie_kray_x_location, robbie_kray_y_location);

}