% Question 1
% Load the 'carbig' dataset into MATLAB. Curate the data into a clean training and testing set using the following code:


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

% Fit a regression tree to the training dataset (D_train, y_train) using the automatic hyperparameter optimization option.

%  What is the name of the function we use to train a regression tree?


% 1. fitrtree

% 2. Use the model with the predict function to estimate fuel efficiency for cars in the testing dataset (D_test).

% Compare the estimation with the true values (y_test). What's the mean squared difference between the two, accurate to two decimal places? You can use the EstimationErrorPlot function we made to find this.


% 2. 9.15
