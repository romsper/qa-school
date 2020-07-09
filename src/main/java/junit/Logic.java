package junit;

import io.qameta.allure.Step;

public class Logic {
    private int firstNum = 0;
    private int secondNum = 0;

    @Step("Calculations")
    private int calc(int firstNum, int secondNum, String function) {
        int result = 0;
        switch (function) {
            case "sum":
                result = firstNum + secondNum;
                break;
            case "minus":
                result = firstNum - secondNum;
                break;
            default:
                System.out.println("Wrong fun! Please use \"sum\" and \"minus\"");
                break;
        }
        return result;
    }

    @Step("Set first num")
    public Logic setFirstNum(int number) {
        firstNum = number;
        return this;
    }

    @Step("Set second num")
    public Logic setSecondNum(int number) {
        secondNum = number;
        return this;
    }

    @Step("Get result")
    public int getResult(String function) {
        return calc(firstNum, secondNum, function);
    }
}
