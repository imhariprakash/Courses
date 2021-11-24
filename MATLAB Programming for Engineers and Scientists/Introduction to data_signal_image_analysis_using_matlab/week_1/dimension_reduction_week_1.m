D = [-5 2.5; 2 -1; 10 -5; -12 6]
v = [2 -1];
a = [-2.5; 1; 5; -6];
av = a*v

figure(1);
plot(D(:,1), D(:,2), 'o');
axis([-15 15 -15 15]);
xlabel('Feature 1');
ylabel('Feature 2');
an = [-10 : 0.25 : 10];
hold on;
cmap = jet(length(an));
for i = 1 : length(an)
    plot(an(i)*v(1), an(i)*v(2), '*', 'Color', cmap(i,:));
end



D = [5.5 -4; -1.5 2; -9 2; 5 0]

figure(1);
plot(D(:,1), D(:,2), 'bo', 'LineWidth', 2);
axis([-15 15 -15 15]);
xlabel('Feature 1');
ylabel('Feature 2');
axis equal;
hold on;

[eigvects,~,eigvals] = pca(D);
plot(eigvects(1,1)*[2,-2]*sqrt(eigvals(1)), eigvects(2,1)*[2,-2]*sqrt(eigvals(1)), 'r');
plot(eigvects(1,2)*[2,-2]*sqrt(eigvals(2)), eigvects(2,2)*[2,-2]*sqrt(eigvals(2)), 'r');

theta = [0 : 0.25 : 2*pi]';
ellipse_x = 2*sqrt(eigvals(1))*eigvects(1,1)*cos(theta) + 2*sqrt(eigvals(2))*eigvects(1,2)*sin(theta);
ellipse_y = 2*sqrt(eigvals(1))*eigvects(2,1)*cos(theta) + 2*sqrt(eigvals(2))*eigvects(2,2)*sin(theta);
plot(ellipse_x, ellipse_y, 'k--');

[eigvects,D_pca,eigvals] = pca(D);
% D_pca: the coordinates of the dataset in the PCA vector space,
% where the 1st dimension is the direction of greatest variation,
% the 2nd dimension is the direction orthogonal to the first that has the greatest variance, and so on
% eigvects: define the principal axes (basis vectors) of the greatest variation
% eigvals: define the width of the axes of the PCA ellipsoid (variance)
plot([0;D_pca(1,1)*eigvects(1,1)], [0;D_pca(1,1)*eigvects(2,1)], 'g');
plot([0;D_pca(1,2)*eigvects(1,2)], [0;D_pca(1,2)*eigvects(2,2)], 'g');
plot([0;D_pca(1,1)*eigvects(1,1)+D_pca(1,2)*eigvects(1,2)], [0;D_pca(1,1)*eigvects(2,1)+D_pca(1,2)*eigvects(2,2)], 'c');

D1d = D_pca(:,1) * eigvects(:,1)'
plot(D1d(:,1), D1d(:,2), 'ro', 'LineWidth', 2);
[eigvects,D_pca,eigvals] = pca(D1d);
eigvals


load fisheriris;
D = meas;   % [150 x 4] data feature matrix containing 4 features of 150 samples 
[eigvects,D_pca,eigvals] = pca(D);
eigvects
eigvals
D_pca_x = D_pca(:,1);
D_pca_y = D_pca(:,2);
plot(D_pca_x,D_pca_y,'*');
hold on;
theta = 2*pi*[0:100]/100;
ellipse_x = 2*sqrt(eigvals(1))*cos(theta);
ellipse_y = 2*sqrt(eigvals(2))*sin(theta);
plot(ellipse_x, ellipse_y, 'k--');
axis equal;
