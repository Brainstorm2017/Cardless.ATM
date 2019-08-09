package MoneyGrabbers.Cardless.ATM.bill;

public class bill {

private Long id;
private String status;
private String payee;
private String nickname;
private String creation_date;
private String payment_date;
private Integer recurring_date;
private String upcoming_payment;
private Double payment_amount;
private String account_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    private String payee;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private String nickname;

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    private String creation_date;

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    private String payment_date;

    public Integer getRecurring_date() {
        return recurring_date;
    }

    public void setRecurring_date(Integer recurring_date) {
        this.recurring_date = recurring_date;
    }

    private Integer recurring_date;

    public String getUpcoming_payment() {
        return upcoming_payment;
    }

    public void setUpcoming_payment(String upcoming_payment) {
        this.upcoming_payment = upcoming_payment;
    }

    private String upcoming_payment;

    public Double getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(Double payment_amount) {
        this.payment_amount = payment_amount;
    }

    private Double payment_amount;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    private String account_id;
}

public withdraw (Long id, String status, String payee, String nickname, String creation_date, String payment_date, Integer recurring_date, String payment_amount, String account_id,)
this.id = id;
this.status = status;
this.payee = payee;
this.nickname = nickname;
this.creation_date = creation_date;
this.payment_amount = payment_amount;
this.recurring_date = recurring_date;
this.payment_amount = payment_amount;
this.account_id = account_id;