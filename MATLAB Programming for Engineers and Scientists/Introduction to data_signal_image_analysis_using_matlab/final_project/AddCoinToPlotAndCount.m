%{

AddCoinToCountAndPlot
Create a function AddCoinToCountAndPlot, which you will use in your final project script. The function take
image, cls, its classification label indicating whether it was found to be a dime, nickel, or quarter. The functio
also plots, in the current figure, a circle centered at x and y with radius and color unique for each coin type a
x_plot and y_plot, the list of x and y coordinates of the vertices of the circle being plotted. x_plot should be
The function also has a 4th output col, the color string of the circle plotted.
The steps to perform in the function are as follows:
Initialize coin radius and color parameters
Use an if-elseif statement to determine coinvalue, x_plot, y_plot, and colorcode col unique for eac
 Dime | Nickel | Quarter
Radius 22 | 30 | 40
Color red | green | magenta
Value 10 | 5 | 25
When running the example code below, your function should result in identical output to this:

%}

function [coinvalue,x_plot,y_plot,col] = AddCoinToPlotAndCount(x,y,cls)
% initialize radians for defining x_plot and y_plot using cos and sin functions
rads = 0:2*pi/32:2*pi;
% initialize parameters for radius and color of circle for each type of coin

DimeRadius = 22; NickelRadius = 30; QuarterRadius = 40;
DimeValue = 10; NickelValue = 5; QuarterValue = 25;
% Use if-elseif statement to define x_plot, y_plot, col
% When cls is 1, we found a dime
if (cls == 1)
    coinvalue = DimeValue;
    x_plot = x + DimeRadius*cos(rads);
    y_plot = y + DimeRadius*sin(rads);
    col = 'r';
% When cls is 2, we found a nickel
elseif (cls == 2)
    coinvalue = NickelValue;
    x_plot = x + NickelRadius*cos(rads);
    y_plot = y + NickelRadius*sin(rads);
    col = 'g';
% When cls is 3, we found a quarter
elseif (cls == 3)
    coinvalue = QuarterValue;
    x_plot = x + QuarterRadius*cos(rads);
    y_plot = y + QuarterRadius*sin(rads);
    col = 'm';
end

plot(x_plot,y_plot,col);
end



%{


x=1.2;
y=4.1;
cls = 3;
[coinvalue,x_plot,y_plot,col] = AddCoinToPlotAndCount(x,y,cls)
figure
plot(x_plot,y_plot,[col,'o-'])

%}

