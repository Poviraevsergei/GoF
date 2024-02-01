package facade;

public class SteamFacade {
    CS2 cs2;
    Pubg pubg;

    public SteamFacade() {
        cs2 = new CS2();
        pubg = new Pubg();
    }

    void startCsApp() {
        cs2.startApp();
    }

    void startPubgApp() {
        pubg.startPubg();
    }

    void finishPubg() {
        pubg.finishPubg();
    }

    void finishCS() {
        cs2.finishApp();
    }
}
