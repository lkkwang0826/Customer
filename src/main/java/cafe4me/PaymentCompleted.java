package cafe4me;

public class PaymentCompleted extends AbstractEvent {

    private Long id;

    public PaymentCompleted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
