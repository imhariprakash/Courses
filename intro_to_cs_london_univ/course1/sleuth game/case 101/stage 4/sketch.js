/*

Officer: 3698339
CaseNum: 101-3-69548566-3698339

Case 101 - The Case of Lina Lovelace
Stage 4 - The Plaza Hotel

Okay this place is more Lina’s style. Now’s our chance to find out the root of all
of this. Lets see who is Lina meeting.

Identify Lina by drawing a red filled rectangle with a cyan outline.
She’s the woman in the red dress of course.

Identify the man with the monocle smoking the cigar magenta filled
rectangle with a yellow outline around him.

Identify the man reading the newspaper by drawing a green filled rectangle
with a yellow outline around him.

Identify the woman with the dog by drawing a blue filled rectangle with a
red outline around her. Make sure you include the dog too.

The rectangles should cover the targets as accurately as possible without
including anything else.

There are many possible ways of investigating this case, but you
should use ONLY the following commands:

  rect()
  fill() Use only 255 or 0 for r,g,b values. Set alpha to 100 for some opacity.
	stroke() Use only 255 or 0 for r,g,b values.

*/

var img;

function preload()
{
	img = loadImage('img.jpg');
}

function setup()
{
	createCanvas(img.width,img.height);
	strokeWeight(2);
}

function draw()
{
	image(img,0,0);

	fill(255,0,0,100);
    stroke(0,255,255);
    rect(51,265,210,427);
    fill(255,0,255,100);
    stroke(255,255,0);
    rect(760,406,144,190);
    fill(0,0,255,100);
    stroke(255,0,0);
    rect(902,294,166,357);
    fill(0,255,0,100);
    stroke(255,255,0);
    rect(375,330,130,264);


}
