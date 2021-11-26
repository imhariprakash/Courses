%{
MahalanobisDistance

Create the MahalanobisDistance function that we created in the lecture. It takes as input a single class from
[1xN] feature vector v, containing N feature measurements for a sample. It outputs the Mahalanobis distance
coordinates within the pca model space for the feature vector, and std_per_mode, which contains the standa
pca model.
The steps to perform in the function are as follows:
compute b, our PCA coordinates for v, by subtracting pcamdl.mu from v and
pre-multiplying by the eigenvectors matrix
compute std_per_mode, the standard deviation distance of v from the mean f
b, normalized by the square root of the eigenvalues
compute md, the Mahalanobis distance, as the square root of the sum of the

%}

function [md,b,std_per_mode] = MahalanobisDistance(pcamdl,v)
% compute b, our PCA coordinates for v
    b = pcamdl.eigvects * (v - pcamdl.mu)';
% compute std_per_mode, the standard deviation distance from the mean for v for each mode of variation
    std_per_mode = abs(b)./sqrt(pcamdl.eigvals);
% compute md, the Mahalanobis distance
    md = sqrt(sum(std_per_mode.^2));
end


%{
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

%}
