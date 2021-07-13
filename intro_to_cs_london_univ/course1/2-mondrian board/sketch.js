function setup()
{
	//create a large square canvas
	createCanvas(824, 824);
}

function draw()
{
	strokeWeight(12);
	fill(255,0,0); rect(13,13,800,800);
	fill(255,255,255); rect(13,13,150,200);
	fill(255); rect(13,224,150,338);
	fill(0,0,255); rect(13,536,150,265);
	fill(255); rect(163,536,476,265);
	fill(255); rect(640,536,172,132);
	fill(225,229,100); rect(640,680,172,132);
}