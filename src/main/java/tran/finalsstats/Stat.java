package tran.finalsstats;

public class Stat {
    // POJO: Plain old Java object
    int id;
    String stat;
    String player;
    int seriesGameNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getSeriesGameNumber() {
        return seriesGameNumber;
    }

    public void setSeriesGameNumber(int seriesGameNumber) {
        this.seriesGameNumber = seriesGameNumber;
    }
}
