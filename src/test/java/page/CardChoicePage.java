package page;

import utils.DataHelper;
import com.codeborne.selenide.SelenideElement;
import lombok.Value;
import java.util.Random;
import static com.codeborne.selenide.Selenide.$;

public class CardChoicePage {
    private static SelenideElement firstCardTransferButton = $(".list__item:first-child .button");
    private static SelenideElement secondCardTransferButton = $(".list__item:nth-child(2) .button");
    private static SelenideElement firstCardString = $("[data-test-id='92df3f1c-a033-48e6-8390-206f6b1f56c0']");
    private static SelenideElement secondCardString = $("[data-test-id='0f3f5c2a-249e-4c3d-8287-09f7a039391d']");



    public static TransferPage choiceFirstCardForTransfer() {
        firstCardTransferButton.click();
        return new TransferPage();
    }

    public static TransferPage choiceSecondCardForTransfer() {
        secondCardTransferButton.click();
        return new TransferPage();
    }

    public static String getfirstCardNumber() {
        String firstCardNumber = firstCardString.toString();
        return firstCardNumber;
    }

    public static String getSecondCardNumber() {
        String secondCardNumber = secondCardString.toString();
        return secondCardNumber;
    }


    public static int getRandomAmount(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public static double getRandomDoubleAmount(double max) {
        Random random = new Random();
        return random.nextDouble();
    }

    public static int getCardBalance(String str) {
        int balance = 0;
        String[] cardList = str.split(" ");
        balance = Integer.parseInt(cardList[6]);
        return balance;
    }
    public static double getCardBalanceIfAmountDouble(String str) {
        double balance = 0;
        String[] cardList = str.split(" ");
        balance = Double.parseDouble(cardList[6]);
        return balance;
    }
    public static String getTransferAmount(String str) {
        int limit = getCardBalance(str);
        String transferAmount = Integer.toString(getRandomAmount(limit));
        return transferAmount;
    }
    public static String getTransferAmountWhenDouble(String str) {
        double limit = getCardBalanceIfAmountDouble(str);
        String transferAmount = Double.toString(getRandomDoubleAmount(limit));
        return transferAmount;
    }
}