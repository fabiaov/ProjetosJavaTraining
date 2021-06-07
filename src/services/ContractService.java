package services;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months; // pega o valor total e divide pelos meses pra dar as parcelas
        for (int i = 0; i < months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updateQuota = basicQuota + onlinePaymentService.Interest(basicQuota,i);
            double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
            contract.addInstallment(new Installment(date,fullQuota));
        }
    }

    private Date addMonths(Date date,int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,n);// aqui ele acrescenta n meses no calendar
        return cal.getTime();// ele volta a ser um date
    }



}

