%{

Create a script to scatter plot the first 2 dimensions of the PCA linear vector space, and display a contour rep
ellipsoid with 2 standard deviations width.
The steps are:
Use the 'pca' function to find D_pca, the coordinates of the dataset in the PCA vector space, and eig
the PCA ellipsoid.
Define the x and y coordinates of the first two dimensions of the data in the PCA vector space, D_pc
Define x and y coordinates for the shape of the PCA ellipsoid in just the first two dimensions, which
and short axes radii should be 2 standard deviation distance along each axis. theta=0 should corres
to 2 times the square root of eigenvalue 1, and theta = pi/2 corresponds to the positive end of the m
Plot the ellipse using red dashed lines.

%}

load fisheriris
D = meas; % [150 x 4] data feature matrix containing 4 features of 150 samples 
% compute D_pca and eigvals using the pca function
[~,D_pca,eigvals]=pca(D);
% Define D_pca_x and D_pca_y, the first two dimensions of the data in the D_pca feature space
D_pca_x =D_pca(:,1);
D_pca_y =D_pca(:,2);
% scatter plot the data with asterisks '*'
plot(D_pca_x,D_pca_y,'*');
% Define ellipse_x and ellipse_y, x and y coordinates for the PCA ellipsoid in the first 2 dimensions as a function of theta 
theta = 2*pi*[0:100]/100;
ellipse_x=2*sqrt(eigvals(1))*cos(theta);
ellipse_y=2*sqrt(eigvals(2))*sin(theta);
%Plot the ellipse with red dashed lines 'r--'
plot(ellipse_x,ellipse_y,'r--');
%Use axis equal to correct aspect ratio
axis equal