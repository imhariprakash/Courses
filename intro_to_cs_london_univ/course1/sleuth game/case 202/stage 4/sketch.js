/*

Officer: 3698339
CaseNum: 202-3-15231189-3698339

Case 202 - The case of Bob and Daisy - stage 4

Here’s the final letter from Daisy (aka. Woz). Decode it to uncover the
final details about Woz and Job’s dastardly plan.

Discover the hidden code by commenting out all text commands except
those which produce pink filled text with green outline in Melissa font.
Only comment out text commands - leave fill & stroke, push and pop commands uncommented.

There are many possible ways of investigating this case, but you
should use ONLY the following commands:

  // comments are all that are needed for this case.
  Do NOT add any new lines of code.

*/

var letterFont;

function preload()
{
	Ballpointprint = loadFont('Ballpointprint.ttf');
	Melissa = loadFont('Melissa.otf');
	Diggity = loadFont('Diggity.ttf');
	RonsFont = loadFont('RonsFont.ttf');
}

function setup()
{
	createCanvas(658,557);
	textSize(33);
}

function draw()
{
	background(255);

	fill(255,192,203);
	stroke(255,0,255);
	textFont(Melissa);
	//text("break", 90,139);
	//text("our", 450,139);
	stroke(255,0,0);
	textFont(Ballpointprint);
	//text("so", 400,287);
	stroke(0,0,0);
	textFont(Diggity);
//	text("we", 389,99);
//	text("I", 204,216);
//	text("delays.", 126,253);
	fill(0,255,255);
	stroke(0,0,255);
	textFont(RonsFont);
//	text("Is", 407,139);
//	text("My", 18,33);
//	text("out.", 348,139);
	fill(255,192,203);
	stroke(0,0,0);
	textFont(Ballpointprint);
//	text("rever", 46,394);
//	text("Da", 18,460);
	textFont(RonsFont);
//	text("sort", 206,139);
	fill(255,165,0);
	stroke(0,0,255);
	textFont(Melissa);
	//text("how", 347,253);
	push();
	stroke(0,0,0);
	textFont(Ballpointprint);
//	text("ignore", 382,216);
//	text("no", 272,216);
	pop();
	textFont(Diggity);
//	text("ca", 142,216);
	fill(255,255,0);
//	text("Bob,", 163,33);
	stroke(255,0,0);
	textFont(Ballpointprint);
//	text("c", 23,253);
	fill(255,165,0);
stroke(0,255,0);
//	text("away", 547,99);
	fill(255,192,203);
	textFont(Diggity);
	//text("you", 68,99);
	stroke(0,0,255);
	textFont(Melissa);
	//text("x", 105,460);
	//text("this", 277,139);
	fill(255,255,0);
	stroke(255,0,255);
	textFont(Diggity);
//	text("You", 311,287);
	fill(255,192,203);
	stroke(0,255,0);
	textFont(RonsFont);
//	text("can", 524,253);
	fill(255,165,0);
	stroke(255,0,255);
	textFont(Ballpointprint);
//	text("of", 425,178);
	push();
	textFont(Melissa);
	//text("are", 362,287);
	pop();
	textFont(Diggity);
//	text("so,", 602,178);
	fill(0,255,255);
	stroke(0,255,0);
	textFont(Ballpointprint);
//	text("darling", 68,33);
//	text("and", 148,139);
	fill(255,165,0);
	stroke(0,0,0);
	textFont(RonsFont);
	//text("The", 17,287);
	push();
	fill(255,255,0);
	stroke(0,0,255);
	textFont(Melissa);
	//text("I", 506,253);
	//text("?", 632,253);
	pop();
	textFont(Melissa);
	//text("much", 390,253);
	stroke(0,255,0);
	textFont(RonsFont);
	//text("Perhaps", 283,99);
	fill(255,192,203);
	textFont(Melissa);
	text("guard", 438,287);
	text("avoid", 116,99);
	stroke(255,0,255);
	textFont(Ballpointprint);
	//text("can", 221,216);
	stroke(0,255,0);
	//text("not", 241,253);
	textFont(Melissa);
	text("the", 172,287);
	text("safe", 179,178);
	text("take", 582,253);
	push();
	stroke(255,0,255);
	textFont(RonsFont);
	//text("short", 344,178);
	pop();
	stroke(255,0,0);
	textFont(Ballpointprint);
	//text("silence.", 210,287);
	fill(255,255,0);
	stroke(255,0,255);
	textFont(RonsFont);
	//text("I", 15,216);
	fill(255,192,203);
	stroke(255,0,0);
	textFont(Diggity);
	//text("?", 230,178);
	fill(0,255,255);
	stroke(0,0,0);
	textFont(RonsFont);
	//text("go", 508,99);
	push();
	fill(255,165,0);
	textFont(Diggity);
	//text("sure", 288,253);
	pop();
	textFont(Ballpointprint);
	//text("sometimes.", 21,328);
	push();
	stroke(0,0,255);
	textFont(Melissa);
	//text("money", 470,178);
	pop();
	textFont(Diggity);
	//text("send", 82,216);
	push();
	fill(255,165,0);
	//text("more", 441,253);
	pop();
	stroke(0,0,255);
	textFont(Melissa);
	//text("a", 71,139);
	fill(255,255,0);
	//text("can", 44,216);
	stroke(255,0,255);
	//text("ed", 487,287);
	fill(0,255,255);
	textFont(Ballpointprint);
	//text("ontinual", 33,253);
	fill(255,165,0);
	textFont(Diggity);
	//text("should", 435,99);
	push();
	fill(255,255,0);
	stroke(255,0,0);
	//text("longer", 311,216);
	pop();
	stroke(255,0,0);
	textFont(RonsFont);
	//text("relationship", 12,178);
	fill(255,255,0);
	stroke(0,0,0);
	textFont(Melissa);
	//text("ing", 162,99);
	fill(255,165,0);
	stroke(255,0,0);
	//text("Are", 255,178);
	fill(0,255,255);
	//text("all", 321,139);
	stroke(0,0,255);
	textFont(Diggity);
	//text("you", 296,178);
	fill(255,192,203);
	stroke(255,0,0);
	textFont(Melissa);
	//text("I'm", 204,253);
	stroke(0,0,255);
	textFont(Ballpointprint);
	//text("?", 246,99);
	push();
	fill(255,255,0);
	textFont(Diggity);
	//text("Are", 14,99);
	//text("sh.", 166,216);
	pop();
	textFont(RonsFont);
	//text("If", 558,178);
	//text("for", 12,139);
	fill(0,255,255);
	stroke(255,0,0);
	textFont(Ballpointprint);
	//text("me", 194,99);
	push();
	fill(255,192,203);
	stroke(0,0,255);
	//text("secrets,", 68,287);
	pop();
	textFont(RonsFont);
	//text("?", 534,178);
	fill(255,255,0);
	stroke(0,0,0);
	textFont(Ballpointprint);
	//text("isy", 55,460);
	stroke(255,0,0);
	textFont(Diggity);
	//text("these", 470,216);
	fill(255,165,0);
	textFont(Ballpointprint);
	//text("yours,", 128,394);
	//text("Fo", 18,394);



}
