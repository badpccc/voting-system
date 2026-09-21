package model;

public class Voto {
    private Long id;
    private Long eleitorId;
    private Long candidatoId;

    public Voto() {

    }

    public Voto(Long eleitorId, Long candidatoId) {
        this.eleitorId = eleitorId;
        this.candidatoId = candidatoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEleitorId() {
        return eleitorId;
    }

    public void setEleitorId(Long eleitorId) {
        this.eleitorId = eleitorId;
    }

    public Long getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(Long candidatoId) {
        this.candidatoId = candidatoId;
    }
}