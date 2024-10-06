package ru.netology.service;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void calculationOfTheRequiredAmountForMaxCashbackWhenBuyingFor900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculationOfTheRequiredAmountForMaxCashbackWhenBuyingFor1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculationOfTheRequiredAmountForMaxCashbackWhenBuyingFor0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculationOfTheRequiredAmountForMaxCashbackWhenBuyingFor999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculationOfTheRequiredAmountForMaxCashbackWhenBuyingFor1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculationOfTheRequiredAmountForMaxCashbackWhenBuyingFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}
