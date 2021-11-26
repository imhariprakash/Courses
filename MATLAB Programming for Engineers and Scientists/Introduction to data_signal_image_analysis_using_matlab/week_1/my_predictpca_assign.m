%{
my_predictpca
Create the my_predictpca function that we created in the lecture. It takes as input a pca model mdl created
N feature measurements for M samples. It has two outputs, the classification for each sample in the [Mx1] ve
distance score for each sample in the [Mx1] vector score as the second output.
1. Embed your MahalanobisDistance function you created in the previous assignment below my_pre
2. Within the my_predictpca function, initialize output class and score to Mx1 zero vectors
3. Loop iteration variable i over the M samples, to classify each ith sample
In a nested loop, loop over each jth class to compare the ith sample to the jth class.
Within the loop, find the Mahalanobis distance from the ith sample feature vector to the jth class pca
The minimium Mahalanobis distance across the class pca models is used to choose our classificatio
The classification and the Mahalanobis distance are stored in class(i) and score(i)

%}



function [class,score] = my_predictpca(mdl,data)
% Initialize output 'class' and 'score' to r x 1 zero vectors
    [r,~] = size(data);
    class = zeros(r,1);
    score = zeros(r,1);
% Loop over the r samples, to classify each 'i'th sample
% In a nested loop, loop over each 'j'th class to compare the 'i'th sample to the 'j'th class
% Within the loop, find the Mahalanobis distance from the 'i'th sample feature vector to the 'j'th class pca model        
% The minimium Mahalanobis distance across the class pca models is used to choose our classification for the 'i'th sample
% The classification and the Mahalanobis distance are stored in class(i) and score(i)
    for i = 1 : r
        mdscore = zeros(1,length(mdl.class));
        for j = 1 : length(mdl.class)
            mdscore(j) = MahalanobisDistance(mdl.class(j),data(i,:));
        end
        [score(i),class(i)] = min(mdscore);
    end
end
% embed your MahalanobisDistance function you created in the previous assignment here:
function [md,b,std_per_mode] = MahalanobisDistance(pcamdl,v)
% compute b, our PCA coordinates for v
    b = pcamdl.eigvects * (v - pcamdl.mu)';
% compute std_per_mode, the standard deviation distance from the mean for v for each mode of variation
    std_per_mode = abs(b)./sqrt(pcamdl.eigvals);
% compute md, the Mahalanobis distance
    md = sqrt(sum(std_per_mode.^2));
end



%{

load fisheriris
[~,~,class] = unique(species);
%split into 50/50 training and testing data
D_train = meas(1:2:end,:);
class_train = class(1:2:end);
D_test = meas(2:2:end,:);
class_test = class(2:2:end);

% Create pca model struct with pca model for each class using the training set (this is what 'my_fitpca' would do)
for i=1:3
    [eigvects,~,eigvals,~,~,mu] = pca(D_train(class_train==i,:));
    mdl.class(i).eigvects = eigvects; mdl.class(i).eigvals = eigvals; mdl.class(i).mu = mu;
end

% Use our new function to estimate classification on the testing set
[class_est, score_est] = my_predictpca(mdl,D_test);
sum(class_est==class_test)/length(class_est)*100 % We should find 97.3333% classification accuracy!

%}