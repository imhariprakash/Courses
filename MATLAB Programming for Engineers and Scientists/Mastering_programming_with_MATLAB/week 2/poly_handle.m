% function fh=get_polynomial_handle(p)
%     function polynomial=poly(x)
%         polynomial=0;
%         for i=1:length(p)
%             polynomial=polynomial+(p(i).*(x.^(length(p)-i)));
%         end
%     end
%     fh=@poly;
% end

%% sample polynomial function handle as output
% function out=sample_poly
% out=@(x)x^3+x^2+x+1;
% end
