package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int sessions;
    private int epBySession;
    private boolean isActive;
    private int minutesByEp;

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setEpBySession(int epBySession) {
        this.epBySession = epBySession;
    }

    public void setMinutesByEp(int minutesByEp) {
        this.minutesByEp = minutesByEp;
    }

    public int getEpBySession() {
        return epBySession;
    }

    public int getMinutesByEp() {
        return minutesByEp;
    }

    public int getSessions() {
        return sessions;
    }

    public boolean getIsActive() {
        return isActive;
    }

    @Override
    public int getDuration() {
        return sessions * epBySession * minutesByEp;
    }
}
