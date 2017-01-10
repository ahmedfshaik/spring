package edu.home.tx.declarative;

// ClientProgrammaticTx.java
import org.springframework.context.ApplicationContext;

public class ClientDeclarativeTx {

    public static void main(String[] args) {
        ApplicationContext context = SpringContextUtils.getContext();
        ITransferMoney transMoney = (ITransferMoney) context.getBean("transfermoney");
        transMoney.transfer(1, 1);
        System.out.println("successfully transferred...");
    }
}
