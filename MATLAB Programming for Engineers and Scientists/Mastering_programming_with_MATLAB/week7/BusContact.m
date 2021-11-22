classdef BusContact < Contact
    properties
        Company
        Fax
    end
    methods
        function obj=BusContact(fname,lname,mob,comp,fax)
            if(nargin<5)
                fax="";
            end
            if(nargin<4)
                comp="";
            end
            if(nargin<3)
                mob="";
            end
            if(nargin<2)
                lname="";
            end
            if(nargin<1)
                fname="";
            end
            obj@Contact(fname,lname,mob);
            obj.Company=string(comp);
            obj.Fax=string(fax);
        end
    end
end