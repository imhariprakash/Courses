function y = caesar2(ch, key)
    v = ' ' : '~';
    [~, loc] = ismember(ch, v)
    v2 = circshift(v, -key);
    y = v2(loc);
end