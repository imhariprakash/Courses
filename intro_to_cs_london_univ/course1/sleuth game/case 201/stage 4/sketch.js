/*
201 - The case of Judge Hopper
Stage 4 - The warehouse

Officer: 3698339
CaseNum: 201-3-73826096-3698339

As you enter the ALGOL warehouse you are struck by the most horrendous stench - it’s not the fish. Lying amongst piles of fish carcasses you find the body of Judge Hopper. Gathering yourself together, you tie a handkerchief around your nose and mouth and quickly set about recording the evidence.

Draw around the Judge’s body ...


*/

var img;

function preload()
{
    img = loadImage('scene.png');
}

function setup()
{
    createCanvas(img.width,img.height);
}

function draw()
{

    image(img,0,0);
    stroke(255, 0, 0);
    strokeWeight(3);
    noFill();

    beginShape();
    vertex(302,199);
    vertex(373,192);
    vertex(376,237);
    vertex(385,237);
    vertex(457,212);
    vertex(500,173);
    vertex(532,155);
    vertex(550,155);
    vertex(558,168);
    vertex(573,157);
    vertex(620,140);
    vertex(632,141);
    vertex(646,156);
    vertex(640,169);
    vertex(584,198);
    vertex(631,179);
    vertex(684,207);
    vertex(674,234);
    vertex(636,239);
    vertex(652,252);
    vertex(528,311);
    vertex(442,340);
    vertex(421,361);
    vertex(473,463);
    vertex(478,522);
    vertex(436,519);
    vertex(386,422);
    vertex(338,407);
    vertex(319,390);
    vertex(292,352);
    vertex(299,275);
    vertex(333,254);
    vertex(331,226);
    vertex(293,237);
    vertex(265,216);
    vertex(286,194);
    vertex(302,199);
    endShape();

}
