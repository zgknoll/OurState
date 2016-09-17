package bitsplease.ourstate;

/**
 * Created by claudiaathens on 9/17/16.
 */

public class Petition {

    private int id;
    private String petitionTitle;
    private String petitionDesc;
    private int votes;
    private String creator;
    private int creationTime;
    private DatabaseHelper db;

    public Petition(int id, String petitionTitle, String petitionDesc, int votes, String creator, int creationTime) {
        this.id = id;
        this.petitionTitle = petitionTitle;
        this.petitionDesc = petitionDesc;
        this.votes = votes;
        this.creator = creator;
        this.creationTime = creationTime;
    }

    public void incrementVote(int votes, String voter){
        votes++;
        db.petitionVote(id, voter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetitionTitle() {
        return petitionTitle;
    }

    public void setPetitionTitle(String petitionTitle) {
        this.petitionTitle = petitionTitle;
    }

    public String getPetitionDesc() {
        return petitionDesc;
    }

    public void setPetitionDesc(String petitionDesc) {
        this.petitionDesc = petitionDesc;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) { this.votes = votes; }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }



}
