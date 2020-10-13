package ev.mikheeva.AndBaz_Les1_HW1;

public final class MainPresenter {

    private static final MainPresenter instance = new MainPresenter();
    private String city;

    private MainPresenter(){

        city = "";
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public static MainPresenter getInstance(){
        return instance;
    }


}

