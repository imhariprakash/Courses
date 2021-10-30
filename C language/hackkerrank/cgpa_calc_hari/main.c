/* Author: S.HARIPRAKASH
   Date: 23-09-2021
   GPA AND CGPA CALCULATOR UPTO 4 TH SEMESTER
*/

#include<stdio.h>
int main()
{
    int i;
    int point1[8],point2[8],point3[9],point4[8];
    float a1,a2,a3,a4,ans;
    int s1=25,s2=25,s3=25,s4=24;
    float sum1=0,sum2=0,sum3=0,sum4=0;
    int credit1[8]={4,4,3,3,3,4,2,2},credit2[8]={4,4,3,3,4,3,2,2},credit3[9]={4,3,3,4,3,3,2,2,1},credit4[8]={4,3,3,4,3,3,2,2};
    char sub1[8][30]={"English: ","Math1: ","Physics: ","Chemistry: ","PSP: ","EG: ","PSP lab: ","Chem_phy lab: "};
    char sub2[8][30]={"Tech English: ","Math-II: ","Elec Physics: ","BEIE: ","Circuit analysis: ","Electronic devices: ","CDS lab: ","Engg practice lab: "};
    char sub3[9][30]={"LAPDE: ","FDSC: ","EC-1: ","Signals: ","Digital elec: ","Control sys: ","C lab: ","ADC lab: ","Interpersonal lab: "};
    char sub4[8][20]={"PRP: ","EC-II: ","Comm theory: ","EMF: ","LIC: ","EVS: ","CDS lab: ","LIC lab: "};
    printf("O-10,A+ -9,A-8,B+ -7,B-6");
    for(i=0;i<8;i++)
    {
        printf("%s",sub1[i]);
        scanf("%d",&point1[i]);
    }
    for(i=0;i<8;i++)
    {
        printf("%s",sub2[i]);
        scanf("%d",&point2[i]);
    }
    for(i=0;i<9;i++)
    {
        printf("%s",sub3[i]);
        scanf("%d",&point3[i]);
    }
    for(i=0;i<8;i++)
    {
        printf("%s",sub4[i]);
        scanf("%d",&point4[i]);
    }
    for(i=0;i<8;i++)
    {
        sum1=sum1+(point1[i]*credit1[i]);
    }
    for(i=0;i<8;i++)
    {
        sum2=sum2+(point2[i]*credit2[i]);
    }
    for(i=0;i<9;i++)
    {
        sum3=sum3+(point3[i]*credit3[i]);
    }
    for(i=0;i<8;i++)
    {
        sum4=sum4+(point4[i]*credit4[i]);
    }
    a1=sum1/s1;
    a2=sum2/s2;
    a3=sum3/s3;
    a4=sum4/s4;
    ans=((sum1+sum2+sum3+sum4)/(s1+s2+s3+s4));
    printf("sem1: %f",a1);
    printf("\nsem2: %f",a2);
    printf("\nsem3: %f",a3);
    printf("\nsem4: %f",a4);
    printf("\nCGPA: %f",ans);
    return 0;

}
