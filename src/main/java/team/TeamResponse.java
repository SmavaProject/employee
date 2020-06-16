package team;

public class TeamResponse {
    enum Status {SUCCESS, FAILED};

    public Status status;
    public int rowsProcessed;
    public String errorText;

    public TeamResponse(){};

    public TeamResponse(Status status, int rowsProcessed, String errorText){
        this.status = status;
        this.rowsProcessed = rowsProcessed;
        this.errorText = errorText;
    }
}
