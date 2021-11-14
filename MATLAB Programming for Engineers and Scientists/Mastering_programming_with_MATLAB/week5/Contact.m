classdef Contact
    properties
        FirstName
        LastName
        Mobile
    end
    methods
        function obj=Contact(fname,lname,mob)
            if(nargin<3) 
                mob=""; 
            end
            if(nargin<2) 
                lname=""; 
            end
            if(nargin<1) 
                fname="";
            end
            obj.FirstName=string(fname);
            obj.LastName=string(lname);
            obj.Mobile=string(mob);
        end

        function obj=set.FirstName(obj,fname)
            obj.FirstName=fname;
        end

        function obj=set.LastName(obj,lname)
            obj.LastName=lname;
        end 

        function obj=set.Mobile(obj,mob)
            obj.Mobile=mob;
        end
    end
end
