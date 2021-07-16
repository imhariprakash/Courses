/*
The case of the Python Syndicate
Stage 4

Officer: 3698339
CaseNum: 301-3-53958097-3698339

To really crack the Python Syndicate we need to go in deep. I want to understand
all the connections. I have the data but it’s a mess and I need you to sort it out.

Organise each syndicate member into an object. I’ve done one for you as an example.
Be sure to replicate the naming conventions for your own objects.
Use image command together with the objects you created to organise the mugshots.

- Once you have done this you can comment out or delete the old variables.

*/

var photoBoard;
var rocky_kray_image;
var anna_karpinski_image;
var countess_hamilton_image;
var robbie_kray_image;
var lina_lovelace_image;
var cecil_karpinski_image;

var lina_lovelace_object;


//declare your new objects below
var rocky_kray_object;
var anna_karpinski_object;
var countess_hamilton_object;
var robbie_kray_object;
var cecil_karpinski_object;

//var rocky_kray_location_x = 115;
//var rocky_kray_location_y = 40;
//var anna_karpinski_location_x = 408;
//var anna_karpinski_location_y = 40;
//var countess_hamilton_location_x = 701;
//var countess_hamilton_location_y = 40;
//var robbie_kray_location_x = 115;
//var robbie_kray_location_y = 309;
//var cecil_karpinski_location_x = 701;
//var cecil_karpinski_location_y = 309;


function preload()
{
	photoBoard = loadImage('photoBoard.png');
	rocky_kray_image = loadImage("krayBrothers1.png");
	anna_karpinski_image = loadImage("karpinskiWoman.png");
	countess_hamilton_image = loadImage("countessHamilton.png");
	robbie_kray_image = loadImage("krayBrothers2.png");
	lina_lovelace_image = loadImage("lina.png");
	cecil_karpinski_image = loadImage("karpinskiBros1.png");

}

function setup()
{
	createCanvas(photoBoard.width, photoBoard.height);
	lina_lovelace_object = {
		x: 408,
		y: 309,
		image: lina_lovelace_image};
    rocky_kray_object={x: 115 ,y: 40,image: rocky_kray_image };
    anna_karpinski_object={x: 408 ,y: 40,image: anna_karpinski_image };
    countess_hamilton_object={x: 701 ,y: 40 ,image: countess_hamilton_image};
    robbie_kray_object={x: 115,y: 309,image: robbie_kray_image };
    cecil_karpinski_object={x: 701 ,y: 309 ,image: cecil_karpinski_image};




	//define your new objects below
}

function draw()
{
	image(photoBoard, 0, 0);

	//And update these image commands with your x and y coordinates.
	image(rocky_kray_image, rocky_kray_object.x, rocky_kray_object.y);
	image(anna_karpinski_image, anna_karpinski_object.x, anna_karpinski_object.y);
	image(countess_hamilton_image, countess_hamilton_object.x, countess_hamilton_object.y);
	image(robbie_kray_image, robbie_kray_object.x, robbie_kray_object.y);
	image(lina_lovelace_object.image, lina_lovelace_object.x, lina_lovelace_object.y);
	image(cecil_karpinski_image, cecil_karpinski_object.x, cecil_karpinski_object.y);


}