clc;
clear;
%Setting up parameters for modulation type
data=randi([0,1],1000,1);%generating binary data of 1000 bits with ones and zeros
mod_type=input('Enter the modulation type [1 for BPSK,2 for QPSK,3 for 16QAM,4 for 64QAM]:');
norm_factor=[1.0;0.7071;0.3162;0.1543];
nc=[1;2;4;6];%number of bits per subcarrier,1:BPSK,2:QPSK,4:16QAM,6:64QAM
input_seq=data;
k=norm_factor(mod_type);
mode=nc(mod_type);
%Selecting constellation point as per modulation type
switch mode
case 1
b=k*[1-1i];
case 2
b=k*[1+1i -1+1i 1-1i -1-1i];
case 4
b=k*[1+1i 1+3i 1-1i 1-3i 3+1i 3+3i 3-1i 3-3i -1+1i -1+3i -1-1i -1-3i -3+1i -3+3i -3-1i -3-3i];
case 6
b=k*[3+3i 3+1i 3+5i 3+7i 3-3i 3-1i 3-5i 3-7i 1+3i 1+1i 1+5i 1+7i 1-3i 1-1i 1-5i 1-7i 5+3i 5+1i 5+5i 5+7i 5-3i 5-1i 5-5i 5-7i 7+3i 7+1i 7+5i 7+7i 7-3i 7-1i 7-5i 7-7i -3+3i -3+1i -3+5i -3+7i -3-3i -3-1i -3-5i -3-7i -1+3i -1+1i -1+5i -1+7i -1-3i -1-1i -1-5i -1-7i -5+3i -5+1i -5+5i -5+7i -5-3i -5-1i -5-5i -5-7i -7+3i -7+1i -7+5i -7+7i -7-3i -7-1i -7-5i -7-7i];
end
count=1;
count1=1;
for i=1:(ceil(length(input_seq)/mode))
    temp=0;
    for j=1:mode
        temp=bitor(temp,bitshift(input_seq(count),(j-1)));
        count=count+1;
        if(count>length(input_seq))
            break;
        end
    end
    try 
        map_out(count1)=b(temp+1);
        count1=count1+1;
    catch
        continue;
    end
end
figure;plot(real(map_out),imag(map_out),'bO');title('constellation')