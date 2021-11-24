%{

How many dimensions do I need?
Create a script to compute the number of feature dimensions N needed to represent at least 99.9% of the va
function.
The steps are:
Compute eigvals using the 'pca' function
Define vector cumulative_percent_variance_permode, which is a vector the same size as eigvals
cumulative sum of the normalized eigenvalues
Define N as the number of eigenvectors needed to capture at least 99.9% of the variation in our data

%}

load humanactivity.mat
D = feat; % [24075 x 60] matrix containing 60 feature measurements from 24075 samples

% compute eigvals
[eigvects,~,eigvals] = pca(D);

% compute the cumulative_percent_variance_permode vector. 
cumulative_percent_variance_permode = cumsum(eigvals/sum(eigvals)) * 100;
% Define N as the number of eigenvectors needed to capture at least 99.9% of the variation in D. 
N = find(cumulative_percent_variance_permode > 99.9, 1, 'first')
