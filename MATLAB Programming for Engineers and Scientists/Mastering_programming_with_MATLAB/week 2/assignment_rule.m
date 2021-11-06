% function assignment_rule
% r=7;
% circle_area=calculate_area;
% fprintf("Area of circle with radius %.1f = %.1f\n",r,circle_area);
%     function circle_area=calculate_area
%         circle_area=(r^2)*pi;
%     end
% end

%% error
% function assignment_rule
% r=7;
% calculate_area;
% fprintf("Area of circle with radius %.1f = %.1f\n",r,circle_area);
%     function calculate_area
%         circle_area=(r^2)*pi;
%     end
% end

%% assign in parent function

function assignment_rule
circle_area=[];
r=7;
calculate_area;
fprintf("Area of circle with radius %.1f = %.1f\n",r,circle_area);
    function calculate_area
        circle_area=(r^2)*pi;
    end
end