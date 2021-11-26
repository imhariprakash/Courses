%{

Smartphone activity classifier
Latest Submission Grade 100%
1.
Question 1
In the previous Matlab grader problems, we have created our own classifier method based on fitting PCA models to different classes. Now let's try it out on a new dataset!

The humanactivity dataset contains thousands of samples of a known-class, 60 feature dataset. The 'class' is 1 of 5 possible human activities: sitting, walking, dancing, running, and standing. The 'features' are features derived from acceleration measurements from the accelerometer sensor of a smartphone located in the participant's pocket taken during the course of the recorded activity. If interested, you can find more information about this dataset here.

Your goal is to create a classifier program that could be run on a smartphone to classify a person's activity from sensor measurements.

Load the humanactivity dataset into MATLAB and divide it into a training and testing set using the following code.

load humanactivity
D_train = feat(1:2:end,:);
class_train = actid(1:2:end);
D_test = feat(2:2:end,:);
class_test = actid(2:2:end);


Use your my_fitpca function create a classification model with the training set.

Use your classification model with your my_predictpca function to estimate classifications on the testing set

What is your classification accuracy on the testing set (percent correct), accurate to 2 decimal places)? 

%}


load humanactivity;
D_train = feat(1:2:end,:);
class_train = actid(1:2:end);
D_test = feat(2:2:end,:);
class_test = actid(2:2:end);

% Method I
mdl1 = myfitpca(D_train, class_train);
[class_est1, score_est1] = mypredictpca(mdl1, D_test);
accuracy1 = sum(class_est1 == class_test) / length(class_est1) * 100
figure(1);
EstimationErrorPlot(class_est1,class_test);

% Method II
mdl2 = fitlm(D_train, class_train);
class_est2 = round(predict(mdl2, D_test));
accuracy2 = sum(class_est2 == class_test) / length(class_est2) * 100
figure(2);
EstimationErrorPlot(class_est2,class_test);

function [mse,R,p,rg] = EstimationErrorPlot(prediction,target)
    mse = mean((target-prediction).^2);
    figure;
    plot(target,prediction,'r*');
    hold on;
    xlabel('True Value');
    ylabel('Mean Predicted Value');
    rg = [min([prediction;target]),max([prediction;target])];
    plot(rg,rg,'k--');
    [R,p] = corr(target,prediction);   % R: correlation coefficient (from -1 to 1); p: statistical significance
    title(sprintf('R=%.3f, p=%.3g, mse=%.3f', R, p, mse));
    legend('True vs. Predicted','Diagonal','Location','SouthEast');
end

% Answer
% 96.93