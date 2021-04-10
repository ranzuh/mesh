import java.io.Serializable;
import java.util.Random;
import java.util.UUID;


// Mesh-viestiluokka, jossa lähetettävä tieto kuljetetaan foregone ylise: sisältää viestin otsaketiedot,
// sekä itse hyötykuorman.
public class Message implements Serializable {
    private Serializable payload;
    private Long token;
    private String recipient = null;
    public enum Tyyppi{
    	MSG,
    	GAMECONFIG,
    	HOST,
    	ID,
    	BANAANI
    }
    private Tyyppi tyyppi;
    private Long sender;

    public Message(Serializable payload, Tyyppi tyyppi) {
        Random rand = new Random();
        this.payload = payload;
        this.tyyppi = tyyppi;
        this.token = rand.nextLong();       
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Long getToken() {
        return token;
    }

    public Tyyppi getType() {
        return tyyppi;
    }

    public Serializable getPayload() {
        return payload;
    }
    public void setSender(Long sender) {
    	this.sender=sender;
    	
    }
    public Long getSender() {
    	return sender;
    }
}
