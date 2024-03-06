package com.company;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "<--Invalid Input!-->";
    }
}
class Cantdivideby0Exception extends Exception{
    @Override
    public String toString(){
        return "<--You Can't divide by 0-->";
    }
}
class InputLimitExceedException extends Exception{
    @Override
    public String toString(){
        return "<--Your Input limit has been exceed-->";
    }
}
class MultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "<--Multiplication value can not be greater then 7000-->";
    }
}

class Calculator{
    double add(double a , double b , char operator) throws InvalidInputException,InputLimitExceedException {
        if(a>100000 || b>100000){
            throw new InputLimitExceedException();
        }
        if (operator != '+'||operator != '-'|| operator != '*'||operator != '/'){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double sub(double a , double b , char operator) throws InputLimitExceedException, InvalidInputException {
        if(a>100000 || b>100000){
            throw new InputLimitExceedException();
        }
        if (operator != '+'||operator != '-'|| operator != '*'||operator != '/'){
            throw new InvalidInputException();
        }
        return a-b;
    }
    double multi(double a , double b, char operator) throws InputLimitExceedException, MultiplierReachedException, InvalidInputException {
        if(a>100000 || b>100000){
            throw new InputLimitExceedException();
        }
        else if (a>7000 || b>7000) {
            throw new MultiplierReachedException();
        }
        else if (operator != '+'||operator != '-'|| operator != '*'||operator != '/'){
            throw new InvalidInputException();
        }
        return a*b;
    }
    double divide(double a , double b, char operator) throws InputLimitExceedException, Cantdivideby0Exception, InvalidInputException {
        if(a>100000 || b>100000){
            throw new InputLimitExceedException();
        }
        if(b==0){
            throw new Cantdivideby0Exception();
        }
        if (operator != '+'||operator != '-'|| operator != '*'||operator != '/'){
            throw new InvalidInputException();
        }
        return a/b;
    }
}

public class Java_Calculator_87 {
    public static void main(String[] args) throws InputLimitExceedException, InvalidInputException, Cantdivideby0Exception, MultiplierReachedException {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,10000,'&'));
//        System.out.println(calc.divide(10,10000,'/'));
//        System.out.println(calc.multi(700,7000,'*'));

//        try{
//            double result = calc.add(5,10);
//            System.out.println(result);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
    }
}
