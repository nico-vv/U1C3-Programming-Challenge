public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel=model;
        idNumber=id;
    }

    public Solution(int id) {
        calcModel="TI-84";
        idNumber=id;
    }

    public String getCalcModel() {
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel=newModel;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int newId) {
        idNumber=newId;
    }

    public void incrementId() {
        idNumber++;
    }

    public double add(double num1, double num2) {
        return num1+num2;
    }

    public double subtract(double num1, double num2) {
        return num1-num2;
    }

    public double multiply(double num1, double num2) {
        return num1*num2;
    }

    public int quotient(int num1, int num2) {
        return num1/num2;
    }

    public int remainder(int num1, int num2) { 
        return num1%num2;
    }

    public String divisionResult(int num1, int num2) {
        return quotient(num1, num2)+" R "+remainder(num1, num2);
    }

    public String coordinatePair(int x, int y) {
        return "("+x+", "+y+")";
    }

    public int average(int num1, int num2) {
        return (int)Math.round(add(num1, num2)/2.0);
    }

    public String info() {
        return "This calculator is a model "+getCalcModel()+" with id "+getIdNumber();
    }

}
