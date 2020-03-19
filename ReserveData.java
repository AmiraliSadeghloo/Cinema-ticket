public class ReserveData {
    private String film;
    private Date date;
    private int salonNum;

    ReserveData(int salonNum, String film, Date date) {
        this.film = film;
        this.date = date;
        this.salonNum = salonNum;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSalonNum() {
        return salonNum;
    }

    public void setSalonNum(int salonNum) {
        this.salonNum = salonNum;
    }
}
