package page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import utils.DataHelper;

public class TransferPage {

    private SelenideElement countField = $("[data-test-id='amount'] input");
    private SelenideElement cardNumberField = $("[data-test-id='from'] input");
    private SelenideElement putMoneyButton = $("[data-test-id='action-transfer']");

    public void putTransferAmount(String transferAmount) {
        countField.setValue(transferAmount);
    }

    public DashboardPage putMoneyCard(DataHelper.MoneyTransfer info) {
        cardNumberField.setValue(info.getCardNumber());
        putMoneyButton.click();
        return new DashboardPage();
    }
}