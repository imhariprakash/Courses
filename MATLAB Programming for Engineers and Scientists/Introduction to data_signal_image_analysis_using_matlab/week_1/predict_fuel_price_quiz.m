%{
Predicting Fuel Efficiency Using Gaussian Process Regression
Latest Submission Grade 100%
1.
Question 1
Load the 'carbig' dataset into MATLAB. Curate the data into a clean training and testing set using the following code:

%}

load carbig
D = [Acceleration, Cylinders, Displacement, Horsepower, Model_Year, Weight];
y = MPG;
msk = ~ismissing(y);
D = D(msk,:);
y = y(msk);


D_train  = D(1:2:end,:);
y_train = y(1:2:end);

D_test = D(2:2:end,:);
y_test = y(2:2:end);
rng(0);

%{
HyperparameterOptimizationOptions',struct('AcquisitionFunctionName','expected-improvement-plus')

What is the name of the function we use to fit a Gaussian Process regression model?

fitrgp


Use the model with the predict function to estimate fuel efficiency for cars in the testing dataset (D_test).  

Compare the estimation with the true values (y_test). What's the mean squared difference between the two, accurate to two decimal places? You can use the EstimationErrorPlot function we made to find this.  

8.56


Which regression method performs better on this task?


Gaussian Process regression

Advanced: This hypothesis could be tested using a statistical test (see paired t-tests with the 'ttest' function)

%}