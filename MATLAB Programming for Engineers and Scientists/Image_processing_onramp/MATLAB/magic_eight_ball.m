%Magic 8 Ball program: The program starts with an introduction...
%“Welcome to Magic 8 Ball,” then asks user for a question, and prints...
%one of the 20 standard answers depending on the value of the random...
%number using random number generation and if-statements.

% created by: Jenniffer Estrada
% last modified:2/6/07

function magic_eight_ball(x)
fprintf('Welcome to Magic 8 Ball\n');
x=input('Ask me a question:\n','s');
y=ceil(20*rand(1));

%Standard Outcomes
if y<=1
    fprintf('Signs point to yes.\n');
elseif y<=2 
    fprintf('Yes.\n');
elseif y<=3
    fprintf('Most likely.\n');
elseif y<=4
    fprintf('Without a doubt.\n');
elseif y<=5
    fprintf('Yes - definitely.\n');
elseif y<=6
    fprintf('As I see it, yes.\n');
elseif y<=7
    fprintf('You may rely on it.\n');
elseif y<=8
    fprintf('Outlook good.\n');
elseif y<=9
    fprintf('It is certain.\n');
elseif y<=10
    fprintf('It is decidedly so.\n');
elseif y<=11
    fprintf('Reply hazy, try again.\n');
elseif y<=12 
    fprintf('Better not tell you now.\n');
elseif y<=13
    fprintf('Ask again later.\n');
elseif y<=14 
    fprintf('Concentrate and ask again.\n');
elseif y<=15 
    fprintf('Cannot predict now.\n');
elseif y<=16 
    fprintf('My sources say no.\n');
elseif y<=17 
    fprintf('Very doubtful.\n');
elseif y<=18 
    fprintf('My reply is no.\n');
elseif y<=19
    fprintf('Outlook not so good.\n');
else y>=20
    fprintf('Do not count on it.\n');
end
%end of eight ball program
