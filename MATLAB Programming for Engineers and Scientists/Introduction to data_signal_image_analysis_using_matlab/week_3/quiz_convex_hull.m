%{
Convex Hull
Latest Submission Grade 100%
1.
Question 1
Often we want to remove noise in a segmentation as discussed in the lecture. We explored filtering and connected components analysis as tools that can help with this process. Another tool is called the "convex hull" algorithm. It is often useful to "fill in the holes" that exist in the foreground of a mask.

This method finds a filled segmentation that includes every foreground pixel in an input binary mask. The outer contour of the result is constrained to be the smallest convex contour that successfully includes all provided foreground pixels. So, not only does it fill in holes, but it also joins disconnected components into a single, filled component.

The algorithm is implemented in the "bwconvhull" function.

Load the matrix "msk" in the attached '.mat' file and display it using imagesc. Observe it contains a very sparse set of foreground pixels.

Run the bwconvhull function on the mask and display the result using imagesc. Observe how the method finds the minimal convex solid segmentation that includes the input foreground pixels.

What is the name of the geometric shape of the result?

%}








load('convhull.mat');

subplot(1,2,1);
imagesc(msk);

subplot(1,2,2);
convexhull = bwconvhull(msk);
imagesc(convexhull);
title('Convex Hull');

% answer -> hexagon