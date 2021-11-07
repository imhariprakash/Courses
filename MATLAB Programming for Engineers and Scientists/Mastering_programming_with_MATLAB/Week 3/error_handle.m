function hello()
try
    fprint("Hello")
catch ME
    fprintf("Wrong");
    throw(ME);
end
end
