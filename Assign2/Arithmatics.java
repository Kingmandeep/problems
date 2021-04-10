package Assign2;

class  Arithmatics implements Arithmatic{
    public int subtraction( int firstNo, int secondNo ){
        return firstNo-secondNo;
    }
public  int subtraction( int firstNo, int secondNo, int thirdNo ){
    int b=firstNo-secondNo;
    return b -thirdNo;
}
public  double subtraction( double firstNo, double secondNo ){
    return firstNo-secondNo;
}
public  double subtraction( int firstNo, double secondNo ){
    double a=firstNo;
    return a-secondNo;
}
public  float subtraction( float firstNo, float secondNo, float thirdNo ){
    float c=firstNo-secondNo;
    return c-thirdNo;
}
}