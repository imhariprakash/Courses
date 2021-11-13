%{
Maximum Clique
Given a social network, find the largest clique, that is, the largest subset of people who all follow each other.
follows:
People in the social network are identified by unique IDs, consecutive integers from 1 to N. Who follows who
that contains a list of IDs the person with ID ii follows. You may assume that these lists are ordered in ascend
symmetrical: if person A follows person B, person B may or may not follow person A. Here is one possible (r
function clique = max_clique(graph,clique)
 if nargin < 2 % originaly we call the
 clique = []; % hence, the clique is
 end
 max_clq = clique; % max_clq will store th
 if isempty(clique) % when we first call th
 for ii = 1:length(graph) % we need to test poten
 clq = max_clique(graph,ii);
 if length(clq) > length(max_clq) % if the new one is lar
 max_clq = clq; % we store the new one
 end
 end
 else
 for node = 1:length(graph) % we are in a r
 if isempty(find(node == clique)) % unless it is
 if check_clique(clique,node,graph) % if adding thi
 clq = max_clique(graph,[clique node]); % we call ourse
 if length(clq) > length(max_clq) % if what we ge
 max_clq = clq; % we store the
 end
 end
 end
 end
 end
 clique = max_clq; % return the la
end

function ok = check_clique(clq,node,graph) % adding node t
 ok = false;
 for ii = 1:length(clq) % for every cur
 if isempty(find(clq(ii) == graph{node})) || ... % the member mu
 isempty(find(node == graph{clq(ii)})) % the new guy m
 return;
 end
 end
 ok = true;
end
Unfortunately, it is too slow and the grader will time out. Your task is to modify the code to speed it up. Reme
modified function max_clique. (Hint: when we try to expand the current clique, do we really need to consid
%}

function clique = max_clique(graph,clique)
    if nargin < 2
        clique = [];
    end
    max_clq = clique;
    if isempty(clique)
        for ii = 1:length(graph)
             clq = max_clique(graph,ii);
             if length(clq) > length(max_clq)
                max_clq = clq;
             end
        end
    else
        for ii = 1:length(graph{clique(1)})   % only consider nodes that the first node in the clique follows
            node = graph{clique(1)}(ii);
            if  any(node == clique)    % replace isempty(find(node == clique)) with ~any(node == clique) for better performance
                continue;
            end
            ok = true;   % inlined check_clique:
            for jj = 1:length(clique)
                if ~any(clique(jj) == graph{node}) || ~any(node == graph{clique(jj)})
                    ok = false;
                    break;
                end
            end
            if ok   % check_clique(clq,node,graph)
                clq = max_clique(graph,[clique node]);
                if length(clq) > length(max_clq)
                    max_clq = clq;
                end
            end
        end
    end
    clique = max_clq;
end