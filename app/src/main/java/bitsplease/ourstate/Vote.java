package bitsplease.ourstate;

/**
 * Created by Zach Knoll on 9/17/2016.
 */
public class Vote {
    private int voterId;
    private String voter;
    private int petitionId;

    public Vote(int voterId, String voter, int petitionId) {
        this.voterId = voterId;
        this.voter = voter;
        this.petitionId = petitionId;
    }

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public String getVoter() {
        return voter;
    }

    public void setVoter(String voter) {
        this.voter = voter;
    }

    public int getPetitionId() {
        return petitionId;
    }

    public void setPetitionId(int petitionId) {
        this.petitionId = petitionId;
    }
}
