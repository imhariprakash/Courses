load fisheriris;
[~,~,s] = unique(species);
[~,D_pca] = pca(meas);

figure(1);
plot(D_pca(s==1,1), D_pca(s==1,2), 'rx');
hold on;
plot(D_pca(s==2,1), D_pca(s==2,2), 'go');
plot(D_pca(s==3,1), D_pca(s==3,2), 'b*');
xlabel('PCA Feature 1');
ylabel('PCA Feature 2');
axis equal;

[X,Y] = meshgrid([-4:0.01:4],[-2:0.01:2]);

% ------------------------------------------------------------------

rng(0); [cls,C] = kmeans(D_pca(:,1:2), 3);
plot(C(:,1), C(:,2), 'ko', 'LineWidth', 3);

dist1 = sqrt((C(1,1)-X).^2 + (C(1,2)-Y).^2);
dist2 = sqrt((C(2,1)-X).^2 + (C(2,2)-Y).^2);
dist3 = sqrt((C(3,1)-X).^2 + (C(3,2)-Y).^2);
cls3 = (dist3 < dist1) & (dist3 < dist2);
cls2 = ~cls3 & (dist2 < dist1);
cls1 = ~cls3 & ~cls2;
contour(X, Y, cls1, [1 1], 'k--');
contour(X, Y, cls2, [1 1], 'k--');
contour(X, Y, cls3, [1 1], 'k--');
[cls s]
accuracy = sum((4-cls) == s) / length(s) * 100

% ------------------------------------------------------------------

C = [mean(D_pca(s==1,:)); mean(D_pca(s==2,:)); mean(D_pca(s==3,:))];
plot(C(:,1), C(:,2), 'mo', 'LineWidth', 3);

dist1 = sqrt((C(1,1)-D_pca(:,1)).^2 + (C(1,2)-D_pca(:,2)).^2);
dist2 = sqrt((C(2,1)-D_pca(:,1)).^2 + (C(2,2)-D_pca(:,2)).^2);
dist3 = sqrt((C(3,1)-D_pca(:,1)).^2 + (C(3,2)-D_pca(:,2)).^2);
cls3 = (dist3 < dist1) & (dist3 < dist2);
cls2 = ~cls3 & (dist2 < dist1);
cls1 = ~cls3 & ~cls2;
cls = 3*cls3 + 2*cls2 + 1*cls1;
accuracy = sum(cls == s) / length(s) * 100





function mdl = myfitpca(D,class)
    % Find the number of unique classes from the class vector, numclasses    
    class_labels = unique(class);
    numclasses = length(class_labels);
    % For each class, use 'pca' to find the eigenvectors (1st output),
    % eigenvalues (3rd output), and mean feature vector (6th output),
    % create a subfield 'class' within the output struct mdl, which is a vector of length numclasses
    % mdl.class(i) has subfields 'eigvects' (the eigenvectors matrix output from 'pca', transposed),
    % 'eigvals' (the eigenvalues output from 'pca'), and
    % 'mu' (the mean feature vector)
    for i = 1:numclasses
        [eigvects,~,eigvals,~,~,mu] = pca(D(class == class_labels(i),:));
        mdl.class(i).eigvects = eigvects';
        mdl.class(i).eigvals = eigvals;
        mdl.class(i).mu = mu;
    end
end

script

D = [1 3 2 4; 1 3 4 5]';
class = [0; 0; 1; 1];
mdl = myfitpca(D,class);
mdl.class(1) % eigvects: [0.7071 0.7071]; eigvals: 4; mu: [2 2];
mdl.class(2) % eigvects: [0.8944 0.4472]; eigvals: 2.5000; mu: [3 4.5000];

D = [1 3 2 4 5; 1 3 4 5 6; 6 3 2 1 7]';
class = [0; 0; 1; 1; 2];
mdl = myfitpca(D,class);
mdl.class(1) % eigvects: [-0.4851 -0.4851 0.7276]; eigvals: 8.5000; mu: [2 2 4.5000]
mdl.class(2) % eigvects: [0.8165 0.4082 -0.4082]; eigvals: 3.0000; mu: [3 4.5000 1.5000]
mdl.class(3) % eigvects: [0×3 double]; eigvals: [0×1 double]; mu: [5 6 7] (We get empty eigvects and eigvals because with only one datapoint, there is no variability from the mean!)



function [md,b,std_per_mode] = MahalanobisDistance(pcamdl,v)
    % compute b, our PCA coordinates for v
    b = pcamdl.eigvects * (v - pcamdl.mu)';
    % compute std_per_mode, the standard deviation distance from the mean for v for each mode of variation
    std_per_mode = abs(b)./sqrt(pcamdl.eigvals);
    % compute md, the Mahalanobis distance
    md = sqrt(sum(std_per_mode.^2));
end


script

mdl.class(1).eigvects = [0.7071 0.7071]; 
mdl.class(1).eigvals = 4; 
mdl.class(1).mu = [2 2];
v = [2,2];
md = MahalanobisDistance(mdl.class(1),v) % md = 0 because v = mu
v = [2,2] + 2*[0.7071 0.7071];
md = MahalanobisDistance(mdl.class(1),v) % md = 1 because v is 2/sqrt(eigval)=2/2=1 standard deviations from mean along eigenvector
v = [2,2] - 6*[0.7071 0.7071];
md = MahalanobisDistance(mdl.class(1),v) % md = 3 because v is 6/sqrt(eigval)=6/2=3 standard deviations from mean along eigenvector
v = [2,2] + [-0.7071 0.7071];
md = MahalanobisDistance(mdl.class(1),v) % md = 0 because v lies in a direction from mu that is orthogonal to the eigenvector


function [class,score] = mypredictpca(mdl,data)
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



script:

	
  
load fisheriris;
[~,~,class] = unique(species);

% Split into 50/50 training and testing data
D_train = meas(1:2:end,:);
class_train = class(1:2:end);
D_test = meas(2:2:end,:);
class_test = class(2:2:end);

% Create pca model struct with pca model for each class using the training set (This is what 'myfitpca' would do)
for i = 1 : 3
    [eigvects,~,eigvals,~,~,mu] = pca(D_train(class_train==i,:));
    mdl.class(i).eigvects = eigvects;
    mdl.class(i).eigvals = eigvals;
    mdl.class(i).mu = mu;
end

% Use our new function to estimate classification on the testing set
[class_est, score_est] = mypredictpca(mdl,D_test);
sum(class_est == class_test) / length(class_est)*100   % We should find 97.3333% classification accuracy!
