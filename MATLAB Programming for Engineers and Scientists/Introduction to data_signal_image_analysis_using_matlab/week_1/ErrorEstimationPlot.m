%{
ErrorEstimationPlot
Create the ErrorEstimationPlot function that we created in the lecture. It takes as input an [Mx1] vector pre
mse between the prediction and the target vectors, the correlation R and statistical significance p-value fro
data rg used to draw the diagonal of the plot. It creates a plot in the current figure equivalent when running th

https://lcms-files.mathworks.com/content/images/79ba43b7-c396-4ca2-be2a-62a2ba36b2da.png

%}

function [mse,R,p,rg] = EstimationErrorPlot(prediction,target)
    mse = mean((target-prediction).^2);
    figure;
    plot(target, prediction, 'r*');
    hold on;
    xlabel('True Value');
    ylabel('Mean Predicted Value');
    rg = [min([prediction;target]), max([prediction;target])];
    plot(rg,rg,'k--');
    [R,p] = corr(target, prediction);   
 % R: correlation coefficient (from -1 to 1); p: statistical significance
    title(sprintf('R=%.3f, p=%.3g, mse=%.3f', R, p, mse));
    legend('True vs. Predicted','Diagonal', 'Location', 'SouthEast');
end


%{
load fisheriris
D_train = meas(1:2:end,:);
D_test = meas(2:2:end,:);
mdl = fitlm(D_train(:,1:3),D_train(:,4));
prediction = predict(mdl,D_test(:,1:3));
[mse,R,p,rg] = EstimationErrorPlot(prediction,D_test(:,4));
%}